
package defaultnamespace.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.6.2
 * Wed Dec 27 18:15:20 WET 2023
 * Generated source version: 3.6.2
 */

@XmlRootElement(name = "valida_numResponse", namespace = "http://default_package/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valida_numResponse", namespace = "http://default_package/")

public class Valida_numResponse {

    @XmlElement(name = "return")
    private Object[] _return;

    public Object[] getReturn() {
        return this._return;
    }

    public void setReturn(Object[] new_return)  {
        this._return = new_return;
    }

}

