package com.nam.srv42.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Record. This utility wraps
 * {@link com.nam.srv42.service.impl.RecordLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author hp
 * @see RecordLocalService
 * @see com.nam.srv42.service.base.RecordLocalServiceBaseImpl
 * @see com.nam.srv42.service.impl.RecordLocalServiceImpl
 * @generated
 */
public class RecordLocalServiceUtil {
    private static RecordLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.nam.srv42.service.impl.RecordLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the record to the database. Also notifies the appropriate model listeners.
    *
    * @param record the record
    * @return the record that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record addRecord(
        com.nam.srv42.model.Record record)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRecord(record);
    }

    /**
    * Creates a new record with the primary key. Does not add the record to the database.
    *
    * @param recordId the primary key for the new record
    * @return the new record
    */
    public static com.nam.srv42.model.Record createRecord(long recordId) {
        return getService().createRecord(recordId);
    }

    /**
    * Deletes the record with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param recordId the primary key of the record
    * @return the record that was removed
    * @throws PortalException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record deleteRecord(long recordId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRecord(recordId);
    }

    /**
    * Deletes the record from the database. Also notifies the appropriate model listeners.
    *
    * @param record the record
    * @return the record that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record deleteRecord(
        com.nam.srv42.model.Record record)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRecord(record);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.nam.srv42.model.Record fetchRecord(long recordId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRecord(recordId);
    }

    /**
    * Returns the record with the matching UUID and company.
    *
    * @param uuid the record's UUID
    * @param companyId the primary key of the company
    * @return the matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchRecordByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRecordByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the record matching the UUID and group.
    *
    * @param uuid the record's UUID
    * @param groupId the primary key of the group
    * @return the matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchRecordByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRecordByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the record with the primary key.
    *
    * @param recordId the primary key of the record
    * @return the record
    * @throws PortalException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record getRecord(long recordId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRecord(recordId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static com.nam.srv42.model.Record getRecordByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRecordByUuidAndCompanyId(uuid, companyId);
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
    public static com.nam.srv42.model.Record getRecordByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRecordByUuidAndGroupId(uuid, groupId);
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
    public static java.util.List<com.nam.srv42.model.Record> getRecords(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRecords(start, end);
    }

    /**
    * Returns the number of records.
    *
    * @return the number of records
    * @throws SystemException if a system exception occurred
    */
    public static int getRecordsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRecordsCount();
    }

    /**
    * Updates the record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param record the record
    * @return the record that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record updateRecord(
        com.nam.srv42.model.Record record)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRecord(record);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<com.nam.srv42.model.Record> getRecords(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRecords(groupId);
    }

    public static java.util.List<com.nam.srv42.model.Record> getRecords(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRecords(groupId, start, end);
    }

    public static java.util.List<com.nam.srv42.model.Record> getRecordsByName(
        long groupId, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRecordsByName(groupId, name, start, end);
    }

    public static com.nam.srv42.model.Record addRecord(long userId,
        java.lang.String name, java.util.Date date, java.lang.String employer,
        int salary, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addRecord(userId, name, date, employer, salary,
            serviceContext);
    }

    public static void removeRecords()
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().removeRecords();
    }

    public static void clearService() {
        _service = null;
    }

    public static RecordLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RecordLocalService.class.getName());

            if (invokableLocalService instanceof RecordLocalService) {
                _service = (RecordLocalService) invokableLocalService;
            } else {
                _service = new RecordLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RecordLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RecordLocalService service) {
    }
}
