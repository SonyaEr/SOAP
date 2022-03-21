
package ua.silentium.entity.vouchers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ua.silentium.entity.Entity;


/**
 * <p>Java class for Type_food complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type_food"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://silentium.ua/entity}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type_food_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeFood", propOrder = {
    "name"
})
public class TypeFood
    extends Entity
{

    @XmlElement(name = "type_food_name", required = true)
    protected String name;

    public TypeFood() {
    }
    public TypeFood(int idTypeFood, String name) {
	this.id = idTypeFood;
	this.name = name;
    }
    
    public TypeFood(String name_typefood) {
  	this.name = name_typefood;
      }
    /**
     * Gets the value of the typeFoodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeFoodName() {
        return name;
    }

    /**
     * Sets the value of the typeFoodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeFoodName(String value) {
        this.name = value;
    }

}
