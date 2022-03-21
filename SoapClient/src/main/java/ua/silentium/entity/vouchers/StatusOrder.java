
package ua.silentium.entity.vouchers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ua.silentium.entity.Entity;


/**
 * <p>Java class for StatusOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://silentium.ua/entity}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status_order_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusOrder", propOrder = {
    "statusOrderName"
})
public class StatusOrder
    extends Entity
{

    @XmlElement(name = "status_order_name", required = true)
    protected String statusOrderName;
    public StatusOrder() {}
    public StatusOrder(int idStatusOrder, String statusOrderName) {
  	this.id = idStatusOrder;
  	this.statusOrderName = statusOrderName;
      }
      
      public StatusOrder(String statusOrderName) {
    	this.statusOrderName = statusOrderName;
        }
    /**
     * Gets the value of the statusOrderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusOrderName() {
        return statusOrderName;
    }

    /**
     * Sets the value of the statusOrderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusOrderName(String value) {
        this.statusOrderName = value;
    }

}
