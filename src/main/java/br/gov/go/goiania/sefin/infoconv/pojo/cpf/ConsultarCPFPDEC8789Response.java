
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
 *         &lt;element name="ConsultarCPFPDEC8789Result" type="{https://acesso.infoconv.receita.fazenda.gov.br/ws/cpf/}ArrayOfPessoaPerfilDEC8789" minOccurs="0"/&gt;
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
    "consultarCPFPDEC8789Result"
})
@XmlRootElement(name = "ConsultarCPFPDEC8789Response")
public class ConsultarCPFPDEC8789Response {

    @XmlElement(name = "ConsultarCPFPDEC8789Result")
    protected ArrayOfPessoaPerfilDEC8789 consultarCPFPDEC8789Result;

    /**
     * Obtém o valor da propriedade consultarCPFPDEC8789Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPessoaPerfilDEC8789 }
     *     
     */
    public ArrayOfPessoaPerfilDEC8789 getConsultarCPFPDEC8789Result() {
        return consultarCPFPDEC8789Result;
    }

    /**
     * Define o valor da propriedade consultarCPFPDEC8789Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPessoaPerfilDEC8789 }
     *     
     */
    public void setConsultarCPFPDEC8789Result(ArrayOfPessoaPerfilDEC8789 value) {
        this.consultarCPFPDEC8789Result = value;
    }

}
