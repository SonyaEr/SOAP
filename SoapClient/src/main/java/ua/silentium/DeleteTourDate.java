
package ua.silentium;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteTourDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteTourDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTourDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteTourDate", propOrder = {
    "idTourDate"
})
public class DeleteTourDate {

    protected int idTourDate;

    /**
     * Gets the value of the idTourDate property.
     * 
     */
    public int getIdTourDate() {
        return idTourDate;
    }

    /**
     * Sets the value of the idTourDate property.
     * 
     */
    public void setIdTourDate(int value) {
        this.idTourDate = value;
    }

}
