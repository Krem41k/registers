<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.meera.db.model.Employee" %>
<%@ page import="com.meera.db.service.EmployeeLocalServiceUtil" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<portlet:defineObjects/>
<%
    Employee employee = null;

    long employeeId = ParamUtil.getLong(request, "employeeId");

    if (employeeId > 0) {
        employee = EmployeeLocalServiceUtil.getEmployee(employeeId);
    }


    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= employee %>" model="<%= Employee.class %>"/>
<portlet:renderURL var="viewEmployeeURL"/>
<portlet:actionURL name='<%= employee == null ? "addEmployee" : "updateEmployee" %>'
                   var="editEmployeeIdURL" windowState="normal"/>

<liferay-ui:header
        backURL="<%= viewEmployeeURL %>"
        title='<%= (employee != null) ? employee.getName() : "Добавить нового сотрудника" %>'
/>

<aui:form action="<%= editEmployeeIdURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>"/>

        <aui:input name="employeeId" type="hidden"
                   value='<%= employee == null ? "" : employee.getEmployeeId() %>'/>

        <aui:input name="surname" label="Фамилия"></aui:input>
        <aui:input name="name" label="Имя"></aui:input>
        <aui:input name="patronymic" label="Отчество"></aui:input>
        <aui:input name="employeeGender" label="Пол"></aui:input>
        <aui:input name="dateOfBirth" placeholder="dd/MM/yyyy" label="Дата рождения"></aui:input>
        <aui:input name="employeePosition" label="Должность"></aui:input>
        <aui:input name="employeeSalary" label="Уровень зарплаты"></aui:input>
        <aui:input name="employeeWorkPhoneNumber" label="Номер рабочего телефона"></aui:input>
        <aui:input name="employeeMobilePhoneNumber" label="Номер мобильного телефона"></aui:input>
        <aui:input name="bankOrganization" label="Банковская организация"></aui:input>
        <aui:input name="archiveStatus" label="Статус архивности"></aui:input>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>

        <aui:button onClick="<%=viewEmployeeURL %>" type="cancel"/>
    </aui:button-row>
</aui:form>