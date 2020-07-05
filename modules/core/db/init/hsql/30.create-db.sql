-- GENRES
insert into HBDEMO_GENRE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('fa55b59e-a193-a9f2-9737-e548d9884d0e', 1, '2020-07-04 13:28:30', 'admin', '2020-07-04 13:28:30', null, null, null, 'Fantasy');

insert into HBDEMO_GENRE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('fc67c0bc-6430-bba3-c7bb-e2587e270b19', 1, '2020-07-04 13:28:17', 'admin', '2020-07-04 13:28:17', null, null, null, 'Drama');

insert into HBDEMO_GENRE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('c266d418-39a0-b66b-74c0-b3a896e2ca2a', 1, '2020-07-04 13:28:08', 'admin', '2020-07-04 13:28:08', null, null, null, 'Comedy');

insert into HBDEMO_GENRE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('7fd34139-17d9-7eaf-6011-453012c1bf78', 1, '2020-07-04 13:27:53', 'admin', '2020-07-04 13:27:53', null, null, null, 'Horror');

insert into HBDEMO_GENRE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('5d293b4e-182d-d1d4-da99-72bd90797de8', 1, '2020-07-04 13:27:44', 'admin', '2020-07-04 13:27:44', null, null, null, 'Musical');

-- DIRECTOR
insert into HBDEMO_DIRECTOR
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, FIRST_NAME, LAST_NAME, AGE, GROWTH, BIRTH_DATE)
values ('fad796bd-26f7-7f17-23b9-308544ececb9', 1, '2020-07-04 13:45:06', 'admin', '2020-07-04 13:45:06', null, null, null, 'Damien', 'Chazelle', 35, 177, 1985-01-19);

insert into HBDEMO_DIRECTOR
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, FIRST_NAME, LAST_NAME, AGE, GROWTH, BIRTH_DATE)
values ('fad796bd-26f7-7f17-23b9-308544ececb9', 1, '2020-07-04 13:45:06', 'admin', '2020-07-04 13:45:06', null, null, null, 'Damien', 'Chazelle', 35, 177, 1985-01-19);

-- COUNTRY
insert into HBDEMO_COUNTRY
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('7bdace73-1a0b-870e-6f97-be08bb485ca5', 1, '2020-07-04 13:47:42', 'admin', '2020-07-04 13:47:42', null, null, null, 'USA');


-- MOVIE
insert into HBDEMO_MOVIE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, YEAR_, BUDGET, TIME_, DIRECTOR_ID, COUNTRY_ID)
values ('66d55b63-5e4d-2e65-5917-8c2284ceaf34', 1, '2020-07-04 13:51:44', 'admin', '2020-07-04 13:51:44', null, null, null, 'The Shawshank Redemption', '1994', 25000000.00, 142, 'e9ac3fdf-7f9e-12e8-68e6-fddb91b847d0', '7bdace73-1a0b-870e-6f97-be08bb485ca5');

insert into HBDEMO_MOVIE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, YEAR_, BUDGET, TIME_, DIRECTOR_ID, COUNTRY_ID)
values ('84fb1ea0-4f31-fd21-db44-9854d960fc9b', 1, '2020-07-04 13:52:45', 'admin', '2020-07-04 13:52:45', null, null, null, 'La La Land', '2016', 30000000.00, 128, 'fad796bd-26f7-7f17-23b9-308544ececb9', '7bdace73-1a0b-870e-6f97-be08bb485ca5');