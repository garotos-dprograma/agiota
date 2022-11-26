create database if not exists agiota;
use agiota;

create table Situacao (
	id			int			primary key,
    nome		varchar(60)
);

create table TipoUsuario (
	id			int			primary key,
    nome		varchar(60)
);

create table Pessoas (
	id			  int			primary key,
    nome		  varchar(60),
    documento	  int,
    cep		      int,
    endereco	  varchar(100),
    tipoUsuarioId int 			references TipoUsuario(id)
);

create table Dividas (
	id			   int			  primary key,
    devedorId	   int 			  references Pessoas(id),
    agiotaId	   int 			  references Pessoas(id),
    pix			   int,
    taxaJuros	   decimal(5,2),
    parcelas	   int,
    dataInicial    datetime       default now(),
    valorInicial   decimal(10,2),
    situacaoDivida int			  references Situacao(id)
);

insert into Situacao values
		(1, 'Pendente'),
		(2, 'Paga');

insert into TipoUsuario values 
		(1 , 'Agiota'),
		(2 , 'Capanga'),
		(3 , 'Devedor');