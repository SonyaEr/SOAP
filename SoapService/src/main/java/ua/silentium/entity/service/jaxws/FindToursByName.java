
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

@XmlRootElement(name = "findToursByName", namespace = "http://silentium.ua")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findToursByName", namespace = "http://silentium.ua")

public class FindToursByName {

    @XmlElement(name = "tourName")
    private java.lang.String tourName;

    public java.lang.String getTourName() {
        return this.tourName;
    }

    public void setTourName(java.lang.String newTourName)  {
        this.tourName = newTourName;
    }

}
