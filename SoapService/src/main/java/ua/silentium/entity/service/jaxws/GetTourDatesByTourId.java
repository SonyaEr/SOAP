
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

@XmlRootElement(name = "getTourDatesByTourId", namespace = "http://silentium.ua")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTourDatesByTourId", namespace = "http://silentium.ua")

public class GetTourDatesByTourId {

    @XmlElement(name = "idTour")
    private int idTour;

    public int getIdTour() {
        return this.idTour;
    }

    public void setIdTour(int newIdTour)  {
        this.idTour = newIdTour;
    }

}
