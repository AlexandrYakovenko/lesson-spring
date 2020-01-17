CREATE SCHEMA IF NOT EXISTS `lesson_spring_db` DEFAULT CHARACTER SET utf8 ;

create table if not exists lesson_spring_db.github_project
(
	id bigint auto_increment
		primary key,
	org_name varchar(255) null,
	repo_name varchar(255) null,
	constraint repo_name
		unique (repo_name)
);


