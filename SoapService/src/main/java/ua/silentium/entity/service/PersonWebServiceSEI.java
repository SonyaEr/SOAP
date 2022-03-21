package ua.silentium.entity.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ua.silentium.entity.vouchers.Person;

@WebService (targetNamespace="http://silentium.ua")
public interface PersonWebServiceSEI {
    
   
    @WebMethod 
    boolean addPerson(@WebParam(name = "person") Person person);
    
    @WebMethod 
    Person checkPerson(@WebParam(name = "email") String email, @WebParam(name = "password") String password);
    
    @WebMethod 
    Person getPerson(@WebParam(name = "idPerson") int idPerson);
    
    @WebMethod 
    boolean deletePerson(@WebParam(name = "idPerson") int idPerson);

    @WebMethod 
    boolean updatePerson(@WebParam(name = "person") Person person);

}
