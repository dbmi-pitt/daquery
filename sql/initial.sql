UPDATE SITE_USER SET email='admin@pitt.edu', password='pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=' where username='admin';

INSERT INTO ROLE (NAME) VALUES ('Admin'), ('Steward'), ('Viewer');

INSERT INTO USER_ROLE (ROLE_ID, USER_ID) VALUES (1, '2884036d-8cda-4798-ab90-2d2315ea149f');
