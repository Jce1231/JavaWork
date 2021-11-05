drop table if exists `kitten` CASCADE; 
create table 
	`kitten` 
(
	id integer AUTO_INCREMENT, 
	breed varchar(255), 
	weight integer not null, 
	name varchar(255), 
	primary key (id)
);