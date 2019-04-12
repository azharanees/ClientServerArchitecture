
package tutorial9bclient;

import tutorial9bclient.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addTwoNumbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addTwoNumbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="d0" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addTwoNumbers", propOrder = {
    "d",
    "d0"
})
public class AddTwoNumbers {

    protected double d;
    protected double d0;

    /**
     * Gets the value of the d property.
     * 
     */
    public double getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     */
    public void setD(double value) {
        this.d = value;
    }

    /**
     * Gets the value of the d0 property.
     * 
     */
    public double getD0() {
        return d0;
    }

    /**
     * Sets the value of the d0 property.
     * 
     */
    public void setD0(double value) {
        this.d0 = value;
    }

}
