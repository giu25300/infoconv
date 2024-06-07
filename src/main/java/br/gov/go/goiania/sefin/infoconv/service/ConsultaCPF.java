package br.gov.go.goiania.sefin.infoconv.service;

import br.gov.go.goiania.sefin.infoconv.pojo.cpf.ArrayOfPessoaPerfilDEC8789;
import br.gov.go.goiania.sefin.infoconv.pojo.cpf.ConsultarCPFService;
import br.gov.go.goiania.sefin.infoconv.pojo.cpf.ConsultarCPFSoap;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

public class ConsultaCPF extends ConsultarCPFService {
    private Config config;
    private ConsultarCPFSoap t;
    public Config getConfig() {
        return config;
    }
    public void setConfig(Config config) {
        this.config = config;
    }

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
        t = super.getConsultarCPFSoap();

        config.carregaChaves(t);
    }

    /***
     * Efetua consulta cpf no infoconv
     * @param listaCPF - até 50 cpf não formatado devem ser informados, separador por ;
     * @return resultado da consulta no infoconv
     */
    public ArrayOfPessoaPerfilDEC8789 consultaCPF(String listaCPF) {
        if (config==null){
            throw new RuntimeException("Configuração não informada.");
        }
        config.validaConfiguracao();

        if (listaCPF.isEmpty()) {
            throw new RuntimeException("Nenhum cpf informado.");
        }

        if (t==null){
            throw new RuntimeException("Método inicializa não invocado.");
        }

        return t.consultarCPFPDEC8789(listaCPF, config.getCpfConsultante());
    }
}