alter table DATA_ATTRIBUTE ADD COLUMN IDENTIFIER boolean;
alter table DATA_ATTRIBUTE ADD COLUMN IDENT_NAME varchar(100);
alter table DATA_ATTRIBUTE ADD COLUMN BIRTH_DATE boolean;
alter table DATA_ATTRIBUTE ADD COLUMN DATE_FIELD boolean;
alter table DATA_ATTRIBUTE ADD COLUMN ZIP_CODE boolean;
alter table DATA_MODEL ADD COLUMN REVISION bigint;
delete from data_attribute;