CREATE DATABASE spring_hibernate;

USE spring_hibernate;

CREATE TABLE user (
  id integer NOT NULL,
  firstname varchar(20),
  lastname varchar(20),
  username varchar(20),
  pass varchar(20),
  PRIMARY KEY (id));

insert  into user values (1,'Petar', 'Petrovic','pp','aaa');
insert  into user values (2,'Nikola', 'Nikolic','nn','bbb');

CREATE TABLE stats(
	id integer NOT NULL,
    tablename varchar(20),
    value varchar(20),
    PRIMARY KEY(id));
    
insert into stats values(1,'USER', 2);
