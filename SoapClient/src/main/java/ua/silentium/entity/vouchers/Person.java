
package ua.silentium.entity.vouchers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ua.silentium.entity.Entity;

/**
 * <p>
 * Java class for Person complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://silentium.ua/entity}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="patronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tel_num" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="birth_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Role" type="{http://silentium.ua/entity/vouchers}Role"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = { "name", "surname", "patronymic", "email", "password", "telNum", "address",
	"birthDate", "document", "role" })
public class Person extends Entity {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String surname;
    protected String patronymic;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(name = "tel_num")
    protected String telNum;
    protected String address;
    @XmlElement(name = "birth_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected String document;
    @XmlElement(name = "Role", required = true)
    protected Role role;

    public Person() {
    }

    public Person(String name, String surname, String email, String password) {
	this.name = name;
	this.surname = surname;
	this.email = email;
	this.password = password;

	// TODO Auto-generated constructor stub
    }

    public Person(int person_id) {
	// TODO Auto-generated constructor stub
	this.id = person_id;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
	return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
	this.name = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSurname() {
	return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSurname(String value) {
	this.surname = value;
    }

    /**
     * Gets the value of the patronymic property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPatronymic() {
	return patronymic;
    }

    /**
     * Sets the value of the patronymic property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPatronymic(String value) {
	this.patronymic = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEmail() {
	return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setEmail(String value) {
	this.email = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPassword() {
	return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPassword(String value) {
	this.password = value;
    }

    /**
     * Gets the value of the telNum property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTelNum() {
	return telNum;
    }

    /**
     * Sets the value of the telNum property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTelNum(String value) {
	this.telNum = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAddress() {
	return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setAddress(String value) {
	this.address = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getBirthDate() {
	return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setBirthDate(XMLGregorianCalendar value) {
	this.birthDate = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDocument() {
	return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDocument(String value) {
	this.document = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return possible object is {@link Role }
     * 
     */
    public Role getRole() {
	return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value allowed object is {@link Role }
     * 
     */
    public void setRole(Role value) {
	this.role = value;
    }

}
