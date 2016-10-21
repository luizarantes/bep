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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Model_Proxy_ObjectProps"/>
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Stored_Display_Proxy_Object_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Subject_Area_Proxy_Object_Groups"/>
 *         &lt;element ref="{http://www.ca.com/erwin/EM2data}Forward_Engineer_Options_Report_Groups"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modelProxyObjectProps",
    "storedDisplayProxyObjectGroups",
    "subjectAreaProxyObjectGroups",
    "forwardEngineerOptionsReportGroups"
})
@XmlRootElement(name = "Model_Proxy_Object")
public class ModelProxyObject {

    @XmlElement(name = "Model_Proxy_ObjectProps", required = true)
    protected ModelProxyObjectProps modelProxyObjectProps;
    @XmlElement(name = "Stored_Display_Proxy_Object_Groups", required = true)
    protected StoredDisplayProxyObjectGroups storedDisplayProxyObjectGroups;
    @XmlElement(name = "Subject_Area_Proxy_Object_Groups", required = true)
    protected SubjectAreaProxyObjectGroups subjectAreaProxyObjectGroups;
    @XmlElement(name = "Forward_Engineer_Options_Report_Groups", required = true)
    protected ForwardEngineerOptionsReportGroups forwardEngineerOptionsReportGroups;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * Gets the value of the modelProxyObjectProps property.
     * 
     * @return
     *     possible object is
     *     {@link ModelProxyObjectProps }
     *     
     */
    public ModelProxyObjectProps getModelProxyObjectProps() {
        return modelProxyObjectProps;
    }

    /**
     * Sets the value of the modelProxyObjectProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelProxyObjectProps }
     *     
     */
    public void setModelProxyObjectProps(ModelProxyObjectProps value) {
        this.modelProxyObjectProps = value;
    }

    /**
     * Gets the value of the storedDisplayProxyObjectGroups property.
     * 
     * @return
     *     possible object is
     *     {@link StoredDisplayProxyObjectGroups }
     *     
     */
    public StoredDisplayProxyObjectGroups getStoredDisplayProxyObjectGroups() {
        return storedDisplayProxyObjectGroups;
    }

    /**
     * Sets the value of the storedDisplayProxyObjectGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredDisplayProxyObjectGroups }
     *     
     */
    public void setStoredDisplayProxyObjectGroups(StoredDisplayProxyObjectGroups value) {
        this.storedDisplayProxyObjectGroups = value;
    }

    /**
     * Gets the value of the subjectAreaProxyObjectGroups property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAreaProxyObjectGroups }
     *     
     */
    public SubjectAreaProxyObjectGroups getSubjectAreaProxyObjectGroups() {
        return subjectAreaProxyObjectGroups;
    }

    /**
     * Sets the value of the subjectAreaProxyObjectGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAreaProxyObjectGroups }
     *     
     */
    public void setSubjectAreaProxyObjectGroups(SubjectAreaProxyObjectGroups value) {
        this.subjectAreaProxyObjectGroups = value;
    }

    /**
     * Gets the value of the forwardEngineerOptionsReportGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardEngineerOptionsReportGroups }
     *     
     */
    public ForwardEngineerOptionsReportGroups getForwardEngineerOptionsReportGroups() {
        return forwardEngineerOptionsReportGroups;
    }

    /**
     * Sets the value of the forwardEngineerOptionsReportGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardEngineerOptionsReportGroups }
     *     
     */
    public void setForwardEngineerOptionsReportGroups(ForwardEngineerOptionsReportGroups value) {
        this.forwardEngineerOptionsReportGroups = value;
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
