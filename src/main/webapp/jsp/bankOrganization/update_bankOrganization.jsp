<%@ page import="com.meera.db.model.BankOrganization" %>
<%@ page import="com.meera.db.service.BankOrganizationLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<portlet:defineObjects/>
<%
    BankOrganization bankOrganization = null;

    long bankOrganizationId = ParamUtil.getLong(request, "bankOrganizationId");

    if (bankOrganizationId > 0) {
        bankOrganization = BankOrganizationLocalServiceUtil.getBankOrganization(bankOrganizationId);
    }


    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= bankOrganization %>" model="<%= BankOrganization.class %>"/>
<portlet:renderURL var="viewBankOrganizationURL"/>
<portlet:actionURL name='<%= bankOrganization == null ? "addBankOrganization" : "updateBankOrganization" %>'
                   var="editBankOrganizationIdURL" windowState="normal"/>

<liferay-ui:header
        backURL="<%= viewBankOrganizationURL %>"
        title='<%= (bankOrganization != null) ? bankOrganization.getName() : "Добавить новую организацию" %>'
/>

<aui:form action="<%= editBankOrganizationIdURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>"/>

        <aui:input name="bankOrganizationId" type="hidden"
                   value='<%= bankOrganization == null ? "" : bankOrganization.getBankOrganizationId() %>'/>

        <aui:input name="name" type="hidden" label="Название банковской организации"></aui:input>
        <aui:input name="BIK" label="БИК"></aui:input>
        <aui:input name="adress" label="Адрес"></aui:input>

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button onClick="<%=viewBankOrganizationURL %>" type="cancel"/>
    </aui:button-row>
</aui:form>