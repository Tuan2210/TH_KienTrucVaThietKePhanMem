DROP SCHEMA IF EXISTS passengerdb;
CREATE SCHEMA passengerdb;
USE passengerdb;

DROP TABLE IF EXISTS passenger;
CREATE TABLE passenger (
  PassengerId varchar(5) NOT NULL DEFAULT '',
  Name varchar(50) DEFAULT NULL,
  Address varchar(50) DEFAULT NULL,
  PRIMARY KEY (PassengerId)
);
INSERT INTO passenger VALUES ('01', 'John', 'USA');
INSERT INTO passenger VALUES ('02', 'Mary', 'London');