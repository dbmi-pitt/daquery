create table property (ID bigint NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY, name varchar(256), value varchar(256));
create table site (id varchar(256) NOT NULL PRIMARY KEY, name varchar(256), access_key varchar(256), tempkey boolean, site_url varchar(256), email_access boolean);
create table network (id varchar(256) NOT NULL PRIMARY KEY, name varchar(256), data_model varchar(256));
create table network_membership (id int NOT NULL PRIMARY KEY, site_id varchar(256), network_id varchar(256));