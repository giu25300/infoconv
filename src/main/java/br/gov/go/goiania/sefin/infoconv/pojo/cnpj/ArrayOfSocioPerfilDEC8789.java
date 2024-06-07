
package br.gov.go.goiania.sefin.infoconv.pojo.cnpj;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSocioPerfilDEC8789 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSocioPerfilDEC8789"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SocioPerfilDEC8789" type="{https://acesso.infoconv.receita.fazenda.gov.br/ws/cnpj/}SocioPerfilDEC8789" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSocioPerfilDEC8789", propOrder = {
    "socioPerfilDEC8789"
})
public class ArrayOfSocioPerfilDEC8789 {

    @XmlElement(name = "SocioPerfilDEC8789", nillable = true)
    protected List<SocioPerfilDEC8789> socioPerfilDEC8789;

    /**
     * Gets the value of the socioPerfilDEC8789 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socioPerfilDEC8789 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocioPerfilDEC8789().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocioPerfilDEC8789 }
     * 
     * 
     */
    public List<SocioPerfilDEC8789> getSocioPerfilDEC8789() {
        if (socioPerfilDEC8789 == null) {
            socioPerfilDEC8789 = new ArrayList<SocioPerfilDEC8789>();
        }
        return this.socioPerfilDEC8789;
    }

}
