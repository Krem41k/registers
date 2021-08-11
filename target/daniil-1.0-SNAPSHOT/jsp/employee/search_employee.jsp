<%@page import="javax.portlet.PortletURL" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>
<liferay-theme:defineObjects/><portlet:defineObjects/>
<%
    PortletURL homeURL = renderResponse.createRenderURL();
    PortletURL backURL = renderResponse.createRenderURL();
    backURL.setParameter("mvcPath", "/jsp/employee/display_search_employee.jsp");
    PortletURL displaySearchStudent = renderResponse.createRenderURL();
    displaySearchStudent.setParameter("mvcPath", "/jsp/employee/display_search_employee.jsp");
    displaySearchStudent.setParameter("backURL", backURL.toString());
%>

<aui:form action="<%=displaySearchStudent%>" name="employeeForm" method="POST">
    <aui:input name="surname" value='' label="Поиск сотрудников по фамилии" type="text"></aui:input>
    <aui:button-row>
        <aui:button type="submit" value="Поиск"/>
        <aui:button onClick="<%=homeURL.toString() %>" type="cancel"/>
    </aui:button-row>
</aui:form>