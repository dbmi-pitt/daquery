alter table outgoing_query_sites add column site_status varchar(20);
alter table incoming_query_sites add column site_status varchar(20);
alter table site drop column status;