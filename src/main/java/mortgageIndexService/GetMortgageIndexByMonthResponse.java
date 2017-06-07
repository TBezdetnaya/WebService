
package mortgageIndexService;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMortgageIndexByMonthResult" type="{http://www.webserviceX.NET/}MonthlyIndex"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMortgageIndexByMonthResult"
})
@XmlRootElement(name = "GetMortgageIndexByMonthResponse")
public class GetMortgageIndexByMonthResponse {

    @XmlElement(name = "GetMortgageIndexByMonthResult", required = true)
    protected MonthlyIndex getMortgageIndexByMonthResult;

    /**
     * Gets the value of the getMortgageIndexByMonthResult property.
     *
     * @return
     *     possible object is
     *     {@link MonthlyIndex }
     *
     */
    public MonthlyIndex getGetMortgageIndexByMonthResult() {
        return getMortgageIndexByMonthResult;
    }

    /**
     * Sets the value of the getMortgageIndexByMonthResult property.
     *
     * @param value
     *     allowed object is
     *     {@link MonthlyIndex }
     *
     */
    public void setGetMortgageIndexByMonthResult(MonthlyIndex value) {
        this.getMortgageIndexByMonthResult = value;
    }

}
