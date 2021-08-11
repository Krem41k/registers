package com.meera.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author LiferaySavvy
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
    private Employee _employee;

    public EmployeeWrapper(Employee employee) {
        _employee = employee;
    }

    @Override
    public Class<?> getModelClass() {
        return Employee.class;
    }

    @Override
    public String getModelClassName() {
        return Employee.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeId", getEmployeeId());
        attributes.put("surname", getSurname());
        attributes.put("name", getName());
        attributes.put("patronymic", getPatronymic());
        attributes.put("employeeGender", getEmployeeGender());
        attributes.put("dateOfBirth", getDateOfBirth());
        attributes.put("employeePosition", getEmployeePosition());
        attributes.put("employeeSalary", getEmployeeSalary());
        attributes.put("employeeWorkPhoneNumber", getEmployeeWorkPhoneNumber());
        attributes.put("employeeMobilePhoneNumber",
            getEmployeeMobilePhoneNumber());
        attributes.put("bankOrganization", getBankOrganization());
        attributes.put("archiveStatus", getArchiveStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        String surname = (String) attributes.get("surname");

        if (surname != null) {
            setSurname(surname);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String patronymic = (String) attributes.get("patronymic");

        if (patronymic != null) {
            setPatronymic(patronymic);
        }

        String employeeGender = (String) attributes.get("employeeGender");

        if (employeeGender != null) {
            setEmployeeGender(employeeGender);
        }

        Date dateOfBirth = (Date) attributes.get("dateOfBirth");

        if (dateOfBirth != null) {
            setDateOfBirth(dateOfBirth);
        }

        String employeePosition = (String) attributes.get("employeePosition");

        if (employeePosition != null) {
            setEmployeePosition(employeePosition);
        }

        Integer employeeSalary = (Integer) attributes.get("employeeSalary");

        if (employeeSalary != null) {
            setEmployeeSalary(employeeSalary);
        }

        String employeeWorkPhoneNumber = (String) attributes.get(
                "employeeWorkPhoneNumber");

        if (employeeWorkPhoneNumber != null) {
            setEmployeeWorkPhoneNumber(employeeWorkPhoneNumber);
        }

        String employeeMobilePhoneNumber = (String) attributes.get(
                "employeeMobilePhoneNumber");

        if (employeeMobilePhoneNumber != null) {
            setEmployeeMobilePhoneNumber(employeeMobilePhoneNumber);
        }

        String bankOrganization = (String) attributes.get("bankOrganization");

        if (bankOrganization != null) {
            setBankOrganization(bankOrganization);
        }

        String archiveStatus = (String) attributes.get("archiveStatus");

        if (archiveStatus != null) {
            setArchiveStatus(archiveStatus);
        }
    }

    /**
    * Returns the primary key of this employee.
    *
    * @return the primary key of this employee
    */
    @Override
    public long getPrimaryKey() {
        return _employee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee.
    *
    * @param primaryKey the primary key of this employee
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee ID of this employee.
    *
    * @return the employee ID of this employee
    */
    @Override
    public long getEmployeeId() {
        return _employee.getEmployeeId();
    }

    /**
    * Sets the employee ID of this employee.
    *
    * @param employeeId the employee ID of this employee
    */
    @Override
    public void setEmployeeId(long employeeId) {
        _employee.setEmployeeId(employeeId);
    }

    /**
    * Returns the surname of this employee.
    *
    * @return the surname of this employee
    */
    @Override
    public java.lang.String getSurname() {
        return _employee.getSurname();
    }

    /**
    * Sets the surname of this employee.
    *
    * @param surname the surname of this employee
    */
    @Override
    public void setSurname(java.lang.String surname) {
        _employee.setSurname(surname);
    }

    /**
    * Returns the name of this employee.
    *
    * @return the name of this employee
    */
    @Override
    public java.lang.String getName() {
        return _employee.getName();
    }

    /**
    * Sets the name of this employee.
    *
    * @param name the name of this employee
    */
    @Override
    public void setName(java.lang.String name) {
        _employee.setName(name);
    }

    /**
    * Returns the patronymic of this employee.
    *
    * @return the patronymic of this employee
    */
    @Override
    public java.lang.String getPatronymic() {
        return _employee.getPatronymic();
    }

    /**
    * Sets the patronymic of this employee.
    *
    * @param patronymic the patronymic of this employee
    */
    @Override
    public void setPatronymic(java.lang.String patronymic) {
        _employee.setPatronymic(patronymic);
    }

    /**
    * Returns the employee gender of this employee.
    *
    * @return the employee gender of this employee
    */
    @Override
    public java.lang.String getEmployeeGender() {
        return _employee.getEmployeeGender();
    }

    /**
    * Sets the employee gender of this employee.
    *
    * @param employeeGender the employee gender of this employee
    */
    @Override
    public void setEmployeeGender(java.lang.String employeeGender) {
        _employee.setEmployeeGender(employeeGender);
    }

    /**
    * Returns the date of birth of this employee.
    *
    * @return the date of birth of this employee
    */
    @Override
    public java.util.Date getDateOfBirth() {
        return _employee.getDateOfBirth();
    }

    /**
    * Sets the date of birth of this employee.
    *
    * @param dateOfBirth the date of birth of this employee
    */
    @Override
    public void setDateOfBirth(java.util.Date dateOfBirth) {
        _employee.setDateOfBirth(dateOfBirth);
    }

    /**
    * Returns the employee position of this employee.
    *
    * @return the employee position of this employee
    */
    @Override
    public java.lang.String getEmployeePosition() {
        return _employee.getEmployeePosition();
    }

    /**
    * Sets the employee position of this employee.
    *
    * @param employeePosition the employee position of this employee
    */
    @Override
    public void setEmployeePosition(java.lang.String employeePosition) {
        _employee.setEmployeePosition(employeePosition);
    }

    /**
    * Returns the employee salary of this employee.
    *
    * @return the employee salary of this employee
    */
    @Override
    public int getEmployeeSalary() {
        return _employee.getEmployeeSalary();
    }

    /**
    * Sets the employee salary of this employee.
    *
    * @param employeeSalary the employee salary of this employee
    */
    @Override
    public void setEmployeeSalary(int employeeSalary) {
        _employee.setEmployeeSalary(employeeSalary);
    }

    /**
    * Returns the employee work phone number of this employee.
    *
    * @return the employee work phone number of this employee
    */
    @Override
    public java.lang.String getEmployeeWorkPhoneNumber() {
        return _employee.getEmployeeWorkPhoneNumber();
    }

    /**
    * Sets the employee work phone number of this employee.
    *
    * @param employeeWorkPhoneNumber the employee work phone number of this employee
    */
    @Override
    public void setEmployeeWorkPhoneNumber(
        java.lang.String employeeWorkPhoneNumber) {
        _employee.setEmployeeWorkPhoneNumber(employeeWorkPhoneNumber);
    }

    /**
    * Returns the employee mobile phone number of this employee.
    *
    * @return the employee mobile phone number of this employee
    */
    @Override
    public java.lang.String getEmployeeMobilePhoneNumber() {
        return _employee.getEmployeeMobilePhoneNumber();
    }

    /**
    * Sets the employee mobile phone number of this employee.
    *
    * @param employeeMobilePhoneNumber the employee mobile phone number of this employee
    */
    @Override
    public void setEmployeeMobilePhoneNumber(
        java.lang.String employeeMobilePhoneNumber) {
        _employee.setEmployeeMobilePhoneNumber(employeeMobilePhoneNumber);
    }

    /**
    * Returns the bank organization of this employee.
    *
    * @return the bank organization of this employee
    */
    @Override
    public java.lang.String getBankOrganization() {
        return _employee.getBankOrganization();
    }

    /**
    * Sets the bank organization of this employee.
    *
    * @param bankOrganization the bank organization of this employee
    */
    @Override
    public void setBankOrganization(java.lang.String bankOrganization) {
        _employee.setBankOrganization(bankOrganization);
    }

    /**
    * Returns the archive status of this employee.
    *
    * @return the archive status of this employee
    */
    @Override
    public java.lang.String getArchiveStatus() {
        return _employee.getArchiveStatus();
    }

    /**
    * Sets the archive status of this employee.
    *
    * @param archiveStatus the archive status of this employee
    */
    @Override
    public void setArchiveStatus(java.lang.String archiveStatus) {
        _employee.setArchiveStatus(archiveStatus);
    }

    @Override
    public boolean isNew() {
        return _employee.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeWrapper((Employee) _employee.clone());
    }

    @Override
    public int compareTo(com.meera.db.model.Employee employee) {
        return _employee.compareTo(employee);
    }

    @Override
    public int hashCode() {
        return _employee.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.meera.db.model.Employee> toCacheModel() {
        return _employee.toCacheModel();
    }

    @Override
    public com.meera.db.model.Employee toEscapedModel() {
        return new EmployeeWrapper(_employee.toEscapedModel());
    }

    @Override
    public com.meera.db.model.Employee toUnescapedModel() {
        return new EmployeeWrapper(_employee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeWrapper)) {
            return false;
        }

        EmployeeWrapper employeeWrapper = (EmployeeWrapper) obj;

        if (Validator.equals(_employee, employeeWrapper._employee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee getWrappedEmployee() {
        return _employee;
    }

    @Override
    public Employee getWrappedModel() {
        return _employee;
    }

    @Override
    public void resetOriginalValues() {
        _employee.resetOriginalValues();
    }
}
