package com.nam.srv42.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.nam.srv42.model.Record;

/**
 * The persistence interface for the record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hp
 * @see RecordPersistenceImpl
 * @see RecordUtil
 * @generated
 */
public interface RecordPersistence extends BasePersistence<Record> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RecordUtil} to access the record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the records where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching records
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.nam.srv42.model.Record> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.nam.srv42.model.Record> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.nam.srv42.model.Record> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first record in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record findByUuid_First(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Returns the first record in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record fetchByUuid_First(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last record in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record findByUuid_Last(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Returns the last record in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record fetchByUuid_Last(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.nam.srv42.model.Record[] findByUuid_PrevAndNext(long recordId,
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Removes all the records where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of records where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching records
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the record where uuid = &#63; and groupId = &#63; or throws a {@link com.nam.srv42.NoSuchRecordException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record findByUUID_G(java.lang.String uuid,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Returns the record where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record fetchByUUID_G(java.lang.String uuid,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the record where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record fetchByUUID_G(java.lang.String uuid,
        long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the record where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the record that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record removeByUUID_G(java.lang.String uuid,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Returns the number of records where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching records
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the records where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching records
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.nam.srv42.model.Record> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.nam.srv42.model.Record> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.nam.srv42.model.Record> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.nam.srv42.model.Record findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Returns the first record in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.nam.srv42.model.Record findByUuid_C_Last(java.lang.String uuid,
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Returns the last record in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.nam.srv42.model.Record[] findByUuid_C_PrevAndNext(
        long recordId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Removes all the records where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of records where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching records
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the records where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching records
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.nam.srv42.model.Record> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.nam.srv42.model.Record> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.nam.srv42.model.Record> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first record in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record findByGroupId_First(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Returns the first record in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record fetchByGroupId_First(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last record in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record
    * @throws com.nam.srv42.NoSuchRecordException if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record findByGroupId_Last(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Returns the last record in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching record, or <code>null</code> if a matching record could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record fetchByGroupId_Last(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.nam.srv42.model.Record[] findByGroupId_PrevAndNext(
        long recordId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Removes all the records where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of records where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching records
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the record in the entity cache if it is enabled.
    *
    * @param record the record
    */
    public void cacheResult(com.nam.srv42.model.Record record);

    /**
    * Caches the records in the entity cache if it is enabled.
    *
    * @param records the records
    */
    public void cacheResult(java.util.List<com.nam.srv42.model.Record> records);

    /**
    * Creates a new record with the primary key. Does not add the record to the database.
    *
    * @param recordId the primary key for the new record
    * @return the new record
    */
    public com.nam.srv42.model.Record create(long recordId);

    /**
    * Removes the record with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param recordId the primary key of the record
    * @return the record that was removed
    * @throws com.nam.srv42.NoSuchRecordException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record remove(long recordId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    public com.nam.srv42.model.Record updateImpl(
        com.nam.srv42.model.Record record)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the record with the primary key or throws a {@link com.nam.srv42.NoSuchRecordException} if it could not be found.
    *
    * @param recordId the primary key of the record
    * @return the record
    * @throws com.nam.srv42.NoSuchRecordException if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record findByPrimaryKey(long recordId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.nam.srv42.NoSuchRecordException;

    /**
    * Returns the record with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param recordId the primary key of the record
    * @return the record, or <code>null</code> if a record with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.nam.srv42.model.Record fetchByPrimaryKey(long recordId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the records.
    *
    * @return the records
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.nam.srv42.model.Record> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.nam.srv42.model.Record> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.nam.srv42.model.Record> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the records from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of records.
    *
    * @return the number of records
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
