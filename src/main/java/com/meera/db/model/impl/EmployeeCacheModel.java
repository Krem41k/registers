package com.meera.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.meera.db.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author LiferaySavvy
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
    public long employeeId;
    public String surname;
    public String name;
    public String patronymic;
    public String employeeGender;
    public long dateOfBirth;
    public String employeePosition;
    public int employeeSalary;
    public String employeeWorkPhoneNumber;
    public String employeeMobilePhoneNumber;
    public String bankOrganization;
    public String archiveStatus;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{employeeId=");
        sb.append(employeeId);
        sb.append(", surname=");
        sb.append(surname);
        sb.append(", name=");
        sb.append(name);
        sb.append(", patronymic=");
        sb.append(patronymic);
        sb.append(", employeeGender=");
        sb.append(employeeGender);
        sb.append(", dateOfBirth=");
        sb.append(dateOfBirth);
        sb.append(", employeePosition=");
        sb.append(employeePosition);
        sb.append(", employeeSalary=");
        sb.append(employeeSalary);
        sb.append(", employeeWorkPhoneNumber=");
        sb.append(employeeWorkPhoneNumber);
        sb.append(", employeeMobilePhoneNumber=");
        sb.append(employeeMobilePhoneNumber);
        sb.append(", bankOrganization=");
        sb.append(bankOrganization);
        sb.append(", archiveStatus=");
        sb.append(archiveStatus);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setEmployeeId(employeeId);

        if (surname == null) {
            employeeImpl.setSurname(StringPool.BLANK);
        } else {
            employeeImpl.setSurname(surname);
        }

        if (name == null) {
            employeeImpl.setName(StringPool.BLANK);
        } else {
            employeeImpl.setName(name);
        }

        if (patronymic == null) {
            employeeImpl.setPatronymic(StringPool.BLANK);
        } else {
            employeeImpl.setPatronymic(patronymic);
        }

        if (employeeGender == null) {
            employeeImpl.setEmployeeGender(StringPool.BLANK);
        } else {
            employeeImpl.setEmployeeGender(employeeGender);
        }

        if (dateOfBirth == Long.MIN_VALUE) {
            employeeImpl.setDateOfBirth(null);
        } else {
            employeeImpl.setDateOfBirth(new Date(dateOfBirth));
        }

        if (employeePosition == null) {
            employeeImpl.setEmployeePosition(StringPool.BLANK);
        } else {
            employeeImpl.setEmployeePosition(employeePosition);
        }

        employeeImpl.setEmployeeSalary(employeeSalary);

        if (employeeWorkPhoneNumber == null) {
            employeeImpl.setEmployeeWorkPhoneNumber(StringPool.BLANK);
        } else {
            employeeImpl.setEmployeeWorkPhoneNumber(employeeWorkPhoneNumber);
        }

        if (employeeMobilePhoneNumber == null) {
            employeeImpl.setEmployeeMobilePhoneNumber(StringPool.BLANK);
        } else {
            employeeImpl.setEmployeeMobilePhoneNumber(employeeMobilePhoneNumber);
        }

        if (bankOrganization == null) {
            employeeImpl.setBankOrganization(StringPool.BLANK);
        } else {
            employeeImpl.setBankOrganization(bankOrganization);
        }

        if (archiveStatus == null) {
            employeeImpl.setArchiveStatus(StringPool.BLANK);
        } else {
            employeeImpl.setArchiveStatus(archiveStatus);
        }

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employeeId = objectInput.readLong();
        surname = objectInput.readUTF();
        name = objectInput.readUTF();
        patronymic = objectInput.readUTF();
        employeeGender = objectInput.readUTF();
        dateOfBirth = objectInput.readLong();
        employeePosition = objectInput.readUTF();
        employeeSalary = objectInput.readInt();
        employeeWorkPhoneNumber = objectInput.readUTF();
        employeeMobilePhoneNumber = objectInput.readUTF();
        bankOrganization = objectInput.readUTF();
        archiveStatus = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(employeeId);

        if (surname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(surname);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (patronymic == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(patronymic);
        }

        if (employeeGender == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employeeGender);
        }

        objectOutput.writeLong(dateOfBirth);

        if (employeePosition == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employeePosition);
        }

        objectOutput.writeInt(employeeSalary);

        if (employeeWorkPhoneNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employeeWorkPhoneNumber);
        }

        if (employeeMobilePhoneNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employeeMobilePhoneNumber);
        }

        if (bankOrganization == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bankOrganization);
        }

        if (archiveStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(archiveStatus);
        }
    }
}
