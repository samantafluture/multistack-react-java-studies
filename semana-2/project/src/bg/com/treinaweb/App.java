package bg.com.treinaweb;

import bg.com.treinaweb.models.Diarista;

public class App {
    public static void main(String[] args) {
        var diarista = new Diarista(1L, "Maria", "33333333", "9999-9999", "Av. Paulista, 123");

        System.out.println(diarista.getId());
        System.out.println(diarista.getNome());
        System.out.println(diarista.getCpf());
        System.out.println(diarista.getTelefone());
        System.out.println(diarista.getEndereco());
    }
}
