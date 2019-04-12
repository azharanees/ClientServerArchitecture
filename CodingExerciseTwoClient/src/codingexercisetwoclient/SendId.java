
package codingexercisetwoclient;

import codingexercisetwoclient.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendId", propOrder = {
    "parameter"
})
public class SendId {

    protected int parameter;

    /**
     * Gets the value of the parameter property.
     * 
     */
    public int getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     */
    public void setParameter(int value) {
        this.parameter = value;
    }

}
