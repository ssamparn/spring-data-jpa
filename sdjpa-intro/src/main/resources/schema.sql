drop table if exists book;
drop table if exists author;

create table if not exists book (
    id BINARY(16) not null,
    isbn varchar(255),
    publisher varchar(255),
    title varchar(255),
    author_id BINARY(16),
    primary key (id)
);

create table if not exists author (
    id BINARY(16) not null,
    first_name varchar(255),
    last_name varchar(255),
    primary key (id)
);