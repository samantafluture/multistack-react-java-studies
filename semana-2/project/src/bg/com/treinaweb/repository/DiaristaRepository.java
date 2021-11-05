package bg.com.treinaweb.repository;

import java.util.ArrayList;
import java.util.List;

import bg.com.treinaweb.models.Diarista;

public class DiaristaRepository implements IRepository<Diarista, Long> {

    private List<Diarista> diaristas;
    private Long idAtual;

    public DiaristaRepository() {
        diaristas = new ArrayList<Diarista>(); // inicializar a lista
        // diaristas.add(new Diarista(1L, "Maria", "1290192", "9989-9474", "Av. Paulista, 1000"));
        idAtual = 1L; // meu id começa com 1
    }

    @Override
    public List<Diarista> buscarTodos() {
        return diaristas;
    }

    @Override
    public Diarista cadastrar(Diarista model) {
        model.setId(idAtual);

        diaristas.add(model);
        idAtual++;

        return model;
    }

    @Override
    public Diarista buscarPorId(Long id) {
        for (Diarista diarista : diaristas) {
            if (diarista.getId().equals(id)) {
                return diarista;
            }
        }

        return null;
    }

    @Override
    public boolean excluirPorId(Long id) {
        var diaristaEncontrada = buscarPorId(id);

        if (diaristaEncontrada != null) {
            diaristas.remove(diaristaEncontrada);
            return true;
        }

        return false;
    }

}
