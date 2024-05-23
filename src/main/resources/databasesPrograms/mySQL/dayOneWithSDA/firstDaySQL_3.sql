show tables;

select User from mysql.user;

select * from mysql.db;

create user andrzej;

select * from mysql.tables_priv;

grant all privileges ON test_base to andrzej;

show grants for andrzej;


#Error Code: 1066. Not unique table/alias: 'studentssubjects'



