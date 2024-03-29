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

import com.meera.db.NoSuchBankOrganizationException;
import com.meera.db.model.BankOrganization;
import com.meera.db.model.impl.BankOrganizationImpl;
import com.meera.db.model.impl.BankOrganizationModelImpl;
import com.meera.db.service.persistence.BankOrganizationPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the bank organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LiferaySavvy
 * @see BankOrganizationPersistence
 * @see BankOrganizationUtil
 * @generated
 */
public class BankOrganizationPersistenceImpl extends BasePersistenceImpl<BankOrganization>
    implements BankOrganizationPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BankOrganizationUtil} to access the bank organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BankOrganizationImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BankOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            BankOrganizationModelImpl.FINDER_CACHE_ENABLED,
            BankOrganizationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BankOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            BankOrganizationModelImpl.FINDER_CACHE_ENABLED,
            BankOrganizationImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BankOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            BankOrganizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_BANKORGANIZATION = "SELECT bankOrganization FROM BankOrganization bankOrganization";
    private static final String _SQL_COUNT_BANKORGANIZATION = "SELECT COUNT(bankOrganization) FROM BankOrganization bankOrganization";
    private static final String _ORDER_BY_ENTITY_ALIAS = "bankOrganization.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BankOrganization exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BankOrganizationPersistenceImpl.class);
    private static BankOrganization _nullBankOrganization = new BankOrganizationImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BankOrganization> toCacheModel() {
                return _nullBankOrganizationCacheModel;
            }
        };

    private static CacheModel<BankOrganization> _nullBankOrganizationCacheModel = new CacheModel<BankOrganization>() {
            @Override
            public BankOrganization toEntityModel() {
                return _nullBankOrganization;
            }
        };

    public BankOrganizationPersistenceImpl() {
        setModelClass(BankOrganization.class);
    }

    /**
     * Caches the bank organization in the entity cache if it is enabled.
     *
     * @param bankOrganization the bank organization
     */
    @Override
    public void cacheResult(BankOrganization bankOrganization) {
        EntityCacheUtil.putResult(BankOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            BankOrganizationImpl.class, bankOrganization.getPrimaryKey(),
            bankOrganization);

        bankOrganization.resetOriginalValues();
    }

    /**
     * Caches the bank organizations in the entity cache if it is enabled.
     *
     * @param bankOrganizations the bank organizations
     */
    @Override
    public void cacheResult(List<BankOrganization> bankOrganizations) {
        for (BankOrganization bankOrganization : bankOrganizations) {
            if (EntityCacheUtil.getResult(
                        BankOrganizationModelImpl.ENTITY_CACHE_ENABLED,
                        BankOrganizationImpl.class,
                        bankOrganization.getPrimaryKey()) == null) {
                cacheResult(bankOrganization);
            } else {
                bankOrganization.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all bank organizations.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BankOrganizationImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BankOrganizationImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the bank organization.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BankOrganization bankOrganization) {
        EntityCacheUtil.removeResult(BankOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            BankOrganizationImpl.class, bankOrganization.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<BankOrganization> bankOrganizations) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BankOrganization bankOrganization : bankOrganizations) {
            EntityCacheUtil.removeResult(BankOrganizationModelImpl.ENTITY_CACHE_ENABLED,
                BankOrganizationImpl.class, bankOrganization.getPrimaryKey());
        }
    }

    /**
     * Creates a new bank organization with the primary key. Does not add the bank organization to the database.
     *
     * @param bankOrganizationId the primary key for the new bank organization
     * @return the new bank organization
     */
    @Override
    public BankOrganization create(long bankOrganizationId) {
        BankOrganization bankOrganization = new BankOrganizationImpl();

        bankOrganization.setNew(true);
        bankOrganization.setPrimaryKey(bankOrganizationId);

        return bankOrganization;
    }

    /**
     * Removes the bank organization with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param bankOrganizationId the primary key of the bank organization
     * @return the bank organization that was removed
     * @throws com.meera.db.NoSuchBankOrganizationException if a bank organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankOrganization remove(long bankOrganizationId)
        throws NoSuchBankOrganizationException, SystemException {
        return remove((Serializable) bankOrganizationId);
    }

    /**
     * Removes the bank organization with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the bank organization
     * @return the bank organization that was removed
     * @throws com.meera.db.NoSuchBankOrganizationException if a bank organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankOrganization remove(Serializable primaryKey)
        throws NoSuchBankOrganizationException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BankOrganization bankOrganization = (BankOrganization) session.get(BankOrganizationImpl.class,
                    primaryKey);

            if (bankOrganization == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBankOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(bankOrganization);
        } catch (NoSuchBankOrganizationException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BankOrganization removeImpl(BankOrganization bankOrganization)
        throws SystemException {
        bankOrganization = toUnwrappedModel(bankOrganization);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(bankOrganization)) {
                bankOrganization = (BankOrganization) session.get(BankOrganizationImpl.class,
                        bankOrganization.getPrimaryKeyObj());
            }

            if (bankOrganization != null) {
                session.delete(bankOrganization);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (bankOrganization != null) {
            clearCache(bankOrganization);
        }

        return bankOrganization;
    }

    @Override
    public BankOrganization updateImpl(
        com.meera.db.model.BankOrganization bankOrganization)
        throws SystemException {
        bankOrganization = toUnwrappedModel(bankOrganization);

        boolean isNew = bankOrganization.isNew();

        Session session = null;

        try {
            session = openSession();

            if (bankOrganization.isNew()) {
                session.save(bankOrganization);

                bankOrganization.setNew(false);
            } else {
                session.merge(bankOrganization);
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

        EntityCacheUtil.putResult(BankOrganizationModelImpl.ENTITY_CACHE_ENABLED,
            BankOrganizationImpl.class, bankOrganization.getPrimaryKey(),
            bankOrganization);

        return bankOrganization;
    }

    protected BankOrganization toUnwrappedModel(
        BankOrganization bankOrganization) {
        if (bankOrganization instanceof BankOrganizationImpl) {
            return bankOrganization;
        }

        BankOrganizationImpl bankOrganizationImpl = new BankOrganizationImpl();

        bankOrganizationImpl.setNew(bankOrganization.isNew());
        bankOrganizationImpl.setPrimaryKey(bankOrganization.getPrimaryKey());

        bankOrganizationImpl.setBankOrganizationId(bankOrganization.getBankOrganizationId());
        bankOrganizationImpl.setName(bankOrganization.getName());
        bankOrganizationImpl.setBIK(bankOrganization.getBIK());
        bankOrganizationImpl.setAdress(bankOrganization.getAdress());

        return bankOrganizationImpl;
    }

    /**
     * Returns the bank organization with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the bank organization
     * @return the bank organization
     * @throws com.meera.db.NoSuchBankOrganizationException if a bank organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankOrganization findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBankOrganizationException, SystemException {
        BankOrganization bankOrganization = fetchByPrimaryKey(primaryKey);

        if (bankOrganization == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBankOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return bankOrganization;
    }

    /**
     * Returns the bank organization with the primary key or throws a {@link com.meera.db.NoSuchBankOrganizationException} if it could not be found.
     *
     * @param bankOrganizationId the primary key of the bank organization
     * @return the bank organization
     * @throws com.meera.db.NoSuchBankOrganizationException if a bank organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankOrganization findByPrimaryKey(long bankOrganizationId)
        throws NoSuchBankOrganizationException, SystemException {
        return findByPrimaryKey((Serializable) bankOrganizationId);
    }

    /**
     * Returns the bank organization with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the bank organization
     * @return the bank organization, or <code>null</code> if a bank organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankOrganization fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BankOrganization bankOrganization = (BankOrganization) EntityCacheUtil.getResult(BankOrganizationModelImpl.ENTITY_CACHE_ENABLED,
                BankOrganizationImpl.class, primaryKey);

        if (bankOrganization == _nullBankOrganization) {
            return null;
        }

        if (bankOrganization == null) {
            Session session = null;

            try {
                session = openSession();

                bankOrganization = (BankOrganization) session.get(BankOrganizationImpl.class,
                        primaryKey);

                if (bankOrganization != null) {
                    cacheResult(bankOrganization);
                } else {
                    EntityCacheUtil.putResult(BankOrganizationModelImpl.ENTITY_CACHE_ENABLED,
                        BankOrganizationImpl.class, primaryKey,
                        _nullBankOrganization);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BankOrganizationModelImpl.ENTITY_CACHE_ENABLED,
                    BankOrganizationImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return bankOrganization;
    }

    /**
     * Returns the bank organization with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param bankOrganizationId the primary key of the bank organization
     * @return the bank organization, or <code>null</code> if a bank organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankOrganization fetchByPrimaryKey(long bankOrganizationId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) bankOrganizationId);
    }

    /**
     * Returns all the bank organizations.
     *
     * @return the bank organizations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankOrganization> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the bank organizations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.BankOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of bank organizations
     * @param end the upper bound of the range of bank organizations (not inclusive)
     * @return the range of bank organizations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankOrganization> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the bank organizations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.BankOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of bank organizations
     * @param end the upper bound of the range of bank organizations (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of bank organizations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankOrganization> findAll(int start, int end,
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

        List<BankOrganization> list = (List<BankOrganization>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BANKORGANIZATION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BANKORGANIZATION;

                if (pagination) {
                    sql = sql.concat(BankOrganizationModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BankOrganization>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BankOrganization>(list);
                } else {
                    list = (List<BankOrganization>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the bank organizations from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BankOrganization bankOrganization : findAll()) {
            remove(bankOrganization);
        }
    }

    /**
     * Returns the number of bank organizations.
     *
     * @return the number of bank organizations
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

                Query q = session.createQuery(_SQL_COUNT_BANKORGANIZATION);

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
     * Initializes the bank organization persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.meera.db.model.BankOrganization")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BankOrganization>> listenersList = new ArrayList<ModelListener<BankOrganization>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BankOrganization>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BankOrganizationImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
