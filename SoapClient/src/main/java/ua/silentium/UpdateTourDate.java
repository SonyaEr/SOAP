
package ua.silentium;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ua.silentium.entity.vouchers.TourDate;


/**
 * <p>Java class for updateTourDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateTourDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tourdate" type="{http://silentium.ua/entity/vouchers}Tour_date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateTourDate", propOrder = {
    "tourdate"
})
public class UpdateTourDate {

    protected TourDate tourdate;

    /**
     * Gets the value of the tourdate property.
     * 
     * @return
     *     possible object is
     *     {@link TourDate }
     *     
     */
    public TourDate getTourdate() {
        return tourdate;
    }

    /**
     * Sets the value of the tourdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourDate }
     *     
     */
    public void setTourdate(TourDate value) {
        this.tourdate = value;
    }

}
