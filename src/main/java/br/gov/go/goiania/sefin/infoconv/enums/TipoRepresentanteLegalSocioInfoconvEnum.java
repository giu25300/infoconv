package br.gov.go.goiania.sefin.infoconv.enums;

public enum TipoRepresentanteLegalSocioInfoconvEnum {
    ADMINISTRADOR("Administrador","05"),
    CURADOR("Curador","09"),
    MAE("Mãe","14"),
    PAI("Pai","15"),
    PROCURADOR("Procurador","17"),
    TUTOR("Tutor","35");

    private String id;
    private String value;

    private TipoRepresentanteLegalSocioInfoconvEnum(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static TipoRepresentanteLegalSocioInfoconvEnum fromValue(final String value) {
        if (value != null) {
            for (TipoRepresentanteLegalSocioInfoconvEnum e : TipoRepresentanteLegalSocioInfoconvEnum.values()) {
                if (value.equals(e.getValue()))
                    return e;
            }
        }
        return null;
    }

    public static TipoRepresentanteLegalSocioInfoconvEnum fromId(final String id) {
        if (id != null) {
            for (TipoRepresentanteLegalSocioInfoconvEnum e : TipoRepresentanteLegalSocioInfoconvEnum.values()) {
                if (id.equals(e.getId()))
                    return e;
            }
        }
        return null;
    }
}
