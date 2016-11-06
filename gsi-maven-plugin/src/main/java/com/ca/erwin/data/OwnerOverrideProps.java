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
 *         &lt;element ref="{http://www.ca.com/erwin/data}Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Long_Id"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Owner_Path"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Dependent_Objects_Ref_Array"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Do_Not_Generate"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Object_Typecode"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Owner_Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}User_Formatted_Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}User_Formatted_Physical_Name"/>
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
    "dependentObjectsRefArray",
    "doNotGenerate",
    "objectTypecode",
    "ownerName",
    "userFormattedName",
    "userFormattedPhysicalName"
})
@XmlRootElement(name = "Owner_OverrideProps")
public class OwnerOverrideProps {

    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "Long_Id", required = true)
    protected String longId;
    @XmlElement(name = "Owner_Path", required = true)
    protected OwnerPath ownerPath;
    @XmlElement(name = "Dependent_Objects_Ref_Array", required = true)
    protected DependentObjectsRefArray dependentObjectsRefArray;
    @XmlElement(name = "Do_Not_Generate", required = true)
    protected DoNotGenerate doNotGenerate;
    @XmlElement(name = "Object_Typecode", required = true)
    protected String objectTypecode;
    @XmlElement(name = "Owner_Name", required = true)
    protected OwnerName ownerName;
    @XmlElement(name = "User_Formatted_Name", required = true)
    protected UserFormattedName userFormattedName;
    @XmlElement(name = "User_Formatted_Physical_Name", required = true)
    protected UserFormattedPhysicalName userFormattedPhysicalName;

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

}
