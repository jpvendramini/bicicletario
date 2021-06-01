create database bicicletario;

use bicicletario;

CREATE TABLE condomino (
id BIGINT(10) AUTO_INCREMENT,
nome VARCHAR(255),
bloco int,
numero int,
telefone VARCHAR(255),
modelo VARCHAR(255),
cor VARCHAR(255),
vaga VARCHAR(255),
PRIMARY KEY (id)
);