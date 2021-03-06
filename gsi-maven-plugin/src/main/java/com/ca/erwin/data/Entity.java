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
 *         &lt;element ref="{http://www.ca.com/erwin/data}EntityProps"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Attribute_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Key_Group_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}History_Information_Groups" minOccurs="0"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Oracle_Physical_Storage_Groups"/>
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
    "entityProps",
    "attributeGroups",
    "keyGroupGroups",
    "historyInformationGroups",
    "oraclePhysicalStorageGroups"
})
@XmlRootElement(name = "Entity")
public class Entity {

    @XmlElement(name = "EntityProps", required = true)
    protected EntityProps entityProps;
    @XmlElement(name = "Attribute_Groups", required = true)
    protected AttributeGroups attributeGroups;
    @XmlElement(name = "Key_Group_Groups", required = true)
    protected KeyGroupGroups keyGroupGroups;
    @XmlElement(name = "History_Information_Groups")
    protected HistoryInformationGroups historyInformationGroups;
    @XmlElement(name = "Oracle_Physical_Storage_Groups", required = true)
    protected OraclePhysicalStorageGroups oraclePhysicalStorageGroups;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;

    /**
     * Gets the value of the entityProps property.
     * 
     * @return
     *     possible object is
     *     {@link EntityProps }
     *     
     */
    public EntityProps getEntityProps() {
        return entityProps;
    }

    /**
     * Sets the value of the entityProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityProps }
     *     
     */
    public void setEntityProps(EntityProps value) {
        this.entityProps = value;
    }

    /**
     * Gets the value of the attributeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeGroups }
     *     
     */
    public AttributeGroups getAttributeGroups() {
        return attributeGroups;
    }

    /**
     * Sets the value of the attributeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeGroups }
     *     
     */
    public void setAttributeGroups(AttributeGroups value) {
        this.attributeGroups = value;
    }

    /**
     * Gets the value of the keyGroupGroups property.
     * 
     * @return
     *     possible object is
     *     {@link KeyGroupGroups }
     *     
     */
    public KeyGroupGroups getKeyGroupGroups() {
        return keyGroupGroups;
    }

    /**
     * Sets the value of the keyGroupGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyGroupGroups }
     *     
     */
    public void setKeyGroupGroups(KeyGroupGroups value) {
        this.keyGroupGroups = value;
    }

    /**
     * Gets the value of the historyInformationGroups property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryInformationGroups }
     *     
     */
    public HistoryInformationGroups getHistoryInformationGroups() {
        return historyInformationGroups;
    }

    /**
     * Sets the value of the historyInformationGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryInformationGroups }
     *     
     */
    public void setHistoryInformationGroups(HistoryInformationGroups value) {
        this.historyInformationGroups = value;
    }

    /**
     * Gets the value of the oraclePhysicalStorageGroups property.
     * 
     * @return
     *     possible object is
     *     {@link OraclePhysicalStorageGroups }
     *     
     */
    public OraclePhysicalStorageGroups getOraclePhysicalStorageGroups() {
        return oraclePhysicalStorageGroups;
    }

    /**
     * Sets the value of the oraclePhysicalStorageGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link OraclePhysicalStorageGroups }
     *     
     */
    public void setOraclePhysicalStorageGroups(OraclePhysicalStorageGroups value) {
        this.oraclePhysicalStorageGroups = value;
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
