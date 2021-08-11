package com.meera.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.meera.db.model.JobDirectory;

/**
 * The persistence interface for the job directory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LiferaySavvy
 * @see JobDirectoryPersistenceImpl
 * @see JobDirectoryUtil
 * @generated
 */
public interface JobDirectoryPersistence extends BasePersistence<JobDirectory> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link JobDirectoryUtil} to access the job directory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the job directory in the entity cache if it is enabled.
    *
    * @param jobDirectory the job directory
    */
    public void cacheResult(com.meera.db.model.JobDirectory jobDirectory);

    /**
    * Caches the job directories in the entity cache if it is enabled.
    *
    * @param jobDirectories the job directories
    */
    public void cacheResult(
        java.util.List<com.meera.db.model.JobDirectory> jobDirectories);

    /**
    * Creates a new job directory with the primary key. Does not add the job directory to the database.
    *
    * @param jobDirectoryId the primary key for the new job directory
    * @return the new job directory
    */
    public com.meera.db.model.JobDirectory create(long jobDirectoryId);

    /**
    * Removes the job directory with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param jobDirectoryId the primary key of the job directory
    * @return the job directory that was removed
    * @throws com.meera.db.NoSuchJobDirectoryException if a job directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.db.model.JobDirectory remove(long jobDirectoryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.db.NoSuchJobDirectoryException;

    public com.meera.db.model.JobDirectory updateImpl(
        com.meera.db.model.JobDirectory jobDirectory)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the job directory with the primary key or throws a {@link com.meera.db.NoSuchJobDirectoryException} if it could not be found.
    *
    * @param jobDirectoryId the primary key of the job directory
    * @return the job directory
    * @throws com.meera.db.NoSuchJobDirectoryException if a job directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.db.model.JobDirectory findByPrimaryKey(long jobDirectoryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.db.NoSuchJobDirectoryException;

    /**
    * Returns the job directory with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param jobDirectoryId the primary key of the job directory
    * @return the job directory, or <code>null</code> if a job directory with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.db.model.JobDirectory fetchByPrimaryKey(
        long jobDirectoryId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the job directories.
    *
    * @return the job directories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.meera.db.model.JobDirectory> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.meera.db.model.JobDirectory> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.meera.db.model.JobDirectory> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the job directories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of job directories.
    *
    * @return the number of job directories
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
