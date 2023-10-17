CREATE DATABASE test_base;

USE test_base;

#comment

CREATE TABLE Persons(
	PersonId int AUTO_INCREMENT PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Address varchar(255),
    CONSTRAINT PK_Persons PRIMARY KEY (PersonID)
);

DROP TABLE Persons;

ALTER TABLE Persons
ADD City varchar(255);

ALTER TABLE Persons
MODIFY COLUMN City varchar(200);

ALTER TABLE Persons
ADD PRIMARY KEY (PersonId);

ALTER TABLE Persons
ADD CONSTRAINT PK_Persons PRIMARY KEY (PersonsID);

ALTER TABLE Persons RENAME TO Osoby;

TRUNCATE TABLE Persons;

ALTER TABLE Persons
DROP COLUMN CITY;

CREATE TABLE Persons(
	PersonId int AUTO_INCREMENT PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255) DEFAULT 'Bartek',
    Address varchar(255) UNIQUE
);

CREATE TABLE Clients(
	clientID int auto_increment primary key,
    name varchar(255),
    surname varchar(255)
);

CREATE TABLE Orders(
	orderID int auto_increment primary key,
    product varchar(255),
    amoumt int,
    clientId int,
    FOREIGN KEY (clientId) REFERENCES Clients(clientId)
);

DROP TABLE Orders;


CREATE TABLE Students(
	studentId int auto_increment primary key,
    name varchar(255),
    surname varchar(255)
    );
    
CREATE TABLE Subjects(
	subjectId int auto_increment primary key,
    name varchar(255)
);

CREATE TABLE StudentsSubjects(
	StudentsSubjectsId int auto_increment PRIMARY KEY,
    studentId int,
    subjectId int,
    FOREIGN KEY (studentId) REFERENCES Students(studentId),
    FOREIGN KEY (subjectId) REFERENCES Subjects(subjectId)
);















