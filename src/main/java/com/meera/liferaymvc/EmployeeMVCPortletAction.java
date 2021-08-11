package com.meera.liferaymvc;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.meera.db.model.Employee;
import com.meera.db.service.EmployeeLocalServiceUtil;


public class EmployeeMVCPortletAction extends MVCPortlet {
    public void addEmployee(ActionRequest actionRequest,
                            ActionResponse actionResponse) throws IOException, PortletException {
        try {
            String surname = ParamUtil.getString(actionRequest, "surname");
            String name = ParamUtil.getString(actionRequest, "name");
            String patronymic = ParamUtil.getString(actionRequest, "patronymic");
            String employeeGender = ParamUtil.getString(actionRequest, "employeeGender");
            Date dateOfBirth = ParamUtil.getDate(actionRequest, "dateOfBirth", new SimpleDateFormat("dd/MM/yyyy"));
            String employeePosition = ParamUtil.getString(actionRequest, "employeePosition");
            int employeeSalary = ParamUtil.getInteger(actionRequest, "employeeSalary");
            String employeeWorkPhoneNumber = ParamUtil.getString(actionRequest, "employeeWorkPhoneNumber");
            String employeeMobilePhoneNumber = ParamUtil.getString(actionRequest, "employeeMobilePhoneNumber");
            String bankOrganization = ParamUtil.getString(actionRequest, "bankOrganization");
            String archiveStatus = ParamUtil.getString(actionRequest, "archiveStatus");

            long employeeId = CounterLocalServiceUtil.increment(Employee.class.getName());

            Employee employee = EmployeeLocalServiceUtil.createEmployee(employeeId);
            employee.setSurname(surname);
            employee.setName(name);
            employee.setPatronymic(patronymic);
            employee.setEmployeeGender(employeeGender);
            employee.setDateOfBirth(dateOfBirth);
            employee.setEmployeePosition(employeePosition);
            employee.setEmployeeSalary(employeeSalary);
            employee.setEmployeeWorkPhoneNumber(employeeWorkPhoneNumber);
            employee.setEmployeeMobilePhoneNumber(employeeMobilePhoneNumber);
            employee.setBankOrganization(bankOrganization);
            employee.setArchiveStatus(archiveStatus);

            employee = EmployeeLocalServiceUtil.addEmployee(employee);
            if (employee != null) {
                SessionMessages.add(actionRequest.getPortletSession(),
                        "employee-add-success");
                _log.info("employee have been added successfylly");
            } else {
                SessionErrors.add(actionRequest.getPortletSession(),
                        "employee-add-error");
                _log.error("There is an Error in adding employee");
            }
            actionResponse.setRenderParameter("mvcPath",
                    "/jsp/employee/add_employee.jsp");
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "employee-add-error");
            e.printStackTrace();
        }
    }

    public void updateEmployee(ActionRequest actionRequest,
                               ActionResponse actionResponse) throws IOException, PortletException {
        try {

            long employeeId = ParamUtil.getLong(actionRequest, "employeeId");
            String surname = ParamUtil.getString(actionRequest, "surname");
            String name = ParamUtil.getString(actionRequest, "name");
            String patronymic = ParamUtil.getString(actionRequest, "patronymic");
            String employeeGender = ParamUtil.getString(actionRequest, "employeeGender");
            Date dateOfBirth = ParamUtil.getDate(actionRequest, "dateOfBirth", new SimpleDateFormat("dd/MM/yyyy"));
            String employeePosition = ParamUtil.getString(actionRequest, "employeePosition");
            int employeeSalary = ParamUtil.getInteger(actionRequest, "employeeSalary");
            String employeeWorkPhoneNumber = ParamUtil.getString(actionRequest, "employeeWorkPhoneNumber");
            String employeeMobilePhoneNumber = ParamUtil.getString(actionRequest, "employeeMobilePhoneNumber");
            String bankOrganization = ParamUtil.getString(actionRequest, "bankOrganization");
            String archiveStatus = ParamUtil.getString(actionRequest, "archiveStatus");
            Employee employee = EmployeeLocalServiceUtil.getEmployee(employeeId);

            if (employee != null) {
                employee.setSurname(surname);
                employee.setName(name);
                employee.setPatronymic(patronymic);
                employee.setEmployeeGender(employeeGender);
                employee.setDateOfBirth(dateOfBirth);
                employee.setEmployeePosition(employeePosition);
                employee.setEmployeeSalary(employeeSalary);
                employee.setEmployeeWorkPhoneNumber(employeeWorkPhoneNumber);
                employee.setEmployeeMobilePhoneNumber(employeeMobilePhoneNumber);
                employee.setBankOrganization(bankOrganization);
                employee.setArchiveStatus(archiveStatus);
                employee = EmployeeLocalServiceUtil.updateEmployee(employee);
                if (employee != null) {
                    SessionMessages.add(actionRequest.getPortletSession(),
                            "employee-update-success");
                    _log.info("employee have been updated successfylly");
                } else {
                    SessionErrors.add(actionRequest.getPortletSession(),
                            "employee-update-error");
                    _log.error("There is an Error in delete employee");
                }
            } else {
                SessionErrors.add(actionRequest.getPortletSession(),
                        "employee-update-error");
                _log.error("Could not find employee.");
            }
            actionResponse.setRenderParameter("mvcPath",
                    "/jsp/employee/update_employee.jsp");
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "employee-update-error");
            e.printStackTrace();
        }
    }

    public void getEmployee(ActionRequest actionRequest,
                            ActionResponse actionResponse) throws IOException, PortletException {
        try {
            long employeeId = ParamUtil.getLong(actionRequest, "employeeId");
            Employee employee = EmployeeLocalServiceUtil.getEmployee(employeeId);
            if (employee != null) {
                actionRequest.setAttribute("employeeObject", employee);
                _log.info("employee have been found for specific primary key successfylly");
            } else {
                _log.error("employee not found");
            }
        } catch (Exception e) {
            SessionErrors.add(actionRequest.getPortletSession(),
                    "employee-add-error");
            e.printStackTrace();
        }
    }

    public void changeArchiveStatus(ActionRequest actionRequest,
                                    ActionResponse actionResponse) throws SystemException, PortalException {
        long employeeId = ParamUtil.getLong(actionRequest, "employeeId");
        Employee employee = EmployeeLocalServiceUtil.getEmployee(employeeId);

        if (employee.getArchiveStatus().equalsIgnoreCase("да")) {
            employee.setArchiveStatus("Нет");

        } else {
            employee.setArchiveStatus("Да");

        }
        EmployeeLocalServiceUtil.updateEmployee(employee);
    }

    private static Log _log = LogFactoryUtil
            .getLog(EmployeeMVCPortletAction.class);
}