package com.meera.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.meera.db.model.JobDirectory;

import java.util.List;

/**
 * The persistence utility for the job directory service. This utility wraps {@link JobDirectoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LiferaySavvy
 * @see JobDirectoryPersistence
 * @see JobDirectoryPersistenceImpl
 * @generated
 */
public class JobDirectoryUtil {
    private static JobDirectoryPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(JobDirectory jobDirectory) {
        getPersistence().clearCache(jobDirectory);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<JobDirectory> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<JobDirectory> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<JobDirectory> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static JobDirectory update(JobDirectory jobDirectory)
        throws SystemException {
        return getPersistence().update(jobDirectory);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static JobDirectory update(JobDirectory jobDirectory,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(jobDirectory, serviceContext);
    }

    /**
    * Caches the job directory in the entity cache if it is enabled.
    *
    * @param jobDirectory the job directory
    */
    public static void cacheResult(com.meera.db.model.JobDirectory jobDirectory) {
        getPersistence().cacheResult(jobDirectory);
    }

    /**
    * Caches the job directories in the entity cache if it is enabled.
    *
    * @param jobDirectories the job directories
    */
    public static void cacheResult(
        java.util.List<com.meera.db.model.JobDirectory> jobDirectories) {
        getPersistence().cacheResult(jobDirectories);
    }

    /**
    * Creates a new job directory with the primary key. Does not add the job directory to the database.
    *
    * @param jobDirectoryId the primary key for the new job directory
    * @return the new job directory
    */
    public static com.meera.db.model.JobDirectory create(long jobDirectoryId) {
        return getPersistence().create(jobDirectoryId);
    }

    /**
    * Removes the job directory with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param jobDirectoryId the primary key of the job directory
    * @return the job directory that was removed
    * @throws com.meera.db.NoSuchJobDirectoryException if a job directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.db.model.JobDirectory remove(long jobDirectoryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.db.NoSuchJobDirectoryException {
        return getPersistence().remove(jobDirectoryId);
    }

    public static com.meera.db.model.JobDirectory updateImpl(
        com.meera.db.model.JobDirectory jobDirectory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(jobDirectory);
    }

    /**
    * Returns the job directory with the primary key or throws a {@link com.meera.db.NoSuchJobDirectoryException} if it could not be found.
    *
    * @param jobDirectoryId the primary key of the job directory
    * @return the job directory
    * @throws com.meera.db.NoSuchJobDirectoryException if a job directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.db.model.JobDirectory findByPrimaryKey(
        long jobDirectoryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.db.NoSuchJobDirectoryException {
        return getPersistence().findByPrimaryKey(jobDirectoryId);
    }

    /**
    * Returns the job directory with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param jobDirectoryId the primary key of the job directory
    * @return the job directory, or <code>null</code> if a job directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.db.model.JobDirectory fetchByPrimaryKey(
        long jobDirectoryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(jobDirectoryId);
    }

    /**
    * Returns all the job directories.
    *
    * @return the job directories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meera.db.model.JobDirectory> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the job directories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.JobDirectoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of job directories
    * @param end the upper bound of the range of job directories (not inclusive)
    * @return the range of job directories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meera.db.model.JobDirectory> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the job directories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.JobDirectoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of job directories
    * @param end the upper bound of the range of job directories (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of job directories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meera.db.model.JobDirectory> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the job directories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of job directories.
    *
    * @return the number of job directories
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static JobDirectoryPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (JobDirectoryPersistence) PortletBeanLocatorUtil.locate(com.meera.db.service.ClpSerializer.getServletContextName(),
                    JobDirectoryPersistence.class.getName());

            ReferenceRegistry.registerReference(JobDirectoryUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(JobDirectoryPersistence persistence) {
    }
}
