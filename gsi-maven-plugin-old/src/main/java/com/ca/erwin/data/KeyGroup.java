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
 *         &lt;element ref="{http://www.ca.com/erwin/data}Key_GroupProps"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Key_Group_Member_Groups" minOccurs="0"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Oracle_Constraint_State_Groups" minOccurs="0"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Oracle_Attribute_Storage_Groups" minOccurs="0"/>
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
    "keyGroupProps",
    "keyGroupMemberGroups",
    "oracleConstraintStateGroups",
    "oracleAttributeStorageGroups"
})
@XmlRootElement(name = "Key_Group")
public class KeyGroup {

    @XmlElement(name = "Key_GroupProps", required = true)
    protected KeyGroupProps keyGroupProps;
    @XmlElement(name = "Key_Group_Member_Groups")
    protected KeyGroupMemberGroups keyGroupMemberGroups;
    @XmlElement(name = "Oracle_Constraint_State_Groups")
    protected OracleConstraintStateGroups oracleConstraintStateGroups;
    @XmlElement(name = "Oracle_Attribute_Storage_Groups")
    protected OracleAttributeStorageGroups oracleAttributeStorageGroups;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;

    /**
     * Gets the value of the keyGroupProps property.
     * 
     * @return
     *     possible object is
     *     {@link KeyGroupProps }
     *     
     */
    public KeyGroupProps getKeyGroupProps() {
        return keyGroupProps;
    }

    /**
     * Sets the value of the keyGroupProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyGroupProps }
     *     
     */
    public void setKeyGroupProps(KeyGroupProps value) {
        this.keyGroupProps = value;
    }

    /**
     * Gets the value of the keyGroupMemberGroups property.
     * 
     * @return
     *     possible object is
     *     {@link KeyGroupMemberGroups }
     *     
     */
    public KeyGroupMemberGroups getKeyGroupMemberGroups() {
        return keyGroupMemberGroups;
    }

    /**
     * Sets the value of the keyGroupMemberGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyGroupMemberGroups }
     *     
     */
    public void setKeyGroupMemberGroups(KeyGroupMemberGroups value) {
        this.keyGroupMemberGroups = value;
    }

    /**
     * Gets the value of the oracleConstraintStateGroups property.
     * 
     * @return
     *     possible object is
     *     {@link OracleConstraintStateGroups }
     *     
     */
    public OracleConstraintStateGroups getOracleConstraintStateGroups() {
        return oracleConstraintStateGroups;
    }

    /**
     * Sets the value of the oracleConstraintStateGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link OracleConstraintStateGroups }
     *     
     */
    public void setOracleConstraintStateGroups(OracleConstraintStateGroups value) {
        this.oracleConstraintStateGroups = value;
    }

    /**
     * Gets the value of the oracleAttributeStorageGroups property.
     * 
     * @return
     *     possible object is
     *     {@link OracleAttributeStorageGroups }
     *     
     */
    public OracleAttributeStorageGroups getOracleAttributeStorageGroups() {
        return oracleAttributeStorageGroups;
    }

    /**
     * Sets the value of the oracleAttributeStorageGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link OracleAttributeStorageGroups }
     *     
     */
    public void setOracleAttributeStorageGroups(OracleAttributeStorageGroups value) {
        this.oracleAttributeStorageGroups = value;
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
