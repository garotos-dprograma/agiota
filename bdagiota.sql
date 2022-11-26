drop database if exists agiota;
create database if not exists agiota;
use agiota;

create table situacao (
	id			int			primary key,
    nome		varchar(60)
);

insert into situacao values
		(1, 'Pendente'),
		(2, 'Paga');

CREATE TABLE pessoa (
  id int primary key AUTO_INCREMENT,
  nome varchar(20) NOT NULL,
  sobrenome varchar(100) not null,
  rg varchar (45) not null,
  email varchar (45) not null,
  telefone varchar (45) not null,
  cpf varchar(45) NOT NULL,
  senha varchar (45) not null,
  sexo_id int references sexo(id),
  rua varchar(100) NOT NULL,
  numero varchar(6) not null,
  cidade varchar(45) not null,
  bairro varchar(45) not null,
  estado_id int not null references estado(id),
  cep varchar(45) not null,
  agiota bit
);

create table divida (
	id int primary key auto_increment,
    devedorId	   int 			  references Pessoas(id),
    agiotaId	   int 			  references Pessoas(id),
    taxaJuros	   decimal(5,2),
    parcelas	   int,
    dataInicial    datetime       default now(),
    valorAtual	   decimal(10,2),
    valorInicial   decimal(10,2),
    situacaoDivida int			  references Situacao(id)
);

