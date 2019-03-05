package com.nam.srv42.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.nam.srv42.service.ClpSerializer;
import com.nam.srv42.service.RecordLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class RecordClp extends BaseModelImpl<Record> implements Record {
    private String _uuid;
    private long _recordId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private Date _date;
    private String _employer;
    private int _salary;
    private BaseModel<?> _recordRemoteModel;
    private Class<?> _clpSerializerClass = com.nam.srv42.service.ClpSerializer.class;

    public RecordClp() {
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
    public long getPrimaryKey() {
        return _recordId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setRecordId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _recordId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_recordRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getRecordId() {
        return _recordId;
    }

    @Override
    public void setRecordId(long recordId) {
        _recordId = recordId;

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setRecordId", long.class);

                method.invoke(_recordRemoteModel, recordId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_recordRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_recordRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_recordRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_recordRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_recordRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_recordRemoteModel, modifiedDate);
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

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_recordRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDate() {
        return _date;
    }

    @Override
    public void setDate(Date date) {
        _date = date;

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setDate", Date.class);

                method.invoke(_recordRemoteModel, date);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmployer() {
        return _employer;
    }

    @Override
    public void setEmployer(String employer) {
        _employer = employer;

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployer", String.class);

                method.invoke(_recordRemoteModel, employer);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSalary() {
        return _salary;
    }

    @Override
    public void setSalary(int salary) {
        _salary = salary;

        if (_recordRemoteModel != null) {
            try {
                Class<?> clazz = _recordRemoteModel.getClass();

                Method method = clazz.getMethod("setSalary", int.class);

                method.invoke(_recordRemoteModel, salary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Record.class.getName()));
    }

    public BaseModel<?> getRecordRemoteModel() {
        return _recordRemoteModel;
    }

    public void setRecordRemoteModel(BaseModel<?> recordRemoteModel) {
        _recordRemoteModel = recordRemoteModel;
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

        Class<?> remoteModelClass = _recordRemoteModel.getClass();

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

        Object returnValue = method.invoke(_recordRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RecordLocalServiceUtil.addRecord(this);
        } else {
            RecordLocalServiceUtil.updateRecord(this);
        }
    }

    @Override
    public Record toEscapedModel() {
        return (Record) ProxyUtil.newProxyInstance(Record.class.getClassLoader(),
            new Class[] { Record.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RecordClp clone = new RecordClp();

        clone.setUuid(getUuid());
        clone.setRecordId(getRecordId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setName(getName());
        clone.setDate(getDate());
        clone.setEmployer(getEmployer());
        clone.setSalary(getSalary());

        return clone;
    }

    @Override
    public int compareTo(Record record) {
        long primaryKey = record.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RecordClp)) {
            return false;
        }

        RecordClp record = (RecordClp) obj;

        long primaryKey = record.getPrimaryKey();

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
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", recordId=");
        sb.append(getRecordId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", date=");
        sb.append(getDate());
        sb.append(", employer=");
        sb.append(getEmployer());
        sb.append(", salary=");
        sb.append(getSalary());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("com.nam.srv42.model.Record");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>recordId</column-name><column-value><![CDATA[");
        sb.append(getRecordId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date</column-name><column-value><![CDATA[");
        sb.append(getDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employer</column-name><column-value><![CDATA[");
        sb.append(getEmployer());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salary</column-name><column-value><![CDATA[");
        sb.append(getSalary());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
