//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.09 at 03:40:04 AM EET 
//


package ua.silentium.entity.vouchers;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ua.silentium.entity.Entity;


/**
 * <p>Java class for TypeFood.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeFood">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *    
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeFood", propOrder = {
    "name",
})
public class TypeFood extends Entity {

    @XmlElement(name = "type_food_name", required = true)
    protected String name;
    
    public TypeFood() {
    }
    public TypeFood(int idTypeFood, String name_typefood) {
	this.id = idTypeFood;
	this.name = name_typefood;
    }
    public TypeFood(String name_typefood) {
	this.name = name_typefood;
    }
    
    public String getTypeFoodName() {
        return name;
    }

    /**
     * Sets the value of the tourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeFoodName(String value) {
        this.name = value;
    }
    
    @Override
   	public String toString() {
   		StringBuilder builder = new StringBuilder();
   		builder.append("TypeFood(name=");
   		builder.append(name);
   		builder.append(")");
   		return builder.toString();
   	}

}