package Dados;

import Enums.Autoctone;
import Enums.ClassificacaoFinal;

import java.time.LocalDate;

public class ConclusaoEncerramento {
    private ClassificacaoFinal classificacaoFinal;
    private Autoctone autoctone;
    private Integer Codigo;
    private String Bairro;
    private String Localidade_Infeccao;
    private LocalDate Data_Encerramento;

    public ConclusaoEncerramento()
    {
        this.classificacaoFinal = classificacaoFinal;
        this.autoctone = autoctone;
        Codigo = codigo;
        Bairro = bairro;
        Localidade_Infeccao = localidade_Infeccao;
        Data_Encerramento = data_Encerramento;
    }

    public ClassificacaoFinal getClassificacaoFinal() {
        return classificacaoFinal;
    }

    public void setClassificacaoFinal(ClassificacaoFinal classificacaoFinal) {
        this.classificacaoFinal = classificacaoFinal;
    }

    public Autoctone getAutoctone() {
        return autoctone;
    }

    public void setAutoctone(Autoctone autoctone) {
        this.autoctone = autoctone;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer codigo) {
        Codigo = codigo;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getLocalidade_Infeccao() {
        return Localidade_Infeccao;
    }

    public void setLocalidade_Infeccao(String localidade_Infeccao) {
        Localidade_Infeccao = localidade_Infeccao;
    }

    public LocalDate getData_Encerramento() {
        return Data_Encerramento;
    }

    public void setData_Encerramento(LocalDate data_Encerramento) {
        Data_Encerramento = data_Encerramento;
    }
}
