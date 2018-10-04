alter table DAQUERY_REQUEST ADD COLUMN ARCHIVED boolean;
update DAQUERY_REQUEST set archived=false;