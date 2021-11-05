package br.com.teinaweb.classes;

public class Cliente extends Pessoa{

    public Cliente (String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

    @Override
    public void depositar (double valor) {
        var saldoAtual = this.getSaldo();
        var saldoNovo = saldoAtual + valor + (valor * 0.1); // acréscimo de 10% no valor do depósito

        this.setSaldo(saldoNovo);
    }

    @Override
    public void sacar(double valor) {
        var saldoAtual = this.getSaldo();
        var saldoNovo = saldoAtual - valor; 

        this.setSaldo(saldoNovo);
    }

    // representação em String do objeto
    @Override
    public String toString() {
        return "Cliente: " + this.getNome();
    }
}
