package br.gov.go.goiania.sefin.infoconv.common;

import java.util.HashMap;
import java.util.Map;

public class NaturezaOcupacaoInfoconv {
    private Map<String, String> naturezaOcupacao;

    public Map<String, String> getNaturezaOcupacao() {
        return naturezaOcupacao;
    }

    public NaturezaOcupacaoInfoconv(){
        naturezaOcupacao = new HashMap<>();
        naturezaOcupacao.put("02","Empregado de instituições financeiras públicas e privadas");
        naturezaOcupacao.put("03","Empregado ou contratado de organismo internacional e de organização não-governamental");
        naturezaOcupacao.put("11","Profissional liberal ou autônomo sem vínculo de emprego");
        naturezaOcupacao.put("12","Proprietário de empresa ou de firma individual ou empregador-titular");
        naturezaOcupacao.put("13","Capitalista, que auferiu rendimentos de capital, inclusive de aluguéis");
        naturezaOcupacao.put("14","Microempreendedor individual (MEI)");
        naturezaOcupacao.put("21","Membro ou servidor público da administração direta federal");
        naturezaOcupacao.put("22","Servidor público de autarquia ou fundação federal");
        naturezaOcupacao.put("23","Empregado de empresa pública ou de sociedade de economia mista federal, exceto de instituições financeiras");
        naturezaOcupacao.put("31","Membro ou servidor público da administração direta estadual e do Distrito Federal");
        naturezaOcupacao.put("32","Servidor público de autarquia ou fundação estadual e do Distrito Federal");
        naturezaOcupacao.put("33","Empregado de empresa pública ou de sociedade de economia mista estadual e do Distrito Federal, exceto de instituições financeiras");
        naturezaOcupacao.put("41","Membro ou servidor público da administração direta municipal");
        naturezaOcupacao.put("42","Servidor público de autarquia ou fundação municipal");
        naturezaOcupacao.put("43","Empregado de empresa pública ou de sociedade de economia mista municipal");
        naturezaOcupacao.put("51","Militar");
        naturezaOcupacao.put("61","Aposentado, militar da reserva ou reformado e pensionista de previdência, exceto os abrangidos pelo código 62");
        naturezaOcupacao.put("62","Aposentado, militar reformado e pensionista de previdência oficial portador de moléstia grave");
        naturezaOcupacao.put("71","Beneficiário de pensão alimentícia");
        naturezaOcupacao.put("72","Bolsista");
        naturezaOcupacao.put("81","Espólio");
        naturezaOcupacao.put("91","Natureza da ocupação não especificada anteriormente");
    }
}
