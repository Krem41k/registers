package com.meera.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.meera.db.model.JobDirectory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing JobDirectory in entity cache.
 *
 * @author LiferaySavvy
 * @see JobDirectory
 * @generated
 */
public class JobDirectoryCacheModel implements CacheModel<JobDirectory>,
    Externalizable {
    public long jobDirectoryId;
    public String name;
    public String archiveStatus;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{jobDirectoryId=");
        sb.append(jobDirectoryId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", archiveStatus=");
        sb.append(archiveStatus);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public JobDirectory toEntityModel() {
        JobDirectoryImpl jobDirectoryImpl = new JobDirectoryImpl();

        jobDirectoryImpl.setJobDirectoryId(jobDirectoryId);

        if (name == null) {
            jobDirectoryImpl.setName(StringPool.BLANK);
        } else {
            jobDirectoryImpl.setName(name);
        }

        if (archiveStatus == null) {
            jobDirectoryImpl.setArchiveStatus(StringPool.BLANK);
        } else {
            jobDirectoryImpl.setArchiveStatus(archiveStatus);
        }

        jobDirectoryImpl.resetOriginalValues();

        return jobDirectoryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        jobDirectoryId = objectInput.readLong();
        name = objectInput.readUTF();
        archiveStatus = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(jobDirectoryId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (archiveStatus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(archiveStatus);
        }
    }
}
