package com.meera.liferaymvc;

import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.meera.db.model.JobDirectory;
import com.meera.db.service.JobDirectoryLocalServiceUtil;


public class JobDirectoryMVCPortletAction extends MVCPortlet {
    public void addJobDirectory(ActionRequest actionRequest,
                                ActionResponse actionResponse) throws IOException, PortletException {
        try {

            String name = ParamUtil.getString(actionRequest, "name");
            String archiveStatus = ParamUtil.getString(actionRequest, "archiveStatus");

            long jobDirectoryId = CounterLocalServiceUtil.increment(JobDirectory.class.getName());

            JobDirectory jobDirectory = JobDirectoryLocalServiceUtil.createJobDirectory(jobDirectoryId);

            jobDirectory.setName(name);
            jobDirectory.setArchiveStatus(archiveStatus);

            jobDirectory = JobDirectoryLocalServiceUtil.addJobDirectory(jobDirectory);
            if (jobDirectory != null) {
                SessionMessages.add(actionRequest.getPortletSession(),
                        "jobDirectory-add-success");
                _log.info("jobDirectory have been added successfylly");
            } else {
                SessionErrors.add(actionRequest.getPortletSession(),
                        "jobDirectory-add-error");
                _log.error("There is an Error in adding bankOrganization");
            }
            actionResponse.setRenderParameter("mvcPath",
                    "/jsp/jobDirectory/add_jobDirectory.jsp");
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "jobDirectory-add-error");
            e.printStackTrace();
        }
    }

    public void updateJobDirectory(ActionRequest actionRequest,
                                   ActionResponse actionResponse) throws IOException, PortletException {
        try {
            long jobDirectoryId = ParamUtil.getLong(actionRequest, "jobDirectoryId");
            String name = ParamUtil.getString(actionRequest, "name");
            String archiveStatus = ParamUtil.getString(actionRequest, "archiveStatus");
            JobDirectory jobDirectory = JobDirectoryLocalServiceUtil.getJobDirectory(jobDirectoryId);

            if (jobDirectory != null) {

                jobDirectory.setName(name);
                jobDirectory.setArchiveStatus(archiveStatus);
                jobDirectory = JobDirectoryLocalServiceUtil.updateJobDirectory(jobDirectory);
                if (jobDirectory != null) {
                    SessionMessages.add(actionRequest.getPortletSession(),
                            "jobDirectory-update-success");
                    _log.info("jobDirectory have been updated successfylly");
                } else {
                    SessionErrors.add(actionRequest.getPortletSession(),
                            "jobDirectory-update-error");
                    _log.error("There is an Error in delete jobDirectory");
                }
            } else {
                SessionErrors.add(actionRequest.getPortletSession(),
                        "jobDirectory-update-error");
                _log.error("Could not find jobDirectory.");
            }
            actionResponse.setRenderParameter("mvcPath",
                    "/jsp/jobDirectory/update_jobDirectory.jsp");
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "jobDirectory-update-error");
            e.printStackTrace();
        }
    }

    public void getJobDirectory(ActionRequest actionRequest,
                                ActionResponse actionResponse) throws IOException, PortletException {
        try {
            long jobDirectoryId = ParamUtil.getLong(actionRequest, "jobDirectoryId");
            String cmd = ParamUtil.getString(actionRequest, "cmd");
            JobDirectory jobDirectory = JobDirectoryLocalServiceUtil.getJobDirectory(jobDirectoryId);
            if (jobDirectory != null) {
                actionRequest.setAttribute("jobDirectoryObject", jobDirectory);
                _log.info("jobDirectory have been found for specific primary key successfylly");
            } else {
                _log.error("jobDirectory not found");
            }
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "jobDirectory-add-error");
            e.printStackTrace();
        }
    }

    public void changeArchiveStatus(ActionRequest actionRequest,
                                    ActionResponse actionResponse) throws SystemException, PortalException {
        long jobDirectoryId = ParamUtil.getLong(actionRequest, "jobDirectoryId");
        JobDirectory jobDirectory = JobDirectoryLocalServiceUtil.getJobDirectory(jobDirectoryId);

        if (jobDirectory.getArchiveStatus().equalsIgnoreCase("да")) {
            jobDirectory.setArchiveStatus("Нет");
        } else {
            jobDirectory.setArchiveStatus("Да");
            ;
        }
        JobDirectoryLocalServiceUtil.updateJobDirectory(jobDirectory);
    }

    private static Log _log = LogFactoryUtil
            .getLog(EmployeeMVCPortletAction.class);

}