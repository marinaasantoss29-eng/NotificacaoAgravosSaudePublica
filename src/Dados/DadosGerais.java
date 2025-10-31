package Dados;

import java.time.LocalDate;

public class DadosGerais {
    private String TipoNotificacao;
    private String Agravo;
    private String UF;
    private Integer Codigo;
    private LocalDate DataNotificacao;
    private String Municipio;
    private static Integer Codigo1=1;

    public DadosGerais(String tipoNotificacao,
                       String agravo,
                       String UF,
                       Integer codigo1,
                       LocalDate dataNotificacao,
                       String municipio,
                       Integer Codigo)
    {
        TipoNotificacao = tipoNotificacao;
        Agravo = agravo;
        this.UF = UF;
        Codigo = codigo1++;
        DataNotificacao = dataNotificacao;
        Municipio = municipio;
    }

    public DadosGerais() {

    }

    public String getTipoNotificacao() {
        return TipoNotificacao;
    }

    public void setTipoNotificacao(String tipoNotificacao) {
        TipoNotificacao = tipoNotificacao;
    }

    public String getAgravo() {
        return Agravo;
    }

    public void setAgravo(String agravo) {
        Agravo = agravo;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer codigo) {
        Codigo = codigo;
    }

    public LocalDate getDataNotificacao() {
        return DataNotificacao;
    }

    public void setDataNotificacao(LocalDate dataNotificacao) {
        DataNotificacao = dataNotificacao;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }

    public static Integer getCodigo1() {
        return Codigo1;
    }

    public static void setCodigo1(Integer codigo1) {
        Codigo1 = codigo1;
    }
}
