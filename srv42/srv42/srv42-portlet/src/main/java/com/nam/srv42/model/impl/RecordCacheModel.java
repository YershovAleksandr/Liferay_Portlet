package com.nam.srv42.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.nam.srv42.model.Record;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Record in entity cache.
 *
 * @author hp
 * @see Record
 * @generated
 */
public class RecordCacheModel implements CacheModel<Record>, Externalizable {
    public String uuid;
    public long recordId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public long date;
    public String employer;
    public int salary;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", recordId=");
        sb.append(recordId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", name=");
        sb.append(name);
        sb.append(", date=");
        sb.append(date);
        sb.append(", employer=");
        sb.append(employer);
        sb.append(", salary=");
        sb.append(salary);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Record toEntityModel() {
        RecordImpl recordImpl = new RecordImpl();

        if (uuid == null) {
            recordImpl.setUuid(StringPool.BLANK);
        } else {
            recordImpl.setUuid(uuid);
        }

        recordImpl.setRecordId(recordId);
        recordImpl.setGroupId(groupId);
        recordImpl.setCompanyId(companyId);
        recordImpl.setUserId(userId);

        if (userName == null) {
            recordImpl.setUserName(StringPool.BLANK);
        } else {
            recordImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            recordImpl.setCreateDate(null);
        } else {
            recordImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            recordImpl.setModifiedDate(null);
        } else {
            recordImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            recordImpl.setName(StringPool.BLANK);
        } else {
            recordImpl.setName(name);
        }

        if (date == Long.MIN_VALUE) {
            recordImpl.setDate(null);
        } else {
            recordImpl.setDate(new Date(date));
        }

        if (employer == null) {
            recordImpl.setEmployer(StringPool.BLANK);
        } else {
            recordImpl.setEmployer(employer);
        }

        recordImpl.setSalary(salary);

        recordImpl.resetOriginalValues();

        return recordImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        recordId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        date = objectInput.readLong();
        employer = objectInput.readUTF();
        salary = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(recordId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(date);

        if (employer == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employer);
        }

        objectOutput.writeInt(salary);
    }
}
