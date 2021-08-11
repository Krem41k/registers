package com.meera.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.meera.db.service.ClpSerializer;
import com.meera.db.service.JobDirectoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class JobDirectoryClp extends BaseModelImpl<JobDirectory>
    implements JobDirectory {
    private long _jobDirectoryId;
    private String _name;
    private String _archiveStatus;
    private BaseModel<?> _jobDirectoryRemoteModel;
    private Class<?> _clpSerializerClass = com.meera.db.service.ClpSerializer.class;

    public JobDirectoryClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return JobDirectory.class;
    }

    @Override
    public String getModelClassName() {
        return JobDirectory.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _jobDirectoryId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setJobDirectoryId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _jobDirectoryId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("jobDirectoryId", getJobDirectoryId());
        attributes.put("name", getName());
        attributes.put("archiveStatus", getArchiveStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long jobDirectoryId = (Long) attributes.get("jobDirectoryId");

        if (jobDirectoryId != null) {
            setJobDirectoryId(jobDirectoryId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String archiveStatus = (String) attributes.get("archiveStatus");

        if (archiveStatus != null) {
            setArchiveStatus(archiveStatus);
        }
    }

    @Override
    public long getJobDirectoryId() {
        return _jobDirectoryId;
    }

    @Override
    public void setJobDirectoryId(long jobDirectoryId) {
        _jobDirectoryId = jobDirectoryId;

        if (_jobDirectoryRemoteModel != null) {
            try {
                Class<?> clazz = _jobDirectoryRemoteModel.getClass();

                Method method = clazz.getMethod("setJobDirectoryId", long.class);

                method.invoke(_jobDirectoryRemoteModel, jobDirectoryId);
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

        if (_jobDirectoryRemoteModel != null) {
            try {
                Class<?> clazz = _jobDirectoryRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_jobDirectoryRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getArchiveStatus() {
        return _archiveStatus;
    }

    @Override
    public void setArchiveStatus(String archiveStatus) {
        _archiveStatus = archiveStatus;

        if (_jobDirectoryRemoteModel != null) {
            try {
                Class<?> clazz = _jobDirectoryRemoteModel.getClass();

                Method method = clazz.getMethod("setArchiveStatus", String.class);

                method.invoke(_jobDirectoryRemoteModel, archiveStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getJobDirectoryRemoteModel() {
        return _jobDirectoryRemoteModel;
    }

    public void setJobDirectoryRemoteModel(BaseModel<?> jobDirectoryRemoteModel) {
        _jobDirectoryRemoteModel = jobDirectoryRemoteModel;
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

        Class<?> remoteModelClass = _jobDirectoryRemoteModel.getClass();

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

        Object returnValue = method.invoke(_jobDirectoryRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            JobDirectoryLocalServiceUtil.addJobDirectory(this);
        } else {
            JobDirectoryLocalServiceUtil.updateJobDirectory(this);
        }
    }

    @Override
    public JobDirectory toEscapedModel() {
        return (JobDirectory) ProxyUtil.newProxyInstance(JobDirectory.class.getClassLoader(),
            new Class[] { JobDirectory.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        JobDirectoryClp clone = new JobDirectoryClp();

        clone.setJobDirectoryId(getJobDirectoryId());
        clone.setName(getName());
        clone.setArchiveStatus(getArchiveStatus());

        return clone;
    }

    @Override
    public int compareTo(JobDirectory jobDirectory) {
        int value = 0;

        if (getJobDirectoryId() < jobDirectory.getJobDirectoryId()) {
            value = -1;
        } else if (getJobDirectoryId() > jobDirectory.getJobDirectoryId()) {
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

        if (!(obj instanceof JobDirectoryClp)) {
            return false;
        }

        JobDirectoryClp jobDirectory = (JobDirectoryClp) obj;

        long primaryKey = jobDirectory.getPrimaryKey();

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
        StringBundler sb = new StringBundler(7);

        sb.append("{jobDirectoryId=");
        sb.append(getJobDirectoryId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", archiveStatus=");
        sb.append(getArchiveStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.meera.db.model.JobDirectory");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>jobDirectoryId</column-name><column-value><![CDATA[");
        sb.append(getJobDirectoryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archiveStatus</column-name><column-value><![CDATA[");
        sb.append(getArchiveStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
