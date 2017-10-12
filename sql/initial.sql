UPDATE SITE_USER SET email='admin@pitt.edu', password='pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', status = 1 where username='admin';

INSERT INTO ROLE (NAME) VALUES ('Admin'), ('Steward'), ('Viewer');

INSERT INTO USER_ROLE (ROLE_ID, USER_ID) VALUES (1, (select ID from SITE_USER where USERNAME = 'admin'));


