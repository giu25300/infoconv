
package br.gov.go.goiania.sefin.infoconv.pojo.cpf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListaDeCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPFUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listaDeCPF",
    "cpfUsuario"
})
@XmlRootElement(name = "ConsultarCPFPDEC8789")
public class ConsultarCPFPDEC8789 {

    @XmlElement(name = "ListaDeCPF")
    protected String listaDeCPF;
    @XmlElement(name = "CPFUsuario")
    protected String cpfUsuario;

    /**
     * Obtém o valor da propriedade listaDeCPF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaDeCPF() {
        return listaDeCPF;
    }

    /**
     * Define o valor da propriedade listaDeCPF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaDeCPF(String value) {
        this.listaDeCPF = value;
    }

    /**
     * Obtém o valor da propriedade cpfUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPFUsuario() {
        return cpfUsuario;
    }

    /**
     * Define o valor da propriedade cpfUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPFUsuario(String value) {
        this.cpfUsuario = value;
    }

}
