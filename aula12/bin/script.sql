CREATE TABLE cliente(codigo serial PRIMARY KEY, nome varchar(50),
telefone varchar(11), email varchar(40) unique);

INSERT INTO cliente (nome,telefone,email) VALUES('adriano',123,'hotmail'),
('adrianoa',456,'drimail'), ('caterina',789,'katmail'));