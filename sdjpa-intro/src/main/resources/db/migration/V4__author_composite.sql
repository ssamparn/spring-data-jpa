drop table if exists author_composite;

create table if not exists author_composite (
    first_name varchar(255),
    last_name varchar(255),
    country varchar(255),
    primary key (first_name, last_name)
);