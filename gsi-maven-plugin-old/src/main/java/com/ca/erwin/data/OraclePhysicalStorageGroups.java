//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.13 at 10:21:45 PM BRST 
//


package com.ca.erwin.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.ca.com/erwin/data}Oracle_Physical_Storage"/>
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
    "oraclePhysicalStorage"
})
@XmlRootElement(name = "Oracle_Physical_Storage_Groups")
public class OraclePhysicalStorageGroups {

    @XmlElement(name = "Oracle_Physical_Storage", required = true)
    protected OraclePhysicalStorage oraclePhysicalStorage;

    /**
     * Gets the value of the oraclePhysicalStorage property.
     * 
     * @return
     *     possible object is
     *     {@link OraclePhysicalStorage }
     *     
     */
    public OraclePhysicalStorage getOraclePhysicalStorage() {
        return oraclePhysicalStorage;
    }

    /**
     * Sets the value of the oraclePhysicalStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OraclePhysicalStorage }
     *     
     */
    public void setOraclePhysicalStorage(OraclePhysicalStorage value) {
        this.oraclePhysicalStorage = value;
    }

}