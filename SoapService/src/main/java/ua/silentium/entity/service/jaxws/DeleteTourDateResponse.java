
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

@XmlRootElement(name = "deleteTourDateResponse", namespace = "http://silentium.ua")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteTourDateResponse", namespace = "http://silentium.ua")

public class DeleteTourDateResponse {

    @XmlElement(name = "return")
    private boolean _return;

    public boolean getReturn() {
        return this._return;
    }

    public void setReturn(boolean new_return)  {
        this._return = new_return;
    }

}

