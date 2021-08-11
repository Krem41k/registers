package com.meera.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BankOrganization}.
 * </p>
 *
 * @author LiferaySavvy
 * @see BankOrganization
 * @generated
 */
public class BankOrganizationWrapper implements BankOrganization,
    ModelWrapper<BankOrganization> {
    private BankOrganization _bankOrganization;

    public BankOrganizationWrapper(BankOrganization bankOrganization) {
        _bankOrganization = bankOrganization;
    }

    @Override
    public Class<?> getModelClass() {
        return BankOrganization.class;
    }

    @Override
    public String getModelClassName() {
        return BankOrganization.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bankOrganizationId", getBankOrganizationId());
        attributes.put("name", getName());
        attributes.put("BIK", getBIK());
        attributes.put("adress", getAdress());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long bankOrganizationId = (Long) attributes.get("bankOrganizationId");

        if (bankOrganizationId != null) {
            setBankOrganizationId(bankOrganizationId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String BIK = (String) attributes.get("BIK");

        if (BIK != null) {
            setBIK(BIK);
        }

        String adress = (String) attributes.get("adress");

        if (adress != null) {
            setAdress(adress);
        }
    }

    /**
    * Returns the primary key of this bank organization.
    *
    * @return the primary key of this bank organization
    */
    @Override
    public long getPrimaryKey() {
        return _bankOrganization.getPrimaryKey();
    }

    /**
    * Sets the primary key of this bank organization.
    *
    * @param primaryKey the primary key of this bank organization
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _bankOrganization.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the bank organization ID of this bank organization.
    *
    * @return the bank organization ID of this bank organization
    */
    @Override
    public long getBankOrganizationId() {
        return _bankOrganization.getBankOrganizationId();
    }

    /**
    * Sets the bank organization ID of this bank organization.
    *
    * @param bankOrganizationId the bank organization ID of this bank organization
    */
    @Override
    public void setBankOrganizationId(long bankOrganizationId) {
        _bankOrganization.setBankOrganizationId(bankOrganizationId);
    }

    /**
    * Returns the name of this bank organization.
    *
    * @return the name of this bank organization
    */
    @Override
    public java.lang.String getName() {
        return _bankOrganization.getName();
    }

    /**
    * Sets the name of this bank organization.
    *
    * @param name the name of this bank organization
    */
    @Override
    public void setName(java.lang.String name) {
        _bankOrganization.setName(name);
    }

    /**
    * Returns the b i k of this bank organization.
    *
    * @return the b i k of this bank organization
    */
    @Override
    public java.lang.String getBIK() {
        return _bankOrganization.getBIK();
    }

    /**
    * Sets the b i k of this bank organization.
    *
    * @param BIK the b i k of this bank organization
    */
    @Override
    public void setBIK(java.lang.String BIK) {
        _bankOrganization.setBIK(BIK);
    }

    /**
    * Returns the adress of this bank organization.
    *
    * @return the adress of this bank organization
    */
    @Override
    public java.lang.String getAdress() {
        return _bankOrganization.getAdress();
    }

    /**
    * Sets the adress of this bank organization.
    *
    * @param adress the adress of this bank organization
    */
    @Override
    public void setAdress(java.lang.String adress) {
        _bankOrganization.setAdress(adress);
    }

    @Override
    public boolean isNew() {
        return _bankOrganization.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _bankOrganization.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _bankOrganization.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _bankOrganization.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _bankOrganization.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _bankOrganization.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _bankOrganization.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _bankOrganization.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _bankOrganization.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _bankOrganization.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _bankOrganization.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BankOrganizationWrapper((BankOrganization) _bankOrganization.clone());
    }

    @Override
    public int compareTo(com.meera.db.model.BankOrganization bankOrganization) {
        return _bankOrganization.compareTo(bankOrganization);
    }

    @Override
    public int hashCode() {
        return _bankOrganization.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.meera.db.model.BankOrganization> toCacheModel() {
        return _bankOrganization.toCacheModel();
    }

    @Override
    public com.meera.db.model.BankOrganization toEscapedModel() {
        return new BankOrganizationWrapper(_bankOrganization.toEscapedModel());
    }

    @Override
    public com.meera.db.model.BankOrganization toUnescapedModel() {
        return new BankOrganizationWrapper(_bankOrganization.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _bankOrganization.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _bankOrganization.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _bankOrganization.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankOrganizationWrapper)) {
            return false;
        }

        BankOrganizationWrapper bankOrganizationWrapper = (BankOrganizationWrapper) obj;

        if (Validator.equals(_bankOrganization,
                    bankOrganizationWrapper._bankOrganization)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BankOrganization getWrappedBankOrganization() {
        return _bankOrganization;
    }

    @Override
    public BankOrganization getWrappedModel() {
        return _bankOrganization;
    }

    @Override
    public void resetOriginalValues() {
        _bankOrganization.resetOriginalValues();
    }
}
