//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.09 at 03:40:04 AM EET 
//

package ua.silentium.entity.vouchers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ua.silentium.entity.Entity;

/**
 * <p>
 * Java class for Type_tour.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="Type_tour">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Excursion"/>
 *     &lt;enumeration value="Gastro tour"/>
 *     &lt;enumeration value="Rest day"/>
 *     &lt;enumeration value="Cruise"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type_tour", propOrder = { "name", })
public class TypeTour extends Entity {

    @XmlElement(name = "type_tour_name", required = true)
    protected String name;

    public TypeTour() {
    }

    public TypeTour(int idTypeTour, String name) {
	this.id = idTypeTour;
	this.name = name;
    }
    public TypeTour(String name) {
   	this.name = name;
       }

    public String getTypeTourName() {
	return name;
    }

    /**
     * Sets the value of the tourName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTypeTourName(String value) {
	this.name = value;
    }
}
