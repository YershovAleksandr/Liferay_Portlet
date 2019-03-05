create table srvv_Record (
	uuid_ VARCHAR(75) null,
	recordId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(200) null,
	date_ DATE null,
	employer VARCHAR(75) null,
	salary INTEGER
);