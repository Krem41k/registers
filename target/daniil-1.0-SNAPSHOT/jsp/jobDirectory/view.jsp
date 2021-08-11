<%@page import="java.util.List" %>
<%@ page import="com.meera.db.model.JobDirectory" %>
<%@ page import="com.meera.db.service.JobDirectoryLocalServiceUtil" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    List<JobDirectory> jobDirectoryList = JobDirectoryLocalServiceUtil.getJobDirectories(0, JobDirectoryLocalServiceUtil.getJobDirectoriesCount());

%>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= jobDirectoryList %>"
    />

    <liferay-ui:search-container-row
            className="com.meera.db.model.JobDirectory"
            modelVar="jobDirectory"
    >
        <liferay-ui:search-container-column-text name="ID должности" value="${jobDirectory.jobDirectoryId}"/>
        <liferay-ui:search-container-column-text name="Название" value="${jobDirectory.name}"/>
        <liferay-ui:search-container-column-text name="Статус архивности" value="${jobDirectory.archiveStatus}"/>
        <liferay-ui:search-container-column-text name="Действия">
            <liferay-ui:icon-menu>
                <portlet:renderURL var="editURL">
                    <portlet:param name="jobDirectoryId"
                                   value="<%= String.valueOf(jobDirectory.getJobDirectoryId()) %>"/>
                    <portlet:param name="mvcPath" value="/jsp/jobDirectory/update_jobDirectory.jsp"/>
                </portlet:renderURL>

                <liferay-ui:icon image="edit" message="Обновить"
                                 url="<%=editURL.toString() %>"/>
                <portlet:actionURL name="changeArchiveStatus" var="changeArchiveStatusURL">
                    <portlet:param name="jobDirectoryId"
                                   value="<%= String.valueOf(jobDirectory.getJobDirectoryId()) %>"/>
                </portlet:actionURL>

                <liferay-ui:icon image="edit" message="Изменить архивный статус"
                                 url="<%=changeArchiveStatusURL.toString() %>"/>
            </liferay-ui:icon-menu>
        </liferay-ui:search-container-column-text>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row cssClass="guestbook-buttons">
    <portlet:renderURL var="addJobDirectoryURL">
        <portlet:param name="mvcPath" value="/jsp/jobDirectory/add_jobDirectory.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= addJobDirectoryURL.toString() %>" value="Добавить должность">
    </aui:button>
</aui:button-row>
