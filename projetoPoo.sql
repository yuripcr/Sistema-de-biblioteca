create database bibliotecapoo;
use bibliotecapoo;

Create table usuario (
	nome varchar(30),
    cpf varchar(14),
    endereco varchar(30),
    telefone varchar (15),
    primary key(cpf)
);

Create table funcionario (
	nome varchar(30),
    cpf varchar(14),
    funcao varchar(30),
    salario float,
    primary key(cpf)
);

create table livros(
	codigo int, 
    titulo varchar(20),
    edicao int,
    anoPublicacao int, 
    codigoEditora int, 
    genero varchar(20),
    codigoAutor int,
    status varchar(10),
    primary key(codigo)
);

create table autores(
	codigo int,
	nome varchar(30),
	nacionalidade varchar(30),
    primary key(codigo)
);

alter table livros add foreign key(codigoAutor) references  autores(codigo);

create table editora(
	codigo int,
	nome varchar(30),
	contato varchar(30),
    primary key(codigo)
);

alter table livros add foreign key(codigoEditora) references  editora(codigo);

create table emprestarUsuario(
	codigo int,
    cpf varchar(14),
	primary key(codigo, cpf),
    foreign key(codigo) references livros(codigo),
    foreign key(cpf) references usuario(cpf)
);

create table emprestarFuncionario(
	codigo int,
    cpf varchar(14),
	primary key(codigo, cpf),
    foreign key(codigo) references livros(codigo),
    foreign key(cpf) references funcionario(cpf)
);