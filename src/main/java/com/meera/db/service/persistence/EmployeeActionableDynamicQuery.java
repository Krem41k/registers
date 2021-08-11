package com.meera.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.meera.db.model.Employee;
import com.meera.db.service.EmployeeLocalServiceUtil;

/**
 * @author LiferaySavvy
 * @generated
 */
public abstract class EmployeeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EmployeeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EmployeeLocalServiceUtil.getService());
        setClass(Employee.class);

        setClassLoader(com.meera.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("employeeId");
    }
}
