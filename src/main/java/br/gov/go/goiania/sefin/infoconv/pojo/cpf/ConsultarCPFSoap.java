
package br.gov.go.goiania.sefin.infoconv.pojo.cpf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConsultarCPFSoap", targetNamespace = "https://acesso.infoconv.receita.fazenda.gov.br/ws/cpf/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConsultarCPFSoap {


    /**
     * Consultar CPF - Perfil DEC8789
     * 			
     * 
     * @param cpfUsuario
     * @param listaDeCPF
     * @return
     *     returns br.gov.go.goiania.sefin.pojo.cpf.ArrayOfPessoaPerfilDEC8789
     */
    @WebMethod(operationName = "ConsultarCPFPDEC8789", action = "https://acesso.infoconv.receita.fazenda.gov.br/ws/cpf/ConsultarCPFPDEC8789")
    @WebResult(name = "ConsultarCPFPDEC8789Result", targetNamespace = "https://acesso.infoconv.receita.fazenda.gov.br/ws/cpf/")
    @RequestWrapper(localName = "ConsultarCPFPDEC8789", targetNamespace = "https://acesso.infoconv.receita.fazenda.gov.br/ws/cpf/", className = "br.gov.go.goiania.sefin.pojo.cpf.ConsultarCPFPDEC8789")
    @ResponseWrapper(localName = "ConsultarCPFPDEC8789Response", targetNamespace = "https://acesso.infoconv.receita.fazenda.gov.br/ws/cpf/", className = "br.gov.go.goiania.sefin.pojo.cpf.ConsultarCPFPDEC8789Response")
    public ArrayOfPessoaPerfilDEC8789 consultarCPFPDEC8789(
        @WebParam(name = "ListaDeCPF", targetNamespace = "https://acesso.infoconv.receita.fazenda.gov.br/ws/cpf/")
        String listaDeCPF,
        @WebParam(name = "CPFUsuario", targetNamespace = "https://acesso.infoconv.receita.fazenda.gov.br/ws/cpf/")
        String cpfUsuario);

}