update site set TYPE = null;
alter table site drop column TYPE;
update site set status = null;
alter table site drop column status;
alter table site add column ACCESS_KEY varchar(500); 
alter table site add column COMM_ENC_KEY  varchar(1024);
alter table site add column ENC_TYPE varchar(50);
alter table site add column STATUS varchar(50); 

update network set DATABASE_URL = null;
update network set DATABASE_PASSWORD = null;
update network set DATABASE_USERNAME = null;
alter table network drop column DATABASE_URL;
alter table network drop column DATABASE_PASSWORD;
alter table network drop column DATABASE_USERNAME;


CREATE TABLE DATA_SOURCE
(
   DS_ID bigint NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY,
   NAME varchar(50) NOT NULL,
   CONNECTION_URL varchar(250),
   USERNAME varchar(50),
   PWD varchar(50),
   DTYPE int
)
;

CREATE TABLE SQL_DATA_SOURCE
(
   DS_ID bigint NOT NULL,
   CONNECTION_URL varchar(250),
   USERNAME varchar(50),
   PWD varchar(50)
)
;

CREATE TABLE SAS_DATA_SOURCE
(
   DS_ID bigint NOT NULL,
   DATASET_LOCATION varchar(250)
)
;


CREATE TABLE SOURCE_TO_NETWORK
(
	NETWORK_ID bigint NOT NULL,
	DATA_SOURCE_ID bigint NOT NULL
)
;

CREATE TABLE OUTGOING_QUERY_SITES
(
	SITE_ID bigint not NULL,
	NETWORK_ID bigint not NULL
)
;

CREATE TABLE INCOMING_QUERY_SITES
(
	SITE_ID bigint not NULL,
	NETWORK_ID bigint not NULL
)
;


drop table inbound_query;
drop table outbound_query;

rename table site_user to dq_user;
update site set status = null;
alter table dq_user drop column status;
alter table dq_user add column STATUS varchar(50); 

INSERT INTO ROLE (NAME) VALUES ('admin'), ('steward'), ('viewer');

