package ua.silentium.entity.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ua.silentium.entity.PersonDAO;
import ua.silentium.entity.TourDAO;
import ua.silentium.entity.vouchers.Person;
import ua.silentium.entity.vouchers.Tour;

@WebService(targetNamespace="http://silentium.ua", endpointInterface = "ua.silentium.entity.service.PersonWebServiceSEI", portName = "PersonServicePort", serviceName = "PersonService")

public class PersonService implements PersonWebServiceSEI{

   
    private static List <Person> persons;

    public Person getPerson(int id) {
	for(Person t : persons){
	    if (t.getId() == id){
		return t;
	    } 
	}
	return new Person();
    }

   /* public boolean addPerson(Person person) {
        if (persons == null) {
            persons = new ArrayList<Person>();
        }
        persons.add(person);
	return true;
    }
    */
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public boolean addPerson(@WebParam(name = "Person") Person person) {
	return new PersonDAO().addPerson(person);
    }
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public Person checkPerson(@WebParam(name = "email") String email, @WebParam(name = "password") String password) {
	return new PersonDAO().checkPerson(email, password);
    }

    public boolean updatePerson(Person person) {
   	int id = person.getId();
   	for(Person t : persons){
   	    if (t.getId() == id){
                   t.updatePerson(person);
               	return true;
   	    } 
   	}
           return false;
       }
    public boolean deletePerson(int id) {
        Iterator itr = persons.iterator();
        while (itr.hasNext()) {
            Person t = (Person)itr.next();
            if (t.getId() == id) {
                itr.remove();
            	return true;
            	}
        }
        return false;
    }

}
