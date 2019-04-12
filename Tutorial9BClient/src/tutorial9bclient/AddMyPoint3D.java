
package tutorial9bclient;

import tutorial9bclient.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addMyPoint3D complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addMyPoint3D">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="myPoint3D" type="{http://server/}myPoint3D" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMyPoint3D", propOrder = {
    "myPoint3D"
})
public class AddMyPoint3D {

    protected MyPoint3D myPoint3D;

    /**
     * Gets the value of the myPoint3D property.
     * 
     * @return
     *     possible object is
     *     {@link MyPoint3D }
     *     
     */
    public MyPoint3D getMyPoint3D() {
        return myPoint3D;
    }

    /**
     * Sets the value of the myPoint3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyPoint3D }
     *     
     */
    public void setMyPoint3D(MyPoint3D value) {
        this.myPoint3D = value;
    }

}
