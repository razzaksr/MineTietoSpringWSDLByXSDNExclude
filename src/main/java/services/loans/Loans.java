//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.24 at 10:36:07 PM IST 
//


package services.loans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="loanPrinciple" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="loanBorrower" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loanTenure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loanInterest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="loanPayable" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loans", propOrder = {
    "loanId",
    "loanPrinciple",
    "loanBorrower",
    "loanTenure",
    "loanInterest",
    "loanPayable"
})
public class Loans {

    protected long loanId;
    protected double loanPrinciple;
    @XmlElement(required = true)
    protected String loanBorrower;
    protected int loanTenure;
    protected double loanInterest;
    protected double loanPayable;

    /**
     * Gets the value of the loanId property.
     * 
     */
    public long getLoanId() {
        return loanId;
    }

    /**
     * Sets the value of the loanId property.
     * 
     */
    public void setLoanId(long value) {
        this.loanId = value;
    }

    /**
     * Gets the value of the loanPrinciple property.
     * 
     */
    public double getLoanPrinciple() {
        return loanPrinciple;
    }

    /**
     * Sets the value of the loanPrinciple property.
     * 
     */
    public void setLoanPrinciple(double value) {
        this.loanPrinciple = value;
    }

    /**
     * Gets the value of the loanBorrower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanBorrower() {
        return loanBorrower;
    }

    /**
     * Sets the value of the loanBorrower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanBorrower(String value) {
        this.loanBorrower = value;
    }

    /**
     * Gets the value of the loanTenure property.
     * 
     */
    public int getLoanTenure() {
        return loanTenure;
    }

    /**
     * Sets the value of the loanTenure property.
     * 
     */
    public void setLoanTenure(int value) {
        this.loanTenure = value;
    }

    /**
     * Gets the value of the loanInterest property.
     * 
     */
    public double getLoanInterest() {
        return loanInterest;
    }

    /**
     * Sets the value of the loanInterest property.
     * 
     */
    public void setLoanInterest(double value) {
        this.loanInterest = value;
    }

    /**
     * Gets the value of the loanPayable property.
     * 
     */
    public double getLoanPayable() {
        return loanPayable;
    }

    /**
     * Sets the value of the loanPayable property.
     * 
     */
    public void setLoanPayable(double value) {
        this.loanPayable = value;
    }

}
