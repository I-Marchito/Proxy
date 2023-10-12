package com.example;

import java.util.List;

public class FichaProxy implements IFicha {
    
    private Ficha ficha;

    private Integer id;

    public FichaProxy(Integer id){
        this.id = id;
    }

    @Override
    public List<String> obterDadosAbertos(){
        if (this.ficha == null){
            this.ficha = new Ficha(this.id);
        }
        return this.ficha.obterDadosAbertos();
    }

    @Override
    public List<String> obterDadosFechados(Jogador jogador){
        if (!jogador.isOwner()){
            throw new IllegalArgumentException("Jogador não é dono da Ficha");
        }
        if (this.ficha == null){
            this.ficha = new Ficha(this.id);
        }
        return this.ficha.obterDadosFechados(jogador);
    }



}
