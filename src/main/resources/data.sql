create table tb_produto(
    codigo varchar(16) not null primary key,
    name varchar(50) not null,
    descricao varchar(300),
    preco numeric(18,2),
    peso numeric(8,2),
    altura numeric(6,2),
    tamanho varchar(20)
);