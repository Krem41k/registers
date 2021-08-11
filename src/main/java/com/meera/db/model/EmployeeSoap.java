package com.meera.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LiferaySavvy
 * @generated
 */
public class EmployeeSoap implements Serializable {
    private long _employeeId;
    private String _surname;
    private String _name;
    private String _patronymic;
    private String _employeeGender;
    private Date _dateOfBirth;
    private String _employeePosition;
    private int _employeeSalary;
    private String _employeeWorkPhoneNumber;
    private String _employeeMobilePhoneNumber;
    private String _bankOrganization;
    private String _archiveStatus;

    public EmployeeSoap() {
    }

    public static EmployeeSoap toSoapModel(Employee model) {
        EmployeeSoap soapModel = new EmployeeSoap();

        soapModel.setEmployeeId(model.getEmployeeId());
        soapModel.setSurname(model.getSurname());
        soapModel.setName(model.getName());
        soapModel.setPatronymic(model.getPatronymic());
        soapModel.setEmployeeGender(model.getEmployeeGender());
        soapModel.setDateOfBirth(model.getDateOfBirth());
        soapModel.setEmployeePosition(model.getEmployeePosition());
        soapModel.setEmployeeSalary(model.getEmployeeSalary());
        soapModel.setEmployeeWorkPhoneNumber(model.getEmployeeWorkPhoneNumber());
        soapModel.setEmployeeMobilePhoneNumber(model.getEmployeeMobilePhoneNumber());
        soapModel.setBankOrganization(model.getBankOrganization());
        soapModel.setArchiveStatus(model.getArchiveStatus());

        return soapModel;
    }

    public static EmployeeSoap[] toSoapModels(Employee[] models) {
        EmployeeSoap[] soapModels = new EmployeeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[][] toSoapModels(Employee[][] models) {
        EmployeeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmployeeSoap[models.length][models[0].length];
        } else {
            soapModels = new EmployeeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[] toSoapModels(List<Employee> models) {
        List<EmployeeSoap> soapModels = new ArrayList<EmployeeSoap>(models.size());

        for (Employee model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmployeeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _employeeId;
    }

    public void setPrimaryKey(long pk) {
        setEmployeeId(pk);
    }

    public long getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;
    }

    public String getSurname() {
        return _surname;
    }

    public void setSurname(String surname) {
        _surname = surname;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getPatronymic() {
        return _patronymic;
    }

    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;
    }

    public String getEmployeeGender() {
        return _employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        _employeeGender = employeeGender;
    }

    public Date getDateOfBirth() {
        return _dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        _dateOfBirth = dateOfBirth;
    }

    public String getEmployeePosition() {
        return _employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        _employeePosition = employeePosition;
    }

    public int getEmployeeSalary() {
        return _employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        _employeeSalary = employeeSalary;
    }

    public String getEmployeeWorkPhoneNumber() {
        return _employeeWorkPhoneNumber;
    }

    public void setEmployeeWorkPhoneNumber(String employeeWorkPhoneNumber) {
        _employeeWorkPhoneNumber = employeeWorkPhoneNumber;
    }

    public String getEmployeeMobilePhoneNumber() {
        return _employeeMobilePhoneNumber;
    }

    public void setEmployeeMobilePhoneNumber(String employeeMobilePhoneNumber) {
        _employeeMobilePhoneNumber = employeeMobilePhoneNumber;
    }

    public String getBankOrganization() {
        return _bankOrganization;
    }

    public void setBankOrganization(String bankOrganization) {
        _bankOrganization = bankOrganization;
    }

    public String getArchiveStatus() {
        return _archiveStatus;
    }

    public void setArchiveStatus(String archiveStatus) {
        _archiveStatus = archiveStatus;
    }
}
