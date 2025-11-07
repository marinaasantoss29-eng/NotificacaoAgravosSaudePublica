package Arquivos;

import java.io.FileWriter;
import java.io.IOException;
import Model.Notificacao;

public class ArquivoNotificacao {

    public static void salvarEmArquivo(Notificacao notificacao, String tipoDoenca) {
        try {
            // Caminho do arquivo (ficará dentro da pasta src/Arquivos)
            FileWriter writer = new FileWriter("src/Arquivos/notificacoes.txt", true); // true = acrescenta sem apagar

            writer.write("\n=====================================\n");
            writer.write("NOTIFICAÇÃO DE " + tipoDoenca.toUpperCase() + "\n");
            writer.write("=====================================\n");

            writer.write("Tipo de Notificação: " + notificacao.getDadosGerais().getTipoNotificacao() + "\n");
            writer.write("Agravo: " + notificacao.getDadosGerais().getAgravo() + "\n");
            writer.write("UF: " + notificacao.getDadosGerais().getUF() + "\n");
            writer.write("Código: " + notificacao.getDadosGerais().getCodigo() + "\n");
            writer.write("Data da Notificação: " + notificacao.getDadosGerais().getDataNotificacao() + "\n");
            writer.write("Município: " + notificacao.getDadosGerais().getMunicipio() + "\n\n");

            writer.write("--- Dados Individuais ---\n");
            writer.write("Nome: " + notificacao.getDadosIndividuais().getNome() + "\n");
            writer.write("Data de Nascimento: " + notificacao.getDadosIndividuais().getDataNascimento() + "\n");
            writer.write("Idade: " + notificacao.getDadosIndividuais().getIdade() + "\n");
            writer.write("Sexo: " + notificacao.getDadosIndividuais().getSexo() + "\n");
            writer.write("Gestante: " + notificacao.getDadosIndividuais().getGestante() + "\n");
            writer.write("Escolaridade: " + notificacao.getDadosIndividuais().getEscolaridade() + "\n");
            writer.write("Nome da Mãe: " + notificacao.getDadosIndividuais().getNome_mae() + "\n\n");

            writer.write("--- Dados de Residência ---\n");
            writer.write("Município: " + notificacao.getDadosResidencia().getMunicipio() + "\n");
            writer.write("UF: " + notificacao.getDadosResidencia().getUF() + "\n");
            writer.write("Bairro: " + notificacao.getDadosResidencia().getBairro() + "\n");
            writer.write("Logradouro: " + notificacao.getDadosResidencia().getLogradouro() + "\n");
            writer.write("Número: " + notificacao.getDadosResidencia().getNumero() + "\n");
            writer.write("Telefone: " + notificacao.getDadosResidencia().getTelefone() + "\n");
            writer.write("Zona: " + notificacao.getDadosResidencia().getZona() + "\n\n");

            writer.write("--- Dados Epidemiológicos ---\n");
            writer.write("Data de Investigação: " + notificacao.getDadosEpidemiologico().getData_investigacao() + "\n");
            writer.write("Atividades 15 dias: " + notificacao.getDadosEpidemiologico().getPrincipaisAtividadesUltimos15Dias() + "\n");
            writer.write("Tipo de Lâmina: " + notificacao.getDadosEpidemiologico().getTipo_lamina() + "\n");
            writer.write("Sintomas: " + notificacao.getDadosEpidemiologico().getSintomas() + "\n\n");

            writer.write("--- Dados de Tratamento ---\n");
            writer.write("Data de Investigação: " + notificacao.getDadosTratamento().getDataInvestigacao() + "\n");
            writer.write("Resultado do Exame: " + notificacao.getDadosTratamento().getResultadoExame() + "\n");
            writer.write("Esquema Terapêutico: " + notificacao.getDadosTratamento().getEsquemaTratamentoManuelTerapeuticoMalaria() + "\n");
            writer.write("Data de Início do Tratamento: " + notificacao.getDadosTratamento().getDataInicioTratamento() + "\n");

            writer.write("-------------------------------------\n\n");

            writer.close();

            System.out.println("✅ Notificação salva com sucesso no arquivo TXT!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }
}
