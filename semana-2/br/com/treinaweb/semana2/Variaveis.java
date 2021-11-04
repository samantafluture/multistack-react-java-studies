package br.com.treinaweb.semana2;

public class Variaveis {
    public static void main(String[] args) {
        String nome = "Samanta";
        int idade = 32;
        double altura = 1.75;
        boolean casado = false;

        // inferência de tipos
        var variavel = "variavel";

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(casado);
        System.out.println(variavel);

        // constante que não pode ser reatribuída
        final var CONSTANTE = "constante";
        System.out.println(CONSTANTE);
    }
}