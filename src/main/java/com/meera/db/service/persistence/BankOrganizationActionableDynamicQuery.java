package com.meera.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.meera.db.model.BankOrganization;
import com.meera.db.service.BankOrganizationLocalServiceUtil;

/**
 * @author LiferaySavvy
 * @generated
 */
public abstract class BankOrganizationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BankOrganizationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BankOrganizationLocalServiceUtil.getService());
        setClass(BankOrganization.class);

        setClassLoader(com.meera.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bankOrganizationId");
    }
}
