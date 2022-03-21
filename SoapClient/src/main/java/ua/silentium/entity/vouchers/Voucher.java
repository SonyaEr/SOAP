
package ua.silentium.entity.vouchers;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ua.silentium.entity.Entity;

/**
 * <p>
 * Java class for Voucher complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Voucher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://silentium.ua/entity}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="voucher_count" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Person" type="{http://silentium.ua/entity/vouchers}Person"/&gt;
 *         &lt;element name="Order" type="{http://silentium.ua/entity/vouchers}Order"/&gt;
 *         &lt;element name="voucher_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="date_updated_voucher" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="StatusVoucher" type="{http://silentium.ua/entity/vouchers}StatusVoucher"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Voucher", propOrder = { "voucherCount", "amount", "person", "order", "voucherDate",
	"dateUpdatedVoucher", "statusVoucher" })
public class Voucher extends Entity {

    @XmlElement(name = "voucher_count")
    protected int voucherCount;
    @XmlElement(required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Person", required = true)
    protected Person person;
    @XmlElement(name = "Order", required = true)
    protected Order order;
    @XmlElement(name = "voucher_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voucherDate;
    @XmlElement(name = "date_updated_voucher", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUpdatedVoucher;
    @XmlElement(name = "StatusVoucher", required = true)
    protected StatusVoucher statusVoucher;

    /**
     * Gets the value of the voucherCount property.
     * 
     */

    Voucher() {
    }

    public Voucher(int id, int voucherCount, BigDecimal amount, XMLGregorianCalendar voucherDate,
	    XMLGregorianCalendar dateUpdatedVoucher, int order, int person, String statusVoucher) {

	this.id = id;
	this.voucherCount = voucherCount;
	this.amount = amount;
	this.voucherDate = voucherDate;
	this.dateUpdatedVoucher = dateUpdatedVoucher;
	this.order = new Order(order);
	this.person = new Person(person);
	this.statusVoucher = new StatusVoucher(statusVoucher);
	// TODO Auto-generated constructor stub
    }

    public int getVoucherCount() {
	return voucherCount;
    }

    /**
     * Sets the value of the voucherCount property.
     * 
     */
    public void setVoucherCount(int value) {
	this.voucherCount = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getAmount() {
	return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setAmount(BigDecimal value) {
	this.amount = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return possible object is {@link Person }
     * 
     */
    public Person getPerson() {
	return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value allowed object is {@link Person }
     * 
     */
    public void setPerson(Person value) {
	this.person = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return possible object is {@link Order }
     * 
     */
    public Order getOrder() {
	return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value allowed object is {@link Order }
     * 
     */
    public void setOrder(Order value) {
	this.order = value;
    }

    /**
     * Gets the value of the voucherDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getVoucherDate() {
	return voucherDate;
    }

    /**
     * Sets the value of the voucherDate property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setVoucherDate(XMLGregorianCalendar value) {
	this.voucherDate = value;
    }

    /**
     * Gets the value of the dateUpdatedVoucher property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDateUpdatedVoucher() {
	return dateUpdatedVoucher;
    }

    /**
     * Sets the value of the dateUpdatedVoucher property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDateUpdatedVoucher(XMLGregorianCalendar value) {
	this.dateUpdatedVoucher = value;
    }

    /**
     * Gets the value of the statusVoucher property.
     * 
     * @return possible object is {@link StatusVoucher }
     * 
     */
    public StatusVoucher getStatusVoucher() {
	return statusVoucher;
    }

    /**
     * Sets the value of the statusVoucher property.
     * 
     * @param value allowed object is {@link StatusVoucher }
     * 
     */
    public void setStatusVoucher(StatusVoucher value) {
	this.statusVoucher = value;
    }

}
