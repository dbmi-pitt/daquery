create table network_membership (id int NOT NULL PRIMARY KEY, site_id varchar(256), network_id varchar(256));
create table connection_request (id int NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY, network_id varchar(256), from_site_id varchar(256), to_site_id varchar(256), status varchar(256));
#include daquery.ddl;
