CREATE DATABASE  IF NOT EXISTS `agiota` /*!40100 DEFAULT CHARACTER SET latin1
*/;
USE `agiota`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: agiota
-- ------------------------------------------------------
-- Server version 5.7.31

--
-- Table structure for table `cadastroclientes`
--
DROP TABLE IF EXISTS cliente_agiota;

CREATE TABLE cliente_agiota (
  id int(11) primary key NULL AUTO_INCREMENT,
  nome varchar(45) NOT NULL,
  rg varchar (45) not null,
  email varchar (45) not null,
  telefone varchar (45) not null,
  cpf varchar(45) NOT NULL,
  senha varchar (45) not null,
  sexo varchar(45) NOT NULL,
  Rua varchar(100) NOT NULL,
  numero varchar (45) not null,
  cargo varchar (45) not null,
  cidade varchar(45) NOT NULL,
  estado varchar(45) NOT NULL,
  cep varchar (45) not null
 
  
);
delimiter $
create function chk_cliente(emailJ varchar(45), senhaJ varchar(60))
 returns boolean deterministic
	begin
		set @resultado = (select email,senha from cliente_agiota where emailJ = email and senhaJ = senha );
        if @resultado.senha or @resulado.email is null then
        return false;
        else
        return true;
        end if;
     end$
-- Dump completed on 2022-05-02 21:51:26