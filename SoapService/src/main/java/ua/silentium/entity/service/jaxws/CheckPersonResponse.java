
package ua.silentium.entity.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.4.4
 * Wed Dec 22 03:46:55 EET 2021
 * Generated source version: 3.4.4
 */

@XmlRootElement(name = "checkPersonResponse", namespace = "http://silentium.ua")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkPersonResponse", namespace = "http://silentium.ua")

public class CheckPersonResponse {

    @XmlElement(name = "return")
    private ua.silentium.entity.vouchers.Person _return;

    public ua.silentium.entity.vouchers.Person getReturn() {
        return this._return;
    }

    public void setReturn(ua.silentium.entity.vouchers.Person new_return)  {
        this._return = new_return;
    }

}

