insert into site (id, name, access_key, tempkey, site_url, email_access) values ('20b23b5c-61ad-44eb-8eef-886adcced18e', 'bill-dev', 'abc123', true, 'http://shirey-dt-032.dbmi.pitt.edu:8080/', true);
insert into site (id, name, access_key, tempkey, site_url, email_access) values ('0f2378ec-d9ce-489a-b338-c8f82e567f40', 'chuck-dev', '123abc', true, 'http://borromeo-lp.dbmi.pitt.edu:8080/', true);
insert into site (id, name, access_key, tempkey, site_url, email_access) values ('bcfdd450-3dd8-4ced-9599-c65de7c9f115', 'desheng-dev', 'xyz789', true, 'http://del20-dt.univ.pitt.edu:8080/', true);

insert into network(id, name) values('devALL','fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823');
insert into network(id, name) values('devDandC','1169eae7-79ed-41e6-bb62-c86167aef92f');
insert into network(id, name) values('devCandB','9dc38074-a153-4183-a36f-2b64cf75c13c');
insert into network(id, name) values('devDandB','afff8323-176c-4cb0-9d2c-cccc03fff101');

insert into network_membership(id, site_id, network_id) values(1,'20b23b5c-61ad-44eb-8eef-886adcced18e','fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823');
insert into network_membership(id, site_id, network_id) values(2,'0f2378ec-d9ce-489a-b338-c8f82e567f40','fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823');
insert into network_membership(id, site_id, network_id) values(3,'bcfdd450-3dd8-4ced-9599-c65de7c9f115','fb3e4325-dbc5-4501-9fb9-4bd8dbc0a823');

insert into network_membership(id, site_id, network_id) values(4,'0f2378ec-d9ce-489a-b338-c8f82e567f40','1169eae7-79ed-41e6-bb62-c86167aef92f');
insert into network_membership(id, site_id, network_id) values(5,'bcfdd450-3dd8-4ced-9599-c65de7c9f115','1169eae7-79ed-41e6-bb62-c86167aef92f');

insert into network_membership(id, site_id, network_id) values(6,'20b23b5c-61ad-44eb-8eef-886adcced18e','9dc38074-a153-4183-a36f-2b64cf75c13c');
insert into network_membership(id, site_id, network_id) values(7,'0f2378ec-d9ce-489a-b338-c8f82e567f40','9dc38074-a153-4183-a36f-2b64cf75c13c');

insert into network_membership(id, site_id, network_id) values(8,'20b23b5c-61ad-44eb-8eef-886adcced18e','afff8323-176c-4cb0-9d2c-cccc03fff101');
insert into network_membership(id, site_id, network_id) values(9,'bcfdd450-3dd8-4ced-9599-c65de7c9f115','afff8323-176c-4cb0-9d2c-cccc03fff101');






