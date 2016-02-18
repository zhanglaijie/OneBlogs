drop table if exists users;
create table users(
id bigint(20) unsigned NOT NULL AUTO_INCREMENT,
username varchar(60),
password varchar(255),
nicename varchar(60),
email varchar(100),
registered datetime,
status int(11),
level int(11),
primary key(id)
);

insert into users values(1,'sa','c12e01f2a13ff5587e1e9e4aedb8242d','系统管理员(sa)','laijie100@qq.com','2015-11-21 08:43:02',1,1);
insert into users values(2,'admin','21232f297a57a5a743894a0e4a801fc3','系统管理员(admin)','laijie100@qq.com','2015-11-21 08:43:02',1,1)
,(3,'user','ee11cbb19052e40b07aac0ca060c23ee','系统管理员(user)','laijie100@qq.com','2015-11-21 08:43:02',1,1);