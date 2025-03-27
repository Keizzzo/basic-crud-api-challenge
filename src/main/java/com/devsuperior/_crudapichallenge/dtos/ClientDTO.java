package com.devsuperior._crudapichallenge.dtos;

import com.devsuperior._crudapichallenge.entities.Client;

import java.time.LocalDate;

public class ClientDTO {
    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private Integer children;
    private LocalDate birthDate;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String cpf, Double income, Integer children, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.children = children;
        this.birthDate = birthDate;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        children = entity.getChildren();
        birthDate = entity.getBirthDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
