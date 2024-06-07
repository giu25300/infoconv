package br.gov.go.goiania.sefin.infoconv.enums;

public enum TipoQualificacaoSocioInfoconvEnum {
    ADMINSISTRADOR("Administrador", "05"),
    CONSELHEIRO_ADMINISTRACAO("Conselheiro de Administração", "08"),
    DIRETOR("Diretor", "10"),
    PRESIDENTE("Presidente", "16"),
    PROCURADOR("Procurador", "17"),
    SECRETARIO("Secretário", "18"),
    SOCIEDADE_CONSORCIADA("Sociedade Consorciada", "20"),
    SOCIEDADE_FILIADA("Sociedade Filiada", "21"),
    SOCIO("Sócio", "22"),
    SOCIO_CAPITALISTA("Sócio Capitalista", "23"),
    SOCIO_COMANDITADO("Sócio Comanditado", "24"),
    SOCIO_COMANDITARIO("Sócio Comanditário", "25"),
    SOCIO_INDUSTRIA("Sócio de Indústria", "26"),
    SOCIO_GERENTE("Sócio-Gerente", "28"),
    SOCIO_INCAPAZ("Sócio Incapaz ou Relat.Incapaz (exceto menor)", "29"),
    SOCIO_MENOR("Sócio Menor (Assistido/Representado)", "30"),
    SOCIO_OSTENSIVO("Sócio Ostensivo", "31"),
    TESOUREIRO("Tesoureiro", "33"),
    SOCIO_PJ_DOMICILIADO_EXTERIOR("Sócio Pessoa Jurídica Domiciliado no Exterior", "37"),
    SOCIO_PF_DOCIMICILIADO_EXTERIOR("Sócio Pessoa Física Residente ou Domiciliado no Exterior", "38"),
    SOCIO_PF_RESIDENTE_BRASIL("Sócio Pessoa Física Residente no Brasil", "47"),
    SOCIO_PJ_DOMICILIADO_BRASIL("Sócio Pessoa Jurídica Domiciliado no Brasil", "48"),
    SOCIO_ADMINISTRADOR("Sócio-Administrador", "49"),
    SOCIO_CAPITAL("Sócio com Capital", "52"),
    SOCIO_SEM_CAPITAL("Sócio sem Capital", "53"),
    FUNDADOR("Fundador", "54"),
    SOCIO_COMANDITADO_RESIDENTE_EXTERIOR("Sócio Comanditado Residente no Exterior", "55"),
    SOCIO_COMANDITARIO_PF_RESIDENTE_EXTERIOR("Sócio Comanditário Pessoa Física Residente no Exterior", "56"),
    SOCIO_COMANDITARIO_PJ_DOMICILIADO_EXTERIOR("Sócio Comanditário Pessoa Jurídica Domiciliado no Exterior", "57"),
    SOCIO_COMANDITARIO_INCAPAZ("Sócio Comanditário Incapaz", "58"),
    PRODUTOR_RURAL("Produtor Rural", "59"),
    COTAS_TESOURARIA("Cotas em Tesouraria", "63"),
    TITULAR_PF_RESIDENTE_BRASIL("Titular Pessoa Física Residente ou Domiciliado no Brasil", "65"),
    TITULAR_PF_RESIDENTE_EXTERIOR("Titular Pessoa Física Residente ou Domiciliado no Exterior", "66"),
    TITULAR_PF_INCAPAZ_RELATIVAMENTE_INCAPAZ("Titular Pessoa Física Incapaz ou Relativamente Incapaz (exceto menor)", "67"),
    TITULAR_PF_MENOR("Titular Pessoa Física Menor (Assistido/Representado)", "68"),
    ADMINISTRADOR_RESIDENTE_EXTERIOR("Administrador Residente ou Domiciliado no Exterior", "70"),
    CONSELHEIRO_ADMINISTRACAO_RESIDENTE_EXTERIOR("Conselheiro de Administração Residente ou Domiciliado no Exterior", "71"),
    DIRETOR_RESIDENTE_EXTERIOR("Diretor Residente ou Domiciliado no Exterior", "72"),
    PRESIDENTE_RESIDENTE_EXTERIOR("Presidente Residente ou Domiciliado no Exterior", "73"),
    SOCIO_ADMINISTRADOR_RESIDENTE_EXTERIOR("Sócio-Administrador Residente ou Domiciliado no Exterior", "74"),
    FUNDADOR_RESIDENTE_EXTERIOR("Fundador Residente ou Domiciliado no Exterior", "75"),
    PROTETOR("Protetor", "76"),
    VICE_PRESIDENTE("Vice-Presidente", "77"),
    TITULAR_PJ_DOMICILIADA_BRASIL("Titular Pessoa Jurídica Domiciliada no Brasil", "78"),
    TITULAR_PJ_DOMICILIADA_EXTERIOR("Titular Pessoa Jurídica Domiciliada no Exterior", "79");

    private String id;
    private String value;

    private TipoQualificacaoSocioInfoconvEnum(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static TipoQualificacaoSocioInfoconvEnum fromValue(final String value) {
        if (value != null) {
            for (TipoQualificacaoSocioInfoconvEnum e : TipoQualificacaoSocioInfoconvEnum.values()) {
                if (value.equals(e.getValue()))
                    return e;
            }
        }
        return null;
    }

    public static TipoQualificacaoSocioInfoconvEnum fromId(final String id) {
        if (id != null) {
            for (TipoQualificacaoSocioInfoconvEnum e : TipoQualificacaoSocioInfoconvEnum.values()) {
                if (id.equals(e.getId()))
                    return e;
            }
        }
        return null;
    }
}
