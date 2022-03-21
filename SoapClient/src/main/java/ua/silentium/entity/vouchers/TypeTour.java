
package ua.silentium.entity.vouchers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ua.silentium.entity.Entity;


/**
 * <p>Java class for Type_tour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type_tour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://silentium.ua/entity}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type_tour_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type_tour", propOrder = {
    "name"
})
public class TypeTour
    extends Entity
{

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
    

    /**
     * Gets the value of the typeTourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTourName() {
        return name;
    }

    /**
     * Sets the value of the typeTourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTourName(String value) {
        this.name = value;
    }

}
