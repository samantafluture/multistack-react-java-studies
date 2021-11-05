package br.com.treinaweb;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // if else
        var idade = 16;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else if (idade >= 16) {
            System.out.println("Menor de idade, mas pode votar");
        } else {
            System.out.println("Menor de idade");
        }

        // switch case
        var dia = "sábado";
        switch (dia) {
        case "segunda":
            System.out.println("Dia de trabalho");
            break;
        case "terça":
            System.out.println("Dia de trabalho");
            break;
        case "quarta":
            System.out.println("Dia de trabalho");
        case "quinta":
            System.out.println("Dia de trabalho");
            break;
        case "sexta":
            System.out.println("Quase fim de semana");
            break;
        default:
            System.out.println("Dia de descanso"); // qualquer outro valor
        }

        // switch case "melhorado"
        var mesDoAno = "dezembro";
        switch (mesDoAno) {
        case "janeiro" -> System.out.println("férias");
        case "fevereiro" -> System.out.println("carnaval");
        case "dezembro" -> System.out.println("natal");
        default -> System.out.println("outro mês");
        }
    }
}
