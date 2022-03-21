
package ua.silentium.entity.vouchers;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import ua.silentium.entity.Entity;


/**
 * <p>Java class for Tour_date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tour_date"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://silentium.ua/entity}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date_arrival" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tour_date_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tour" type="{http://silentium.ua/entity/vouchers}Tour"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tour_date", propOrder = {
    "dateArrival",
    "price",
    "tourDateName",
    "tour"
})
public class TourDate
    extends Entity
{

    @XmlElement(name = "date_arrival", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateArrival;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(name = "tour_date_name")
    protected String tourDateName;
    @XmlElement(name = "Tour", required = true)
    protected Tour tour;

    public TourDate(int idTourDate, XMLGregorianCalendar dateArrival, BigDecimal price, String tourDateName, Tour tour) throws DatatypeConfigurationException {
   	// TODO Auto-generated constructor stub
	this.id = idTourDate;
   	this.dateArrival= dateArrival;
   	this.price=price;
   	this.tourDateName=tourDateName;
   	this.tour = tour;
       }
       public TourDate() {
       }
      ;
    public TourDate(int tour_date_id) {
	this.id = tour_date_id;
	
    }
    /**
     * Gets the value of the dateArrival property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateArrival() {
        return dateArrival;
    }

    /**
     * Sets the value of the dateArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateArrival(XMLGregorianCalendar value) {
        this.dateArrival = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the tourDateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourDateName() {
        return tourDateName;
    }

    /**
     * Sets the value of the tourDateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourDateName(String value) {
        this.tourDateName = value;
    }

    /**
     * Gets the value of the tour property.
     * 
     * @return
     *     possible object is
     *     {@link Tour }
     *     
     */
    public Tour getTour() {
        return tour;
    }

    /**
     * Sets the value of the tour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tour }
     *     
     */
    public void setTour(Tour value) {
        this.tour = value;
    }
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append(id);
	builder.append(" - (DateArrival=");
	builder.append(dateArrival);
	builder.append(", Price=");
	builder.append(price);
	builder.append(", tourDateName=");
	builder.append(tourDateName);
	//builder.append(", Tour=");
	//builder.append(tour.toString());
	builder.append(")");
	return builder.toString();
    }
   

}
