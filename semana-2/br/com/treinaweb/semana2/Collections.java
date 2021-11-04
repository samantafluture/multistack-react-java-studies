package br.com.treinaweb.semana2;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {

        // List -> usa index pré-determinado (0+) e armazena de forma sequencial
        var notas = new ArrayList<Double>();
        notas.add(9.0);
        notas.add(8.0);
        notas.add(7.5);

        System.out.println(notas); // todas entre []
        System.out.println(notas.get(0)); // primeira nota
        System.out.println(notas.size()); // tamanho da lista

        // Map -> armazena chave e valor (você informa a chave que identifica o elemento)
        // < > -> 1. tipo de dado da chave; 2. tipo de dado do valor
        // String -> nome do aluno; Double -> notas
        var medias = new HashMap<String, Double>(); 
        medias.put("João", 9.0);
        medias.put("Maria", 8.0);
        medias.put("Pedro", 7.5);

        System.out.println(medias);
        System.out.println(medias.get("Maria")); // retorna o valor da chave "Maria"
    }
}

// list -> interface
// ArrayList & HashMap -> implementam a interface List
// < > -> tipo de dado, só pode passar uma classe (por isso a letra maiúscula)