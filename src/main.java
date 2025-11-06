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
            opcao=scanner.nextInt();
            switch (opcao){
                case 1:
                    int op;
                    do {
                        System.out.println("""
                                1- Registrar malaria
                                2- Registra hanseniase
                                3- Registrar tuberculosa
                                4- Sair  
                                """);
                        System.out.println("Escolha opção:");
                        op = scanner.nextInt();

                        if (op == 1) {
                            malaria.CriarRelatorio();
                        }
                        if (op == 2) {
                            hanseniase.CriarRelatorio();
                        }
                        if (op == 3) {
                            tuberculose.CriarRelatorio();
                        }
                    }while (op != 4);
                    break;
                case 2:
                   // Consultar notificacao;
                    break;
                case 3:
                    //Gerar relatorio;
            }

        }while (opcao != 4);
    }



}
