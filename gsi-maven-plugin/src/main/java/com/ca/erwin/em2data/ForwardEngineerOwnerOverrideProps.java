//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.13 at 10:21:45 PM BRST 
//


package com.ca.erwin.em2data;

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
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Long_Id"/>
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Object_Typecode"/>
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Owner_Name"/>
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
    "name",
    "longId",
    "objectTypecode",
    "ownerName"
})
@XmlRootElement(name = "Forward_Engineer_Owner_OverrideProps")
public class ForwardEngineerOwnerOverrideProps {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Long_Id", required = true)
    protected String longId;
    @XmlElement(name = "Object_Typecode", required = true)
    protected String objectTypecode;
    @XmlElement(name = "Owner_Name", required = true)
    protected OwnerName ownerName;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the longId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongId() {
        return longId;
    }

    /**
     * Sets the value of the longId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongId(String value) {
        this.longId = value;
    }

    /**
     * Gets the value of the objectTypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectTypecode() {
        return objectTypecode;
    }

    /**
     * Sets the value of the objectTypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectTypecode(String value) {
        this.objectTypecode = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerName }
     *     
     */
    public OwnerName getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerName }
     *     
     */
    public void setOwnerName(OwnerName value) {
        this.ownerName = value;
    }

}
