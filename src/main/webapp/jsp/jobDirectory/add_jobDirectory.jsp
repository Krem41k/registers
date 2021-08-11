<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<portlet:defineObjects/>
<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/jsp/jobDirectory/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addJobDirectory" var="addJobDirectoryURL"></portlet:actionURL>

<aui:form action="<%= addJobDirectoryURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>

        <aui:input name="name" label="Название должности"/>
        <aui:input name="archiveStatus" label="Архивный статус"/>


    </aui:fieldset>

    <aui:button-row>

        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

    </aui:button-row>
</aui:form>