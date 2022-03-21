
package ua.silentium;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ua.silentium.entity.vouchers.Tour;


/**
 * <p>Java class for getTourDatesByTour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTourDatesByTour"&gt;
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
@XmlType(name = "getTourDatesByTourId", propOrder = {
    "idTour"
})
public class GetTourDatesByTourId {

    protected int idTour;

    /**
     * Gets the value of the idTour property.
     * 
     */
    public int getIdTour() {
        return idTour;
    }

    /**
     * Sets the value of the idTour property.
     * 
     */
    public void setIdTour(int value) {
        this.idTour = value;
    }

}
