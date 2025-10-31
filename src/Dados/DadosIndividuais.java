package Dados;

import java.time.LocalDate;
import Enums.*;

public class DadosIndividuais {
    private String nome;
    private LocalDate DataNascimento;
    private Integer Idade;
    private Sexo sexo;
    private Gestante gestante;
    private Raca raca;
    private Escolaridade escolaridade;
    private String nome_mae;
    private Integer nProntuario;
    private String ocupacao;

    public DadosIndividuais()
    {
        this.nome = nome;
        LocalDate dataNascimento;
        Integer idade;
        this.sexo = sexo;
        this.gestante = gestante;
        this.raca = raca;
        this.escolaridade = escolaridade;
        this.nome_mae = nome_mae;
        this.nProntuario = nProntuario;
        this.ocupacao = ocupacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Gestante getGestante() {
        return gestante;
    }

    public void setGestante(Gestante gestante) {
        this.gestante = gestante;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public Integer getnProntuario() {
        return nProntuario;
    }

    public void setnProntuario(Integer nProntuario) {
        this.nProntuario = nProntuario;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
}
