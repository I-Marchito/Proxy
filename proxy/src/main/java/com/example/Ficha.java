package com.example;

import java.util.Arrays;
import java.util.List;

public class Ficha implements IFicha {

    private Integer id;
    private String nome;
    private String imagem;
    private String bg;
    private String atributos;
    
    public Ficha(int id){
        this.id = id;
        Ficha objeto = BD.getFicha(id);
        this.nome = objeto.nome;
        this.imagem = objeto.imagem;
        this.bg = objeto.bg;
        this.atributos = objeto.atributos;
    }

    public Ficha(Integer id, String nome, String imagem, String bg, String atributos){
        this.id = id;
        this.nome = nome;
        this.imagem = imagem;
        this.bg = bg;
        this.atributos = atributos;
    }

    public Integer getID(){
        return id;
    }

    @Override
    public List<String> obterDadosAbertos(){
        return Arrays.asList(this.nome, this.imagem);
    }

    @Override
    public List<String> obterDadosFechados(Jogador jogador){
        return Arrays.asList(this.bg, this.atributos);
    }




}
