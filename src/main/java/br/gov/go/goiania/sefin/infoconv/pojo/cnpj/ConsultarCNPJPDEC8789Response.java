
package br.gov.go.goiania.sefin.infoconv.pojo.cnpj;

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
 *         &lt;element name="ConsultarCNPJPDEC8789Result" type="{https://acesso.infoconv.receita.fazenda.gov.br/ws/cnpj/}ArrayOfCNPJPerfilDEC8789" minOccurs="0"/&gt;
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
    "consultarCNPJPDEC8789Result"
})
@XmlRootElement(name = "ConsultarCNPJPDEC8789Response")
public class ConsultarCNPJPDEC8789Response {

    @XmlElement(name = "ConsultarCNPJPDEC8789Result")
    protected ArrayOfCNPJPerfilDEC8789 consultarCNPJPDEC8789Result;

    /**
     * Obtém o valor da propriedade consultarCNPJPDEC8789Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCNPJPerfilDEC8789 }
     *     
     */
    public ArrayOfCNPJPerfilDEC8789 getConsultarCNPJPDEC8789Result() {
        return consultarCNPJPDEC8789Result;
    }

    /**
     * Define o valor da propriedade consultarCNPJPDEC8789Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCNPJPerfilDEC8789 }
     *     
     */
    public void setConsultarCNPJPDEC8789Result(ArrayOfCNPJPerfilDEC8789 value) {
        this.consultarCNPJPDEC8789Result = value;
    }

}
