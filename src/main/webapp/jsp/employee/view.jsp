<%@page import="java.util.List" %>
<%@ page import="com.meera.db.model.Employee" %>
<%@ page import="com.meera.db.service.EmployeeLocalServiceUtil" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    List<Employee> employeeList = EmployeeLocalServiceUtil.getEmployees(0, EmployeeLocalServiceUtil.getEmployeesCount());

%>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= employeeList %>"
    />

    <liferay-ui:search-container-row
            className="com.meera.db.model.Employee"
            modelVar="employee"
    >
        <liferay-ui:search-container-column-text name="ID сотрудника" value="${employee.employeeId}"/>
        <liferay-ui:search-container-column-text name="Фамилия" value="${employee.surname}"/>
        <liferay-ui:search-container-column-text name="Имя" value="${employee.name}"/>
        <liferay-ui:search-container-column-text name="Отчество" value="${employee.patronymic}"/>
        <liferay-ui:search-container-column-text name="Пол" value="${employee.employeeGender}"/>
        <%
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        %>
        <liferay-ui:search-container-column-text name="Дата рождения"
                                                 value="<%=sdf.format(employee.getDateOfBirth()).toString()%>"/>
        <liferay-ui:search-container-column-text name="Должность" value="${employee.employeePosition}"/>
        <liferay-ui:search-container-column-text name="Уровень зарплаты" value="${employee.employeeSalary}"/>
        <liferay-ui:search-container-column-text name="Номер рабочего телефона"
                                                 value="${employee.employeeWorkPhoneNumber}"/>
        <liferay-ui:search-container-column-text name="Номер мобильного телефона"
                                                 value="${employee.employeeMobilePhoneNumber}"/>
        <liferay-ui:search-container-column-text name="Банковская организация" value="${employee.bankOrganization}"/>
        <liferay-ui:search-container-column-text name="Статус архивности" value="${employee.archiveStatus}"/>
        <liferay-ui:search-container-column-text name="Действия">
            <liferay-ui:icon-menu>
                <portlet:renderURL var="editURL">
                    <portlet:param name="employeeId"
                                   value="<%= String.valueOf(employee.getEmployeeId()) %>"/>
                    <portlet:param name="mvcPath" value="/jsp/employee/update_employee.jsp"/>
                </portlet:renderURL>

                <liferay-ui:icon image="edit" message="Обновить"
                                 url="<%=editURL.toString() %>"/>

                <portlet:actionURL name="changeArchiveStatus" var="changeArchiveStatusURL">
                    <portlet:param name="employeeId"
                                   value="<%= String.valueOf(employee.getEmployeeId()) %>"/>
                </portlet:actionURL>

                <liferay-ui:icon image="edit" message="Изменить архивный статус"
                                 url="<%=changeArchiveStatusURL.toString() %>"/>
            </liferay-ui:icon-menu>
        </liferay-ui:search-container-column-text>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row cssClass="guestbook-buttons">
    <portlet:renderURL var="addEmployeeURL">
        <portlet:param name="mvcPath" value="/jsp/employee/add_employee.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= addEmployeeURL.toString() %>" value="Добавить сотрудника">
    </aui:button>
</aui:button-row>
<aui:button-row cssClass="guestbook-buttons">
    <portlet:renderURL var="searchEmployeeURL">
        <portlet:param name="mvcPath" value="/jsp/employee/search_employee.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= searchEmployeeURL.toString() %>" value="Найти сотрудника">
    </aui:button>
</aui:button-row>
