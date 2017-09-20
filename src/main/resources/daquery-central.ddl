create table property (id int, name varchar(256), value varchar(256));
create table site (id int, name varchar(256), access_key varchar(256), tempkey boolean, site_url varchar(256), email_access boolean);
create table network(id int, name varchar(256))
create table network_membership(id int, site int, network_id int);