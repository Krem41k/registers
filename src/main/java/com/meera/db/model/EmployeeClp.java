package com.meera.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.meera.db.service.ClpSerializer;
import com.meera.db.service.EmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EmployeeClp extends BaseModelImpl<Employee> implements Employee {
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
    private BaseModel<?> _employeeRemoteModel;
    private Class<?> _clpSerializerClass = com.meera.db.service.ClpSerializer.class;

    public EmployeeClp() {
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
    public long getPrimaryKey() {
        return _employeeId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmployeeId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employeeId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getEmployeeId() {
        return _employeeId;
    }

    @Override
    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeId", long.class);

                method.invoke(_employeeRemoteModel, employeeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSurname() {
        return _surname;
    }

    @Override
    public void setSurname(String surname) {
        _surname = surname;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setSurname", String.class);

                method.invoke(_employeeRemoteModel, surname);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_employeeRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPatronymic() {
        return _patronymic;
    }

    @Override
    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setPatronymic", String.class);

                method.invoke(_employeeRemoteModel, patronymic);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmployeeGender() {
        return _employeeGender;
    }

    @Override
    public void setEmployeeGender(String employeeGender) {
        _employeeGender = employeeGender;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeGender",
                        String.class);

                method.invoke(_employeeRemoteModel, employeeGender);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDateOfBirth() {
        return _dateOfBirth;
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {
        _dateOfBirth = dateOfBirth;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setDateOfBirth", Date.class);

                method.invoke(_employeeRemoteModel, dateOfBirth);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmployeePosition() {
        return _employeePosition;
    }

    @Override
    public void setEmployeePosition(String employeePosition) {
        _employeePosition = employeePosition;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeePosition",
                        String.class);

                method.invoke(_employeeRemoteModel, employeePosition);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getEmployeeSalary() {
        return _employeeSalary;
    }

    @Override
    public void setEmployeeSalary(int employeeSalary) {
        _employeeSalary = employeeSalary;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeSalary", int.class);

                method.invoke(_employeeRemoteModel, employeeSalary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmployeeWorkPhoneNumber() {
        return _employeeWorkPhoneNumber;
    }

    @Override
    public void setEmployeeWorkPhoneNumber(String employeeWorkPhoneNumber) {
        _employeeWorkPhoneNumber = employeeWorkPhoneNumber;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeWorkPhoneNumber",
                        String.class);

                method.invoke(_employeeRemoteModel, employeeWorkPhoneNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmployeeMobilePhoneNumber() {
        return _employeeMobilePhoneNumber;
    }

    @Override
    public void setEmployeeMobilePhoneNumber(String employeeMobilePhoneNumber) {
        _employeeMobilePhoneNumber = employeeMobilePhoneNumber;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeMobilePhoneNumber",
                        String.class);

                method.invoke(_employeeRemoteModel, employeeMobilePhoneNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBankOrganization() {
        return _bankOrganization;
    }

    @Override
    public void setBankOrganization(String bankOrganization) {
        _bankOrganization = bankOrganization;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setBankOrganization",
                        String.class);

                method.invoke(_employeeRemoteModel, bankOrganization);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getArchiveStatus() {
        return _archiveStatus;
    }

    @Override
    public void setArchiveStatus(String archiveStatus) {
        _archiveStatus = archiveStatus;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setArchiveStatus", String.class);

                method.invoke(_employeeRemoteModel, archiveStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmployeeRemoteModel() {
        return _employeeRemoteModel;
    }

    public void setEmployeeRemoteModel(BaseModel<?> employeeRemoteModel) {
        _employeeRemoteModel = employeeRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _employeeRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_employeeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeLocalServiceUtil.addEmployee(this);
        } else {
            EmployeeLocalServiceUtil.updateEmployee(this);
        }
    }

    @Override
    public Employee toEscapedModel() {
        return (Employee) ProxyUtil.newProxyInstance(Employee.class.getClassLoader(),
            new Class[] { Employee.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EmployeeClp clone = new EmployeeClp();

        clone.setEmployeeId(getEmployeeId());
        clone.setSurname(getSurname());
        clone.setName(getName());
        clone.setPatronymic(getPatronymic());
        clone.setEmployeeGender(getEmployeeGender());
        clone.setDateOfBirth(getDateOfBirth());
        clone.setEmployeePosition(getEmployeePosition());
        clone.setEmployeeSalary(getEmployeeSalary());
        clone.setEmployeeWorkPhoneNumber(getEmployeeWorkPhoneNumber());
        clone.setEmployeeMobilePhoneNumber(getEmployeeMobilePhoneNumber());
        clone.setBankOrganization(getBankOrganization());
        clone.setArchiveStatus(getArchiveStatus());

        return clone;
    }

    @Override
    public int compareTo(Employee employee) {
        int value = 0;

        if (getEmployeeId() < employee.getEmployeeId()) {
            value = -1;
        } else if (getEmployeeId() > employee.getEmployeeId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeClp)) {
            return false;
        }

        EmployeeClp employee = (EmployeeClp) obj;

        long primaryKey = employee.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{employeeId=");
        sb.append(getEmployeeId());
        sb.append(", surname=");
        sb.append(getSurname());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", patronymic=");
        sb.append(getPatronymic());
        sb.append(", employeeGender=");
        sb.append(getEmployeeGender());
        sb.append(", dateOfBirth=");
        sb.append(getDateOfBirth());
        sb.append(", employeePosition=");
        sb.append(getEmployeePosition());
        sb.append(", employeeSalary=");
        sb.append(getEmployeeSalary());
        sb.append(", employeeWorkPhoneNumber=");
        sb.append(getEmployeeWorkPhoneNumber());
        sb.append(", employeeMobilePhoneNumber=");
        sb.append(getEmployeeMobilePhoneNumber());
        sb.append(", bankOrganization=");
        sb.append(getBankOrganization());
        sb.append(", archiveStatus=");
        sb.append(getArchiveStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("com.meera.db.model.Employee");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>surname</column-name><column-value><![CDATA[");
        sb.append(getSurname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>patronymic</column-name><column-value><![CDATA[");
        sb.append(getPatronymic());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeGender</column-name><column-value><![CDATA[");
        sb.append(getEmployeeGender());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
        sb.append(getDateOfBirth());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeePosition</column-name><column-value><![CDATA[");
        sb.append(getEmployeePosition());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeSalary</column-name><column-value><![CDATA[");
        sb.append(getEmployeeSalary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeWorkPhoneNumber</column-name><column-value><![CDATA[");
        sb.append(getEmployeeWorkPhoneNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeMobilePhoneNumber</column-name><column-value><![CDATA[");
        sb.append(getEmployeeMobilePhoneNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankOrganization</column-name><column-value><![CDATA[");
        sb.append(getBankOrganization());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archiveStatus</column-name><column-value><![CDATA[");
        sb.append(getArchiveStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
