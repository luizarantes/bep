//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.13 at 10:21:45 PM BRST 
//


package com.ca.erwin.em2data;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Stored_Display_Proxy_Object" maxOccurs="unbounded"/>
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
    "storedDisplayProxyObject"
})
@XmlRootElement(name = "Stored_Display_Proxy_Object_Groups")
public class StoredDisplayProxyObjectGroups {

    @XmlElement(name = "Stored_Display_Proxy_Object", required = true)
    protected List<StoredDisplayProxyObject> storedDisplayProxyObject;

    /**
     * Gets the value of the storedDisplayProxyObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storedDisplayProxyObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoredDisplayProxyObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredDisplayProxyObject }
     * 
     * 
     */
    public List<StoredDisplayProxyObject> getStoredDisplayProxyObject() {
        if (storedDisplayProxyObject == null) {
            storedDisplayProxyObject = new ArrayList<StoredDisplayProxyObject>();
        }
        return this.storedDisplayProxyObject;
    }

}