//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.13 at 10:21:45 PM BRST 
//


package com.ca.erwin.data;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.ca.com/erwin/data}Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Long_Id"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Owner_Path"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Schema_Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Is_Cache_On"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Is_Min"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Is_Max"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Cache_Capacity"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Order_On"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Starting_Value"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Increment_By"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Dependent_Objects_Ref_Array"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Do_Not_Generate"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}User_Formatted_Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}User_Formatted_Physical_Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Is_Cycle_On"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Max_Value"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Min_Value"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Name_Qualifier"/>
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
    "ownerPath",
    "schemaName",
    "isCacheOn",
    "isMin",
    "isMax",
    "cacheCapacity",
    "orderOn",
    "startingValue",
    "incrementBy",
    "dependentObjectsRefArray",
    "doNotGenerate",
    "userFormattedName",
    "userFormattedPhysicalName",
    "isCycleOn",
    "maxValue",
    "minValue",
    "nameQualifier"
})
@XmlRootElement(name = "SequenceProps")
public class SequenceProps {

    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "Long_Id", required = true)
    protected String longId;
    @XmlElement(name = "Owner_Path", required = true)
    protected OwnerPath ownerPath;
    @XmlElement(name = "Schema_Name", required = true)
    protected SchemaName schemaName;
    @XmlElement(name = "Is_Cache_On")
    protected boolean isCacheOn;
    @XmlElement(name = "Is_Min")
    protected boolean isMin;
    @XmlElement(name = "Is_Max")
    protected boolean isMax;
    @XmlElement(name = "Cache_Capacity", required = true)
    protected BigInteger cacheCapacity;
    @XmlElement(name = "Order_On")
    protected boolean orderOn;
    @XmlElement(name = "Starting_Value", required = true)
    protected BigInteger startingValue;
    @XmlElement(name = "Increment_By", required = true)
    protected BigInteger incrementBy;
    @XmlElement(name = "Dependent_Objects_Ref_Array", required = true)
    protected DependentObjectsRefArray dependentObjectsRefArray;
    @XmlElement(name = "Do_Not_Generate", required = true)
    protected DoNotGenerate doNotGenerate;
    @XmlElement(name = "User_Formatted_Name", required = true)
    protected UserFormattedName userFormattedName;
    @XmlElement(name = "User_Formatted_Physical_Name", required = true)
    protected UserFormattedPhysicalName userFormattedPhysicalName;
    @XmlElement(name = "Is_Cycle_On")
    protected boolean isCycleOn;
    @XmlElement(name = "Max_Value", required = true)
    protected BigInteger maxValue;
    @XmlElement(name = "Min_Value", required = true)
    protected BigInteger minValue;
    @XmlElement(name = "Name_Qualifier", required = true)
    protected NameQualifier nameQualifier;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
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
     * Gets the value of the ownerPath property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerPath }
     *     
     */
    public OwnerPath getOwnerPath() {
        return ownerPath;
    }

    /**
     * Sets the value of the ownerPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerPath }
     *     
     */
    public void setOwnerPath(OwnerPath value) {
        this.ownerPath = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaName }
     *     
     */
    public SchemaName getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaName }
     *     
     */
    public void setSchemaName(SchemaName value) {
        this.schemaName = value;
    }

    /**
     * Gets the value of the isCacheOn property.
     * 
     */
    public boolean isIsCacheOn() {
        return isCacheOn;
    }

    /**
     * Sets the value of the isCacheOn property.
     * 
     */
    public void setIsCacheOn(boolean value) {
        this.isCacheOn = value;
    }

    /**
     * Gets the value of the isMin property.
     * 
     */
    public boolean isIsMin() {
        return isMin;
    }

    /**
     * Sets the value of the isMin property.
     * 
     */
    public void setIsMin(boolean value) {
        this.isMin = value;
    }

    /**
     * Gets the value of the isMax property.
     * 
     */
    public boolean isIsMax() {
        return isMax;
    }

    /**
     * Sets the value of the isMax property.
     * 
     */
    public void setIsMax(boolean value) {
        this.isMax = value;
    }

    /**
     * Gets the value of the cacheCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCacheCapacity() {
        return cacheCapacity;
    }

    /**
     * Sets the value of the cacheCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCacheCapacity(BigInteger value) {
        this.cacheCapacity = value;
    }

    /**
     * Gets the value of the orderOn property.
     * 
     */
    public boolean isOrderOn() {
        return orderOn;
    }

    /**
     * Sets the value of the orderOn property.
     * 
     */
    public void setOrderOn(boolean value) {
        this.orderOn = value;
    }

    /**
     * Gets the value of the startingValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartingValue() {
        return startingValue;
    }

    /**
     * Sets the value of the startingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartingValue(BigInteger value) {
        this.startingValue = value;
    }

    /**
     * Gets the value of the incrementBy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncrementBy() {
        return incrementBy;
    }

    /**
     * Sets the value of the incrementBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncrementBy(BigInteger value) {
        this.incrementBy = value;
    }

    /**
     * Gets the value of the dependentObjectsRefArray property.
     * 
     * @return
     *     possible object is
     *     {@link DependentObjectsRefArray }
     *     
     */
    public DependentObjectsRefArray getDependentObjectsRefArray() {
        return dependentObjectsRefArray;
    }

    /**
     * Sets the value of the dependentObjectsRefArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentObjectsRefArray }
     *     
     */
    public void setDependentObjectsRefArray(DependentObjectsRefArray value) {
        this.dependentObjectsRefArray = value;
    }

    /**
     * Gets the value of the doNotGenerate property.
     * 
     * @return
     *     possible object is
     *     {@link DoNotGenerate }
     *     
     */
    public DoNotGenerate getDoNotGenerate() {
        return doNotGenerate;
    }

    /**
     * Sets the value of the doNotGenerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoNotGenerate }
     *     
     */
    public void setDoNotGenerate(DoNotGenerate value) {
        this.doNotGenerate = value;
    }

    /**
     * Gets the value of the userFormattedName property.
     * 
     * @return
     *     possible object is
     *     {@link UserFormattedName }
     *     
     */
    public UserFormattedName getUserFormattedName() {
        return userFormattedName;
    }

    /**
     * Sets the value of the userFormattedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFormattedName }
     *     
     */
    public void setUserFormattedName(UserFormattedName value) {
        this.userFormattedName = value;
    }

    /**
     * Gets the value of the userFormattedPhysicalName property.
     * 
     * @return
     *     possible object is
     *     {@link UserFormattedPhysicalName }
     *     
     */
    public UserFormattedPhysicalName getUserFormattedPhysicalName() {
        return userFormattedPhysicalName;
    }

    /**
     * Sets the value of the userFormattedPhysicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFormattedPhysicalName }
     *     
     */
    public void setUserFormattedPhysicalName(UserFormattedPhysicalName value) {
        this.userFormattedPhysicalName = value;
    }

    /**
     * Gets the value of the isCycleOn property.
     * 
     */
    public boolean isIsCycleOn() {
        return isCycleOn;
    }

    /**
     * Sets the value of the isCycleOn property.
     * 
     */
    public void setIsCycleOn(boolean value) {
        this.isCycleOn = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxValue(BigInteger value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinValue(BigInteger value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the nameQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link NameQualifier }
     *     
     */
    public NameQualifier getNameQualifier() {
        return nameQualifier;
    }

    /**
     * Sets the value of the nameQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameQualifier }
     *     
     */
    public void setNameQualifier(NameQualifier value) {
        this.nameQualifier = value;
    }

}
