package br.gov.go.goiania.sefin.infoconv.enums;

public enum TipoSocioInfoconvEnum {
    PESSOA_JURIDICA("Pessoa Jurídica","1"),
    PESSOA_FISICA("Pessoa Fisica","2"),
    SOCIO_ESTRANGEIRO("Sócio Estrangeiro","3");

    private String id;
    private String value;

    private TipoSocioInfoconvEnum(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static TipoSocioInfoconvEnum fromValue(final String value) {
        if (value != null) {
            for (TipoSocioInfoconvEnum e : TipoSocioInfoconvEnum.values()) {
                if (value.equals(e.getValue()))
                    return e;
            }
        }
        return null;
    }

    public static TipoSocioInfoconvEnum fromId(final String id) {
        if (id != null) {
            for (TipoSocioInfoconvEnum e : TipoSocioInfoconvEnum.values()) {
                if (id.equals(e.getId()))
                    return e;
            }
        }
        return null;
    }
}
