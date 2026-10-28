package com.seduc2.pet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class Animal {

   public Animal (){}

    public Animal(long id, String nome, String especie, String raca, String sexo, LocalDate datanascimento, Double peso, String cor, boolean castrado, String vacinacao, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
        this.peso = peso;
        this.cor = cor;
        this.castrado = castrado;
        this.vacinacao = vacinacao;
        this.observacoes = observacoes;
    }

    public Animal(String nome, String especie, String raca, String sexo, LocalDate datanascimento, Double peso, String cor, boolean castrado, String vacinacao, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
        this.peso = peso;
        this.cor = cor;
        this.castrado = castrado;
        this.vacinacao = vacinacao;
        this.observacoes = observacoes;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getVacinacao() {
        return vacinacao;
    }

    public void setVacinacao(String vacinacao) {
        this.vacinacao = vacinacao;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String nome;
        private String especie;
        private String raca;
        private String sexo;
        private LocalDate datanascimento;
        private Double peso;
        private String cor;
        private boolean castrado;
        private String vacinacao;
        private String observacoes;

    }
