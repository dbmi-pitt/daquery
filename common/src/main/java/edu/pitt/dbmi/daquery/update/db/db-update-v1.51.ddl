alter table DATA_ATTRIBUTE ADD COLUMN IDENTIFIER boolean;
alter table DATA_ATTRIBUTE ADD COLUMN IDENT_NAME varchar(100);
delete from data_attribute;
delete from data_model;

