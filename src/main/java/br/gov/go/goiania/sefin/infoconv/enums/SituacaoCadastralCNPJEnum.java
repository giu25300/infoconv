package br.gov.go.goiania.sefin.infoconv.enums;

public enum SituacaoCadastralCNPJEnum {
    NULA("Nula","01"),
    ATIVA("Ativa","02"),
    SUSPENSA("Suspensa","03"),
    INAPTA("Inapta","04"),
    ATIVA_NAO_REGULAR("Ativa não Regular","05"),
    BAIXADA("Baixada","08");

    private String id;
    private String value;

    private SituacaoCadastralCNPJEnum(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static SituacaoCadastralCNPJEnum fromValue(final String value) {
        if (value != null) {
            for (SituacaoCadastralCNPJEnum e : SituacaoCadastralCNPJEnum.values()) {
                if (value.equals(e.getValue()))
                    return e;
            }
        }
        return null;
    }

    public static SituacaoCadastralCNPJEnum fromId(final String id) {
        if (id != null) {
            for (SituacaoCadastralCNPJEnum e : SituacaoCadastralCNPJEnum.values()) {
                if (id.equals(e.getId()))
                    return e;
            }
        }
        return null;
    }
}
