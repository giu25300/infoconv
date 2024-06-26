package br.gov.go.goiania.sefin.infoconv.common;

import java.util.HashMap;
import java.util.Map;

public class OcupacaoPrincipalInfoconv {
    private Map<String, String> ocupacaoPrincipal;

    public Map<String, String> getOcupacaoPrincipal() {
        return ocupacaoPrincipal;
    }

    public OcupacaoPrincipalInfoconv(){
        ocupacaoPrincipal = new HashMap<>();
        ocupacaoPrincipal.put("000","Outras ocupações não especificadas anteriormente");
        ocupacaoPrincipal.put("010","Militar da Aeronáutica");
        ocupacaoPrincipal.put("020","Militar do Exército");
        ocupacaoPrincipal.put("030","Militar da Marinha");
        ocupacaoPrincipal.put("040","Policial Militar");
        ocupacaoPrincipal.put("050","Bombeiro Militar");
        ocupacaoPrincipal.put("101","Membro do Poder Executivo (Presidente da República, Vice-Presidente da República, Ministro de Estado, Governador, Vice-Governador, Prefeito, Vice-Prefeito");
        ocupacaoPrincipal.put("102","Membro do Poder Judiciário (Ministro, Juiz e Desembargador) e de Tribunal de Contas (Ministro e Conselheiro)");
        ocupacaoPrincipal.put("103","Membro do Poder Legislativo (Senador, Deputado Federal, Deputado Estadual e Vereador)");
        ocupacaoPrincipal.put("104","Membro do Ministério Público (Procurador e Promotor)");
        ocupacaoPrincipal.put("105","Dirigente superior da administração pública (ocupante de cargo de direção, chefia, assessoria e de natureza especial), inclusive os das fundações públicas e autarquias");
        ocupacaoPrincipal.put("106","Diplomata e afins");
        ocupacaoPrincipal.put("107","Servidor das carreiras do Poder Legislativo");
        ocupacaoPrincipal.put("108","Servidor das carreiras do Ministério Público");
        ocupacaoPrincipal.put("109","Servidor das carreiras do Poder Judiciário, Oficial de Justiça, Auxiliar, Assistente e Analista Judiciário");
        ocupacaoPrincipal.put("110","Advogado do setor público, Procurador da Fazenda, Consultor Jurídico, Procurador de autarquias e fundações públicas, Defensor Público");
        ocupacaoPrincipal.put("111","Servidor das carreiras de auditoria fiscal e de fiscalização");
        ocupacaoPrincipal.put("112","Servidor das carreiras do Banco Central, CVM e Susep");
        ocupacaoPrincipal.put("113","Delegado de Polícia e outros servidores das carreiras de polícia, exceto militar");
        ocupacaoPrincipal.put("114","Servidor das carreiras de gestão governamental, analista, gestor e técnico de planejamento");
        ocupacaoPrincipal.put("115","Servidor das carreiras de ciência e tecnologia");
        ocupacaoPrincipal.put("116","Servidor das demais carreiras da administração pública direta, autárquica e fundacional");
        ocupacaoPrincipal.put("117","Titular de Cartório");
        ocupacaoPrincipal.put("118","Dirigente ou administrador de partido político, organização patronal, sindical, filantrópica e religiosa");
        ocupacaoPrincipal.put("120","Dirigente, presidente e diretor de empresa industrial, comercial ou prestadora de serviços");
        ocupacaoPrincipal.put("121","Presidente e diretor de empresa pública e sociedade de economia mista");
        ocupacaoPrincipal.put("130","Gerente ou supervisor de empresa industrial, comercial ou prestadora de serviços");
        ocupacaoPrincipal.put("131","Gerente ou supervisor de empresa pública e sociedade de economia mista");
        ocupacaoPrincipal.put("140","Presidente, diretor, gerente e supervisor de organismo internacional e de organização não-governamental");
        ocupacaoPrincipal.put("211","Matemático, estatístico, atuário e afins");
        ocupacaoPrincipal.put("212","Analista de sistemas, desenvolvedor de software, administrador de redes e bancos de dados e outros especialistas em informática (exceto técnico)");
        ocupacaoPrincipal.put("213","Físico, químico, meteorologista, geólogo, oceanógrafo e afins");
        ocupacaoPrincipal.put("214","Engenheiro, arquiteto e afins");
        ocupacaoPrincipal.put("215","Piloto de aeronaves, comandante de embarcações e oficiais de máquinas");
        ocupacaoPrincipal.put("221","Biólogo, biomédico e afins");
        ocupacaoPrincipal.put("222","Agrônomo e afins");
        ocupacaoPrincipal.put("224","Profissional da educação física (exceto professor)");
        ocupacaoPrincipal.put("225","Médico");
        ocupacaoPrincipal.put("226","Odontólogo");
        ocupacaoPrincipal.put("227","Enfermeiro de nível superior, nutricionista, farmacêutico e afins");
        ocupacaoPrincipal.put("228","Veterinário, patologista (veterinário) e zootecnista");
        ocupacaoPrincipal.put("229","Fonoaudiólogo, fisioterapeuta, terapeuta ocupacional e afins");
        ocupacaoPrincipal.put("241","Advogado");
        ocupacaoPrincipal.put("250","Sociólogo e cientista político");
        ocupacaoPrincipal.put("251","Antropólogo e arqueólogo");
        ocupacaoPrincipal.put("252","Economista, administrador, contador, auditor e afins");
        ocupacaoPrincipal.put("253","Profissional de marketing, de publicidade e de comercialização");
        ocupacaoPrincipal.put("254","Psicanalista");
        ocupacaoPrincipal.put("255","Psicólogo");
        ocupacaoPrincipal.put("256","Geógrafo");
        ocupacaoPrincipal.put("257","Historiador");
        ocupacaoPrincipal.put("258","Assistente social e economista doméstico");
        ocupacaoPrincipal.put("259","Filósofo");
        ocupacaoPrincipal.put("261","Jornalista e repórter");
        ocupacaoPrincipal.put("263","Sacerdote ou membro de ordens ou seitas religiosas");
        ocupacaoPrincipal.put("264","Tradutor, intérprete, filólogo");
        ocupacaoPrincipal.put("265","Bibliotecário, documentalista, arquivólogo, museólogo");
        ocupacaoPrincipal.put("266","Escritor, crítico, redator");
        ocupacaoPrincipal.put("271","Locutor, comentarista");
        ocupacaoPrincipal.put("272","Ator, diretor de espetáculos");
        ocupacaoPrincipal.put("273","Cantor e compositor");
        ocupacaoPrincipal.put("274","Músico, arranjador, regente de orquestra ou coral");
        ocupacaoPrincipal.put("275","Desenhista industrial (designer), escultor, pintor artístico e afins");
        ocupacaoPrincipal.put("276","Cenógrafo, decorador de interiores");
        ocupacaoPrincipal.put("277","Empresário e produtor de espetáculos");
        ocupacaoPrincipal.put("279","Outros profissionais do espetáculo e das artes");
        ocupacaoPrincipal.put("290","Professor na educação infantil");
        ocupacaoPrincipal.put("291","Professor do ensino fundamental");
        ocupacaoPrincipal.put("292","Professor do ensino médio");
        ocupacaoPrincipal.put("293","Professor do ensino profissional");
        ocupacaoPrincipal.put("294","Professor do ensino superior");
        ocupacaoPrincipal.put("295","Instrutor e professor de escolas livres");
        ocupacaoPrincipal.put("296","Pedagogo, orientador educacional");
        ocupacaoPrincipal.put("311","Técnico em ciências físicas e químicas");
        ocupacaoPrincipal.put("312","Técnico em construção civil, de edificações e obras de infraestrutura");
        ocupacaoPrincipal.put("313","Técnico em eletroeletrônica e fotônica");
        ocupacaoPrincipal.put("314","Técnico em metalmecânica");
        ocupacaoPrincipal.put("316","Técnico em mineralogia e geologia");
        ocupacaoPrincipal.put("317","Técnico em informática");
        ocupacaoPrincipal.put("318","Desenhista técnico e modelista");
        ocupacaoPrincipal.put("319","Outros técnicos de nível médio das ciências físicas, químicas, engenharia e afins");
        ocupacaoPrincipal.put("320","Técnico em biologia");
        ocupacaoPrincipal.put("321","Técnico da produção agropecuária");
        ocupacaoPrincipal.put("322","Técnico da ciência da saúde humana");
        ocupacaoPrincipal.put("323","Técnico da ciência da saúde animal");
        ocupacaoPrincipal.put("324","Técnico de laboratório, Raios-X e outros equipamentos e instrumentos de diagnóstico");
        ocupacaoPrincipal.put("325","Técnico de bioquímica e da biotecnologia");
        ocupacaoPrincipal.put("328","Técnico de conservação, dissecação e empalhamento de corpos");
        ocupacaoPrincipal.put("341","Técnico em navegação aérea, marítima, fluvial e metroferroviária");
        ocupacaoPrincipal.put("342","Técnico em transportes (logística)");
        ocupacaoPrincipal.put("351","Técnico das ciências administrativas e contábeis");
        ocupacaoPrincipal.put("352","Técnico de inspeção, fiscalização e coordenação administrativa");
        ocupacaoPrincipal.put("353","Agente de Bolsa de Valores, câmbio e outros serviços financeiros");
        ocupacaoPrincipal.put("354","Agente e representante comercial, corretor, leiloeiro e afins");
        ocupacaoPrincipal.put("355","Corretor e Administrador de Imóveis");
        ocupacaoPrincipal.put("371","Técnico de serviços culturais");
        ocupacaoPrincipal.put("372","Cinegrafista, fotógrafo e outros técnicos em operação de máquinas de tratamento de dados");
        ocupacaoPrincipal.put("373","Técnico em operação de estações de rádio e televisão");
        ocupacaoPrincipal.put("374","Técnico em operação de aparelhos de sonorização, cenografia e projeção");
        ocupacaoPrincipal.put("375","Decorador e vitrinista");
        ocupacaoPrincipal.put("376","Apresentador, artistas de artes populares e modelos");
        ocupacaoPrincipal.put("377","Atleta, desportista e afins");
        ocupacaoPrincipal.put("391","Outros técnicos de nível médio");
        ocupacaoPrincipal.put("410","Bancário, economiário, escriturário, secretário, assistente e auxiliar administrativo");
        ocupacaoPrincipal.put("420","Trabalhador de atendimento ao público, caixa, despachante, recenseador e afins");
        ocupacaoPrincipal.put("511","Comissário de bordo, guia de turismo, agente de viagem e afins");
        ocupacaoPrincipal.put("512","Trabalhador dos serviços domésticos em geral");
        ocupacaoPrincipal.put("513","Trabalhador dos serviços de hotelaria e alimentação");
        ocupacaoPrincipal.put("514","Trabalhador dos serviços de administração, conservação e manutenção de edifícios");
        ocupacaoPrincipal.put("515","Trabalhador dos serviços de saúde");
        ocupacaoPrincipal.put("516","Trabalhador dos serviços de embelezamento e cuidados pessoais");
        ocupacaoPrincipal.put("517","Trabalhador dos serviços de proteção e segurança (exceto militar)");
        ocupacaoPrincipal.put("518","Motorista e condutor do transporte de passageiros (motorista de taxi, ônibus, pequena embarcação etc)");
        ocupacaoPrincipal.put("519","Outros trabalhadores de serviços diversos");
        ocupacaoPrincipal.put("529","Vendedor e prestador de serviços do comércio, ambulante, caixeiro-viajante e camelô");
        ocupacaoPrincipal.put("610","Produtor na exploração agropecuária");
        ocupacaoPrincipal.put("620","Trabalhador na exploração agropecuária");
        ocupacaoPrincipal.put("630","Pescador, caçador e extrativista florestal");
        ocupacaoPrincipal.put("640","Operador de máquina agropecuária e florestal");
        ocupacaoPrincipal.put("710","Trabalhador da indústria extrativa e da construção civil");
        ocupacaoPrincipal.put("720","Trabalhador da transformação de metais e compósitos");
        ocupacaoPrincipal.put("730","Trabalhador da fabricação e instalação eletroeletrônica");
        ocupacaoPrincipal.put("740","Montador de aparelhos e instrumentos de precisão e musicais");
        ocupacaoPrincipal.put("750","Joalheiro, vidreiro, ceramista e afins");
        ocupacaoPrincipal.put("760","Trabalhador das indústrias têxteis, do curtimento, do vestuário e das artes gráficas");
        ocupacaoPrincipal.put("770","Trabalhador das indústrias de madeira e do mobiliário");
        ocupacaoPrincipal.put("780","Condutor e operador de robôs, veículos de equipamentos de movimentação de carga e afins");
        ocupacaoPrincipal.put("810","Trabalhador das indústrias química, petroquímica, borracha e plástico e afins");
        ocupacaoPrincipal.put("820","Trabalhador de instalações siderúrgicas e de materiais de construção");
        ocupacaoPrincipal.put("830","Trabalhador de instalações e máquinas de fabricação de celulose e papel");
        ocupacaoPrincipal.put("840","Trabalhador da fabricação de alimentos, bebidas, fumo e de agroindústrias");
        ocupacaoPrincipal.put("860","Operador de instalações de produção e distribuição de energia");
        ocupacaoPrincipal.put("870","Trabalhador de outras instalações agroindustriais");
        ocupacaoPrincipal.put("900","Trabalhador de reparação e manutenção");
    }
}
