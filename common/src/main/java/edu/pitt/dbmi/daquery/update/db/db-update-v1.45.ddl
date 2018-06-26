alter table INQUIRY ADD COLUMN QUERY_TYPE integer;
update INQUIRY set QUERY_TYPE=1 where AGGREGATE=true;
