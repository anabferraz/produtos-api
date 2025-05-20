package io.github.apipix.pix.api.model;

import io.github.apipix.pix.api.enums.TipoChave;
import io.github.apipix.pix.api.enums.TipoConta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tb_chaves_pix")
public class Key {

    @Column(name = "codigo")
    @Id
    private String id = UUID.randomUUID().toString();
    @Column
    private TipoChave keyType;
    @Column(name = "keyValue")
    private String value;
    @Column
    private TipoConta accType;
    @Column
    private int agency;
    @Column
    private int account;
    @Column
    private String holderName;
    @Column
    private String holderSurname;

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", tipo de chave='" + keyType + '\'' +
                ", chave='" + value + '\'' +
                ", tipo da conta=" + accType +
                ", agencia=" + agency +
                ", conta=" + account +
                ", nome correntista=" + holderName +
                ", sobrenome correntista=" + holderSurname +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public TipoChave getKeyType() {
        return keyType;
    }

    public void setKeyType(TipoChave keyType) {
        this.keyType = keyType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TipoConta getAccType() {
        return accType;
    }

    public void setAccType(TipoConta accType) {
        this.accType = accType;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderSurname() {
        return holderSurname;
    }

    public void setHolderSurname(String holderSurname) {
        this.holderSurname = holderSurname;
    }
}
