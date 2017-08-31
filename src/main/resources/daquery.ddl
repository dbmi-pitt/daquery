create table user (
  id BIGINT NOT NULL AUTO_INCREMENT,
  username VARCHAR(40) NOT NULL,
  password VARCHAR(1000) NOT NULL,
  PRIMARY KEY (id)
);

create table role (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(40) NOT NULL,
  PRIMARY KEY (id)
);

create table user_role (
  role_id BIGINT NOT NULL,
  user_id BIGINT NOT NULL
);