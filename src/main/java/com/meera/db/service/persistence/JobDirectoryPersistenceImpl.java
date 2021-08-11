package com.meera.db.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.meera.db.NoSuchJobDirectoryException;
import com.meera.db.model.JobDirectory;
import com.meera.db.model.impl.JobDirectoryImpl;
import com.meera.db.model.impl.JobDirectoryModelImpl;
import com.meera.db.service.persistence.JobDirectoryPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the job directory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LiferaySavvy
 * @see JobDirectoryPersistence
 * @see JobDirectoryUtil
 * @generated
 */
public class JobDirectoryPersistenceImpl extends BasePersistenceImpl<JobDirectory>
    implements JobDirectoryPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link JobDirectoryUtil} to access the job directory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = JobDirectoryImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JobDirectoryModelImpl.ENTITY_CACHE_ENABLED,
            JobDirectoryModelImpl.FINDER_CACHE_ENABLED, JobDirectoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JobDirectoryModelImpl.ENTITY_CACHE_ENABLED,
            JobDirectoryModelImpl.FINDER_CACHE_ENABLED, JobDirectoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JobDirectoryModelImpl.ENTITY_CACHE_ENABLED,
            JobDirectoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_JOBDIRECTORY = "SELECT jobDirectory FROM JobDirectory jobDirectory";
    private static final String _SQL_COUNT_JOBDIRECTORY = "SELECT COUNT(jobDirectory) FROM JobDirectory jobDirectory";
    private static final String _ORDER_BY_ENTITY_ALIAS = "jobDirectory.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No JobDirectory exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(JobDirectoryPersistenceImpl.class);
    private static JobDirectory _nullJobDirectory = new JobDirectoryImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<JobDirectory> toCacheModel() {
                return _nullJobDirectoryCacheModel;
            }
        };

    private static CacheModel<JobDirectory> _nullJobDirectoryCacheModel = new CacheModel<JobDirectory>() {
            @Override
            public JobDirectory toEntityModel() {
                return _nullJobDirectory;
            }
        };

    public JobDirectoryPersistenceImpl() {
        setModelClass(JobDirectory.class);
    }

    /**
     * Caches the job directory in the entity cache if it is enabled.
     *
     * @param jobDirectory the job directory
     */
    @Override
    public void cacheResult(JobDirectory jobDirectory) {
        EntityCacheUtil.putResult(JobDirectoryModelImpl.ENTITY_CACHE_ENABLED,
            JobDirectoryImpl.class, jobDirectory.getPrimaryKey(), jobDirectory);

        jobDirectory.resetOriginalValues();
    }

    /**
     * Caches the job directories in the entity cache if it is enabled.
     *
     * @param jobDirectories the job directories
     */
    @Override
    public void cacheResult(List<JobDirectory> jobDirectories) {
        for (JobDirectory jobDirectory : jobDirectories) {
            if (EntityCacheUtil.getResult(
                        JobDirectoryModelImpl.ENTITY_CACHE_ENABLED,
                        JobDirectoryImpl.class, jobDirectory.getPrimaryKey()) == null) {
                cacheResult(jobDirectory);
            } else {
                jobDirectory.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all job directories.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(JobDirectoryImpl.class.getName());
        }

        EntityCacheUtil.clearCache(JobDirectoryImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the job directory.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(JobDirectory jobDirectory) {
        EntityCacheUtil.removeResult(JobDirectoryModelImpl.ENTITY_CACHE_ENABLED,
            JobDirectoryImpl.class, jobDirectory.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<JobDirectory> jobDirectories) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (JobDirectory jobDirectory : jobDirectories) {
            EntityCacheUtil.removeResult(JobDirectoryModelImpl.ENTITY_CACHE_ENABLED,
                JobDirectoryImpl.class, jobDirectory.getPrimaryKey());
        }
    }

    /**
     * Creates a new job directory with the primary key. Does not add the job directory to the database.
     *
     * @param jobDirectoryId the primary key for the new job directory
     * @return the new job directory
     */
    @Override
    public JobDirectory create(long jobDirectoryId) {
        JobDirectory jobDirectory = new JobDirectoryImpl();

        jobDirectory.setNew(true);
        jobDirectory.setPrimaryKey(jobDirectoryId);

        return jobDirectory;
    }

    /**
     * Removes the job directory with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param jobDirectoryId the primary key of the job directory
     * @return the job directory that was removed
     * @throws com.meera.db.NoSuchJobDirectoryException if a job directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JobDirectory remove(long jobDirectoryId)
        throws NoSuchJobDirectoryException, SystemException {
        return remove((Serializable) jobDirectoryId);
    }

    /**
     * Removes the job directory with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the job directory
     * @return the job directory that was removed
     * @throws com.meera.db.NoSuchJobDirectoryException if a job directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JobDirectory remove(Serializable primaryKey)
        throws NoSuchJobDirectoryException, SystemException {
        Session session = null;

        try {
            session = openSession();

            JobDirectory jobDirectory = (JobDirectory) session.get(JobDirectoryImpl.class,
                    primaryKey);

            if (jobDirectory == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchJobDirectoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(jobDirectory);
        } catch (NoSuchJobDirectoryException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected JobDirectory removeImpl(JobDirectory jobDirectory)
        throws SystemException {
        jobDirectory = toUnwrappedModel(jobDirectory);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(jobDirectory)) {
                jobDirectory = (JobDirectory) session.get(JobDirectoryImpl.class,
                        jobDirectory.getPrimaryKeyObj());
            }

            if (jobDirectory != null) {
                session.delete(jobDirectory);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (jobDirectory != null) {
            clearCache(jobDirectory);
        }

        return jobDirectory;
    }

    @Override
    public JobDirectory updateImpl(com.meera.db.model.JobDirectory jobDirectory)
        throws SystemException {
        jobDirectory = toUnwrappedModel(jobDirectory);

        boolean isNew = jobDirectory.isNew();

        Session session = null;

        try {
            session = openSession();

            if (jobDirectory.isNew()) {
                session.save(jobDirectory);

                jobDirectory.setNew(false);
            } else {
                session.merge(jobDirectory);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(JobDirectoryModelImpl.ENTITY_CACHE_ENABLED,
            JobDirectoryImpl.class, jobDirectory.getPrimaryKey(), jobDirectory);

        return jobDirectory;
    }

    protected JobDirectory toUnwrappedModel(JobDirectory jobDirectory) {
        if (jobDirectory instanceof JobDirectoryImpl) {
            return jobDirectory;
        }

        JobDirectoryImpl jobDirectoryImpl = new JobDirectoryImpl();

        jobDirectoryImpl.setNew(jobDirectory.isNew());
        jobDirectoryImpl.setPrimaryKey(jobDirectory.getPrimaryKey());

        jobDirectoryImpl.setJobDirectoryId(jobDirectory.getJobDirectoryId());
        jobDirectoryImpl.setName(jobDirectory.getName());
        jobDirectoryImpl.setArchiveStatus(jobDirectory.getArchiveStatus());

        return jobDirectoryImpl;
    }

    /**
     * Returns the job directory with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the job directory
     * @return the job directory
     * @throws com.meera.db.NoSuchJobDirectoryException if a job directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JobDirectory findByPrimaryKey(Serializable primaryKey)
        throws NoSuchJobDirectoryException, SystemException {
        JobDirectory jobDirectory = fetchByPrimaryKey(primaryKey);

        if (jobDirectory == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchJobDirectoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return jobDirectory;
    }

    /**
     * Returns the job directory with the primary key or throws a {@link com.meera.db.NoSuchJobDirectoryException} if it could not be found.
     *
     * @param jobDirectoryId the primary key of the job directory
     * @return the job directory
     * @throws com.meera.db.NoSuchJobDirectoryException if a job directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JobDirectory findByPrimaryKey(long jobDirectoryId)
        throws NoSuchJobDirectoryException, SystemException {
        return findByPrimaryKey((Serializable) jobDirectoryId);
    }

    /**
     * Returns the job directory with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the job directory
     * @return the job directory, or <code>null</code> if a job directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JobDirectory fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        JobDirectory jobDirectory = (JobDirectory) EntityCacheUtil.getResult(JobDirectoryModelImpl.ENTITY_CACHE_ENABLED,
                JobDirectoryImpl.class, primaryKey);

        if (jobDirectory == _nullJobDirectory) {
            return null;
        }

        if (jobDirectory == null) {
            Session session = null;

            try {
                session = openSession();

                jobDirectory = (JobDirectory) session.get(JobDirectoryImpl.class,
                        primaryKey);

                if (jobDirectory != null) {
                    cacheResult(jobDirectory);
                } else {
                    EntityCacheUtil.putResult(JobDirectoryModelImpl.ENTITY_CACHE_ENABLED,
                        JobDirectoryImpl.class, primaryKey, _nullJobDirectory);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(JobDirectoryModelImpl.ENTITY_CACHE_ENABLED,
                    JobDirectoryImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return jobDirectory;
    }

    /**
     * Returns the job directory with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param jobDirectoryId the primary key of the job directory
     * @return the job directory, or <code>null</code> if a job directory with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JobDirectory fetchByPrimaryKey(long jobDirectoryId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) jobDirectoryId);
    }

    /**
     * Returns all the job directories.
     *
     * @return the job directories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<JobDirectory> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<JobDirectory> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<JobDirectory> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<JobDirectory> list = (List<JobDirectory>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_JOBDIRECTORY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_JOBDIRECTORY;

                if (pagination) {
                    sql = sql.concat(JobDirectoryModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<JobDirectory>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<JobDirectory>(list);
                } else {
                    list = (List<JobDirectory>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the job directories from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (JobDirectory jobDirectory : findAll()) {
            remove(jobDirectory);
        }
    }

    /**
     * Returns the number of job directories.
     *
     * @return the number of job directories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_JOBDIRECTORY);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the job directory persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.meera.db.model.JobDirectory")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<JobDirectory>> listenersList = new ArrayList<ModelListener<JobDirectory>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<JobDirectory>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(JobDirectoryImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
