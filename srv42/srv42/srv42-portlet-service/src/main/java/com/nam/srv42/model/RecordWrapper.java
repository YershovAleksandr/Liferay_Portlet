package com.nam.srv42.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Record}.
 * </p>
 *
 * @author hp
 * @see Record
 * @generated
 */
public class RecordWrapper implements Record, ModelWrapper<Record> {
    private Record _record;

    public RecordWrapper(Record record) {
        _record = record;
    }

    @Override
    public Class<?> getModelClass() {
        return Record.class;
    }

    @Override
    public String getModelClassName() {
        return Record.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("recordId", getRecordId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());
        attributes.put("date", getDate());
        attributes.put("employer", getEmployer());
        attributes.put("salary", getSalary());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long recordId = (Long) attributes.get("recordId");

        if (recordId != null) {
            setRecordId(recordId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Date date = (Date) attributes.get("date");

        if (date != null) {
            setDate(date);
        }

        String employer = (String) attributes.get("employer");

        if (employer != null) {
            setEmployer(employer);
        }

        Integer salary = (Integer) attributes.get("salary");

        if (salary != null) {
            setSalary(salary);
        }
    }

    /**
    * Returns the primary key of this record.
    *
    * @return the primary key of this record
    */
    @Override
    public long getPrimaryKey() {
        return _record.getPrimaryKey();
    }

    /**
    * Sets the primary key of this record.
    *
    * @param primaryKey the primary key of this record
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _record.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this record.
    *
    * @return the uuid of this record
    */
    @Override
    public java.lang.String getUuid() {
        return _record.getUuid();
    }

    /**
    * Sets the uuid of this record.
    *
    * @param uuid the uuid of this record
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _record.setUuid(uuid);
    }

    /**
    * Returns the record ID of this record.
    *
    * @return the record ID of this record
    */
    @Override
    public long getRecordId() {
        return _record.getRecordId();
    }

    /**
    * Sets the record ID of this record.
    *
    * @param recordId the record ID of this record
    */
    @Override
    public void setRecordId(long recordId) {
        _record.setRecordId(recordId);
    }

    /**
    * Returns the group ID of this record.
    *
    * @return the group ID of this record
    */
    @Override
    public long getGroupId() {
        return _record.getGroupId();
    }

    /**
    * Sets the group ID of this record.
    *
    * @param groupId the group ID of this record
    */
    @Override
    public void setGroupId(long groupId) {
        _record.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this record.
    *
    * @return the company ID of this record
    */
    @Override
    public long getCompanyId() {
        return _record.getCompanyId();
    }

    /**
    * Sets the company ID of this record.
    *
    * @param companyId the company ID of this record
    */
    @Override
    public void setCompanyId(long companyId) {
        _record.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this record.
    *
    * @return the user ID of this record
    */
    @Override
    public long getUserId() {
        return _record.getUserId();
    }

    /**
    * Sets the user ID of this record.
    *
    * @param userId the user ID of this record
    */
    @Override
    public void setUserId(long userId) {
        _record.setUserId(userId);
    }

    /**
    * Returns the user uuid of this record.
    *
    * @return the user uuid of this record
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _record.getUserUuid();
    }

    /**
    * Sets the user uuid of this record.
    *
    * @param userUuid the user uuid of this record
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _record.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this record.
    *
    * @return the user name of this record
    */
    @Override
    public java.lang.String getUserName() {
        return _record.getUserName();
    }

    /**
    * Sets the user name of this record.
    *
    * @param userName the user name of this record
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _record.setUserName(userName);
    }

    /**
    * Returns the create date of this record.
    *
    * @return the create date of this record
    */
    @Override
    public java.util.Date getCreateDate() {
        return _record.getCreateDate();
    }

    /**
    * Sets the create date of this record.
    *
    * @param createDate the create date of this record
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _record.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this record.
    *
    * @return the modified date of this record
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _record.getModifiedDate();
    }

    /**
    * Sets the modified date of this record.
    *
    * @param modifiedDate the modified date of this record
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _record.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the name of this record.
    *
    * @return the name of this record
    */
    @Override
    public java.lang.String getName() {
        return _record.getName();
    }

    /**
    * Sets the name of this record.
    *
    * @param name the name of this record
    */
    @Override
    public void setName(java.lang.String name) {
        _record.setName(name);
    }

    /**
    * Returns the date of this record.
    *
    * @return the date of this record
    */
    @Override
    public java.util.Date getDate() {
        return _record.getDate();
    }

    /**
    * Sets the date of this record.
    *
    * @param date the date of this record
    */
    @Override
    public void setDate(java.util.Date date) {
        _record.setDate(date);
    }

    /**
    * Returns the employer of this record.
    *
    * @return the employer of this record
    */
    @Override
    public java.lang.String getEmployer() {
        return _record.getEmployer();
    }

    /**
    * Sets the employer of this record.
    *
    * @param employer the employer of this record
    */
    @Override
    public void setEmployer(java.lang.String employer) {
        _record.setEmployer(employer);
    }

    /**
    * Returns the salary of this record.
    *
    * @return the salary of this record
    */
    @Override
    public int getSalary() {
        return _record.getSalary();
    }

    /**
    * Sets the salary of this record.
    *
    * @param salary the salary of this record
    */
    @Override
    public void setSalary(int salary) {
        _record.setSalary(salary);
    }

    @Override
    public boolean isNew() {
        return _record.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _record.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _record.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _record.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _record.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _record.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _record.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _record.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _record.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _record.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _record.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RecordWrapper((Record) _record.clone());
    }

    @Override
    public int compareTo(com.nam.srv42.model.Record record) {
        return _record.compareTo(record);
    }

    @Override
    public int hashCode() {
        return _record.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.nam.srv42.model.Record> toCacheModel() {
        return _record.toCacheModel();
    }

    @Override
    public com.nam.srv42.model.Record toEscapedModel() {
        return new RecordWrapper(_record.toEscapedModel());
    }

    @Override
    public com.nam.srv42.model.Record toUnescapedModel() {
        return new RecordWrapper(_record.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _record.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _record.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _record.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RecordWrapper)) {
            return false;
        }

        RecordWrapper recordWrapper = (RecordWrapper) obj;

        if (Validator.equals(_record, recordWrapper._record)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _record.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Record getWrappedRecord() {
        return _record;
    }

    @Override
    public Record getWrappedModel() {
        return _record;
    }

    @Override
    public void resetOriginalValues() {
        _record.resetOriginalValues();
    }
}
