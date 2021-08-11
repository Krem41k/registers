package com.meera.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.meera.db.model.BankOrganization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BankOrganization in entity cache.
 *
 * @author LiferaySavvy
 * @see BankOrganization
 * @generated
 */
public class BankOrganizationCacheModel implements CacheModel<BankOrganization>,
    Externalizable {
    public long bankOrganizationId;
    public String name;
    public String BIK;
    public String adress;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{bankOrganizationId=");
        sb.append(bankOrganizationId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", BIK=");
        sb.append(BIK);
        sb.append(", adress=");
        sb.append(adress);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public BankOrganization toEntityModel() {
        BankOrganizationImpl bankOrganizationImpl = new BankOrganizationImpl();

        bankOrganizationImpl.setBankOrganizationId(bankOrganizationId);

        if (name == null) {
            bankOrganizationImpl.setName(StringPool.BLANK);
        } else {
            bankOrganizationImpl.setName(name);
        }

        if (BIK == null) {
            bankOrganizationImpl.setBIK(StringPool.BLANK);
        } else {
            bankOrganizationImpl.setBIK(BIK);
        }

        if (adress == null) {
            bankOrganizationImpl.setAdress(StringPool.BLANK);
        } else {
            bankOrganizationImpl.setAdress(adress);
        }

        bankOrganizationImpl.resetOriginalValues();

        return bankOrganizationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        bankOrganizationId = objectInput.readLong();
        name = objectInput.readUTF();
        BIK = objectInput.readUTF();
        adress = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(bankOrganizationId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (BIK == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(BIK);
        }

        if (adress == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(adress);
        }
    }
}
