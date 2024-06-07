package br.gov.go.goiania.sefin.infoconv.enums;

public enum PorteEmpresaInfoconvEnum {
    PESSOA_JURIDICA("Microempresa - ME","01"),
    PESSOA_FISICA("Empresa de pequeno porte - EPP","03"),
    SOCIO_ESTRANGEIRO("Demais empresas","05");

    private String id;
    private String value;

    private PorteEmpresaInfoconvEnum(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static PorteEmpresaInfoconvEnum fromValue(final String value) {
        if (value != null) {
            for (PorteEmpresaInfoconvEnum e : PorteEmpresaInfoconvEnum.values()) {
                if (value.equals(e.getValue()))
                    return e;
            }
        }
        return null;
    }

    public static PorteEmpresaInfoconvEnum fromId(final String id) {
        if (id != null) {
            for (PorteEmpresaInfoconvEnum e : PorteEmpresaInfoconvEnum.values()) {
                if (id.equals(e.getId()))
                    return e;
            }
        }
        return null;
    }
}