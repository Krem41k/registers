package com.meera.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.meera.db.model.BankOrganization;

/**
 * The persistence interface for the bank organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LiferaySavvy
 * @see BankOrganizationPersistenceImpl
 * @see BankOrganizationUtil
 * @generated
 */
public interface BankOrganizationPersistence extends BasePersistence<BankOrganization> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BankOrganizationUtil} to access the bank organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the bank organization in the entity cache if it is enabled.
    *
    * @param bankOrganization the bank organization
    */
    public void cacheResult(
        com.meera.db.model.BankOrganization bankOrganization);

    /**
    * Caches the bank organizations in the entity cache if it is enabled.
    *
    * @param bankOrganizations the bank organizations
    */
    public void cacheResult(
        java.util.List<com.meera.db.model.BankOrganization> bankOrganizations);

    /**
    * Creates a new bank organization with the primary key. Does not add the bank organization to the database.
    *
    * @param bankOrganizationId the primary key for the new bank organization
    * @return the new bank organization
    */
    public com.meera.db.model.BankOrganization create(long bankOrganizationId);

    /**
    * Removes the bank organization with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bankOrganizationId the primary key of the bank organization
    * @return the bank organization that was removed
    * @throws com.meera.db.NoSuchBankOrganizationException if a bank organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.db.model.BankOrganization remove(long bankOrganizationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.db.NoSuchBankOrganizationException;

    public com.meera.db.model.BankOrganization updateImpl(
        com.meera.db.model.BankOrganization bankOrganization)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bank organization with the primary key or throws a {@link com.meera.db.NoSuchBankOrganizationException} if it could not be found.
    *
    * @param bankOrganizationId the primary key of the bank organization
    * @return the bank organization
    * @throws com.meera.db.NoSuchBankOrganizationException if a bank organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.db.model.BankOrganization findByPrimaryKey(
        long bankOrganizationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.meera.db.NoSuchBankOrganizationException;

    /**
    * Returns the bank organization with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bankOrganizationId the primary key of the bank organization
    * @return the bank organization, or <code>null</code> if a bank organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.meera.db.model.BankOrganization fetchByPrimaryKey(
        long bankOrganizationId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the bank organizations.
    *
    * @return the bank organizations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.meera.db.model.BankOrganization> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.meera.db.model.BankOrganization> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.meera.db.model.BankOrganization> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the bank organizations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bank organizations.
    *
    * @return the number of bank organizations
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
