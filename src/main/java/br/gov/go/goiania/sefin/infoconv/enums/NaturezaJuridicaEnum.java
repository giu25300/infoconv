package br.gov.go.goiania.sefin.infoconv.enums;

public enum NaturezaJuridicaEnum {
    ORGAO_PUBLICO_PODER_EXECUTIVO_FEDERAL("Órgão Público do Poder Executivo Federal", "101-5"),
    ORGAO_PUBLICO_PODER_EXECUTIVO_ESTADUAL_DISTRITO_FEDERAL("Órgão Público do Poder Executivo Estadual ou do Distrito Federal", "102-3"),
    ORGAO_PUBLICO_PODER_EXECUTIVO_MUNICIPAL("Órgão Público do Poder Executivo Municipal", "103-1"),
    ORGAO_PUBLICO_PODER_LEGISLATIVO_FEDERAL("Órgão Público do Poder Legislativo Federal", "104-0"),
    ORGAO_PUBLICO_PODER_LEGISLATIVO_ESTADUAL_DISTRITO_FEDERAL("Órgão Público do Poder Legislativo Estadual ou do Distrito Federal", "105-8"),
    ORGAO_PUBLICO_PODER_LEGISLATIVO_MUNICIPAL("Órgão Público do Poder Legislativo Municipal", "106-6"),
    ORGAO_PUBLICO_PODER_JUDICIARIO_FEDERAL("Órgão Público do Poder Judiciário Federal", "107-4"),
    ORGAO_PUBLICO_PODER_JUDICIARIO_ESTADUAL("Órgão Público do Poder Judiciário Estadual", "108-2"),
    AUTARQUIA_FEDERAL("Autarquia Federal", "10-4	"),
    AUTARQUIA_ESTADUAL_DISTRITO_FEDERAL("Autarquia Estadual ou do Distrito Federal	", "11-2	"),
    AUTARQUIA_MUNICIPAL("Autarquia Municipal", "12-0	"),
    FUNDACAO_FEDERAL("Fundação Federal", "113-9"),
    FUNDACAO_ESTADUAL_DISTRITO_FEDERAL("Fundação Estadual ou do Distrito Federal", "114-7"),
    FUNDACAO_MUNICIPAL("Fundação Municipal", "115-5"),
    ORGAO_PUBLICO_AUTONOMO_FEDERAL("Órgão Público Autônomo Federal", "116-3"),
    ORGAO_PUBLICO_AUTONOMO_ESTADUAL_DISTRITO_FEDERAL("Órgão Público Autônomo Estadual ou do Distrito Federal", "117-1"),
    ORGAO_PUBLICO_AUTONOMO_MUNICIPAL("Órgão Público Autônomo Municipal", "118-0"),
    COMISSAO_POLINACIONAL("Comissão Polinacional", "119-8"),
    FUNDO_PUBLICO("Fundo Público", "120-1"),
    CONSORCIO_PUBLICO_DIREITO_PUBLICO("Consórcio Público de Direito Público (Associação Pública)", "121-0"),
    CONSORCIO_PUBLICO_DIREITO_PRIVADO("Consórcio Público de Direito Privado", "122-8"),
    ESTADO_DISTRITO_FEDERAL("Estado ou Distrito Federal", "123-6"),
    MUNICIPIO("Município", "124-4"),
    FUNDACAO_PUBLICA_DIREITO_PRIVADO_FEDERAL("Fundação Pública de Direito Privado Federal", "125-2"),
    FUNDACAO_PUBLICA_DIREITO_PRIVADO_ESTADUAL_DISTRITO_FEDERAL("Fundação Pública de Direito Privado Estadual ou do Distrito Federal", "126-0"),
    FUNDACAO_PUBLICA_DIREITO_PRIVADO_MUNICIPAL("Fundação Pública de Direito Privado Municipal", "127-9"),
    FUNDO_PUBLICO_ADMINISTRACAO_INDIRETA_FEDERAL("Fundo Público da Administração Indireta Federal", "128-7"),
    FUNDO_PUBLICO_ADMINISTRACAO_INDIRETA_ESTADUAL_DISTRITO_FEDERAL("Fundo Público da Administração Indireta Estadual ou do Distrito Federal", "129-5"),
    FUNDO_PUBLICO_ADMINISTRACAO_INDIRETA_MUNICIPAL("Fundo Público da Administração Indireta Municipal", "130-9"),
    FUNDO_PUBLICO_ADMINISTRACAO_DIRETA_FEDERAL("Fundo Público da Administração Direta Federal", "131-7"),
    FUNDO_PUBLICO_ADMINISTRACAO_DIRETA_ESTADUAL_DISTRITO_FEDERAL("Fundo Público da Administração Direta Estadual ou do Distrito Federal", "132-5"),
    FUNDO_PUBLICO_ADMINISTRACAO_DIRETA_MUNICIPAL("Fundo Público da Administração Direta Municipal", "133-3"),
    UNIAO("União", "134-1"),
    EMPRESA_PUBLICA("Empresa Pública", "2011"),
    SOCIEDADE_ECONOMIA_MISTA("Sociedade de Economia Mista", "2038"),
    SOCIEDADE_ANONIMA_ABERTA("Sociedade Anônima Aberta", "2046"),
    SOCIEDADE_ANONIMA_FECHADA("Sociedade Anônima Fechada", "2054"),
    SOCIEDADE_EMPRESARIA_LIMITADA("Sociedade Empresária Limitada", "2062"),
    SOCIEDADE_EMPRESARIA_NOME_COLETIVO("Sociedade Empresária em Nome Coletivo", "2070"),
    SOCIEDADE_EMPRESARIA_COMANDITA_SIMPLES("Sociedade Empresária em Comandita Simples", "2089"),
    SOCIEDADE_EMPRESARIA_COMANDITA_POR_ACOES("Sociedade Empresária em Comandita por Ações", "2097"),
    SOCIEDADE_MERCANTIL_CAPITAL_INDUSTRIA("Sociedade Mercantil de Capital e Indústria (extinta)", "2100"),
    SOCIEDADE_CONTA_PARTICIPACAO("Sociedade em Conta de Participação", "2127"),
    EMPRESARIO_INDIVIDUAL("Empresário (Individual)", "2135"),
    COOPERATIVA("Cooperativa", "2143"),
    CONSORCIO_SOCIEDADES("Consórcio de Sociedades", "2151"),
    GRUPO_SOCIEDADES("Grupo de Sociedades", "2160"),
    ESTABELECIMENTO_BRASIL_SOCIEDADE_ESTRANGEIRA("Estabelecimento, no Brasil, de Sociedade Estrangeira", "2178"),
    ESTABELECIMENTO_BRASIL_EMPRESA_BINACIONAL_ARGENTINOBRASILEIRA("Estabelecimento, no Brasil, de Empresa Binacional ArgentinoBrasileira", "2194"),
    ENTIDADE_BINACIONAL_ITAIPU("Entidade Binacional Itaipu (até 2009)", "2208"),
    EMPRESA_DOMICILIADA_EXTERIOR("Empresa Domiciliada no Exterior", "2216"),
    CLUBE_FUNDO_INVEDIMENTO("Clube/Fundo de Investimento", "2224"),
    SOCIDADE_SIMPLES_PURA("Sociedade Simples Pura", "2232"),
    SOCIDADE_SIMPLES_LIMITADA("Sociedade Simples Limitada", "2240"),
    SOCIDADE_SIMPLES_NOME_COLETIVO("Sociedade Simples em Nome Coletivo", "2259"),
    SOCIDADE_SIMPLES_COMANDITA_SIMPLES("Sociedade Simples em Comandita Simples", "2267"),
    EMPRESA_BINACIONAL("Empresa Binacional", "2275"),
    CONSORCIO_EMPREGADORES("Consórcio de Empregadores", "2283"),
    CONSORCIO_SIMPLES("Consórcio Simples", "2291"),
    EMPRESA_INDIVIDUAL_RESPONSABILIDADE_LIMITADA_NATUREZA_EMPRESARIA("Empresa Individual de Responsabilidade Limitada (de Natureza Empresária)", "2305"),
    EMPRESA_INDIVIDUAL_RESPONSABILIDADE_LIMITADA_NATUREZA_SIMPLES("Empresa Individual de Responsabilidade Limitada (de Natureza Simples)", "2313"),
    SOCIEDADE_UNIPESSOAL_ADVOCACIA("Sociedade Unipessoal de Advocacia", "2321"),
    COOPERATIVAS_CONSUMO("Cooperativas de Consumo", "2330"),
    EMPRESA_SIMPLES_INOVACAO_SIMPLES("Empresa Simples de InovaçãoInova Simples", "2348"),
    SERVICO_NOTARIAL_REGISTRAL("Serviço Notarial e Registral (Cartório)", "303-4"),
    FUNDACAO_PRIVADA("Fundação Privada", "306-9"),
    SERVICO_SOCIAL_AUTONOMO("Serviço Social Autônomo", "307-7"),
    CONDOMINIO_EDIFLICIO("Condomínio Edilício", "308-5"),
    COMISSAO_CONCILIACAO_PREVIA("Comissão de Conciliação Prévia", "310-7"),
    ENTIDADE_MEDIACAO_ARBRITAGEM("Entidade de Mediação e Arbitragem", "311-5"),
    PARTIDO_POLITICO("Partido Político", "312-3"),
    ENTIDADE_SINDICAL("Entidade Sindical", "313-1"),
    ESTABELECIMENTO_BRASIL_FUNDACAO_ASSOCIACAO_ESTRANGEIRAS("Estabelecimento, no Brasil, de Fundação ou Associação Estrangeiras", "320-4"),
    FUNDACAO_ASSOCIACAO_DOMICILIADA_EXTERIOR("Fundação ou Associação domiciliada no exterior", "321-2"),
    ORGANIZACAO_RELIGIOSA("Organização Religiosa", "322-0"),
    COMUNIDADE_INDIGENA("Comunidade Indígena", "323-9"),
    FUNDO_PRIVADO("Fundo Privado", "324-7"),
    ASSOCIACAO_PRIVADA("Associação Privada", "399-9"),
    EMPRESA_INDIVIDUAL_IMOBILIARIA("Empresa Individual Imobiliária", "401-4"),
    CANDIDATO_CARGO_POLITICO_ELETIVO("Candidato a Cargo Político Eletivo", "409-0"),
    PRODUTOR_RURAL_PF("Produtor Rural (Pessoa Física)", "412-0"),
    ORGANIZACAO_INTERNACIONAL("Organização Internacional", "501-0"),
    REPRESENTACAO_DIPLOMATICA_ESTRANGEIRA("Representação Diplomática Estrangeira", "502-9"),
    OUTRAS_INSTITUICOES_EXTRATERRITORIAIS("Outras Instituições Extraterritoriais", "503-7");

    private String id;
    private String value;

    private NaturezaJuridicaEnum(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static NaturezaJuridicaEnum fromValue(final String value) {
        if (value != null) {
            for (NaturezaJuridicaEnum e : NaturezaJuridicaEnum.values()) {
                if (value.equals(e.getValue()))
                    return e;
            }
        }
        return null;
    }

    public static NaturezaJuridicaEnum fromId(final String id) {
        if (id != null) {
            for (NaturezaJuridicaEnum e : NaturezaJuridicaEnum.values()) {
                if (id.equals(e.getId()))
                    return e;
            }
        }
        return null;
    }
    }
