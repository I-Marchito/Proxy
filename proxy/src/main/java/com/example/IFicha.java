package com.example;

import java.util.List;

public interface IFicha {
    List<String> obterDadosAbertos();
    List<String> obterDadosFechados(Jogador jogador);
    
}
