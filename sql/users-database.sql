/*STUDENTS DATABASE*/

create table students (
	index serial not null,
	firstName VARCHAR(32) not null,
	lastName VARCHAR(32) not null,
	email VARCHAR(64) not null,
	password VARCHAR(128),
	uuid UUID not null,
	classes INTEGER[],
	proficiencies JSON[],
	activity JSON,
	passwordResetKey VARCHAR(128),
	passwordResetKeyExp TIMESTAMP,\
	metadata JSON default NULL,
	studentID VARCHAR(32) default NULL
);
create unique index students_email_uindex on students (email);
create unique index students_index_uindex on students (index);
create unique index students_passwordResetKey_uindex on students (passwordResetKey);
create unique index students_uuid_uindex on students (uuid);
alter table students add constraint students_pk primary key (index);

/*TEACHERS DATABASE*/

create table teachers (
	index serial not null,
	firstName VARCHAR(32) not null,
	lastName VARCHAR(32) not null,
	schoolName VARCHAR(32),
	email VARCHAR(64) not null,
	password VARCHAR(128) not null,
	uuid UUID not null,
	classes INTEGER[],
	students INTEGER[],
	activity JSON,
	passwordResetKey VARCHAR(128),
	passwordResetKeyExp TIMESTAMP,
	metadata JSON default NULL
);
create unique index teachers_email_uindex on teachers (email);
create unique index teachers_index_uindex on teachers (index);
create unique index teachers_passwordResetKey_uindex on teachers (passwordResetKey);
create unique index teachers_uuid_uindex on teachers (uuid);
alter table teachers add constraint teachers_pk primary key (index);

/*CLASSES DATABASE*/

create table classes (
	index serial not null,
	className VARCHAR(64) not null,
	uuid UUID not null,
	classKey INTEGER default NULL not null,
	teacher INTEGER default NULL not null,
	students INTEGER[],
	state VARCHAR(8) default 'HIDDEN' not null,
	billing BOOLEAN default false not null,
	resources INTEGER[],
	activity JSON,
	metadata JSON default NULL
);
create unique index classes_index_uindex on classes (index);
alter table classes add constraint classes_pk primary key (index);