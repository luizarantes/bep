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
 *         &lt;element ref="{http://www.ca.com/erwin/data}Oracle_Attribute_Storage"/>
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
    "oracleAttributeStorage"
})
@XmlRootElement(name = "Oracle_Attribute_Storage_Groups")
public class OracleAttributeStorageGroups {

    @XmlElement(name = "Oracle_Attribute_Storage", required = true)
    protected OracleAttributeStorage oracleAttributeStorage;

    /**
     * Gets the value of the oracleAttributeStorage property.
     * 
     * @return
     *     possible object is
     *     {@link OracleAttributeStorage }
     *     
     */
    public OracleAttributeStorage getOracleAttributeStorage() {
        return oracleAttributeStorage;
    }

    /**
     * Sets the value of the oracleAttributeStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OracleAttributeStorage }
     *     
     */
    public void setOracleAttributeStorage(OracleAttributeStorage value) {
        this.oracleAttributeStorage = value;
    }

}
