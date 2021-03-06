
package ua.silentium;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import ua.silentium.entity.vouchers.Person;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonWebServiceSEI", targetNamespace = "http://silentium.ua")
@XmlSeeAlso({
    ua.silentium.ObjectFactory.class,
    ua.silentium.entity.ObjectFactory.class,
    ua.silentium.entity.vouchers.ObjectFactory.class
})
public interface PersonWebServiceSEI {


    /**
     * 
     * @param password
     * @param email
     * @return
     *     returns ua.silentium.entity.vouchers.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkPerson", targetNamespace = "http://silentium.ua", className = "ua.silentium.CheckPerson")
    @ResponseWrapper(localName = "checkPersonResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.CheckPersonResponse")
    public Person checkPerson(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password);
    /**
     * 
     * @param idPerson
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://silentium.ua", className = "ua.silentium.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.DeletePersonResponse")
    public boolean deletePerson(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

    /**
     * 
     * @param idPerson
     * @return
     *     returns ua.silentium.entity.vouchers.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPerson", targetNamespace = "http://silentium.ua", className = "ua.silentium.GetPerson")
    @ResponseWrapper(localName = "getPersonResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.GetPersonResponse")
    public Person getPerson(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

    /**
     * 
     * @param person
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addPerson", targetNamespace = "http://silentium.ua", className = "ua.silentium.AddPerson")
    @ResponseWrapper(localName = "addPersonResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.AddPersonResponse")
    public boolean addPerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param person
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://silentium.ua", className = "ua.silentium.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://silentium.ua", className = "ua.silentium.UpdatePersonResponse")
    public boolean updatePerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

}
