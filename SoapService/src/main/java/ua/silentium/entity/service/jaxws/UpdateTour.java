
package ua.silentium.entity.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.4.4
 * Wed Dec 22 03:46:15 EET 2021
 * Generated source version: 3.4.4
 */

@XmlRootElement(name = "updateTour", namespace = "http://silentium.ua")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateTour", namespace = "http://silentium.ua")

public class UpdateTour {

    @XmlElement(name = "tour")
    private ua.silentium.entity.vouchers.Tour tour;

    public ua.silentium.entity.vouchers.Tour getTour() {
        return this.tour;
    }

    public void setTour(ua.silentium.entity.vouchers.Tour newTour)  {
        this.tour = newTour;
    }

}
