CREATE TABLE "APP"."NETWORKS"
(
   ID bigint NOT NULL,
   NAME varchar(100) NOT NULL
)
;
CREATE TABLE "APP"."NOTIFICATIONS"
(
   ID bigint NOT NULL,
   TYPE varchar(100) NOT NULL,
   MESSAGE varchar(1000)
)
;
CREATE TABLE "APP"."ROLES"
(
   ID bigint NOT NULL,
   NAME varchar(50) NOT NULL,
   TYPE varchar(50) NOT NULL
)
;
CREATE TABLE "APP"."SITES"
(
   ID bigint NOT NULL,
   NAME varchar(100) NOT NULL,
   NETWORK_ID bigint NOT NULL
)
;
CREATE TABLE "APP"."USERS"
(
   ID char(16) NOT NULL,
   EMAIL varchar(100),
   PASSWORD_DIGEST varchar(100),
   REAL_NAME varchar(100)
)
;
CREATE TABLE "APP"."USERS_ROLES"
(
   USER_ID char(16) NOT NULL,
   ROLE_ID bigint NOT NULL
)
;
