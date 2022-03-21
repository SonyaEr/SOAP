
package ua.silentium;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ua.silentium.entity.vouchers.Tour;


/**
 * <p>Java class for addTour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addTour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tour" type="{http://silentium.ua/entity/vouchers}Tour" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addTour", propOrder = {
    "tour"
})
public class AddTour {

    protected Tour tour;

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

}
