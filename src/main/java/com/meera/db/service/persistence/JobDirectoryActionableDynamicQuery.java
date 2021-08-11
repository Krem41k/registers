package com.meera.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.meera.db.model.JobDirectory;
import com.meera.db.service.JobDirectoryLocalServiceUtil;

/**
 * @author LiferaySavvy
 * @generated
 */
public abstract class JobDirectoryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public JobDirectoryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(JobDirectoryLocalServiceUtil.getService());
        setClass(JobDirectory.class);

        setClassLoader(com.meera.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("jobDirectoryId");
    }
}
