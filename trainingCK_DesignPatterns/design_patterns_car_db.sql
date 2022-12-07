DROP SCHEMA IF EXISTS design_patterns_car_db;
CREATE SCHEMA design_patterns_car_db;

USE design_patterns_car_db;

DROP TABLE IF EXISTS Honda;
CREATE TABLE Honda(
	Id int NOT NULL auto_increment,
	Ten varchar(50) NOT NULL,
	Gia varchar(50) NULL,
    CauHinh varchar(50) NULL,
    NhaSanXuat varchar(50) NULL,
    PRIMARY KEY (Id)
);
INSERT INTO Honda VALUES(NULL, 'Honda City', '500,000,000 vnd', 'Tốt', 'Nhật Bản');
INSERT INTO Honda VALUES(NULL, 'Honda Brio', '410,000,000 vnd', 'Thường', 'Nhật Bản');

DROP TABLE IF EXISTS Nexus;
CREATE TABLE Nexus(
	Id int NOT NULL auto_increment,
	Ten varchar(50) NOT NULL,
	Gia varchar(50) NULL,
    CauHinh varchar(50) NULL,
    NhaSanXuat varchar(50) NULL,
    PRIMARY KEY (Id)
);
INSERT INTO Nexus VALUES(NULL, 'Nexus 1', '200,000,000 vnd', 'Thường', 'Hàn Quốc');
INSERT INTO Nexus VALUES(NULL, 'Nexus 2', '350,000,000 vnd', 'Tốt', 'Hàn Quốc');

DROP TABLE IF EXISTS Toyota;
CREATE TABLE Toyota(
	Id int NOT NULL auto_increment,
	Ten varchar(50) NOT NULL,
	Gia varchar(50) NULL,
    CauHinh varchar(50) NULL,
    NhaSanXuat varchar(50) NULL,
    PRIMARY KEY (Id)
);
INSERT INTO Toyota VALUES(NULL, 'Camry 2.5Q', '1,370,000,000 vnd', 'Sang', 'Nhật');
INSERT INTO Toyota VALUES(NULL, 'Innova', '995,000,000 vnd', 'Tốt', 'Nhật');