package br.gov.go.goiania.sefin.infoconv.service;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

public class Config {
    private String certificadoDigital;
    private String cpfConsultante;
    private String senhaCertificadoDigital;
    private String trustStoreCertificado;
    public String getCertificadoDigital() {
        return certificadoDigital;
    }
    public String getCpfConsultante() {
        return cpfConsultante;
    }
    public String getSenhaCertificadoDigital() {
        return senhaCertificadoDigital;
    }
    public String getTrustStoreCertificado() {
        return trustStoreCertificado;
    }
    public void setCertificadoDigital(String certificadoDigital) {
        this.certificadoDigital = certificadoDigital;
    }
    public void setCpfConsultante(String cpfConsultante) {
        this.cpfConsultante = cpfConsultante;
    }
    public void setSenhaCertificadoDigital(String senhaCertificadoDigital) {
        this.senhaCertificadoDigital = senhaCertificadoDigital;
    }
    public void setTrustStoreCertificado(String trustStoreCertificado) {
        this.trustStoreCertificado = trustStoreCertificado;
    }

    void validaConfiguracao() {
        if (certificadoDigital.isEmpty()) {
            throw new RuntimeException("Certificado Digital não informado.");
        }
        if (cpfConsultante.isEmpty()) {
            throw new RuntimeException("Cpf do consultante não informado.");
        }
        if (senhaCertificadoDigital.isEmpty()) {
            throw new RuntimeException("Senha do certificado não informado.");
        }
        if (trustStoreCertificado.isEmpty()) {
            throw new RuntimeException("Cadeia do certificado público não informado.");
        }
    }
    void carregaChaves(Object o) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException, UnrecoverableKeyException, KeyManagementException {
        validaConfiguracao();

        KeyStore ks = KeyStore.getInstance("pkcs12");
        ks.load(new FileInputStream(getCertificadoDigital()), getSenhaCertificadoDigital().toCharArray());

        KeyStore jks = KeyStore.getInstance("JKS");
        jks.load(new FileInputStream(getTrustStoreCertificado()), null);

        for (Enumeration<String> t = ks.aliases(); t.hasMoreElements(); ) {
            String alias = t.nextElement();
//                System.out.println("@:" + alias);
            if (ks.isKeyEntry(alias)) {
                Certificate[] a = ks.getCertificateChain(alias);
                for (int i = 0; i < a.length; i++) {
                    X509Certificate x509 = (X509Certificate) a[i];
//                        System.out.println(x509.getSubjectDN().toString());
                    if (i > 0)
                        jks.setCertificateEntry(x509.getSubjectDN().toString(), x509);
//                        System.out.println(ks.getCertificateAlias(x509));
//                        System.out.println("ok");
                }
            }
        }
        KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
        kmf.init(ks, getSenhaCertificadoDigital().toCharArray());

        TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
        tmf.init(jks);

        SSLContext ctx = SSLContext.getInstance("TLS");
        ctx.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

        // Set the new TrustManager in the client.
        HTTPConduit httpConduit = (HTTPConduit) ClientProxy.getClient(o).getConduit();
        TLSClientParameters tlsCP = new TLSClientParameters();
        httpConduit.setTlsClientParameters(tlsCP);
        tlsCP.setSSLSocketFactory(ctx.getSocketFactory());
    }

//    private static Config setaConfig() {
//        Config config = new Config();
//        config.setCertificadoDigital("C:\\xampp1\\htdocs\\certificado\\152962_INFOCONV.pfx");
//        config.setCpfConsultante("02705023194");
//        config.setSenhaConsultante("159357");
//        config.setTrustStoreCertificado("C:\\xampp1\\htdocs\\certificado\\servidorcadeias-PROD.trustStore");
//
//        return config;
//    }
}