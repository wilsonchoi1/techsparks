
package org.redhat.demo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for claimInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="claimInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applyItem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="claimDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="polno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimInput", propOrder = {
    "applyItem",
    "claimDate",
    "claimType",
    "contactPhone",
    "customerId",
    "customerName",
    "email",
    "polno"
})
public class ClaimInput {

    protected int applyItem;
    protected String claimDate;
    protected int claimType;
    protected String contactPhone;
    protected String customerId;
    protected String customerName;
    protected String email;
    protected String polno;

    /**
     * Gets the value of the applyItem property.
     * 
     */
    public int getApplyItem() {
        return applyItem;
    }

    /**
     * Sets the value of the applyItem property.
     * 
     */
    public void setApplyItem(int value) {
        this.applyItem = value;
    }

    /**
     * Gets the value of the claimDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimDate() {
        return claimDate;
    }

    /**
     * Sets the value of the claimDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimDate(String value) {
        this.claimDate = value;
    }

    /**
     * Gets the value of the claimType property.
     * 
     */
    public int getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     */
    public void setClaimType(int value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the polno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolno() {
        return polno;
    }

    /**
     * Sets the value of the polno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolno(String value) {
        this.polno = value;
    }

}
