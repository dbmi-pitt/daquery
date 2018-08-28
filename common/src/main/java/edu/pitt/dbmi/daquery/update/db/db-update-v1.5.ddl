alter table SQL_DATA_SOURCE ADD COLUMN DIALECT varchar(50);
CREATE TABLE SQL_CODE
(
	ID bigint NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY,
	CODE varchar(32000),
	DIALECT varchar(30),
	QUERY_ID bigint
);
insert into SQL_CODE (code, dialect, query_id) select code, 'ANSI', inq_id from sql_query;
alter table SQL_QUERY drop column code;
