CREATE USER aristotle_users WITH PASSWORD 'bd10b215-847e-4b96-a063-7c2bcd91c746';
CREATE USER aristotle_resources WITH PASSWORD 'ee763dc1-b84e-4ed2-ae83-251657625043';
CREATE USER aristotle_ml WITH PASSWORD 'f24bd7a9-85de-48e4-9b8e-1fbb755f0f22';
GRANT SELECT, INSERT, UPDATE, DELETE ON users.public.students, users.public.teachers, users.public.classes TO aristotle_users;
ALTER DEFAULT PRIVILEGES FOR USER aristotle_resources IN SCHEMA resources.public GRANT SELECT, INSERT, UPDATE, DELETE ON TABLES TO aristotle_resources;
ALTER DEFAULT PRIVILEGES FOR USER aristotle_ml IN SCHEMA ml.public GRANT SELECT, INSERT, UPDATE, DELETE ON TABLES TO aristotle_ml;

select password, uuid from students where email = 'webmaster@luscinia.ca';
select * from students where email = 'webmaster@luscinia.ca';