package br.gov.go.goiania.sefin.infoconv.enums;

public enum SituacaoCadastralCPFEnum {
    REGULAR("Regular","0"),
    CANCELA_ENCERRAMENTO_ESPOLIO("Cancelada por encerramento de espólio (*1)","1"),
    SUSPENSA("Suspensa","2"),
    TITULAR_FALECIDO("Titular falecido","3"),
    PENDENTE_REGULARIZACAO("Pendente de regularização","4"),
    CANCELADA_MULTIPLICIDADE("Cancelada por multiplicidade","5"),
    NULA("Nula","8"),
    CANCELADA_OFICIO("Cancelada de ofício","9");

    private String id;
    private String value;

    private SituacaoCadastralCPFEnum(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static SituacaoCadastralCPFEnum fromValue(final String value) {
        if (value != null) {
            for (SituacaoCadastralCPFEnum e : SituacaoCadastralCPFEnum.values()) {
                if (value.equals(e.getValue()))
                    return e;
            }
        }
        return null;
    }

    public static SituacaoCadastralCPFEnum fromId(final String id) {
        if (id != null) {
            for (SituacaoCadastralCPFEnum e : SituacaoCadastralCPFEnum.values()) {
                if (id.equals(e.getId()))
                    return e;
            }
        }
        return null;
    }
}
