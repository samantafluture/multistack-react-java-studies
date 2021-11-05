package bg.com.treinaweb;

import java.util.Scanner;

import bg.com.treinaweb.models.Diarista;
import bg.com.treinaweb.repository.DiaristaRepository;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var repository = new DiaristaRepository(); // simula bando de dados

        var opcao = "q";
        do {

            System.out.println(); // pula uma linha no terminal

            exibirMenu();

            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextLine();

            System.out.println(); // pula uma linha no terminal

            switch (opcao) {
                case "1" -> listaDiaristas(repository);
                case "2" -> cadastrarDiarista(repository, scanner);
                case "3" -> buscaDiarista(scanner, repository);
                case "4" -> excluirDiarista(scanner, repository);
                case "q" -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (!opcao.equals("q"));

        scanner.close();
    }

    private static void excluirDiarista(Scanner scanner, DiaristaRepository repository) {
        System.out.print("Id: ");
        var id = scanner.nextLong();
        scanner.nextLine();

        var foiExcluido = repository.excluirPorId(id);

        if (foiExcluido) {
            System.out.println("Diarista excluído com sucesso!");
        } else {
            System.out.println("Diarista não encontrado!");
        }
    }

    private static void buscaDiarista(Scanner scanner, DiaristaRepository repository) {
        System.out.print("Id: ");
        var id = scanner.nextLong();
        scanner.nextLine();

        var diarista = repository.buscarPorId(id);

        if (diarista != null) {
            System.out.println(diarista.getId() + " - " + diarista.getNome());
        } else {
            System.out.println("Diarista não encontrada!");
        }
    }

    private static void cadastrarDiarista(DiaristaRepository repository, Scanner scanner) {
        System.out.print("Nome: ");
        var nome = scanner.nextLine();
        System.out.print("CPF: ");
        var cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        var telefone = scanner.nextLine();
        System.out.print("Endereço: ");
        var endereco = scanner.nextLine();

        var diarista = new Diarista(nome, cpf, telefone, endereco);
        repository.cadastrar(diarista);

        System.out.println("Diarista cadastrada com sucesso!");
    }

    private static void listaDiaristas(DiaristaRepository repository) {
        var diaristas = repository.buscarTodos();

        if (diaristas.isEmpty()) {
            System.out.println("Nenhum diarista cadastrado!");
        }
        
        for (Diarista diarista : diaristas) {
            System.out.println(diarista.getId() + " - " + diarista.getNome());
        }
    }

    private static void exibirMenu() {
        System.out.println("1 - Listar Diaristas");
        System.out.println("2 - Cadastrar Diarista");
        System.out.println("3 - Buscar Diarista");
        System.out.println("4 - Excluir Diarista");
        System.out.println("q - Sair do Sistema");
    }
}
