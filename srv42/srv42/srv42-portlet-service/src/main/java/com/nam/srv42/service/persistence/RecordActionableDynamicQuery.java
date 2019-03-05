package com.nam.srv42.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.nam.srv42.model.Record;
import com.nam.srv42.service.RecordLocalServiceUtil;

/**
 * @author hp
 * @generated
 */
public abstract class RecordActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RecordActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RecordLocalServiceUtil.getService());
        setClass(Record.class);

        setClassLoader(com.nam.srv42.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("recordId");
    }
}
