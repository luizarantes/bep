//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.13 at 10:21:45 PM BRST 
//


package com.ca.erwin.em2data;

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
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Forward_Engineer_Options_ReportProps"/>
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Forward_Engineer_Options_Set_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Forward_Engineer_Owner_Override_Groups"/>
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
    "forwardEngineerOptionsReportProps",
    "forwardEngineerOptionsSetGroups",
    "forwardEngineerOwnerOverrideGroups"
})
@XmlRootElement(name = "Forward_Engineer_Options_Report")
public class ForwardEngineerOptionsReport {

    @XmlElement(name = "Forward_Engineer_Options_ReportProps", required = true)
    protected ForwardEngineerOptionsReportProps forwardEngineerOptionsReportProps;
    @XmlElement(name = "Forward_Engineer_Options_Set_Groups", required = true)
    protected ForwardEngineerOptionsSetGroups forwardEngineerOptionsSetGroups;
    @XmlElement(name = "Forward_Engineer_Owner_Override_Groups", required = true)
    protected ForwardEngineerOwnerOverrideGroups forwardEngineerOwnerOverrideGroups;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;

    /**
     * Gets the value of the forwardEngineerOptionsReportProps property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardEngineerOptionsReportProps }
     *     
     */
    public ForwardEngineerOptionsReportProps getForwardEngineerOptionsReportProps() {
        return forwardEngineerOptionsReportProps;
    }

    /**
     * Sets the value of the forwardEngineerOptionsReportProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardEngineerOptionsReportProps }
     *     
     */
    public void setForwardEngineerOptionsReportProps(ForwardEngineerOptionsReportProps value) {
        this.forwardEngineerOptionsReportProps = value;
    }

    /**
     * Gets the value of the forwardEngineerOptionsSetGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardEngineerOptionsSetGroups }
     *     
     */
    public ForwardEngineerOptionsSetGroups getForwardEngineerOptionsSetGroups() {
        return forwardEngineerOptionsSetGroups;
    }

    /**
     * Sets the value of the forwardEngineerOptionsSetGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardEngineerOptionsSetGroups }
     *     
     */
    public void setForwardEngineerOptionsSetGroups(ForwardEngineerOptionsSetGroups value) {
        this.forwardEngineerOptionsSetGroups = value;
    }

    /**
     * Gets the value of the forwardEngineerOwnerOverrideGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardEngineerOwnerOverrideGroups }
     *     
     */
    public ForwardEngineerOwnerOverrideGroups getForwardEngineerOwnerOverrideGroups() {
        return forwardEngineerOwnerOverrideGroups;
    }

    /**
     * Sets the value of the forwardEngineerOwnerOverrideGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardEngineerOwnerOverrideGroups }
     *     
     */
    public void setForwardEngineerOwnerOverrideGroups(ForwardEngineerOwnerOverrideGroups value) {
        this.forwardEngineerOwnerOverrideGroups = value;
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
