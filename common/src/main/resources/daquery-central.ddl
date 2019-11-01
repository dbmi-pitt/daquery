<!-- daquery.data.version=1.65 -->
create table connection_request (id int NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY, network_id varchar(256), from_site_id varchar(256), to_site_id varchar(256), status varchar(256), requester_email varchar(256));
create table site_contact (id int NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY, site_id varchar(256), user_id varchar(256), email varchar(256), real_name varchar(256));
create table daquery_version (id bigint NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY, build_num int, package_url varchar(500), release_date timestamp, version varchar(50), force_update boolean);
#include daquery.ddl;
