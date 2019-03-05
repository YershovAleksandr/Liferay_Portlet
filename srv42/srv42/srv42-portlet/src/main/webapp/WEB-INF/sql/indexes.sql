create index IX_B8D2E7B3 on srvv_Record (groupId);
create index IX_12D4CAFD on srvv_Record (uuid_);
create index IX_4533690B on srvv_Record (uuid_, companyId);
create unique index IX_DE08B64D on srvv_Record (uuid_, groupId);