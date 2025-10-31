package Dados;
import Enums.*;

import java.time.LocalDate;

public class DadosTratamento {

    private LocalDate DataInvestigacao;
    private ResultadoExame resultadoExame;
    private EsquemaTratamentoManuelTerapeuticoMalaria esquemaTratamentoManuelTerapeuticoMalaria;
    private Integer NumLesoesCutaneas;
    private FormaClinica formaClinica;
    private ClassificacaoOperacional classificacaoOperacional;
    private Integer NumNervosAfetados;
    private ModoEntrada modoEntrada;
    private ModoDeteccaoCadoNovo modoDeteccaoCadoNovo;
    private Baciloscopia baciloscopia;
    private LocalDate DataInicioTratamento;
    private Integer NumeroDeConatosRegistrados;


    public DadosTratamento()
    {
        DataInvestigacao = dataInvestigacao;
        this.resultadoExame = resultadoExame;
        this.esquemaTratamentoManuelTerapeuticoMalaria = esquemaTratamentoManuelTerapeuticoMalaria;
        NumLesoesCutaneas = numLesoesCutaneas;
        this.formaClinica = formaClinica;
        this.classificacaoOperacional = classificacaoOperacional;
        NumNervosAfetados = numNervosAfetados;
        this.modoEntrada = modoEntrada;
        this.modoDeteccaoCadoNovo = modoDeteccaoCadoNovo;
        this.baciloscopia = baciloscopia;
        DataInicioTratamento = dataInicioTratamento;
        NumeroDeConatosRegistrados = numeroDeConatosRegistrados;
    }

    public LocalDate getDataInvestigacao() {
        return DataInvestigacao;
    }

    public void setDataInvestigacao(LocalDate dataInvestigacao) {
        DataInvestigacao = dataInvestigacao;
    }

    public ResultadoExame getResultadoExame() {
        return resultadoExame;
    }

    public void setResultadoExame(ResultadoExame resultadoExame) {
        this.resultadoExame = resultadoExame;
    }

    public EsquemaTratamentoManuelTerapeuticoMalaria getEsquemaTratamentoManuelTerapeuticoMalaria() {
        return esquemaTratamentoManuelTerapeuticoMalaria;
    }

    public void setEsquemaTratamentoManuelTerapeuticoMalaria(EsquemaTratamentoManuelTerapeuticoMalaria esquemaTratamentoManuelTerapeuticoMalaria) {
        this.esquemaTratamentoManuelTerapeuticoMalaria = esquemaTratamentoManuelTerapeuticoMalaria;
    }

    public Integer getNumLesoesCutaneas() {
        return NumLesoesCutaneas;
    }

    public void setNumLesoesCutaneas(Integer numLesoesCutaneas) {
        NumLesoesCutaneas = numLesoesCutaneas;
    }

    public FormaClinica getFormaClinica() {
        return formaClinica;
    }

    public void setFormaClinica(FormaClinica formaClinica) {
        this.formaClinica = formaClinica;
    }

    public ClassificacaoOperacional getClassificacaoOperacional() {
        return classificacaoOperacional;
    }

    public void setClassificacaoOperacional(ClassificacaoOperacional classificacaoOperacional) {
        this.classificacaoOperacional = classificacaoOperacional;
    }

    public Integer getNumNervosAfetados() {
        return NumNervosAfetados;
    }

    public void setNumNervosAfetados(Integer numNervosAfetados) {
        NumNervosAfetados = numNervosAfetados;
    }

    public ModoEntrada getModoEntrada() {
        return modoEntrada;
    }

    public void setModoEntrada(ModoEntrada modoEntrada) {
        this.modoEntrada = modoEntrada;
    }

    public ModoDeteccaoCadoNovo getModoDeteccaoCadoNovo() {
        return modoDeteccaoCadoNovo;
    }

    public void setModoDeteccaoCadoNovo(ModoDeteccaoCadoNovo modoDeteccaoCadoNovo) {
        this.modoDeteccaoCadoNovo = modoDeteccaoCadoNovo;
    }

    public Baciloscopia getBaciloscopia() {
        return baciloscopia;
    }

    public void setBaciloscopia(Baciloscopia baciloscopia) {
        this.baciloscopia = baciloscopia;
    }

    public LocalDate getDataInicioTratamento() {
        return DataInicioTratamento;
    }

    public void setDataInicioTratamento(LocalDate dataInicioTratamento) {
        DataInicioTratamento = dataInicioTratamento;
    }

    public Integer getNumeroDeConatosRegistrados() {
        return NumeroDeConatosRegistrados;
    }

    public void setNumeroDeConatosRegistrados(Integer numeroDeConatosRegistrados) {
        NumeroDeConatosRegistrados = numeroDeConatosRegistrados;
    }
}
