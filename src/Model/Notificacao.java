package Model;

import Dados.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Notificacao {
    private DadosEpidemiologico dadosEpidemiologico;
    private DadosGerais dadosGerais;
    private DadosIndividuais dadosIndividuais;
    private DadosResidencia dadosResidencia;
    private DadosTratamento dadosTratamento;
    List<Notificacao> TodasasNotificacoes = new ArrayList<>();

    public Notificacao() {

    }


    public abstract void SalvarNotificacao(Scanner scanner);

    public abstract void PesquisarNotificacao(Scanner scanner);

    public abstract void CriarRelatorio ();

    public Notificacao(DadosEpidemiologico dadosEpidemiologico,
                       DadosGerais dadosGerais,
                       DadosIndividuais dadosIndividuais,
                       DadosResidencia dadosResidencia,
                       DadosTratamento dadosTratamento)
    {
        this.dadosEpidemiologico = dadosEpidemiologico;
        this.dadosGerais = dadosGerais;
        this.dadosIndividuais = dadosIndividuais;
        this.dadosResidencia = dadosResidencia;
        this.dadosTratamento = dadosTratamento;
    }

    public DadosEpidemiologico getDadosEpidemiologico() {
        return dadosEpidemiologico;
    }

    public void setDadosEpidemiologico(DadosEpidemiologico dadosEpidemiologico) {
        this.dadosEpidemiologico = dadosEpidemiologico;
    }

    public DadosGerais getDadosGerais() {
        return dadosGerais;
    }

    public void setDadosGerais(DadosGerais dadosGerais) {
        this.dadosGerais = dadosGerais;
    }

    public DadosIndividuais getDadosIndividuais() {
        return dadosIndividuais;
    }

    public void setDadosIndividuais(DadosIndividuais dadosIndividuais) {
        this.dadosIndividuais = dadosIndividuais;
    }

    public DadosResidencia getDadosResidencia() {
        return dadosResidencia;
    }

    public void setDadosResidencia(DadosResidencia dadosResidencia) {
        this.dadosResidencia = dadosResidencia;
    }

    public DadosTratamento getDadosTratamento() {
        return dadosTratamento;
    }

    public void setDadosTratamento(DadosTratamento dadosTratamento) {
        this.dadosTratamento = dadosTratamento;
    }
}
