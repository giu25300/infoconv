package br.gov.go.goiania.sefin.infoconv.enums;

public enum TipoEstabelecimentoInfoconvEnum {
    MATRIZ("Matriz","1"),
    FILIAL("Filial","2");

    private String id;
    private String value;

    private TipoEstabelecimentoInfoconvEnum(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static TipoEstabelecimentoInfoconvEnum fromValue(final String value) {
        if (value != null) {
            for (TipoEstabelecimentoInfoconvEnum e : TipoEstabelecimentoInfoconvEnum.values()) {
                if (value.equals(e.getValue()))
                    return e;
            }
        }
        return null;
    }

    public static TipoEstabelecimentoInfoconvEnum fromId(final String id) {
        if (id != null) {
            for (TipoEstabelecimentoInfoconvEnum e : TipoEstabelecimentoInfoconvEnum.values()) {
                if (id.equals(e.getId()))
                    return e;
            }
        }
        return null;
    }
}