package com.meera.liferaymvc;

import java.io.IOException;
import javax.portlet.*;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.meera.db.model.BankOrganization;
import com.meera.db.service.BankOrganizationLocalServiceUtil;


public class BankOrganizationMVCPortletAction extends MVCPortlet {
    public void addBankOrganization(ActionRequest actionRequest,
                                    ActionResponse actionResponse) throws IOException, PortletException {
        try {

            String name = ParamUtil.getString(actionRequest, "name");
            String BIK = ParamUtil.getString(actionRequest, "BIK");
            String address = ParamUtil.getString(actionRequest, "adress");

            long bankOrganizationId = CounterLocalServiceUtil.increment(BankOrganization.class.getName());
            BankOrganization bankOrganization = BankOrganizationLocalServiceUtil.createBankOrganization(bankOrganizationId);

            bankOrganization.setName(name);
            bankOrganization.setBIK(BIK);
            bankOrganization.setAdress(address);

            bankOrganization = BankOrganizationLocalServiceUtil.addBankOrganization(bankOrganization);
            if (bankOrganization != null) {
                SessionMessages.add(actionRequest.getPortletSession(),
                        "bankOrganization-add-success");
                _log.info("bankOrganization have been added successfylly");
            } else {
                SessionErrors.add(actionRequest.getPortletSession(),
                        "bankOrganization-add-error");
                _log.error("There is an Error in adding bankOrganization");
            }
            actionResponse.setRenderParameter("mvcPath",
                    "/jsp/bankOrganization/add_bankOrganization.jsp");
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "bankOrganization-add-error");
            e.printStackTrace();
        }
    }

    public void updateBankOrganization(ActionRequest actionRequest,
                                       ActionResponse actionResponse) throws IOException, PortletException {
        try {
            long bankOrganizationId = ParamUtil.getLong(actionRequest, "bankOrganizationId");
            String name = ParamUtil.getString(actionRequest, "name");
            String BIK = ParamUtil.getString(actionRequest, "BIK");
            String address = ParamUtil.getString(actionRequest, "adress");
            BankOrganization bankOrganization = BankOrganizationLocalServiceUtil.getBankOrganization(bankOrganizationId);

            if (bankOrganization != null) {

                bankOrganization.setName(name);
                bankOrganization.setBIK(BIK);
                bankOrganization.setAdress(address);
                bankOrganization = BankOrganizationLocalServiceUtil.updateBankOrganization(bankOrganization);
                if (bankOrganization != null) {
                    SessionMessages.add(actionRequest.getPortletSession(),
                            "bankOrganization-update-success");
                    _log.info("bankOrganization have been updated successfylly");
                } else {
                    SessionErrors.add(actionRequest.getPortletSession(),
                            "bankOrganization-update-error");
                    _log.error("There is an Error in delete bankOrganization");
                }
            } else {
                SessionErrors.add(actionRequest.getPortletSession(),
                        "bankOrganization-update-error");
                _log.error("Could not find bankOrganization.");
            }
            actionResponse.setRenderParameter("mvcPath",
                    "/jsp/bankOrganization/update_bankOrganization.jsp");
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "bankOrganization-update-error");
            e.printStackTrace();
        }
    }

    public void getBankOrganization(ActionRequest actionRequest,
                                    ActionResponse actionResponse) throws IOException, PortletException {
        try {
            long bankOrganizationId = ParamUtil.getLong(actionRequest, "bankOrganizationId");
            String cmd = ParamUtil.getString(actionRequest, "cmd");
            BankOrganization bankOrganization = BankOrganizationLocalServiceUtil.getBankOrganization(bankOrganizationId);
            if (bankOrganization != null) {
                actionRequest.setAttribute("bankOrganizationObject", bankOrganization);
                _log.info("bankOrganization have been found for specific primary key successfylly");
            } else {
                _log.error("bankOrganization not found");
            }
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "bankOrganization-add-error");
            e.printStackTrace();
        }
    }

    private static Log _log = LogFactoryUtil
            .getLog(EmployeeMVCPortletAction.class);
}