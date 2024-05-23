Create database homeWork;

use homework;


#Stwórz bazę danych, która będzie miała dwie tabele - dostawca i kraj. Pamiętaj
#o id, każda z tabel musi mieć pole “name”, a jedna z nich musi zawierać pole z
#kluczem obcym.
create table countries (
	countryId int auto_increment primary key,
    countryName varchar (50)
);
create table delivers (
	deliverId int auto_increment primary key,
    deliverName varchar (50),
    countryId int,
    foreign key (countryId) references countries (countryId)
);

#Wstaw do każdej tabeli bazy danych po 3 inserty
insert into countries (countryName) values 
	('Poland'),
    ('USA'),
    ('Germany'),
    ('GB');
insert into delivers (deliverName, countryId) values 
	('speedFirst', 1),
    ('quick horse', 1),
    ('number ine', 2),
    ('save and sound', 4),
    ('deliverOne', 4),
    ('deliverTwo', 1);
    

#Zaktualizuj jeden z krajów zmieniając nazwę na "Maroko"    
UPDATE countries
SET countryName = 'Marocco'
WHERE countryId = 3;
    
select * from delivers;
select * from countries;

#Wypisanie wszystkich dostawców wraz z nazwą kraju, z którego pochodzą
select deliverName, countryName from delivers AS d
join countries AS c ON d.countryId = c.countryId;
    
#Wypisanie dostawców, którzy pochodzą z USA
select deliverName, countryName from delivers AS d
join countries AS c ON d.countryId = c.countryId
AND c.countryName = 'USA';
  
#Wypisanie krajów, które mają przynajmniej jednego dostawcę.
select distinct countryName from countries AS c
join delivers AS d ON c.countryId = d.countryId;
    