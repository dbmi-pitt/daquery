alter table INQUIRY ADD COLUMN QUERY_TYPE varchar(50);
update INQUIRY set QUERY_TYPE='aggregate' where AGGREGATE=true;
