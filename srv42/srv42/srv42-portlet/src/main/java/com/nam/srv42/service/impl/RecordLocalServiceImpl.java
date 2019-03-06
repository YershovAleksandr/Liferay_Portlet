package com.nam.srv42.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.nam.srv42.model.Record;
import com.nam.srv42.service.base.RecordLocalServiceBaseImpl;

/**
 * The implementation of the record local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.nam.srv42.service.RecordLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author hp
 * @see com.nam.srv42.service.base.RecordLocalServiceBaseImpl
 * @see com.nam.srv42.service.RecordLocalServiceUtil
 */
public class RecordLocalServiceImpl extends RecordLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.nam.srv42.service.RecordLocalServiceUtil} to access the record local service.
     */
	public List<Record> getRecords(long groupId) throws SystemException{
		return recordPersistence.findByGroupId(groupId);
	}
	
	public List<Record> getRecords(long groupId, int start, int end) throws SystemException{
		return recordPersistence.findByGroupId(groupId, start, end);
	}

	public List<Record> getRecordsByName(long groupId, String name, int start, int end) throws SystemException{
		return recordPersistence.findByG_N(groupId, name, start, end);
	}
	
	public Record addRecord(long userId, String name, Date date, String employer, int salary, ServiceContext serviceContext)
			throws SystemException, PortalException{
		long groupId = serviceContext.getScopeGroupId();
		
		User user = userPersistence.findByPrimaryKey(userId);
		
		long recordId = counterLocalService.increment();
		
		Record record = recordPersistence.create(recordId);
		
		record.setUuid(serviceContext.getUuid());
		record.setUserId(userId);
		record.setGroupId(groupId);
		record.setCompanyId(user.getCompanyId());
		record.setUserName(user.getFullName());
		record.setCreateDate(serviceContext.getCreateDate(new Date()));
		record.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		record.setExpandoBridgeAttributes(serviceContext);
		
		record.setName(name);
		record.setDate(date);
		record.setEmployer(employer);
		record.setSalary(salary);
		
		recordPersistence.update(record);
		
		return record;
	}
	
	public void removeRecords()throws SystemException{
		recordPersistence.removeAll();
	}
	
}
