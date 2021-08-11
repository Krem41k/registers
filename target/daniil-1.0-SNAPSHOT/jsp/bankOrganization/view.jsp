<%@page import="java.util.List" %>
<%@ page import="com.meera.db.model.BankOrganization" %>
<%@ page import="com.meera.db.service.BankOrganizationLocalServiceUtil" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    List<BankOrganization> bankOrganizationList = BankOrganizationLocalServiceUtil.getBankOrganizations(0, BankOrganizationLocalServiceUtil.getBankOrganizationsCount());

%>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= bankOrganizationList %>"
    />

    <liferay-ui:search-container-row
            className="com.meera.db.model.BankOrganization"
            modelVar="bankOrganization"
    >
        <liferay-ui:search-container-column-text name="ID банковской организации"
                                                 value="${bankOrganization.bankOrganizationId}"/>
        <liferay-ui:search-container-column-text name="Название" value="${bankOrganization.name}"/>
        <liferay-ui:search-container-column-text name="БИК" value="${bankOrganization.BIK}"/>
        <liferay-ui:search-container-column-text name="Адрес" value="${bankOrganization.adress}"/>
        <liferay-ui:search-container-column-text name="Действия">
            <liferay-ui:icon-menu>
                <portlet:renderURL var="editURL">
                    <portlet:param name="bankOrganizationId"
                                   value="<%= String.valueOf(bankOrganization.getBankOrganizationId()) %>"/>
                    <portlet:param name="mvcPath" value="/jsp/bankOrganization/update_bankOrganization.jsp"/>
                </portlet:renderURL>

                <liferay-ui:icon image="edit" message="Обновить"
                                 url="<%=editURL.toString() %>"/>

            </liferay-ui:icon-menu>
        </liferay-ui:search-container-column-text>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row cssClass="guestbook-buttons">
    <portlet:renderURL var="addBankOrganizationURL">
        <portlet:param name="mvcPath" value="/jsp/bankOrganization/add_bankOrganization.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= addBankOrganizationURL.toString() %>" value="Добавить организацию">
    </aui:button>
</aui:button-row>
