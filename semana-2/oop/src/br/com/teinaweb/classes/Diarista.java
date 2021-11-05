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

    @Override
    public String toString() {
        return "Diarista: " + this.getNome();
    }

    // gera código único que representa o objeto
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((chavePix == null) ? 0 : chavePix.hashCode());
        return result;
    }

    // comparação entre diferentes objetos da mesma classe
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Diarista other = (Diarista) obj;
        if (chavePix == null) {
            if (other.chavePix != null)
                return false;
        } else if (!chavePix.equals(other.chavePix))
            return false;
        return true;
    }

}
