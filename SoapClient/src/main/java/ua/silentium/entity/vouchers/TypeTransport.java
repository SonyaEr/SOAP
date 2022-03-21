
package ua.silentium.entity.vouchers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ua.silentium.entity.Entity;


/**
 * <p>Java class for Type_transport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type_transport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://silentium.ua/entity}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type_transport_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type_transport", propOrder = {
    "name"
})
public class TypeTransport
    extends Entity
{

    @XmlElement(name = "type_transport_name", required = true)
    protected String name;


    public TypeTransport() {
    }
    public TypeTransport(int idTypeTransport, String name) {
	this.id = idTypeTransport;
	this.name = name;
    }
    public TypeTransport(String name) {
   	this.name = name;
       }
    /**
     * Gets the value of the typeTransportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTransportName() {
        return name;
    }

    /**
     * Sets the value of the typeTransportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTransportName(String value) {
        this.name = value;
    }

}
