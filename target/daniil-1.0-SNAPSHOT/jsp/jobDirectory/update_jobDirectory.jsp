<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.meera.db.model.JobDirectory" %>
<%@ page import="com.meera.db.service.JobDirectoryLocalServiceUtil" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<portlet:defineObjects/>
<%
    JobDirectory jobDirectory = null;

    long jobDirectoryId = ParamUtil.getLong(request, "jobDirectoryId");

    if (jobDirectoryId > 0) {
        jobDirectory = JobDirectoryLocalServiceUtil.getJobDirectory(jobDirectoryId);
    }


    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= jobDirectory %>" model="<%= JobDirectory.class %>"/>
<portlet:renderURL var="viewJobDirectoryURL"/>
<portlet:actionURL name='<%= jobDirectory == null ? "addJobDirectory" : "updateJobDirectory" %>'
                   var="editJobDirectoryIdURL" windowState="normal"/>

<liferay-ui:header
        backURL="<%= viewJobDirectoryURL %>"
        title='<%= (jobDirectory != null) ? jobDirectory.getName() : "Добавить новую должность" %>'
/>

<aui:form action="<%= editJobDirectoryIdURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>"/>

        <aui:input name="jobDirectoryId" type="hidden"
                   value='<%= jobDirectory == null ? "" : jobDirectory.getJobDirectoryId() %>'/>

        <aui:input name="name" label="Название должности"/>
        <aui:input name="archiveStatus" label="Архивный статус" type="hidden"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button onClick="<%=viewJobDirectoryURL %>" type="cancel"/>
    </aui:button-row>
</aui:form>