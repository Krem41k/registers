package com.meera.db.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.meera.db.model.BankOrganization;
import com.meera.db.service.BankOrganizationLocalService;
import com.meera.db.service.persistence.BankOrganizationPersistence;
import com.meera.db.service.persistence.EmployeePersistence;
import com.meera.db.service.persistence.JobDirectoryPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the bank organization local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.meera.db.service.impl.BankOrganizationLocalServiceImpl}.
 * </p>
 *
 * @author LiferaySavvy
 * @see com.meera.db.service.impl.BankOrganizationLocalServiceImpl
 * @see com.meera.db.service.BankOrganizationLocalServiceUtil
 * @generated
 */
public abstract class BankOrganizationLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements BankOrganizationLocalService,
        IdentifiableBean {
    @BeanReference(type = com.meera.db.service.BankOrganizationLocalService.class)
    protected com.meera.db.service.BankOrganizationLocalService bankOrganizationLocalService;
    @BeanReference(type = BankOrganizationPersistence.class)
    protected BankOrganizationPersistence bankOrganizationPersistence;
    @BeanReference(type = com.meera.db.service.EmployeeLocalService.class)
    protected com.meera.db.service.EmployeeLocalService employeeLocalService;
    @BeanReference(type = EmployeePersistence.class)
    protected EmployeePersistence employeePersistence;
    @BeanReference(type = com.meera.db.service.JobDirectoryLocalService.class)
    protected com.meera.db.service.JobDirectoryLocalService jobDirectoryLocalService;
    @BeanReference(type = JobDirectoryPersistence.class)
    protected JobDirectoryPersistence jobDirectoryPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private BankOrganizationLocalServiceClpInvoker _clpInvoker = new BankOrganizationLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.meera.db.service.BankOrganizationLocalServiceUtil} to access the bank organization local service.
     */

    /**
     * Adds the bank organization to the database. Also notifies the appropriate model listeners.
     *
     * @param bankOrganization the bank organization
     * @return the bank organization that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public BankOrganization addBankOrganization(
        BankOrganization bankOrganization) throws SystemException {
        bankOrganization.setNew(true);

        return bankOrganizationPersistence.update(bankOrganization);
    }

    /**
     * Creates a new bank organization with the primary key. Does not add the bank organization to the database.
     *
     * @param bankOrganizationId the primary key for the new bank organization
     * @return the new bank organization
     */
    @Override
    public BankOrganization createBankOrganization(long bankOrganizationId) {
        return bankOrganizationPersistence.create(bankOrganizationId);
    }

    /**
     * Deletes the bank organization with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param bankOrganizationId the primary key of the bank organization
     * @return the bank organization that was removed
     * @throws PortalException if a bank organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public BankOrganization deleteBankOrganization(long bankOrganizationId)
        throws PortalException, SystemException {
        return bankOrganizationPersistence.remove(bankOrganizationId);
    }

    /**
     * Deletes the bank organization from the database. Also notifies the appropriate model listeners.
     *
     * @param bankOrganization the bank organization
     * @return the bank organization that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public BankOrganization deleteBankOrganization(
        BankOrganization bankOrganization) throws SystemException {
        return bankOrganizationPersistence.remove(bankOrganization);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(BankOrganization.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return bankOrganizationPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.BankOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return bankOrganizationPersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.BankOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return bankOrganizationPersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return bankOrganizationPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return bankOrganizationPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public BankOrganization fetchBankOrganization(long bankOrganizationId)
        throws SystemException {
        return bankOrganizationPersistence.fetchByPrimaryKey(bankOrganizationId);
    }

    /**
     * Returns the bank organization with the primary key.
     *
     * @param bankOrganizationId the primary key of the bank organization
     * @return the bank organization
     * @throws PortalException if a bank organization with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankOrganization getBankOrganization(long bankOrganizationId)
        throws PortalException, SystemException {
        return bankOrganizationPersistence.findByPrimaryKey(bankOrganizationId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return bankOrganizationPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<BankOrganization> getBankOrganizations(int start, int end)
        throws SystemException {
        return bankOrganizationPersistence.findAll(start, end);
    }

    /**
     * Returns the number of bank organizations.
     *
     * @return the number of bank organizations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getBankOrganizationsCount() throws SystemException {
        return bankOrganizationPersistence.countAll();
    }

    /**
     * Updates the bank organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param bankOrganization the bank organization
     * @return the bank organization that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public BankOrganization updateBankOrganization(
        BankOrganization bankOrganization) throws SystemException {
        return bankOrganizationPersistence.update(bankOrganization);
    }

    /**
     * Returns the bank organization local service.
     *
     * @return the bank organization local service
     */
    public com.meera.db.service.BankOrganizationLocalService getBankOrganizationLocalService() {
        return bankOrganizationLocalService;
    }

    /**
     * Sets the bank organization local service.
     *
     * @param bankOrganizationLocalService the bank organization local service
     */
    public void setBankOrganizationLocalService(
        com.meera.db.service.BankOrganizationLocalService bankOrganizationLocalService) {
        this.bankOrganizationLocalService = bankOrganizationLocalService;
    }

    /**
     * Returns the bank organization persistence.
     *
     * @return the bank organization persistence
     */
    public BankOrganizationPersistence getBankOrganizationPersistence() {
        return bankOrganizationPersistence;
    }

    /**
     * Sets the bank organization persistence.
     *
     * @param bankOrganizationPersistence the bank organization persistence
     */
    public void setBankOrganizationPersistence(
        BankOrganizationPersistence bankOrganizationPersistence) {
        this.bankOrganizationPersistence = bankOrganizationPersistence;
    }

    /**
     * Returns the employee local service.
     *
     * @return the employee local service
     */
    public com.meera.db.service.EmployeeLocalService getEmployeeLocalService() {
        return employeeLocalService;
    }

    /**
     * Sets the employee local service.
     *
     * @param employeeLocalService the employee local service
     */
    public void setEmployeeLocalService(
        com.meera.db.service.EmployeeLocalService employeeLocalService) {
        this.employeeLocalService = employeeLocalService;
    }

    /**
     * Returns the employee persistence.
     *
     * @return the employee persistence
     */
    public EmployeePersistence getEmployeePersistence() {
        return employeePersistence;
    }

    /**
     * Sets the employee persistence.
     *
     * @param employeePersistence the employee persistence
     */
    public void setEmployeePersistence(EmployeePersistence employeePersistence) {
        this.employeePersistence = employeePersistence;
    }

    /**
     * Returns the job directory local service.
     *
     * @return the job directory local service
     */
    public com.meera.db.service.JobDirectoryLocalService getJobDirectoryLocalService() {
        return jobDirectoryLocalService;
    }

    /**
     * Sets the job directory local service.
     *
     * @param jobDirectoryLocalService the job directory local service
     */
    public void setJobDirectoryLocalService(
        com.meera.db.service.JobDirectoryLocalService jobDirectoryLocalService) {
        this.jobDirectoryLocalService = jobDirectoryLocalService;
    }

    /**
     * Returns the job directory persistence.
     *
     * @return the job directory persistence
     */
    public JobDirectoryPersistence getJobDirectoryPersistence() {
        return jobDirectoryPersistence;
    }

    /**
     * Sets the job directory persistence.
     *
     * @param jobDirectoryPersistence the job directory persistence
     */
    public void setJobDirectoryPersistence(
        JobDirectoryPersistence jobDirectoryPersistence) {
        this.jobDirectoryPersistence = jobDirectoryPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.meera.db.model.BankOrganization",
            bankOrganizationLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.meera.db.model.BankOrganization");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return BankOrganization.class;
    }

    protected String getModelClassName() {
        return BankOrganization.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = bankOrganizationPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
