package com.meera.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BankOrganizationLocalService}.
 *
 * @author LiferaySavvy
 * @see BankOrganizationLocalService
 * @generated
 */
public class BankOrganizationLocalServiceWrapper
    implements BankOrganizationLocalService,
        ServiceWrapper<BankOrganizationLocalService> {
    private BankOrganizationLocalService _bankOrganizationLocalService;

    public BankOrganizationLocalServiceWrapper(
        BankOrganizationLocalService bankOrganizationLocalService) {
        _bankOrganizationLocalService = bankOrganizationLocalService;
    }

    /**
    * Adds the bank organization to the database. Also notifies the appropriate model listeners.
    *
    * @param bankOrganization the bank organization
    * @return the bank organization that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.meera.db.model.BankOrganization addBankOrganization(
        com.meera.db.model.BankOrganization bankOrganization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.addBankOrganization(bankOrganization);
    }

    /**
    * Creates a new bank organization with the primary key. Does not add the bank organization to the database.
    *
    * @param bankOrganizationId the primary key for the new bank organization
    * @return the new bank organization
    */
    @Override
    public com.meera.db.model.BankOrganization createBankOrganization(
        long bankOrganizationId) {
        return _bankOrganizationLocalService.createBankOrganization(bankOrganizationId);
    }

    /**
    * Deletes the bank organization with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bankOrganizationId the primary key of the bank organization
    * @return the bank organization that was removed
    * @throws PortalException if a bank organization with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.meera.db.model.BankOrganization deleteBankOrganization(
        long bankOrganizationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.deleteBankOrganization(bankOrganizationId);
    }

    /**
    * Deletes the bank organization from the database. Also notifies the appropriate model listeners.
    *
    * @param bankOrganization the bank organization
    * @return the bank organization that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.meera.db.model.BankOrganization deleteBankOrganization(
        com.meera.db.model.BankOrganization bankOrganization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.deleteBankOrganization(bankOrganization);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _bankOrganizationLocalService.dynamicQuery();
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.dynamicQuery(dynamicQuery);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.dynamicQuery(dynamicQuery, start,
            end);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.dynamicQueryCount(dynamicQuery);
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
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.meera.db.model.BankOrganization fetchBankOrganization(
        long bankOrganizationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.fetchBankOrganization(bankOrganizationId);
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
    public com.meera.db.model.BankOrganization getBankOrganization(
        long bankOrganizationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.getBankOrganization(bankOrganizationId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.getPersistedModel(primaryKeyObj);
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
    public java.util.List<com.meera.db.model.BankOrganization> getBankOrganizations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.getBankOrganizations(start, end);
    }

    /**
    * Returns the number of bank organizations.
    *
    * @return the number of bank organizations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBankOrganizationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.getBankOrganizationsCount();
    }

    /**
    * Updates the bank organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param bankOrganization the bank organization
    * @return the bank organization that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.meera.db.model.BankOrganization updateBankOrganization(
        com.meera.db.model.BankOrganization bankOrganization)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankOrganizationLocalService.updateBankOrganization(bankOrganization);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bankOrganizationLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bankOrganizationLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bankOrganizationLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BankOrganizationLocalService getWrappedBankOrganizationLocalService() {
        return _bankOrganizationLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBankOrganizationLocalService(
        BankOrganizationLocalService bankOrganizationLocalService) {
        _bankOrganizationLocalService = bankOrganizationLocalService;
    }

    @Override
    public BankOrganizationLocalService getWrappedService() {
        return _bankOrganizationLocalService;
    }

    @Override
    public void setWrappedService(
        BankOrganizationLocalService bankOrganizationLocalService) {
        _bankOrganizationLocalService = bankOrganizationLocalService;
    }
}
