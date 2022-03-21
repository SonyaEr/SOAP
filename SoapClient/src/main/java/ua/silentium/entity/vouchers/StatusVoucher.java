
package ua.silentium.entity.vouchers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ua.silentium.entity.Entity;


/**
 * <p>Java class for StatusVoucher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusVoucher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://silentium.ua/entity}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status_voucher_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusVoucher", propOrder = {
    "statusVoucherName"
})
public class StatusVoucher
    extends Entity
{

    @XmlElement(name = "status_voucher_name", required = true)
    protected String statusVoucherName;
 
    public StatusVoucher() {}
    public StatusVoucher(int idStatusVoucher, String statusVoucherName) {
  	this.id = idStatusVoucher;
  	this.statusVoucherName = statusVoucherName;
      }
      
      public StatusVoucher(String statusVoucherName) {
    	this.statusVoucherName = statusVoucherName;
        }
    /**
     * Gets the value of the statusVoucherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusVoucherName() {
        return statusVoucherName;
    }

    /**
     * Sets the value of the statusVoucherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusVoucherName(String value) {
        this.statusVoucherName = value;
    }

}
