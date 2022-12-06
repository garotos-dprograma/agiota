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
drop table if exists divida;
create table divida (
	id int primary key auto_increment,
    devedorId	   int 			  references Pessoas(id),
    agiotaId	   int 			  references Pessoas(id),
    taxaJuros	   float,
    parcelas	   int,
    dataInicial    datetime       default now(),
    valorAtual	   decimal(10,2),
    valorProMes   decimal(10,2),
    
    situacaoDivida int			default 1  references Situacao(id) 
);

delimiter $

create function proxMes (valorInicial float, taxaJuros float) returns float deterministic
  begin
	  set	@total = valorInicial + (valorInicial * (taxaJuros / 100));
	  return @total;
  end$

delimiter ;
delimiter $
create trigger dete_divida after delete on pessoa
for each row
	begin
		delete from divida where old.id = devedorId;
        delete from divida where old.id = agiotaId;
    end$
delimiter ;
select * from pessoa;
select * from divida