/**
  This example is from http://queirozf.com/entries/scala-slick-simple-example-on-connecting-to-a-postgresql-database

  Create a table called users on a PostgreSQL database like this:
  CREATE TABLE users
  (
    id bigserial NOT NULL,
    username character varying,
    CONSTRAINT pk PRIMARY KEY (id)
  )
  Add these two records for testing
insert into users(username) values ('john'), ('mary');

 */