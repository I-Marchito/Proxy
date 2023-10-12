package com.example;

public class Jogador {

    private String nome;
    private boolean owner;

    public Jogador(String nome, boolean owner){
        this.nome = nome;
        this.owner = owner;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }
    
}