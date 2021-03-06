//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.09 at 03:40:04 AM EET 
//

package ua.silentium.entity.vouchers;

import java.sql.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ua.silentium.entity.Entity;

/**
 * <p>
 * Java class for Order complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Order">
 *   &lt;complexContent>
 *     &lt;extension base="{http://silentium.ua/entity}Entity">
 *       &lt;sequence>
 *         &lt;element name="order_count" type="{http://silentium.ua/entity/vouchers}Order_count"/>
 *         &lt;element name="Tour_date" type="{http://silentium.ua/entity/vouchers}Tour_date"/>
 *         &lt;element name="Person" type="{http://silentium.ua/entity/vouchers}Person"/>
 *         &lt;element name="order_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="date_updated_order" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StatusOrder" type="{http://silentium.ua/entity/vouchers}Status_order"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = { "orderCount", "tourDate", "person", "orderDate", "dateUpdatedOrder",
	"statusOrder" })
public class Order extends Entity {

    @XmlElement(name = "order_count")
    protected int orderCount;
    @XmlElement(name = "TourDate", required = true)
    protected TourDate tourDate;
    @XmlElement(name = "Person", required = true)
    protected Person person;
    @XmlElement(name = "order_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "date_updated_order", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUpdatedOrder;
    @XmlElement(name = "StatusOrder", required = true)
    protected StatusOrder statusOrder;

    public Order(int id, int orderCount, XMLGregorianCalendar orderDate, XMLGregorianCalendar dateUpdatedOrder,
	    int person_id, int tour_date_id, String statusOrder) {
	this.id = id;
	this.orderCount = orderCount;
	this.orderDate = orderDate;
	this.dateUpdatedOrder = dateUpdatedOrder;
	this.person = new Person(person_id);
	this.tourDate = new TourDate(tour_date_id);
	this.statusOrder = new StatusOrder(statusOrder);

    }
    
    public Order(int tour_date_count, int person_id, int tour_date_id) {
  	this.orderCount = tour_date_count;
  	this.person = new Person(person_id);
  	this.tourDate = new TourDate(tour_date_id);
      }

    public Order() {
	// TODO Auto-generated constructor stub
    }

    public Order(int order) {
	this.id = order;
	// TODO Auto-generated constructor stub
    }

    public boolean updateOrder(Order order) {
	if (order == null) {
	    return false;
	}
	this.id = order.id;
	this.orderCount = order.orderCount;
	this.tourDate = order.tourDate;
	this.person = order.person;
	this.orderDate = order.orderDate;
	this.dateUpdatedOrder = order.dateUpdatedOrder;
	this.statusOrder = order.statusOrder;
	return true;
    }

    /**
     * Gets the value of the orderCount property.
     * 
     */
    public int getOrderCount() {
	return orderCount;
    }

    /**
     * Sets the value of the orderCount property.
     * 
     */
    public void setOrderCount(int value) {
	this.orderCount = value;
    }

    /**
     * Gets the value of the tourDate property.
     * 
     * @return possible object is {@link TourDate }
     * 
     */
    public TourDate getTourDate() {
	return tourDate;
    }

    /**
     * Sets the value of the tourDate property.
     * 
     * @param value allowed object is {@link TourDate }
     * 
     */
    public void setTourDate(TourDate value) {
	this.tourDate = value;
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
     * Gets the value of the orderDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getOrderDate() {
	return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setOrderDate(XMLGregorianCalendar value) {
	this.orderDate = value;
    }

    /**
     * Gets the value of the dateUpdatedOrder property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDateUpdatedOrder() {
	return dateUpdatedOrder;
    }

    /**
     * Sets the value of the dateUpdatedOrder property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDateUpdatedOrder(XMLGregorianCalendar value) {
	this.dateUpdatedOrder = value;
    }

    /**
     * Gets the value of the statusOrder property.
     * 
     * @return possible object is {@link StatusOrder }
     * 
     */
    public StatusOrder getStatusOrder() {
	return statusOrder;
    }

    /**
     * Sets the value of the statusOrder property.
     * 
     * @param value allowed object is {@link StatusOrder }
     * 
     */
    public void setStatusOrder(StatusOrder value) {
	this.statusOrder = value;
    }

    /**
     * Gets the value of the orderContact property.
     * 
     * @return possible object is {@link Contact }
     * 
     */

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Order(count=");
	builder.append(orderCount);
	builder.append(", orderDate=");
	builder.append(orderDate);
	builder.append(", dateUpdatedOrder=");
	builder.append(dateUpdatedOrder);
	builder.append(", Person:");
	builder.append(person);
	builder.append(", TourDate:");
	builder.append(tourDate);
	builder.append(", StatusOrder=");
	builder.append(statusOrder);
	builder.append(")");
	return builder.toString();
    }

}
