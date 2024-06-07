
package br.gov.go.goiania.sefin.infoconv.pojo.cnpj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CNPJPerfilDEC8789 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CNPJPerfilDEC8789"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estabelecimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeEmpresarial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeFantasia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacaoCadastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MotivoSituacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataSituacaoCadastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CidadeExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomePais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NaturezaJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataAbertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CNAEPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CNAESecundario" type="{https://acesso.infoconv.receita.fazenda.gov.br/ws/cnpj/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="TipoLogradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Logradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroLogradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPFResponsavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeResponsavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CapitalSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sociedade" type="{https://acesso.infoconv.receita.fazenda.gov.br/ws/cnpj/}ArrayOfSocioPerfilDEC8789" minOccurs="0"/&gt;
 *         &lt;element name="Porte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpcaoSimples" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpcaoSIMEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacaoEspecial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataSituacaoEspecial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CNPJPerfilDEC8789", propOrder = {
    "cnpj",
    "estabelecimento",
    "nomeEmpresarial",
    "nomeFantasia",
    "situacaoCadastral",
    "motivoSituacao",
    "dataSituacaoCadastral",
    "cidadeExterior",
    "codigoPais",
    "nomePais",
    "naturezaJuridica",
    "dataAbertura",
    "cnaePrincipal",
    "cnaeSecundario",
    "tipoLogradouro",
    "logradouro",
    "numeroLogradouro",
    "complemento",
    "bairro",
    "cep",
    "uf",
    "codigoMunicipio",
    "nomeMunicipio",
    "referencia",
    "ddd1",
    "telefone1",
    "ddd2",
    "telefone2",
    "email",
    "cpfResponsavel",
    "nomeResponsavel",
    "capitalSocial",
    "sociedade",
    "porte",
    "opcaoSimples",
    "opcaoSIMEI",
    "situacaoEspecial",
    "dataSituacaoEspecial",
    "erro"
})
public class CNPJPerfilDEC8789 {

    @XmlElement(name = "CNPJ")
    protected String cnpj;
    @XmlElement(name = "Estabelecimento")
    protected String estabelecimento;
    @XmlElement(name = "NomeEmpresarial")
    protected String nomeEmpresarial;
    @XmlElement(name = "NomeFantasia")
    protected String nomeFantasia;
    @XmlElement(name = "SituacaoCadastral")
    protected String situacaoCadastral;
    @XmlElement(name = "MotivoSituacao")
    protected String motivoSituacao;
    @XmlElement(name = "DataSituacaoCadastral")
    protected String dataSituacaoCadastral;
    @XmlElement(name = "CidadeExterior")
    protected String cidadeExterior;
    @XmlElement(name = "CodigoPais")
    protected String codigoPais;
    @XmlElement(name = "NomePais")
    protected String nomePais;
    @XmlElement(name = "NaturezaJuridica")
    protected String naturezaJuridica;
    @XmlElement(name = "DataAbertura")
    protected String dataAbertura;
    @XmlElement(name = "CNAEPrincipal")
    protected String cnaePrincipal;
    @XmlElement(name = "CNAESecundario")
    protected ArrayOfString cnaeSecundario;
    @XmlElement(name = "TipoLogradouro")
    protected String tipoLogradouro;
    @XmlElement(name = "Logradouro")
    protected String logradouro;
    @XmlElement(name = "NumeroLogradouro")
    protected String numeroLogradouro;
    @XmlElement(name = "Complemento")
    protected String complemento;
    @XmlElement(name = "Bairro")
    protected String bairro;
    @XmlElement(name = "CEP")
    protected String cep;
    @XmlElement(name = "UF")
    protected String uf;
    @XmlElement(name = "CodigoMunicipio")
    protected String codigoMunicipio;
    @XmlElement(name = "NomeMunicipio")
    protected String nomeMunicipio;
    @XmlElement(name = "Referencia")
    protected String referencia;
    @XmlElement(name = "DDD1")
    protected String ddd1;
    @XmlElement(name = "Telefone1")
    protected String telefone1;
    @XmlElement(name = "DDD2")
    protected String ddd2;
    @XmlElement(name = "Telefone2")
    protected String telefone2;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "CPFResponsavel")
    protected String cpfResponsavel;
    @XmlElement(name = "NomeResponsavel")
    protected String nomeResponsavel;
    @XmlElement(name = "CapitalSocial")
    protected String capitalSocial;
    @XmlElement(name = "Sociedade")
    protected ArrayOfSocioPerfilDEC8789 sociedade;
    @XmlElement(name = "Porte")
    protected String porte;
    @XmlElement(name = "OpcaoSimples")
    protected String opcaoSimples;
    @XmlElement(name = "OpcaoSIMEI")
    protected String opcaoSIMEI;
    @XmlElement(name = "SituacaoEspecial")
    protected String situacaoEspecial;
    @XmlElement(name = "DataSituacaoEspecial")
    protected String dataSituacaoEspecial;
    @XmlElement(name = "Erro")
    protected String erro;

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJ(String value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade estabelecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstabelecimento() {
        return estabelecimento;
    }

    /**
     * Define o valor da propriedade estabelecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstabelecimento(String value) {
        this.estabelecimento = value;
    }

    /**
     * Obtém o valor da propriedade nomeEmpresarial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    /**
     * Define o valor da propriedade nomeEmpresarial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEmpresarial(String value) {
        this.nomeEmpresarial = value;
    }

    /**
     * Obtém o valor da propriedade nomeFantasia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * Define o valor da propriedade nomeFantasia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFantasia(String value) {
        this.nomeFantasia = value;
    }

    /**
     * Obtém o valor da propriedade situacaoCadastral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }

    /**
     * Define o valor da propriedade situacaoCadastral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoCadastral(String value) {
        this.situacaoCadastral = value;
    }

    /**
     * Obtém o valor da propriedade motivoSituacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoSituacao() {
        return motivoSituacao;
    }

    /**
     * Define o valor da propriedade motivoSituacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoSituacao(String value) {
        this.motivoSituacao = value;
    }

    /**
     * Obtém o valor da propriedade dataSituacaoCadastral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSituacaoCadastral() {
        return dataSituacaoCadastral;
    }

    /**
     * Define o valor da propriedade dataSituacaoCadastral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSituacaoCadastral(String value) {
        this.dataSituacaoCadastral = value;
    }

    /**
     * Obtém o valor da propriedade cidadeExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeExterior() {
        return cidadeExterior;
    }

    /**
     * Define o valor da propriedade cidadeExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeExterior(String value) {
        this.cidadeExterior = value;
    }

    /**
     * Obtém o valor da propriedade codigoPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define o valor da propriedade codigoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Obtém o valor da propriedade nomePais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePais() {
        return nomePais;
    }

    /**
     * Define o valor da propriedade nomePais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePais(String value) {
        this.nomePais = value;
    }

    /**
     * Obtém o valor da propriedade naturezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturezaJuridica() {
        return naturezaJuridica;
    }

    /**
     * Define o valor da propriedade naturezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturezaJuridica(String value) {
        this.naturezaJuridica = value;
    }

    /**
     * Obtém o valor da propriedade dataAbertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAbertura() {
        return dataAbertura;
    }

    /**
     * Define o valor da propriedade dataAbertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAbertura(String value) {
        this.dataAbertura = value;
    }

    /**
     * Obtém o valor da propriedade cnaePrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNAEPrincipal() {
        return cnaePrincipal;
    }

    /**
     * Define o valor da propriedade cnaePrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNAEPrincipal(String value) {
        this.cnaePrincipal = value;
    }

    /**
     * Obtém o valor da propriedade cnaeSecundario.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCNAESecundario() {
        return cnaeSecundario;
    }

    /**
     * Define o valor da propriedade cnaeSecundario.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCNAESecundario(ArrayOfString value) {
        this.cnaeSecundario = value;
    }

    /**
     * Obtém o valor da propriedade tipoLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    /**
     * Define o valor da propriedade tipoLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLogradouro(String value) {
        this.tipoLogradouro = value;
    }

    /**
     * Obtém o valor da propriedade logradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Define o valor da propriedade logradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouro(String value) {
        this.logradouro = value;
    }

    /**
     * Obtém o valor da propriedade numeroLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLogradouro() {
        return numeroLogradouro;
    }

    /**
     * Define o valor da propriedade numeroLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLogradouro(String value) {
        this.numeroLogradouro = value;
    }

    /**
     * Obtém o valor da propriedade complemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEP() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEP(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUF() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUF(String value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade codigoMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Define o valor da propriedade codigoMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMunicipio(String value) {
        this.codigoMunicipio = value;
    }

    /**
     * Obtém o valor da propriedade nomeMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    /**
     * Define o valor da propriedade nomeMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMunicipio(String value) {
        this.nomeMunicipio = value;
    }

    /**
     * Obtém o valor da propriedade referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define o valor da propriedade referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Obtém o valor da propriedade ddd1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDD1() {
        return ddd1;
    }

    /**
     * Define o valor da propriedade ddd1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDD1(String value) {
        this.ddd1 = value;
    }

    /**
     * Obtém o valor da propriedade telefone1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone1() {
        return telefone1;
    }

    /**
     * Define o valor da propriedade telefone1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone1(String value) {
        this.telefone1 = value;
    }

    /**
     * Obtém o valor da propriedade ddd2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDD2() {
        return ddd2;
    }

    /**
     * Define o valor da propriedade ddd2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDD2(String value) {
        this.ddd2 = value;
    }

    /**
     * Obtém o valor da propriedade telefone2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone2() {
        return telefone2;
    }

    /**
     * Define o valor da propriedade telefone2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone2(String value) {
        this.telefone2 = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade cpfResponsavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPFResponsavel() {
        return cpfResponsavel;
    }

    /**
     * Define o valor da propriedade cpfResponsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPFResponsavel(String value) {
        this.cpfResponsavel = value;
    }

    /**
     * Obtém o valor da propriedade nomeResponsavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    /**
     * Define o valor da propriedade nomeResponsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeResponsavel(String value) {
        this.nomeResponsavel = value;
    }

    /**
     * Obtém o valor da propriedade capitalSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalSocial() {
        return capitalSocial;
    }

    /**
     * Define o valor da propriedade capitalSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalSocial(String value) {
        this.capitalSocial = value;
    }

    /**
     * Obtém o valor da propriedade sociedade.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocioPerfilDEC8789 }
     *     
     */
    public ArrayOfSocioPerfilDEC8789 getSociedade() {
        return sociedade;
    }

    /**
     * Define o valor da propriedade sociedade.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocioPerfilDEC8789 }
     *     
     */
    public void setSociedade(ArrayOfSocioPerfilDEC8789 value) {
        this.sociedade = value;
    }

    /**
     * Obtém o valor da propriedade porte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorte() {
        return porte;
    }

    /**
     * Define o valor da propriedade porte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorte(String value) {
        this.porte = value;
    }

    /**
     * Obtém o valor da propriedade opcaoSimples.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcaoSimples() {
        return opcaoSimples;
    }

    /**
     * Define o valor da propriedade opcaoSimples.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcaoSimples(String value) {
        this.opcaoSimples = value;
    }

    /**
     * Obtém o valor da propriedade opcaoSIMEI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcaoSIMEI() {
        return opcaoSIMEI;
    }

    /**
     * Define o valor da propriedade opcaoSIMEI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcaoSIMEI(String value) {
        this.opcaoSIMEI = value;
    }

    /**
     * Obtém o valor da propriedade situacaoEspecial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoEspecial() {
        return situacaoEspecial;
    }

    /**
     * Define o valor da propriedade situacaoEspecial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoEspecial(String value) {
        this.situacaoEspecial = value;
    }

    /**
     * Obtém o valor da propriedade dataSituacaoEspecial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSituacaoEspecial() {
        return dataSituacaoEspecial;
    }

    /**
     * Define o valor da propriedade dataSituacaoEspecial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSituacaoEspecial(String value) {
        this.dataSituacaoEspecial = value;
    }

    /**
     * Obtém o valor da propriedade erro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErro() {
        return erro;
    }

    /**
     * Define o valor da propriedade erro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErro(String value) {
        this.erro = value;
    }

}
