package com.meera.db.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;Employees_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.meera.db.model.impl.EmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.meera.db.model.impl.EmployeeImpl}.
 * </p>
 *
 * @author LiferaySavvy
 * @see Employee
 * @see com.meera.db.model.impl.EmployeeImpl
 * @see com.meera.db.model.impl.EmployeeModelImpl
 * @generated
 */
public interface EmployeeModel extends BaseModel<Employee> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
     */

    /**
     * Returns the primary key of this employee.
     *
     * @return the primary key of this employee
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this employee.
     *
     * @param primaryKey the primary key of this employee
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the employee ID of this employee.
     *
     * @return the employee ID of this employee
     */
    public long getEmployeeId();

    /**
     * Sets the employee ID of this employee.
     *
     * @param employeeId the employee ID of this employee
     */
    public void setEmployeeId(long employeeId);

    /**
     * Returns the surname of this employee.
     *
     * @return the surname of this employee
     */
    @AutoEscape
    public String getSurname();

    /**
     * Sets the surname of this employee.
     *
     * @param surname the surname of this employee
     */
    public void setSurname(String surname);

    /**
     * Returns the name of this employee.
     *
     * @return the name of this employee
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this employee.
     *
     * @param name the name of this employee
     */
    public void setName(String name);

    /**
     * Returns the patronymic of this employee.
     *
     * @return the patronymic of this employee
     */
    @AutoEscape
    public String getPatronymic();

    /**
     * Sets the patronymic of this employee.
     *
     * @param patronymic the patronymic of this employee
     */
    public void setPatronymic(String patronymic);

    /**
     * Returns the employee gender of this employee.
     *
     * @return the employee gender of this employee
     */
    @AutoEscape
    public String getEmployeeGender();

    /**
     * Sets the employee gender of this employee.
     *
     * @param employeeGender the employee gender of this employee
     */
    public void setEmployeeGender(String employeeGender);

    /**
     * Returns the date of birth of this employee.
     *
     * @return the date of birth of this employee
     */
    public Date getDateOfBirth();

    /**
     * Sets the date of birth of this employee.
     *
     * @param dateOfBirth the date of birth of this employee
     */
    public void setDateOfBirth(Date dateOfBirth);

    /**
     * Returns the employee position of this employee.
     *
     * @return the employee position of this employee
     */
    @AutoEscape
    public String getEmployeePosition();

    /**
     * Sets the employee position of this employee.
     *
     * @param employeePosition the employee position of this employee
     */
    public void setEmployeePosition(String employeePosition);

    /**
     * Returns the employee salary of this employee.
     *
     * @return the employee salary of this employee
     */
    public int getEmployeeSalary();

    /**
     * Sets the employee salary of this employee.
     *
     * @param employeeSalary the employee salary of this employee
     */
    public void setEmployeeSalary(int employeeSalary);

    /**
     * Returns the employee work phone number of this employee.
     *
     * @return the employee work phone number of this employee
     */
    @AutoEscape
    public String getEmployeeWorkPhoneNumber();

    /**
     * Sets the employee work phone number of this employee.
     *
     * @param employeeWorkPhoneNumber the employee work phone number of this employee
     */
    public void setEmployeeWorkPhoneNumber(String employeeWorkPhoneNumber);

    /**
     * Returns the employee mobile phone number of this employee.
     *
     * @return the employee mobile phone number of this employee
     */
    @AutoEscape
    public String getEmployeeMobilePhoneNumber();

    /**
     * Sets the employee mobile phone number of this employee.
     *
     * @param employeeMobilePhoneNumber the employee mobile phone number of this employee
     */
    public void setEmployeeMobilePhoneNumber(String employeeMobilePhoneNumber);

    /**
     * Returns the bank organization of this employee.
     *
     * @return the bank organization of this employee
     */
    @AutoEscape
    public String getBankOrganization();

    /**
     * Sets the bank organization of this employee.
     *
     * @param bankOrganization the bank organization of this employee
     */
    public void setBankOrganization(String bankOrganization);

    /**
     * Returns the archive status of this employee.
     *
     * @return the archive status of this employee
     */
    @AutoEscape
    public String getArchiveStatus();

    /**
     * Sets the archive status of this employee.
     *
     * @param archiveStatus the archive status of this employee
     */
    public void setArchiveStatus(String archiveStatus);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.meera.db.model.Employee employee);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.meera.db.model.Employee> toCacheModel();

    @Override
    public com.meera.db.model.Employee toEscapedModel();

    @Override
    public com.meera.db.model.Employee toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}