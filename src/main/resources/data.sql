create table tb_chaves_pix(
    codigo varchar(16) not null primary key,
    keyType varchar(9) not null,
    keyValue varchar(77) not null,
    accType varchar(10) not null,
    agency numeric(4) not null,
    account numeric(8) not null,
    holderName varchar(30) not null,
    holderSurname varchar(45)
);