package com.meera.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JobDirectory}.
 * </p>
 *
 * @author LiferaySavvy
 * @see JobDirectory
 * @generated
 */
public class JobDirectoryWrapper implements JobDirectory,
    ModelWrapper<JobDirectory> {
    private JobDirectory _jobDirectory;

    public JobDirectoryWrapper(JobDirectory jobDirectory) {
        _jobDirectory = jobDirectory;
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

    /**
    * Returns the primary key of this job directory.
    *
    * @return the primary key of this job directory
    */
    @Override
    public long getPrimaryKey() {
        return _jobDirectory.getPrimaryKey();
    }

    /**
    * Sets the primary key of this job directory.
    *
    * @param primaryKey the primary key of this job directory
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _jobDirectory.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the job directory ID of this job directory.
    *
    * @return the job directory ID of this job directory
    */
    @Override
    public long getJobDirectoryId() {
        return _jobDirectory.getJobDirectoryId();
    }

    /**
    * Sets the job directory ID of this job directory.
    *
    * @param jobDirectoryId the job directory ID of this job directory
    */
    @Override
    public void setJobDirectoryId(long jobDirectoryId) {
        _jobDirectory.setJobDirectoryId(jobDirectoryId);
    }

    /**
    * Returns the name of this job directory.
    *
    * @return the name of this job directory
    */
    @Override
    public java.lang.String getName() {
        return _jobDirectory.getName();
    }

    /**
    * Sets the name of this job directory.
    *
    * @param name the name of this job directory
    */
    @Override
    public void setName(java.lang.String name) {
        _jobDirectory.setName(name);
    }

    /**
    * Returns the archive status of this job directory.
    *
    * @return the archive status of this job directory
    */
    @Override
    public java.lang.String getArchiveStatus() {
        return _jobDirectory.getArchiveStatus();
    }

    /**
    * Sets the archive status of this job directory.
    *
    * @param archiveStatus the archive status of this job directory
    */
    @Override
    public void setArchiveStatus(java.lang.String archiveStatus) {
        _jobDirectory.setArchiveStatus(archiveStatus);
    }

    @Override
    public boolean isNew() {
        return _jobDirectory.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _jobDirectory.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _jobDirectory.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _jobDirectory.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _jobDirectory.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _jobDirectory.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _jobDirectory.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _jobDirectory.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _jobDirectory.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _jobDirectory.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _jobDirectory.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new JobDirectoryWrapper((JobDirectory) _jobDirectory.clone());
    }

    @Override
    public int compareTo(com.meera.db.model.JobDirectory jobDirectory) {
        return _jobDirectory.compareTo(jobDirectory);
    }

    @Override
    public int hashCode() {
        return _jobDirectory.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.meera.db.model.JobDirectory> toCacheModel() {
        return _jobDirectory.toCacheModel();
    }

    @Override
    public com.meera.db.model.JobDirectory toEscapedModel() {
        return new JobDirectoryWrapper(_jobDirectory.toEscapedModel());
    }

    @Override
    public com.meera.db.model.JobDirectory toUnescapedModel() {
        return new JobDirectoryWrapper(_jobDirectory.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _jobDirectory.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _jobDirectory.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _jobDirectory.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof JobDirectoryWrapper)) {
            return false;
        }

        JobDirectoryWrapper jobDirectoryWrapper = (JobDirectoryWrapper) obj;

        if (Validator.equals(_jobDirectory, jobDirectoryWrapper._jobDirectory)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public JobDirectory getWrappedJobDirectory() {
        return _jobDirectory;
    }

    @Override
    public JobDirectory getWrappedModel() {
        return _jobDirectory;
    }

    @Override
    public void resetOriginalValues() {
        _jobDirectory.resetOriginalValues();
    }
}
