package com.nam.srv42.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.nam.srv42.model.Record;

import java.util.List;

/**
 * The persistence utility for the record service. This utility wraps {@link RecordPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hp
 * @see RecordPersistence
 * @see RecordPersistenceImpl
 * @generated
 */
public class RecordUtil {
    private static RecordPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Record record) {
        getPersistence().clearCache(record);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Record> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Record> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Record> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Record update(Record record) throws SystemException {
        return getPersistence().update(record);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Record update(Record record, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(record, serviceContext);
    }

    /**
    * Returns all the records where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the records where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of records
    * @param end the upper bound of the range of records (not inclusive)
    * @return the range of matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the records where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of records
    * @param end the upper bound of the range of records (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first record in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first record in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last record in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last record in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the records before and after the current record in the ordered set where uuid = &#63;.
    *
    * @param recordId the primary key of the current record
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next record
    * @throws com.nam.srv42.NoSuchRecordException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record[] findByUuid_PrevAndNext(
        long recordId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence()
                   .findByUuid_PrevAndNext(recordId, uuid, orderByComparator);
    }

    /**
    * Removes all the records where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of records where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching records
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the record where uuid = &#63; and groupId = &#63; or throws a {@link com.nam.srv42.NoSuchRecordException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the record where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the record where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the record where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the record that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of records where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching records
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the records where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the records where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of records
    * @param end the upper bound of the range of records (not inclusive)
    * @return the range of matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the records where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of records
    * @param end the upper bound of the range of records (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first record in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first record in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last record in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last record in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the records before and after the current record in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param recordId the primary key of the current record
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next record
    * @throws com.nam.srv42.NoSuchRecordException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record[] findByUuid_C_PrevAndNext(
        long recordId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(recordId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the records where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of records where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching records
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the records where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the records where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of records
    * @param end the upper bound of the range of records (not inclusive)
    * @return the range of matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the records where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of records
    * @param end the upper bound of the range of records (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first record in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record findByGroupId_First(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first record in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last record in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record findByGroupId_Last(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last record in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchByGroupId_Last(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the records before and after the current record in the ordered set where groupId = &#63;.
    *
    * @param recordId the primary key of the current record
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next record
    * @throws com.nam.srv42.NoSuchRecordException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record[] findByGroupId_PrevAndNext(
        long recordId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(recordId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the records where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of records where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching records
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns all the records where groupId = &#63; and name LIKE &#63;.
    *
    * @param groupId the group ID
    * @param name the name
    * @return the matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByG_N(
        long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_N(groupId, name);
    }

    /**
    * Returns a range of all the records where groupId = &#63; and name LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param name the name
    * @param start the lower bound of the range of records
    * @param end the upper bound of the range of records (not inclusive)
    * @return the range of matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByG_N(
        long groupId, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_N(groupId, name, start, end);
    }

    /**
    * Returns an ordered range of all the records where groupId = &#63; and name LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param name the name
    * @param start the lower bound of the range of records
    * @param end the upper bound of the range of records (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findByG_N(
        long groupId, java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_N(groupId, name, start, end, orderByComparator);
    }

    /**
    * Returns the first record in the ordered set where groupId = &#63; and name LIKE &#63;.
    *
    * @param groupId the group ID
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record findByG_N_First(long groupId,
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence().findByG_N_First(groupId, name, orderByComparator);
    }

    /**
    * Returns the first record in the ordered set where groupId = &#63; and name LIKE &#63;.
    *
    * @param groupId the group ID
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchByG_N_First(long groupId,
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_N_First(groupId, name, orderByComparator);
    }

    /**
    * Returns the last record in the ordered set where groupId = &#63; and name LIKE &#63;.
    *
    * @param groupId the group ID
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record findByG_N_Last(long groupId,
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence().findByG_N_Last(groupId, name, orderByComparator);
    }

    /**
    * Returns the last record in the ordered set where groupId = &#63; and name LIKE &#63;.
    *
    * @param groupId the group ID
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchByG_N_Last(long groupId,
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByG_N_Last(groupId, name, orderByComparator);
    }

    /**
    * Returns the records before and after the current record in the ordered set where groupId = &#63; and name LIKE &#63;.
    *
    * @param recordId the primary key of the current record
    * @param groupId the group ID
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next record
    * @throws com.nam.srv42.NoSuchRecordException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record[] findByG_N_PrevAndNext(
        long recordId, long groupId, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence()
                   .findByG_N_PrevAndNext(recordId, groupId, name,
            orderByComparator);
    }

    /**
    * Removes all the records where groupId = &#63; and name LIKE &#63; from the database.
    *
    * @param groupId the group ID
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_N(long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_N(groupId, name);
    }

    /**
    * Returns the number of records where groupId = &#63; and name LIKE &#63;.
    *
    * @param groupId the group ID
    * @param name the name
    * @return the number of matching records
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_N(long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_N(groupId, name);
    }

    /**
    * Caches the record in the entity cache if it is enabled.
    *
    * @param record the record
    */
    public static void cacheResult(com.nam.srv42.model.Record record) {
        getPersistence().cacheResult(record);
    }

    /**
    * Caches the records in the entity cache if it is enabled.
    *
    * @param records the records
    */
    public static void cacheResult(
        java.util.List<com.nam.srv42.model.Record> records) {
        getPersistence().cacheResult(records);
    }

    /**
    * Creates a new record with the primary key. Does not add the record to the database.
    *
    * @param recordId the primary key for the new record
    * @return the new record
    */
    public static com.nam.srv42.model.Record create(long recordId) {
        return getPersistence().create(recordId);
    }

    /**
    * Removes the record with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param recordId the primary key of the record
    * @return the record that was removed
    * @throws com.nam.srv42.NoSuchRecordException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record remove(long recordId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence().remove(recordId);
    }

    public static com.nam.srv42.model.Record updateImpl(
        com.nam.srv42.model.Record record)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(record);
    }

    /**
    * Returns the record with the primary key or throws a {@link com.nam.srv42.NoSuchRecordException} if it could not be found.
    *
    * @param recordId the primary key of the record
    * @return the record
    * @throws com.nam.srv42.NoSuchRecordException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record findByPrimaryKey(long recordId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException {
        return getPersistence().findByPrimaryKey(recordId);
    }

    /**
    * Returns the record with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param recordId the primary key of the record
    * @return the record, or <code>null</code> if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.nam.srv42.model.Record fetchByPrimaryKey(long recordId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(recordId);
    }

    /**
    * Returns all the records.
    *
    * @return the records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.nam.srv42.model.Record> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the records.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nam.srv42.model.impl.RecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of records
    * @param end the upper bound of the range of records (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of records
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.nam.srv42.model.Record> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the records from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of records.
    *
    * @return the number of records
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RecordPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RecordPersistence) PortletBeanLocatorUtil.locate(com.nam.srv42.service.ClpSerializer.getServletContextName(),
                    RecordPersistence.class.getName());

            ReferenceRegistry.registerReference(RecordUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RecordPersistence persistence) {
    }
}
