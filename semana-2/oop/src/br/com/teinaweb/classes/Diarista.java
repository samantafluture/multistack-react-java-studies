package br.com.teinaweb.classes;

public class Diarista extends Pessoa {
    // atributos
    private String chavePix;

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

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void depositar(double valor) {
        var saldoAtual = this.getSaldo();
        var saldoNovo = saldoAtual + valor;

        this.setSaldo(saldoNovo);

    }

    @Override
    public void sacar(double valor) {
        var saldoAtual = this.getSaldo();
        var saldoNovo = saldoAtual - valor;

        this.setSaldo(saldoNovo);
    }

}
