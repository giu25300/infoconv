package br.gov.go.goiania.sefin.infoconv.enums;

public enum SexoInfoconvEnum {
    MASCULINO("M","1"),
    FEMININO("F","2");

    private String id;
    private String value;

    private SexoInfoconvEnum(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static SexoInfoconvEnum fromValue(final String value) {
        if (value != null) {
            for (SexoInfoconvEnum e : SexoInfoconvEnum.values()) {
                if (value.equals(e.getValue()))
                    return e;
            }
        }
        return null;
    }

    public static SexoInfoconvEnum fromId(final String id) {
        if (id != null) {
            for (SexoInfoconvEnum e : SexoInfoconvEnum.values()) {
                if (id.equals(e.getId()))
                    return e;
            }
        }
        return null;
    }
}