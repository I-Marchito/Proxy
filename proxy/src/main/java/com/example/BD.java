package com.example;

import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<Integer, Ficha> fichas = new HashMap<>();

    public static Ficha getFicha(Integer id){
        return fichas.get(id);
    }

    public static void addFicha(Ficha ficha){
        fichas.put(ficha.getID(), ficha);
    }
    
}
