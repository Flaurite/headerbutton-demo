-- begin HBDEMO_GENRE
create table HBDEMO_GENRE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end HBDEMO_GENRE
-- begin HBDEMO_DIRECTOR
create table HBDEMO_DIRECTOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    AGE integer,
    GROWTH integer,
    BIRTH_DATE date,
    --
    primary key (ID)
)^
-- end HBDEMO_DIRECTOR
-- begin HBDEMO_MOVIE
create table HBDEMO_MOVIE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    YEAR_ varchar(255),
    BUDGET decimal(19, 2),
    TIME_ integer,
    DIRECTOR_ID varchar(36),
    COUNTRY_ID varchar(36),
    --
    primary key (ID)
)^
-- end HBDEMO_MOVIE
-- begin HBDEMO_COUNTRY
create table HBDEMO_COUNTRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end HBDEMO_COUNTRY
-- begin HBDEMO_GENRE_MOVIE_LINK
create table HBDEMO_GENRE_MOVIE_LINK (
    MOVIE_ID varchar(36) not null,
    GENRE_ID varchar(36) not null,
    primary key (MOVIE_ID, GENRE_ID)
)^
-- end HBDEMO_GENRE_MOVIE_LINK
