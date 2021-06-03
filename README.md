<h2>CRUD com Java e MySQL</h2>

<p> Para utilizar este projeto, crie o seguinte banco de dados: </p>
create database bicicletario;

use bicicletario;

CREATE TABLE condomino (
<br>id BIGINT(10) AUTO_INCREMENT,
<br>nome VARCHAR(255),
<br>bloco int,
<br>numero int,
<br>telefone VARCHAR(255),
<br>modelo VARCHAR(255),
<br>cor VARCHAR(255),
<br>vaga VARCHAR(255),
<br>PRIMARY KEY (id)
<br>);
