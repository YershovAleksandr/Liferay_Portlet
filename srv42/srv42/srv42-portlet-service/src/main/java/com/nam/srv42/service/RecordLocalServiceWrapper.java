package com.nam.srv42.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RecordLocalService}.
 *
 * @author hp
 * @see RecordLocalService
 * @generated
 */
public class RecordLocalServiceWrapper implements RecordLocalService,
    ServiceWrapper<RecordLocalService> {
    private RecordLocalService _recordLocalService;

    public RecordLocalServiceWrapper(RecordLocalService recordLocalService) {
        _recordLocalService = recordLocalService;
    }

    /**
    * Adds the record to the database. Also notifies the appropriate model listeners.
    *
    * @param record the record
    * @return the record that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.nam.srv42.model.Record addRecord(
        com.nam.srv42.model.Record record)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.addRecord(record);
    }

    /**
    * Creates a new record with the primary key. Does not add the record to the database.
    *
    * @param recordId the primary key for the new record
    * @return the new record
    */
    @Override
    public com.nam.srv42.model.Record createRecord(long recordId) {
        return _recordLocalService.createRecord(recordId);
    }

    /**
    * Deletes the record with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param recordId the primary key of the record
    * @return the record that was removed
    * @throws PortalException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.nam.srv42.model.Record deleteRecord(long recordId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.deleteRecord(recordId);
    }

    /**
    * Deletes the record from the database. Also notifies the appropriate model listeners.
    *
    * @param record the record
    * @return the record that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.nam.srv42.model.Record deleteRecord(
        com.nam.srv42.model.Record record)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.deleteRecord(record);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _recordLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.nam.srv42.model.Record fetchRecord(long recordId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.fetchRecord(recordId);
    }

    /**
    * Returns the record with the matching UUID and company.
    *
    * @param uuid the record's UUID
    * @param companyId the primary key of the company
    * @return the matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.nam.srv42.model.Record fetchRecordByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.fetchRecordByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the record matching the UUID and group.
    *
    * @param uuid the record's UUID
    * @param groupId the primary key of the group
    * @return the matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.nam.srv42.model.Record fetchRecordByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.fetchRecordByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the record with the primary key.
    *
    * @param recordId the primary key of the record
    * @return the record
    * @throws PortalException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.nam.srv42.model.Record getRecord(long recordId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.getRecord(recordId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the record with the matching UUID and company.
    *
    * @param uuid the record's UUID
    * @param companyId the primary key of the company
    * @return the matching record
    * @throws PortalException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.nam.srv42.model.Record getRecordByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.getRecordByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the record matching the UUID and group.
    *
    * @param uuid the record's UUID
    * @param groupId the primary key of the group
    * @return the matching record
    * @throws PortalException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.nam.srv42.model.Record getRecordByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.getRecordByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the records.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of records
    * @param end the upper bound of the range of records (not inclusive)
    * @return the range of records
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.nam.srv42.model.Record> getRecords(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.getRecords(start, end);
    }

    /**
    * Returns the number of records.
    *
    * @return the number of records
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRecordsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.getRecordsCount();
    }

    /**
    * Updates the record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param record the record
    * @return the record that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.nam.srv42.model.Record updateRecord(
        com.nam.srv42.model.Record record)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.updateRecord(record);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _recordLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _recordLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _recordLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<com.nam.srv42.model.Record> getRecords(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.getRecords(groupId);
    }

    @Override
    public java.util.List<com.nam.srv42.model.Record> getRecords(long groupId,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.getRecords(groupId, start, end);
    }

    @Override
    public java.util.List<com.nam.srv42.model.Record> getRecordsByName(
        long groupId, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.getRecordsByName(groupId, name, start, end);
    }

    @Override
    public com.nam.srv42.model.Record addRecord(long userId,
        java.lang.String name, java.util.Date date, java.lang.String employer,
        int salary, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _recordLocalService.addRecord(userId, name, date, employer,
            salary, serviceContext);
    }

    @Override
    public void removeRecords()
        throws com.liferay.portal.kernel.exception.SystemException {
        _recordLocalService.removeRecords();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RecordLocalService getWrappedRecordLocalService() {
        return _recordLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRecordLocalService(
        RecordLocalService recordLocalService) {
        _recordLocalService = recordLocalService;
    }

    @Override
    public RecordLocalService getWrappedService() {
        return _recordLocalService;
    }

    @Override
    public void setWrappedService(RecordLocalService recordLocalService) {
        _recordLocalService = recordLocalService;
    }
}
