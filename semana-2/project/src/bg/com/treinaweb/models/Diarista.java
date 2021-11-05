package bg.com.treinaweb.models;

public class Diarista extends Pessoa {
    public Diarista() {
    }
 
    public Diarista(String nome, String cpf, String telefone, String endereco) {
        super(null, nome, cpf, telefone, endereco);
    }

    public Diarista(Long id, String nome, String cpf, String telefone, String endereco) {
        super(id, nome, cpf, telefone, endereco);
    }
}
