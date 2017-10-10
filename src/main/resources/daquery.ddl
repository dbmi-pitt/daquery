CREATE TABLE "APP"."NETWORK"
(
   ID bigint PRIMARY KEY NOT NULL,
   NETWORK_ID varchar(50),
   NAME varchar(100) NOT NULL,
   DATA_MODEL_NAME varchar(200)
)
;

CREATE TABLE "APP"."NOTIFICATION"
(
   ID bigint PRIMARY KEY NOT NULL,
   TYPE varchar(100) NOT NULL,
   MESSAGE varchar(1000)
)
;

CREATE TABLE "APP"."SITE_USER"
(
   ID varchar(50) PRIMARY KEY,
   USERNAME varchar(50),
   EMAIL varchar(100),
   PASSWORD varchar(100),
   REAL_NAME varchar(100),
   STATUS int
)
;

CREATE TABLE "APP"."ROLE"
(
   ID bigint NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY,
   NAME varchar(50) NOT NULL
)
;

CREATE TABLE "APP"."USER_ROLE"
(
  USER_ID varchar(50) NOT NULL,
  ROLE_ID bigint NOT NULL
)
;

CREATE TABLE "APP"."SITE"
(
   ID bigint NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY,
   SITE_ID varchar(50),
   NAME varchar(100) NOT NULL,
   NETWORK_ID varchar(50),
   TYPE varchar(100),
   URL varchar(500),
   ADMIN_EMAIL varchar(500),
   STATUS int,
   REQUEST_SENT timestamp,
   REQUEST_REPLIED timestamp
)
;
CREATE TABLE "APP"."INBOUND_QUERY"
(
   ID bigint PRIMARY KEY NOT NULL,
   STUDYNAME varchar(500),
   QUERYNAME varchar(500),
   QUERYTYPE varchar(50),
   NETWORK_ID bigint,
   SITE_ID bigint,
   LASTUPDATE timestamp,
   STATUS varchar(500),
   ORACLEQUERY varchar(500),
   SQLQUERY varchar(500),
   USER_ID varchar(50)
)
;

CREATE TABLE "APP"."OUTBOUND_QUERY"
(
   ID bigint PRIMARY KEY NOT NULL,
   STUDYNAME varchar(500),
   QUERYNAME varchar(500),
   QUERYTYPE varchar(50),
   NETWORK_ID bigint,
   SITE_ID bigint,
   USER_ID varchar(50),
   LASTUPDATE timestamp,
   STATUS varchar(500),
   ORACLEQUERY varchar(500),
   SQLQUERY varchar(500)
)
;

CREATE TABLE PROPERTY (id int, name varchar(256), value varchar(256));
CREATE TABLE SITE_USER (ID varchar(100) NOT NULL,USERNAME varchar(50),EMAIL varchar(100),PASSWORD varchar(100),REAL_NAME varchar(100),STATUS int);
CREATE TABLE USER_ROLE (USER_ID varchar(100) NOT NULL, ROLE_ID bigint NOT NULL);

