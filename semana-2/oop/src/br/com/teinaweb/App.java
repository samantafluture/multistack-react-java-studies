package br.com.teinaweb;

import br.com.teinaweb.classes.Atendimento;
import br.com.teinaweb.classes.Cliente;
import br.com.teinaweb.classes.Diarista;

public class App {
    public static void main(String[] args) {
        var diarista = new Diarista("João da Silva", "9999-9999", "Rua das Flores, 123", "AA12A");
        var cliente = new Cliente("Maria Dias", "8888-8888", "Av. Paulista, 1200");
        var atendimento = new Atendimento();

        diarista.atender(cliente.getNome());
        atendimento.setHoras(5);
        diarista.depositar(100);
        cliente.depositar(100);

        System.out.println("Nome: " + diarista.getNome() + "\nTelefone: " + diarista.getTelefone() + "\nEndereço: " + diarista.getEndereco() + "\nChavePix: " + diarista.getChavePix() + "\nSaldo: " + diarista.getSaldo());

        System.out.println("Nome: " + cliente.getNome() + "\nTelefone: " + cliente.getTelefone() + "\nEndereço: " + cliente.getEndereco() + "\nSaldo: " + cliente.getSaldo());

        System.out.println("Horas: " + atendimento.getHoras());
    }
}
