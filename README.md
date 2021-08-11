# registers
In this project, an application-register of employees of the organization has been developed.
There are three portlets.

The first portlet is the employee registry (EmployeeMVCPortletAction).
Portlet functionality: adding new records (via a separate page) for employees 
and displaying general information on employees in the form of a table with a choice of available actions for each record:
1) Changing an employee's record - this feature is implemented through a separate page, in which the user adds information about the employee.
2) send to archive \ restore from archive (pressing the button changes the value of the archive status).
3) Search for the right employee by last name.

The second portlet is the directory of banking organizations (BankOrganizationMVCPortletAction). 
Portlet functionality: adding new records for banking organizations (via a separate page) 
and displaying general information on banking organizations in the form of a table with a choice of available actions for each record:
Changing the data of a banking organization - this feature should be implemented through a separate page, in which the user adds information about the banking organization. 
When changing a record, the user can edit only the BIC and the address of the banking organization.

The third portlet is the Job Directory (JobDirectoryMVCPortletAction).
Portlet functionality: adding a record and displaying general information on positions in the form of a table with a choice of available actions for each record:
1) change the name.
2) send the recording to the archive / restore from the archive.

Technologies used: Java 6, liferay portal 6.2.5 ga6, tomcat 7.0.62, PostgreSQL, AlloyUI framework.
