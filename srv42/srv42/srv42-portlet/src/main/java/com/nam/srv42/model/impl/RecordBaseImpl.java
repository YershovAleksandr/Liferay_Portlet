package com.nam.srv42.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.nam.srv42.model.Record;
import com.nam.srv42.service.RecordLocalServiceUtil;

/**
 * The extended model base implementation for the Record service. Represents a row in the &quot;srvv_Record&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RecordImpl}.
 * </p>
 *
 * @author hp
 * @see RecordImpl
 * @see com.nam.srv42.model.Record
 * @generated
 */
public abstract class RecordBaseImpl extends RecordModelImpl implements Record {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a record model instance should use the {@link Record} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RecordLocalServiceUtil.addRecord(this);
        } else {
            RecordLocalServiceUtil.updateRecord(this);
        }
    }
}