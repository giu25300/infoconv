package br.gov.go.goiania.sefin.infoconv.common;

import java.util.HashMap;
import java.util.Map;

public class SituacaoCadastralCPF {
    private Map<String, String> situacaoCadastral;

    public Map<String, String> getSituacaoCadastralCPF() {
        return situacaoCadastral;
    }

    public SituacaoCadastralCPF(){
        situacaoCadastral = new HashMap<String, String>();
        situacaoCadastral.put("0","Regular");
        situacaoCadastral.put("1","Cancelada por encerramento de espólio (*1)");
        situacaoCadastral.put("2","Suspensa");
        situacaoCadastral.put("3","Titular falecido");
        situacaoCadastral.put("4","Pendente de regularização");
        situacaoCadastral.put("5","Cancelada por multiplicidade");
        situacaoCadastral.put("8","Nula");
        situacaoCadastral.put("9","Cancelada de ofício");
    }
}
