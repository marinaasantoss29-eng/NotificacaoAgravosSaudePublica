import Model.NotificacaoHanseniase;
import Model.NotificacaoMalaria;
import Model.NotificacaoTuberculose;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        NotificacaoMalaria malaria = new NotificacaoMalaria();
        NotificacaoHanseniase hanseniase = new NotificacaoHanseniase();
        NotificacaoTuberculose tuberculose = new NotificacaoTuberculose();
        Scanner scanner = new Scanner(System.in);


        int opcao;
        do{
            System.out.println("""
                    1- Registrar notificação
                    2- Consultar notificação
                    3- Gerar relatório
                    4- Sair
                    """);
            System.out.println("Escolha opção:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    int op;
                    do {
                        System.out.println("""
                                1- Registrar Malária
                                2- Registrar Hanseníase
                                3- Registrar Tuberculose
                                4- Voltar
                                """);
                        System.out.println("Escolha opção:");
                        op = scanner.nextInt();
                        scanner.nextLine();

                        switch (op) {
                            case 1 -> malaria.SalvarNotificacao(scanner);
                            case 2 -> hanseniase.SalvarNotificacao((scanner));
                            case 3 -> tuberculose.SalvarNotificacao(scanner);
                        }
                    } while (op != 4);
                }

                case 2 -> {
                    System.out.println("""
                            1- Consultar Malária
                            2- Consultar Hanseníase
                            3- Consultar Tuberculose
                            """);
                    System.out.println("Escolha opção:");
                    int op = scanner.nextInt();
                    scanner.nextLine();

                    switch (op) {
                        case 1 -> malaria.PesquisarNotificacao(scanner);
                        case 2 -> hanseniase.PesquisarNotificacao(scanner);
                        case 3 -> tuberculose.PesquisarNotificacao(scanner);
                    }
                }

                case 3 -> {
                    System.out.println("""
                            1- Relatório de Malária
                            2- Relatório de Hanseníase
                            3- Relatório de Tuberculose
                            """);
                    System.out.println("Escolha opção:");
                    int op = scanner.nextInt();
                    scanner.nextLine();

                    switch (op) {
                        case 1 -> malaria.CriarRelatorio();
                        case 2 -> hanseniase.CriarRelatorio();
                        case 3 -> tuberculose.CriarRelatorio();
                    }
                }

                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        }while (opcao != 4);
    }

}
