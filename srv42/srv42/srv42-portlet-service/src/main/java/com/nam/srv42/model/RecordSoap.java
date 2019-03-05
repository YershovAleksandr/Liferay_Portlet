package com.nam.srv42.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author hp
 * @generated
 */
public class RecordSoap implements Serializable {
    private String _uuid;
    private long _recordId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private Date _date;
    private String _employer;
    private int _salary;

    public RecordSoap() {
    }

    public static RecordSoap toSoapModel(Record model) {
        RecordSoap soapModel = new RecordSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setRecordId(model.getRecordId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setDate(model.getDate());
        soapModel.setEmployer(model.getEmployer());
        soapModel.setSalary(model.getSalary());

        return soapModel;
    }

    public static RecordSoap[] toSoapModels(Record[] models) {
        RecordSoap[] soapModels = new RecordSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RecordSoap[][] toSoapModels(Record[][] models) {
        RecordSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RecordSoap[models.length][models[0].length];
        } else {
            soapModels = new RecordSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RecordSoap[] toSoapModels(List<Record> models) {
        List<RecordSoap> soapModels = new ArrayList<RecordSoap>(models.size());

        for (Record model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RecordSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _recordId;
    }

    public void setPrimaryKey(long pk) {
        setRecordId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getRecordId() {
        return _recordId;
    }

    public void setRecordId(long recordId) {
        _recordId = recordId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public Date getDate() {
        return _date;
    }

    public void setDate(Date date) {
        _date = date;
    }

    public String getEmployer() {
        return _employer;
    }

    public void setEmployer(String employer) {
        _employer = employer;
    }

    public int getSalary() {
        return _salary;
    }

    public void setSalary(int salary) {
        _salary = salary;
    }
}
