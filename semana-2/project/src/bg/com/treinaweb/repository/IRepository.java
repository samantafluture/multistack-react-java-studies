package bg.com.treinaweb.repository;

import java.util.List;

public interface IRepository<T, ID> {
    
    // o que retorna -> lista todos os dados cadastrados
    // tipo genérico <T> -> dado do meu modelo
    // nome do método -> buscarTodos
    List<T> buscarTodos();

    // o que retorna -> tipo do modelo, com os dados que foram cadastrado
    // nome do método -> cadastrar
    // recebe como parâmetro -> tipo T o meu modelo a ser cadastrado
    T cadastrar(T model);

    T buscarPorId(ID id);

    boolean excluirPorId(ID id);

}

// < > -> tipos genéricos
// tipo T -> classe de modelo
// tipo ID -> tipo do id daquela classe de modelo
// quem implementar a interface determina que tipos de dados são esses