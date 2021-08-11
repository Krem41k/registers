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
public class JobDirectorySoap implements Serializable {
    private long _jobDirectoryId;
    private String _name;
    private String _archiveStatus;

    public JobDirectorySoap() {
    }

    public static JobDirectorySoap toSoapModel(JobDirectory model) {
        JobDirectorySoap soapModel = new JobDirectorySoap();

        soapModel.setJobDirectoryId(model.getJobDirectoryId());
        soapModel.setName(model.getName());
        soapModel.setArchiveStatus(model.getArchiveStatus());

        return soapModel;
    }

    public static JobDirectorySoap[] toSoapModels(JobDirectory[] models) {
        JobDirectorySoap[] soapModels = new JobDirectorySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static JobDirectorySoap[][] toSoapModels(JobDirectory[][] models) {
        JobDirectorySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new JobDirectorySoap[models.length][models[0].length];
        } else {
            soapModels = new JobDirectorySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static JobDirectorySoap[] toSoapModels(List<JobDirectory> models) {
        List<JobDirectorySoap> soapModels = new ArrayList<JobDirectorySoap>(models.size());

        for (JobDirectory model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new JobDirectorySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _jobDirectoryId;
    }

    public void setPrimaryKey(long pk) {
        setJobDirectoryId(pk);
    }

    public long getJobDirectoryId() {
        return _jobDirectoryId;
    }

    public void setJobDirectoryId(long jobDirectoryId) {
        _jobDirectoryId = jobDirectoryId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getArchiveStatus() {
        return _archiveStatus;
    }

    public void setArchiveStatus(String archiveStatus) {
        _archiveStatus = archiveStatus;
    }
}
