package Model;


import Dados.*;
import Enums.*;

import java.time.LocalDate;
import java.util.Scanner;

public class NotificacaoTuberculose extends Notificacao{


    public NotificacaoTuberculose() {
        super();
    }

    public NotificacaoTuberculose(DadosEpidemiologico dadosEpidemiologico, DadosGerais dadosGerais, DadosIndividuais dadosIndividuais, DadosResidencia dadosResidencia, DadosTratamento dadosTratamento) {
        super(dadosEpidemiologico, dadosGerais, dadosIndividuais, dadosResidencia, dadosTratamento);
    }

    @Override
    public void SalvarNotificacao(Scanner scanner) {
        DadosGerais dadosGerais = new DadosGerais();

        System.out.println("Digite o tipo de notificação:");
        dadosGerais.setTipoNotificacao(scanner.nextLine());

        System.out.println("Digite o agravo:");
        dadosGerais.setAgravo(scanner.nextLine());

        System.out.println("Digite o UF:");
        dadosGerais.setUF(scanner.nextLine());

        System.out.println("Digite o Código:");
        dadosGerais.setCodigo(scanner.nextInt());

        System.out.println("Digite a data de notificações:");
        String DataNotificacao = scanner.nextLine();
        dadosGerais.setDataNotificacao(LocalDate.parse(DataNotificacao));

        System.out.println("Digite o Municipio:");
        dadosGerais.setMunicipio (scanner.nextLine());

        DadosIndividuais dadosIndividuais = new DadosIndividuais();

        System.out.println("Digite o nome:");
        dadosIndividuais.setNome(scanner.nextLine());

        System.out.println("Digite a data de nascimento (dd-MM-yy):");
        String DataNascimento = scanner.nextLine();
        dadosIndividuais.setDataNascimento(LocalDate.parse(DataNascimento));

        System.out.println("Digite a idade:");
        dadosIndividuais.setIdade(scanner.nextInt());

        System.out.println("Digite o sexo:");
        dadosIndividuais.setSexo(Sexo.valueOf(scanner.nextLine()));

        System.out.println("A paciente é gestante?:");
        dadosIndividuais.setGestante(Gestante.valueOf(scanner.nextLine()));

        System.out.println("Digite a escolaridade:");
        dadosIndividuais.setEscolaridade(Escolaridade.valueOf(scanner.nextLine()));

        System.out.println("Digite o nome da mãe:");
        dadosIndividuais.setNome_mae(scanner.nextLine());

        System.out.println("Digite o número do prontuário:");
        dadosIndividuais.setnProntuario(scanner.nextInt());

        System.out.println("Digite a ocupação:");
        dadosIndividuais.setOcupacao(scanner.nextLine());

        DadosResidencia dadosResidencia = new DadosResidencia();

        System.out.println("Digite o município:");
        dadosResidencia.setMunicipio((scanner.nextLine()));

        System.out.println("Digite a UF:");
        dadosResidencia.setUF((scanner.nextLine()));

        System.out.println("Digite o bairro:");
        dadosResidencia.setBairro((scanner.nextLine()));

        System.out.println("Digite o logradouro:");
        dadosResidencia.setLogradouro((scanner.nextLine()));

        System.out.println("Digite o número:");
        dadosResidencia.setNumero((scanner.nextInt()));

        System.out.println("Digite o telefone:");
        dadosResidencia.setTelefone((scanner.nextInt()));

        System.out.println("Digite a zona (Urbana ou Rural):");
        dadosResidencia.setZona(Zona.valueOf((scanner.nextLine())));

        DadosEpidemiologico dadosEpidemiologico = new DadosEpidemiologico();

        System.out.println("Digite a data de investigação (dd-MM-yy):");
        dadosEpidemiologico.setData_investigacao(scanner.nextInt());

        System.out.println("Digite as principais atividade dos últimos 15 dias:");
        dadosEpidemiologico.setPrincipaisAtividadesUltimos15Dias(Integer.parseInt(scanner.nextLine()));

        System.out.println("Digite o tipo de lâmina:");
        dadosEpidemiologico.setTipo_lamina(Integer.parseInt(scanner.nextLine()));

        System.out.println("Digite os sintomas:");
        dadosEpidemiologico.setSintomas(Sintomas.valueOf(scanner.nextLine()));

        DadosTratamento dadosTratamento = new DadosTratamento();

        System.out.println("Digite a data de investigação (dd-MM-yy):");
        String dataInvestigacao = scanner.nextLine();
        dadosTratamento.setDataInvestigacao(LocalDate.parse(dataInvestigacao));

        System.out.println("Digite o resultado do exame:");
        dadosTratamento.setResultadoExame(ResultadoExame.valueOf(scanner.nextLine()));

        System.out.println("Digite o esquema de tratamento:");
        dadosTratamento.setEsquemaTratamentoManuelTerapeuticoMalaria(EsquemaTratamentoManuelTerapeuticoMalaria.valueOf(scanner.nextLine()));

        System.out.println("Digite o número de lesões cutâneas:");
        dadosTratamento.setNumLesoesCutaneas(scanner.nextInt());

        System.out.println("Digite a forma clínica:");
        dadosTratamento.setFormaClinica(FormaClinica.valueOf(scanner.nextLine()));

        System.out.println("Digite a classificação operacional:");
        dadosTratamento.setClassificacaoOperacional(ClassificacaoOperacional.valueOf(scanner.nextLine()));

        System.out.println("Digite o número de nervos afetados:");
        dadosTratamento.setNumNervosAfetados(scanner.nextInt());

        System.out.println("Digite o modo de entrada:");
        dadosTratamento.setModoEntrada(ModoEntrada.valueOf(scanner.nextLine()));

        System.out.println("Digite o modo de detecção(caso novo):");
        dadosTratamento.setModoDeteccaoCadoNovo(ModoDeteccaoCadoNovo.valueOf(scanner.nextLine()));

        System.out.println("Digite a baciloscopia:");
        dadosTratamento.setBaciloscopia(Baciloscopia.valueOf(scanner.nextLine()));

        System.out.println("Digite a dat de início do tratamento (dd-MM-yy):");
        String dataInicioTratamento = scanner.nextLine();
        dadosTratamento.setDataInicioTratamento(LocalDate.parse(dataInicioTratamento));

        System.out.println("Digite o número de contatos registrados:");
        dadosTratamento.setNumeroDeConatosRegistrados(scanner.nextInt());

        ConclusaoEncerramento conclusaoEncerramento = new ConclusaoEncerramento();

        System.out.println("Digite a classificação final:");
        conclusaoEncerramento.setClassificacaoFinal(ClassificacaoFinal.valueOf(scanner.nextLine()));

        System.out.println("Digite se é autóctone(sim ou não):");
        conclusaoEncerramento.setAutoctone(Autoctone.valueOf(scanner.nextLine()));

        System.out.println("Digite o bairro:");
        conclusaoEncerramento.setBairro(scanner.nextLine());

        System.out.println("Digite a localidade de infecção:");
        conclusaoEncerramento.setLocalidade_Infeccao(scanner.nextLine());

        System.out.println("Digite a data de encerramento (dd-MM-yy):");
        String dataEncerramento = scanner.nextLine();
        conclusaoEncerramento.setData_Encerramento(LocalDate.parse(dataEncerramento));

        TodasasNotificacoes.add(this);

    }

    @Override
    public void PesquisarNotificacao(Scanner scanner) {
        int opcao;
        do {
            System.out.println("""
                1-Consultar pelo nome do paciente.
                2-Listar todas as notificações de um determinado bairro.
                3-Listar todas as notificações um determinado período.
                4-Listar todas as notificações de um determinado agravo.
                """);
            System.out.println("opcao:");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> {
                    for (Notificacao n : TodasasNotificacoes) {
                        System.out.println("Digite um nome:");
                        String nome = scanner.nextLine();

                        if (n.getDadosIndividuais().getNome().equals(nome)) {
                            System.out.println(n.getDadosIndividuais().getNome());
                        }
                    }
                }
                case 2 -> {
                    for(Notificacao n : TodasasNotificacoes) {
                        System.out.println("Digite o bairro:");
                        String bairro = scanner.nextLine();

                        if(n.getDadosResidencia().getBairro().equals(bairro)) {
                            System.out.println(n.getDadosResidencia().getBairro());
                        }
                    }
                }
                case 3 -> {
                    scanner.nextLine(); // limpar o buffer

                    System.out.println("Digite a data inicial (yyyy-MM-dd): ");
                    LocalDate dataInicio = LocalDate.parse(scanner.nextLine());

                    System.out.println("Digite a data final (yyyy-MM-dd): ");
                    LocalDate dataFim = LocalDate.parse(scanner.nextLine());

                    boolean encontrou = false;

                    System.out.println("\n--- Notificações entre " + dataInicio + " e " + dataFim + " ---");

                    for (Notificacao n : TodasasNotificacoes) {
                        LocalDate dataNotificacao = n.getDadosGerais().getDataNotificacao();

                        if ((dataNotificacao.isEqual(dataInicio) || dataNotificacao.isAfter(dataInicio)) &&
                                (dataNotificacao.isEqual(dataFim) || dataNotificacao.isBefore(dataFim))) {

                            System.out.println("Nome: " + n.getDadosIndividuais().getNome());
                            System.out.println("Agravo: " + n.getDadosGerais().getAgravo());
                            System.out.println("Data da Notificação: " + n.getDadosGerais().getDataNotificacao());
                            System.out.println("--------------------------------------");
                            encontrou = true;
                        }
                    }
                    if (!encontrou) {
                        System.out.println("Nenhuma notificação encontrada nesse período.");
                    }
                }
                case 4 -> {
                    for(Notificacao n : TodasasNotificacoes){
                        System.out.println("Digite o agravo:");
                        String agravo = scanner.nextLine();

                        if(n.getDadosGerais().getAgravo().equals(agravo)) {
                            System.out.println(n.getDadosGerais().getAgravo());
                        }
                    }
                }
            }
        }while (opcao >= 1 && opcao <=4);
    }

    @Override
    public void CriarRelatorio() {

    }
}
