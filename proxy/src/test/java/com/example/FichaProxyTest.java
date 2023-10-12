package com.example;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FichaProxyTest {

    @BeforeEach
    void setUp(){
        BD.addFicha(new Ficha(1, "Drizzle", "Drizzle.jpg", "Haunted One", "Str 18, Dex 14, Con 18"));
        BD.addFicha(new Ficha(2, "Joan D'Arc", "Guerreira.png", "Folk Hero", "Str 12, Dex 20, Con 16"));
    }

    @Test
    void deveRetornarDadosAbertosFicha(){
        FichaProxy ficha = new FichaProxy(1);

        assertEquals(Arrays.asList("Drizzle", "Drizzle.jpg"), ficha.obterDadosAbertos());
    }

    @Test
    void deveRetornarDadosFechadosFicha(){
        Jogador jogador = new Jogador("Marcela", true);
        FichaProxy ficha = new FichaProxy(2);

        assertEquals(Arrays.asList("Folk Hero", "Str 12, Dex 20, Con 16"), ficha.obterDadosFechados(jogador));
    }

    @Test
    void deveRetornarExcecaoJogadorNaoOwner(){
        try {
            Jogador jogador = new Jogador("Jaqueline", false);
            FichaProxy ficha = new FichaProxy(2);
            
            ficha.obterDadosFechados(jogador);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Jogador não é dono da Ficha", e.getMessage());
        }

    }
}
