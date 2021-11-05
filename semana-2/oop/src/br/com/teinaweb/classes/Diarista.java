package br.com.teinaweb.classes;

public class Diarista extends Pessoa {
    // atributos
    public String chavePix;

    // construtores
    public Diarista(String nome) {
        super(nome, null, null);
    }
    public Diarista(String nome, String telefone, String endereco, String chavePix) {
        super(nome, telefone, endereco);
        this.chavePix = chavePix;
    }

    // métodos
    public void atender(String nomeCliente) {
        System.out.println("Realizando atendimento para " + nomeCliente);
    }
}
