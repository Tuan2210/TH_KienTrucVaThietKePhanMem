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
-- -- --
DROP TABLE IF EXISTS billing;
CREATE TABLE billing (
  BillId varchar(10) NOT NULL DEFAULT '',
  Name varchar(50) DEFAULT NULL,
  Price integer DEFAULT NULL,
  PassengerId varchar(5) NOT NULL,
  PRIMARY KEY (BillId)
);
INSERT INTO billing VALUES ('bill01', 'Bill Food', 200000, '01');
INSERT INTO billing VALUES ('bill02', 'Bill Phone', 100000, '02' );

