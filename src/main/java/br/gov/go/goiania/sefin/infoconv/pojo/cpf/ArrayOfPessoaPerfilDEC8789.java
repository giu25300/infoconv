
package br.gov.go.goiania.sefin.infoconv.pojo.cpf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java de ArrayOfPessoaPerfilDEC8789 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPessoaPerfilDEC8789"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PessoaPerfilDEC8789" type="{https://acesso.infoconv.receita.fazenda.gov.br/ws/cpf/}PessoaPerfilDEC8789" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPessoaPerfilDEC8789", propOrder = {
    "pessoaPerfilDEC8789"
})
public class ArrayOfPessoaPerfilDEC8789 {

    @XmlElement(name = "PessoaPerfilDEC8789", nillable = true)
    protected List<PessoaPerfilDEC8789> pessoaPerfilDEC8789;

    /**
     * Gets the value of the pessoaPerfilDEC8789 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pessoaPerfilDEC8789 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPessoaPerfilDEC8789().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PessoaPerfilDEC8789 }
     * 
     * 
     */
    public List<PessoaPerfilDEC8789> getPessoaPerfilDEC8789() {
        if (pessoaPerfilDEC8789 == null) {
            pessoaPerfilDEC8789 = new ArrayList<PessoaPerfilDEC8789>();
        }
        return this.pessoaPerfilDEC8789;
    }

}
