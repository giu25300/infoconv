
package br.gov.go.goiania.sefin.infoconv.pojo.cpf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PessoaPerfilDEC8789 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PessoaPerfilDEC8789"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacaoCadastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResidenteExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPaisExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomePaisExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeMae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NaturezaOcupacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OcupacaoPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExercicioOcupacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoLogradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Logradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroLogradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnidadeAdministrativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnoObito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estrangeiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodPaisNacionalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomePaisNacionalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataInscricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoMunicipioNaturalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomeMunicipioNaturalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UFMunicipioNaturalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PessoaPerfilDEC8789", propOrder = {
    "cpf",
    "nome",
    "situacaoCadastral",
    "residenteExterior",
    "codigoPaisExterior",
    "nomePaisExterior",
    "nomeMae",
    "dataNascimento",
    "sexo",
    "naturezaOcupacao",
    "ocupacaoPrincipal",
    "exercicioOcupacao",
    "tipoLogradouro",
    "logradouro",
    "numeroLogradouro",
    "complemento",
    "bairro",
    "cep",
    "uf",
    "codigoMunicipio",
    "municipio",
    "ddd",
    "telefone",
    "unidadeAdministrativa",
    "anoObito",
    "estrangeiro",
    "codPaisNacionalidade",
    "nomePaisNacionalidade",
    "dataAtualizacao",
    "dataInscricao",
    "codigoMunicipioNaturalidade",
    "nomeMunicipioNaturalidade",
    "ufMunicipioNaturalidade",
    "erro"
})
public class PessoaPerfilDEC8789 {

    @XmlElement(name = "CPF")
    protected String cpf;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "SituacaoCadastral")
    protected String situacaoCadastral;
    @XmlElement(name = "ResidenteExterior")
    protected String residenteExterior;
    @XmlElement(name = "CodigoPaisExterior")
    protected String codigoPaisExterior;
    @XmlElement(name = "NomePaisExterior")
    protected String nomePaisExterior;
    @XmlElement(name = "NomeMae")
    protected String nomeMae;
    @XmlElement(name = "DataNascimento")
    protected String dataNascimento;
    @XmlElement(name = "Sexo")
    protected String sexo;
    @XmlElement(name = "NaturezaOcupacao")
    protected String naturezaOcupacao;
    @XmlElement(name = "OcupacaoPrincipal")
    protected String ocupacaoPrincipal;
    @XmlElement(name = "ExercicioOcupacao")
    protected String exercicioOcupacao;
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
    @XmlElement(name = "Municipio")
    protected String municipio;
    @XmlElement(name = "DDD")
    protected String ddd;
    @XmlElement(name = "Telefone")
    protected String telefone;
    @XmlElement(name = "UnidadeAdministrativa")
    protected String unidadeAdministrativa;
    @XmlElement(name = "AnoObito")
    protected String anoObito;
    @XmlElement(name = "Estrangeiro")
    protected String estrangeiro;
    @XmlElement(name = "CodPaisNacionalidade")
    protected String codPaisNacionalidade;
    @XmlElement(name = "NomePaisNacionalidade")
    protected String nomePaisNacionalidade;
    @XmlElement(name = "DataAtualizacao")
    protected String dataAtualizacao;
    @XmlElement(name = "DataInscricao")
    protected String dataInscricao;
    @XmlElement(name = "CodigoMunicipioNaturalidade")
    protected String codigoMunicipioNaturalidade;
    @XmlElement(name = "NomeMunicipioNaturalidade")
    protected String nomeMunicipioNaturalidade;
    @XmlElement(name = "UFMunicipioNaturalidade")
    protected String ufMunicipioNaturalidade;
    @XmlElement(name = "Erro")
    protected String erro;

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
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
     * Obtém o valor da propriedade residenteExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenteExterior() {
        return residenteExterior;
    }

    /**
     * Define o valor da propriedade residenteExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenteExterior(String value) {
        this.residenteExterior = value;
    }

    /**
     * Obtém o valor da propriedade codigoPaisExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisExterior() {
        return codigoPaisExterior;
    }

    /**
     * Define o valor da propriedade codigoPaisExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisExterior(String value) {
        this.codigoPaisExterior = value;
    }

    /**
     * Obtém o valor da propriedade nomePaisExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePaisExterior() {
        return nomePaisExterior;
    }

    /**
     * Define o valor da propriedade nomePaisExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePaisExterior(String value) {
        this.nomePaisExterior = value;
    }

    /**
     * Obtém o valor da propriedade nomeMae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * Define o valor da propriedade nomeMae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMae(String value) {
        this.nomeMae = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascimento(String value) {
        this.dataNascimento = value;
    }

    /**
     * Obtém o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtém o valor da propriedade naturezaOcupacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturezaOcupacao() {
        return naturezaOcupacao;
    }

    /**
     * Define o valor da propriedade naturezaOcupacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturezaOcupacao(String value) {
        this.naturezaOcupacao = value;
    }

    /**
     * Obtém o valor da propriedade ocupacaoPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcupacaoPrincipal() {
        return ocupacaoPrincipal;
    }

    /**
     * Define o valor da propriedade ocupacaoPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcupacaoPrincipal(String value) {
        this.ocupacaoPrincipal = value;
    }

    /**
     * Obtém o valor da propriedade exercicioOcupacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExercicioOcupacao() {
        return exercicioOcupacao;
    }

    /**
     * Define o valor da propriedade exercicioOcupacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExercicioOcupacao(String value) {
        this.exercicioOcupacao = value;
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
     * Obtém o valor da propriedade municipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Define o valor da propriedade municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Obtém o valor da propriedade ddd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDD() {
        return ddd;
    }

    /**
     * Define o valor da propriedade ddd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDD(String value) {
        this.ddd = value;
    }

    /**
     * Obtém o valor da propriedade telefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o valor da propriedade telefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone(String value) {
        this.telefone = value;
    }

    /**
     * Obtém o valor da propriedade unidadeAdministrativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeAdministrativa() {
        return unidadeAdministrativa;
    }

    /**
     * Define o valor da propriedade unidadeAdministrativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeAdministrativa(String value) {
        this.unidadeAdministrativa = value;
    }

    /**
     * Obtém o valor da propriedade anoObito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoObito() {
        return anoObito;
    }

    /**
     * Define o valor da propriedade anoObito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoObito(String value) {
        this.anoObito = value;
    }

    /**
     * Obtém o valor da propriedade estrangeiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstrangeiro() {
        return estrangeiro;
    }

    /**
     * Define o valor da propriedade estrangeiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstrangeiro(String value) {
        this.estrangeiro = value;
    }

    /**
     * Obtém o valor da propriedade codPaisNacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPaisNacionalidade() {
        return codPaisNacionalidade;
    }

    /**
     * Define o valor da propriedade codPaisNacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPaisNacionalidade(String value) {
        this.codPaisNacionalidade = value;
    }

    /**
     * Obtém o valor da propriedade nomePaisNacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePaisNacionalidade() {
        return nomePaisNacionalidade;
    }

    /**
     * Define o valor da propriedade nomePaisNacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePaisNacionalidade(String value) {
        this.nomePaisNacionalidade = value;
    }

    /**
     * Obtém o valor da propriedade dataAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Define o valor da propriedade dataAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAtualizacao(String value) {
        this.dataAtualizacao = value;
    }

    /**
     * Obtém o valor da propriedade dataInscricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInscricao() {
        return dataInscricao;
    }

    /**
     * Define o valor da propriedade dataInscricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInscricao(String value) {
        this.dataInscricao = value;
    }

    /**
     * Obtém o valor da propriedade codigoMunicipioNaturalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMunicipioNaturalidade() {
        return codigoMunicipioNaturalidade;
    }

    /**
     * Define o valor da propriedade codigoMunicipioNaturalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMunicipioNaturalidade(String value) {
        this.codigoMunicipioNaturalidade = value;
    }

    /**
     * Obtém o valor da propriedade nomeMunicipioNaturalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMunicipioNaturalidade() {
        return nomeMunicipioNaturalidade;
    }

    /**
     * Define o valor da propriedade nomeMunicipioNaturalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMunicipioNaturalidade(String value) {
        this.nomeMunicipioNaturalidade = value;
    }

    /**
     * Obtém o valor da propriedade ufMunicipioNaturalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFMunicipioNaturalidade() {
        return ufMunicipioNaturalidade;
    }

    /**
     * Define o valor da propriedade ufMunicipioNaturalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFMunicipioNaturalidade(String value) {
        this.ufMunicipioNaturalidade = value;
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
