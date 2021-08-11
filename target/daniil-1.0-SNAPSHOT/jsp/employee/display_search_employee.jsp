<%@page import="javax.portlet.PortletURL" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="java.util.List" %>
<%@ page import="com.meera.db.model.Employee" %>
<%@ page import="com.meera.db.service.EmployeeLocalServiceUtil" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<liferay-theme:defineObjects/>
<portlet:defineObjects/>

<%
    PortletURL homeURL = renderResponse.createRenderURL();
    PortletURL dislayStudentt = renderResponse.createRenderURL();
    dislayStudentt.setParameter("mvcPath", "/jsp/employee/search_employee.jsp");
%>

<%
    String name = request.getParameter("surname");
    List<Employee> employeeList = EmployeeLocalServiceUtil.getEmployees(-1, -1);
    boolean employeeFound = false;
    for (Employee employee : employeeList) {
        if (employee.getSurname().equalsIgnoreCase(name)) {
            employeeFound = true;
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
%>
<b>Фамилия:</b>
<%=employee.getSurname() %>
</br>
<b>Имя:</b>
<%=employee.getName() %>
</br>
<b>Отчество:</b>
<%=employee.getPatronymic() %>
</br>
<b>Пол:</b>
<%=employee.getEmployeeGender() %>
</br>
<b>Дата рождения:</b>
<%=sdf.format(employee.getDateOfBirth())
%>
</br>
<b>Должность:</b>
<%=employee.getEmployeePosition() %>
</br>
<b>Заработная плата:</b>
<%=employee.getEmployeeSalary() %>
</br>
<b>Номер рабочего телефона:</b>
<%=employee.getEmployeeWorkPhoneNumber() %>
</br>
<b>Номер мобильного телефона:</b>
<%=employee.getEmployeeMobilePhoneNumber() %>
</br>
<b>Банковская организация:</b>
<%=employee.getBankOrganization() %>
</br>
<b>Статус архивности:</b>
<%=employee.getArchiveStatus() %>
</br>

<%
            break;
        }
    }
    if (!employeeFound)

        out.println("Работника с такой фамилией не найдено");

%>
<aui:button-row>
    <aui:button onClick="<%=homeURL.toString() %>" value="На главную"/>
</aui:button-row>