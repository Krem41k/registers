<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<portlet:defineObjects />
<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/jsp/employee/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEmployee" var="addEmployeeURL"></portlet:actionURL>

<aui:form action="<%= addEmployeeURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>

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

        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

    </aui:button-row>
</aui:form>