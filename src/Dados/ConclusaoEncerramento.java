package Dados;

import Enums.Autoctone;
import Enums.ClassificacaoFinal;

import java.time.LocalDate;

public class ConclusaoEncerramento {
    private ClassificacaoFinal classificacaoFinal;
    private Autoctone autoctone;
    private Integer codigo;
    private String bairro;
    private String localidade_infeccao;
    private LocalDate data_encerramento;

    public ConclusaoEncerramento() {
    }
    public ConclusaoEncerramento(ClassificacaoFinal classificacaoFinal, Autoctone autoctone, Integer codigo,
                                 String bairro, String localidade_infeccao, LocalDate data_encerramento){
        this.classificacaoFinal= classificacaoFinal;
        this.autoctone= autoctone;
        this.codigo = codigo;
        this.bairro = bairro;
        this.localidade_infeccao = localidade_infeccao;
        this.data_encerramento = data_encerramento;
    }
    public ClassificacaoFinal getClassificacaoFinal() {
        return classificacaoFinal;
    }
    public void setClassificacaoFinal(ClassificacaoFinal classificacaoFinal) {this.classificacaoFinal = classificacaoFinal;}

    public Autoctone getAutoctone() {
        return autoctone;
    }
    public void setAutoctone(Autoctone autoctone) {
        this.autoctone = autoctone;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade_Infeccao() { return localidade_infeccao;}
    public void setLocalidade_Infeccao(String localidade_infeccao) {
        this.localidade_infeccao = localidade_infeccao;
    }

    public LocalDate getData_Encerramento() {
        return data_encerramento;
    }
    public void setData_Encerramento(LocalDate data_encerramento) {
        this.data_encerramento = data_encerramento;
    }
}
