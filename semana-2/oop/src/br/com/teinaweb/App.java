package br.com.teinaweb;

import br.com.teinaweb.classes.Cliente;
import br.com.teinaweb.classes.Diarista;

public class App {
    public static void main(String[] args) {
        var diarista = new Diarista("João da Silva", "9999-9999", "Rua das Flores, 123", "AA12A");
        var cliente = new Cliente("Maria Dias", "8888-8888", "Av. Paulista, 1200", 150.5);

        diarista.atender(cliente.nome);

        System.out.println("Nome: " + diarista.nome + "\nTelefone: " + diarista.telefone + "\nEndereço: " + diarista.endereco + "\nChavePix: " + diarista.chavePix);
        System.out.println("Nome: " + cliente.nome + "\nTelefone: " + cliente.telefone + "\nEndereço: " + cliente.endereco + "\nSaldo: " + cliente.saldo);
    }
}
