package com.meera.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.meera.db.model.BankOrganization;

import java.util.List;

/**
 * The persistence utility for the bank organization service. This utility wraps {@link BankOrganizationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LiferaySavvy
 * @see BankOrganizationPersistence
 * @see BankOrganizationPersistenceImpl
 * @generated
 */
public class BankOrganizationUtil {
    private static BankOrganizationPersistence _persistence;

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
    public static void clearCache(BankOrganization bankOrganization) {
        getPersistence().clearCache(bankOrganization);
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
    public static List<BankOrganization> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<BankOrganization> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<BankOrganization> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static BankOrganization update(BankOrganization bankOrganization)
        throws SystemException {
        return getPersistence().update(bankOrganization);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static BankOrganization update(BankOrganization bankOrganization,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(bankOrganization, serviceContext);
    }

    /**
    * Caches the bank organization in the entity cache if it is enabled.
    *
    * @param bankOrganization the bank organization
    */
    public static void cacheResult(
        com.meera.db.model.BankOrganization bankOrganization) {
        getPersistence().cacheResult(bankOrganization);
    }

    /**
    * Caches the bank organizations in the entity cache if it is enabled.
    *
    * @param bankOrganizations the bank organizations
    */
    public static void cacheResult(
        java.util.List<com.meera.db.model.BankOrganization> bankOrganizations) {
        getPersistence().cacheResult(bankOrganizations);
    }

    /**
    * Creates a new bank organization with the primary key. Does not add the bank organization to the database.
    *
    * @param bankOrganizationId the primary key for the new bank organization
    * @return the new bank organization
    */
    public static com.meera.db.model.BankOrganization create(
        long bankOrganizationId) {
        return getPersistence().create(bankOrganizationId);
    }

    /**
    * Removes the bank organization with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bankOrganizationId the primary key of the bank organization
    * @return the bank organization that was removed
    * @throws com.meera.db.NoSuchBankOrganizationException if a bank organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.db.model.BankOrganization remove(
        long bankOrganizationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.db.NoSuchBankOrganizationException {
        return getPersistence().remove(bankOrganizationId);
    }

    public static com.meera.db.model.BankOrganization updateImpl(
        com.meera.db.model.BankOrganization bankOrganization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(bankOrganization);
    }

    /**
    * Returns the bank organization with the primary key or throws a {@link com.meera.db.NoSuchBankOrganizationException} if it could not be found.
    *
    * @param bankOrganizationId the primary key of the bank organization
    * @return the bank organization
    * @throws com.meera.db.NoSuchBankOrganizationException if a bank organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.db.model.BankOrganization findByPrimaryKey(
        long bankOrganizationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.db.NoSuchBankOrganizationException {
        return getPersistence().findByPrimaryKey(bankOrganizationId);
    }

    /**
    * Returns the bank organization with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bankOrganizationId the primary key of the bank organization
    * @return the bank organization, or <code>null</code> if a bank organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.meera.db.model.BankOrganization fetchByPrimaryKey(
        long bankOrganizationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(bankOrganizationId);
    }

    /**
    * Returns all the bank organizations.
    *
    * @return the bank organizations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.meera.db.model.BankOrganization> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.meera.db.model.BankOrganization> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<com.meera.db.model.BankOrganization> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the bank organizations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of bank organizations.
    *
    * @return the number of bank organizations
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BankOrganizationPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BankOrganizationPersistence) PortletBeanLocatorUtil.locate(com.meera.db.service.ClpSerializer.getServletContextName(),
                    BankOrganizationPersistence.class.getName());

            ReferenceRegistry.registerReference(BankOrganizationUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BankOrganizationPersistence persistence) {
    }
}
