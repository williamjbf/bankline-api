package com.github.williamjbf.banklineapi.model;

import javax.persistence.*;

@Entity
@Table(name = "account_holder")
public class AccountHolder {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String cpf;
   private String name;

    @Embedded
    private Account account;

    public Account getConta() {
        return account;
    }

    public void setConta(Account account) {
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
