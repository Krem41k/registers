<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<portlet:defineObjects/>
<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/jsp/bankOrganization/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addBankOrganization" var="addBankOrganizationURL"></portlet:actionURL>

<aui:form action="<%= addBankOrganizationURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>

        <aui:input name="name" label="Название банковской организации"></aui:input>
        <aui:input name="BIK" label="БИК"></aui:input>
        <aui:input name="adress" label="Адрес"></aui:input>

    </aui:fieldset>

    <aui:button-row>

        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

    </aui:button-row>
</aui:form>