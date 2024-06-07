package br.gov.go.goiania.sefin.infoconv.common;

import java.util.HashMap;
import java.util.Map;

public class SituacaoCadastralCNPJ {
    private Map<String, String> situacaoCadastral;

    public Map<String, String> getSituacaoCadastralCNPJ() {
        return situacaoCadastral;
    }

    public SituacaoCadastralCNPJ(){
        situacaoCadastral = new HashMap<String, String>();
        situacaoCadastral.put("1","Nula");
        situacaoCadastral.put("2","Ativa");
        situacaoCadastral.put("3","Suspensa");
        situacaoCadastral.put("4","Inapta");
        situacaoCadastral.put("8","Baixada");
    }
}
