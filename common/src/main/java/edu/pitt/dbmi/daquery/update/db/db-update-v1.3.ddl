CREATE TABLE SQL_DOWNLOAD
(
   INQ_ID bigint NOT NULL,
   CODE varchar(32000)   
);

alter table DAQUERY_RESPONSE add column DOWNLOAD_INQUIRY_ID bigint;
alter table DAQUERY_RESPONSE add column DOWNLOAD_AVAILABLE boolean;
alter table DATA_MODEL add column DATA_EXPORT_CONF long varchar;

