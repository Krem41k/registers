create table Employees_BankOrganization (
	bankOrganizationId LONG not null primary key,
	name VARCHAR(75) null,
	BIK VARCHAR(75) null,
	adress VARCHAR(75) null
);

create table Employees_Employee (
	employeeId LONG not null primary key,
	surname VARCHAR(75) null,
	name VARCHAR(75) null,
	patronymic VARCHAR(75) null,
	employeeGender VARCHAR(75) null,
	dateOfBirth DATE null,
	employeePosition VARCHAR(75) null,
	employeeSalary INTEGER,
	employeeWorkPhoneNumber VARCHAR(75) null,
	employeeMobilePhoneNumber VARCHAR(75) null,
	bankOrganization VARCHAR(75) null,
	archiveStatus VARCHAR(75) null
);

create table Employees_JobDirectory (
	jobDirectoryId LONG not null primary key,
	name VARCHAR(75) null,
	archiveStatus VARCHAR(75) null
);