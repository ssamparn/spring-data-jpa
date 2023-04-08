drop table if exists book;

create table if not exists book (
    id BINARY(16) not null,
    isbn varchar(255),
    publisher varchar(255),
    title varchar(255),
    primary key (id)
);