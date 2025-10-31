package Model;

import Dados.*;
import Enums.*;

import java.time.LocalDate;
import java.util.Scanner;

public class NotificacaoHanseniase extends Notificacao {

    public NotificacaoHanseniase(DadosEpidemiologico dadosEpidemiologico, DadosGerais dadosGerais, DadosIndividuais dadosIndividuais, DadosResidencia dadosResidencia, DadosTratamento dadosTratamento) {
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

        System.out.println("Digite a data de nascimento (yy-MM-dd):");
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

        System.out.println("Digite a data de investigação (yy-MM-dd):");
        dadosEpidemiologico.setData_investigacao(scanner.nextInt());

        System.out.println("Digite as principais atividade dos últimos 15 dias:");
        dadosEpidemiologico.setPrincipaisAtividadesUltimos15Dias(Integer.parseInt(scanner.nextLine()));

        System.out.println("Digite o tipo de lâmina:");
        dadosEpidemiologico.setTipo_lamina(Integer.parseInt(scanner.nextLine()));

        System.out.println("Digite os sintomas:");
        dadosEpidemiologico.setSintomas(Sintomas.valueOf(scanner.nextLine()));

        DadosTratamento dadosTratamento = new DadosTratamento();
        System.out.println("Digite a data de investigação (yy-MM-dd):");
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

        System.out.println("");


    }

    @Override
    public void PesquisarNotificacao(Scanner scanner) {



    }

    @Override
    public void CriarRelatorio() {

    }
}
