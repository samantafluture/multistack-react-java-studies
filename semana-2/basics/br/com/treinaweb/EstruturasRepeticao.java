package br.com.treinaweb;

import java.util.ArrayList;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        // while -> executa apenas enquanto a condição for verdadeira
        var i = 0; // contador
        while (i <= 10) {
            System.out.println("while -> número " + i);
            i++; // i = i + 1
        }

        // do while -> executa pelo menos uma vez
        var j = 10;
        do {
            System.out.println("do while -> número " + j);
            j++;
        } while (j <= 10);

        // for -> executa um determinado número de vezes
        for (var k = 0; k <= 10; k++) {
            System.out.println("for -> número " + k);
        }

        // foreach -> "for" melhorado, para iterações dentro de listas
        var notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(10.0);

        // variável de iteração com seu tipo : collection em que será feita a iteração
        for (Double nota : notas) {
            System.out.println("for each -> nota: " + nota);
        }
    }
}
