drop table if exists author;

create table if not exists author (
    id BINARY(16) not null,
    first_name varchar(255),
    last_name varchar(255),
    primary key (id)
);
