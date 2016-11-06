//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.13 at 10:21:45 PM BRST 
//


package com.ca.erwin.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.ca.com/erwin/data}Stored_DisplayProps"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Drawing_Object_Entity_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Drawing_Object_Relationship_Groups"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "storedDisplayProps",
    "drawingObjectEntityGroups",
    "drawingObjectRelationshipGroups"
})
@XmlRootElement(name = "Stored_Display")
public class StoredDisplay {

    @XmlElement(name = "Stored_DisplayProps", required = true)
    protected StoredDisplayProps storedDisplayProps;
    @XmlElement(name = "Drawing_Object_Entity_Groups", required = true)
    protected DrawingObjectEntityGroups drawingObjectEntityGroups;
    @XmlElement(name = "Drawing_Object_Relationship_Groups", required = true)
    protected DrawingObjectRelationshipGroups drawingObjectRelationshipGroups;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;

    /**
     * Gets the value of the storedDisplayProps property.
     * 
     * @return
     *     possible object is
     *     {@link StoredDisplayProps }
     *     
     */
    public StoredDisplayProps getStoredDisplayProps() {
        return storedDisplayProps;
    }

    /**
     * Sets the value of the storedDisplayProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredDisplayProps }
     *     
     */
    public void setStoredDisplayProps(StoredDisplayProps value) {
        this.storedDisplayProps = value;
    }

    /**
     * Gets the value of the drawingObjectEntityGroups property.
     * 
     * @return
     *     possible object is
     *     {@link DrawingObjectEntityGroups }
     *     
     */
    public DrawingObjectEntityGroups getDrawingObjectEntityGroups() {
        return drawingObjectEntityGroups;
    }

    /**
     * Sets the value of the drawingObjectEntityGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawingObjectEntityGroups }
     *     
     */
    public void setDrawingObjectEntityGroups(DrawingObjectEntityGroups value) {
        this.drawingObjectEntityGroups = value;
    }

    /**
     * Gets the value of the drawingObjectRelationshipGroups property.
     * 
     * @return
     *     possible object is
     *     {@link DrawingObjectRelationshipGroups }
     *     
     */
    public DrawingObjectRelationshipGroups getDrawingObjectRelationshipGroups() {
        return drawingObjectRelationshipGroups;
    }

    /**
     * Sets the value of the drawingObjectRelationshipGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawingObjectRelationshipGroups }
     *     
     */
    public void setDrawingObjectRelationshipGroups(DrawingObjectRelationshipGroups value) {
        this.drawingObjectRelationshipGroups = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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

}
