package com.meera.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.meera.db.service.BankOrganizationLocalServiceUtil;
import com.meera.db.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class BankOrganizationClp extends BaseModelImpl<BankOrganization>
    implements BankOrganization {
    private long _bankOrganizationId;
    private String _name;
    private String _BIK;
    private String _adress;
    private BaseModel<?> _bankOrganizationRemoteModel;
    private Class<?> _clpSerializerClass = com.meera.db.service.ClpSerializer.class;

    public BankOrganizationClp() {
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
    public long getPrimaryKey() {
        return _bankOrganizationId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBankOrganizationId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _bankOrganizationId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getBankOrganizationId() {
        return _bankOrganizationId;
    }

    @Override
    public void setBankOrganizationId(long bankOrganizationId) {
        _bankOrganizationId = bankOrganizationId;

        if (_bankOrganizationRemoteModel != null) {
            try {
                Class<?> clazz = _bankOrganizationRemoteModel.getClass();

                Method method = clazz.getMethod("setBankOrganizationId",
                        long.class);

                method.invoke(_bankOrganizationRemoteModel, bankOrganizationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_bankOrganizationRemoteModel != null) {
            try {
                Class<?> clazz = _bankOrganizationRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_bankOrganizationRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBIK() {
        return _BIK;
    }

    @Override
    public void setBIK(String BIK) {
        _BIK = BIK;

        if (_bankOrganizationRemoteModel != null) {
            try {
                Class<?> clazz = _bankOrganizationRemoteModel.getClass();

                Method method = clazz.getMethod("setBIK", String.class);

                method.invoke(_bankOrganizationRemoteModel, BIK);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAdress() {
        return _adress;
    }

    @Override
    public void setAdress(String adress) {
        _adress = adress;

        if (_bankOrganizationRemoteModel != null) {
            try {
                Class<?> clazz = _bankOrganizationRemoteModel.getClass();

                Method method = clazz.getMethod("setAdress", String.class);

                method.invoke(_bankOrganizationRemoteModel, adress);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBankOrganizationRemoteModel() {
        return _bankOrganizationRemoteModel;
    }

    public void setBankOrganizationRemoteModel(
        BaseModel<?> bankOrganizationRemoteModel) {
        _bankOrganizationRemoteModel = bankOrganizationRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _bankOrganizationRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_bankOrganizationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BankOrganizationLocalServiceUtil.addBankOrganization(this);
        } else {
            BankOrganizationLocalServiceUtil.updateBankOrganization(this);
        }
    }

    @Override
    public BankOrganization toEscapedModel() {
        return (BankOrganization) ProxyUtil.newProxyInstance(BankOrganization.class.getClassLoader(),
            new Class[] { BankOrganization.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BankOrganizationClp clone = new BankOrganizationClp();

        clone.setBankOrganizationId(getBankOrganizationId());
        clone.setName(getName());
        clone.setBIK(getBIK());
        clone.setAdress(getAdress());

        return clone;
    }

    @Override
    public int compareTo(BankOrganization bankOrganization) {
        int value = 0;

        if (getBankOrganizationId() < bankOrganization.getBankOrganizationId()) {
            value = -1;
        } else if (getBankOrganizationId() > bankOrganization.getBankOrganizationId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankOrganizationClp)) {
            return false;
        }

        BankOrganizationClp bankOrganization = (BankOrganizationClp) obj;

        long primaryKey = bankOrganization.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{bankOrganizationId=");
        sb.append(getBankOrganizationId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", BIK=");
        sb.append(getBIK());
        sb.append(", adress=");
        sb.append(getAdress());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.meera.db.model.BankOrganization");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>bankOrganizationId</column-name><column-value><![CDATA[");
        sb.append(getBankOrganizationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>BIK</column-name><column-value><![CDATA[");
        sb.append(getBIK());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>adress</column-name><column-value><![CDATA[");
        sb.append(getAdress());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
