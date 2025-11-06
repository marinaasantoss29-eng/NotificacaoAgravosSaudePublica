package Dados;

import Enums.Principais_atividades_ultimos_15_dias;
import Enums.Sintomas;
import Enums.Tipo_lamina;

import java.time.LocalDate;

public class DadosEpidemiologico {
    private LocalDate data_investigacao;
    private Principais_atividades_ultimos_15_dias principaisAtividadesUltimos15Dias;
    private Tipo_lamina tipo_lamina;
    private Sintomas sintomas;

    public DadosEpidemiologico() {}

    public LocalDate getData_investigacao() {
        return data_investigacao;
    }

    public void setData_investigacao(LocalDate data_investigacao) {
        this.data_investigacao = data_investigacao;
    }

    public Principais_atividades_ultimos_15_dias getPrincipaisAtividadesUltimos15Dias() {
        return principaisAtividadesUltimos15Dias;
    }

    public void setPrincipaisAtividadesUltimos15Dias(Principais_atividades_ultimos_15_dias principaisAtividadesUltimos15Dias) {
        this.principaisAtividadesUltimos15Dias = principaisAtividadesUltimos15Dias;
    }

    public Tipo_lamina getTipo_lamina() {
        return tipo_lamina;
    }

    public void setTipo_lamina(Tipo_lamina tipo_lamina) {
        this.tipo_lamina = tipo_lamina;
    }

    public Sintomas getSintomas() {
        return sintomas;
    }

    public void setSintomas(Sintomas sintomas) {
        this.sintomas = sintomas;
    }
}
