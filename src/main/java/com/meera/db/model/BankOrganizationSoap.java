package com.meera.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LiferaySavvy
 * @generated
 */
public class BankOrganizationSoap implements Serializable {
    private long _bankOrganizationId;
    private String _name;
    private String _BIK;
    private String _adress;

    public BankOrganizationSoap() {
    }

    public static BankOrganizationSoap toSoapModel(BankOrganization model) {
        BankOrganizationSoap soapModel = new BankOrganizationSoap();

        soapModel.setBankOrganizationId(model.getBankOrganizationId());
        soapModel.setName(model.getName());
        soapModel.setBIK(model.getBIK());
        soapModel.setAdress(model.getAdress());

        return soapModel;
    }

    public static BankOrganizationSoap[] toSoapModels(BankOrganization[] models) {
        BankOrganizationSoap[] soapModels = new BankOrganizationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BankOrganizationSoap[][] toSoapModels(
        BankOrganization[][] models) {
        BankOrganizationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BankOrganizationSoap[models.length][models[0].length];
        } else {
            soapModels = new BankOrganizationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BankOrganizationSoap[] toSoapModels(
        List<BankOrganization> models) {
        List<BankOrganizationSoap> soapModels = new ArrayList<BankOrganizationSoap>(models.size());

        for (BankOrganization model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BankOrganizationSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _bankOrganizationId;
    }

    public void setPrimaryKey(long pk) {
        setBankOrganizationId(pk);
    }

    public long getBankOrganizationId() {
        return _bankOrganizationId;
    }

    public void setBankOrganizationId(long bankOrganizationId) {
        _bankOrganizationId = bankOrganizationId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getBIK() {
        return _BIK;
    }

    public void setBIK(String BIK) {
        _BIK = BIK;
    }

    public String getAdress() {
        return _adress;
    }

    public void setAdress(String adress) {
        _adress = adress;
    }
}
