package br.gov.go.goiania.sefin.infoconv.service;

import br.gov.go.goiania.sefin.infoconv.pojo.cnpj.ArrayOfCNPJPerfilDEC8789;
import br.gov.go.goiania.sefin.infoconv.pojo.cnpj.ConsultarCNPJService;
import br.gov.go.goiania.sefin.infoconv.pojo.cnpj.ConsultarCNPJSoap;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

public class ConsultaCNPJ extends ConsultarCNPJService {
    private Config config;
    public Config getConfig() {
        return config;
    }
    public void setConfig(Config config) {
        this.config = config;
    }
    private ConsultarCNPJSoap t;

    /***
     * Carrega as chaves do certificado digital e configura a conexão ssl
     * @throws UnrecoverableKeyException
     * @throws CertificateException
     * @throws KeyStoreException
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    public void inicializa() throws UnrecoverableKeyException, CertificateException, KeyStoreException, IOException, NoSuchAlgorithmException, KeyManagementException {
        t = super.getConsultarCNPJSoap();

        config.carregaChaves(t);
    }

    /***
     * Efetua consulta cnpj no infoconv
     * @param cnpj - somente um cnpj não formatado deve ser informado
     * @return resultado da consulta no infoconv
     */
    public ArrayOfCNPJPerfilDEC8789 consultaCNPJ(String cnpj){
        if (config==null){
            throw new RuntimeException("Configuração não informada.");
        }
        config.validaConfiguracao();

        if (cnpj.isEmpty()) {
            throw new RuntimeException("Nenhum cnpj informado.");
        }

        if (t==null){
            throw new RuntimeException("Método inicializa não invocado.");
        }

        return t.consultarCNPJPDEC8789(cnpj, config.getCpfConsultante());
    }
}