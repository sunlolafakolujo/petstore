drop user if exist 'petuser'@'localhost';

create user 'petuser'@'localhost' identified by 'petuser123';
grant all previleges.* to 'petuser'@'localhost';
flush privileges

drop database if exists petstoredb;

create database petstoredb;