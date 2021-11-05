package br.com.treinaweb;

public class OperadoresLogicos {
    public static void main(String[] args) {

        // Not (negar um valor)
        System.out.println(!(10 != 11)); // false
        
        // And (é verdadeiro quando os dois forem verdadeiro)
        System.out.println(10 < 20 && 10 > 5); // true

        // Or (é verdadeiro quando um dos dois forem verdadeiro)
        System.out.println(10 > 20 || 10 < 5); // false
    }
}
 