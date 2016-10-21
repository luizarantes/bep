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
 *         &lt;element ref="{http://www.ca.com/erwin/data}Physical_Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Location_Rectangle"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Model_Object_Ref"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Font_Color"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Outline_Color"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_Connection_Side"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_Connection_Side"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Relationship_Coordinates_Array"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Is_User_Controlled_Path"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_Verb_Phrase_Side"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_Verb_Phrase_Side"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Mid_Point_Of_Relationship_Point"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_Verb_Phrase_Point"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_Verb_Phrase_Point"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Is_Color_Inherited"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Is_Font_Inherited"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Font_Ref"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Dependent_Objects_Ref_Array"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_Drawing_Object_Ref" minOccurs="0"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_Drawing_Object_Ref" minOccurs="0"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_Connection_Position"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_Connection_Position"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Middle_Verb_Phrase_Point"/>
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
    "physicalName",
    "locationRectangle",
    "modelObjectRef",
    "fontColor",
    "outlineColor",
    "parentConnectionSide",
    "childConnectionSide",
    "relationshipCoordinatesArray",
    "isUserControlledPath",
    "parentVerbPhraseSide",
    "childVerbPhraseSide",
    "midPointOfRelationshipPoint",
    "parentVerbPhrasePoint",
    "childVerbPhrasePoint",
    "isColorInherited",
    "isFontInherited",
    "fontRef",
    "dependentObjectsRefArray",
    "childDrawingObjectRef",
    "parentDrawingObjectRef",
    "childConnectionPosition",
    "parentConnectionPosition",
    "middleVerbPhrasePoint",
    "userFormattedName",
    "userFormattedPhysicalName"
})
@XmlRootElement(name = "Drawing_Object_RelationshipProps")
public class DrawingObjectRelationshipProps {

    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "Long_Id", required = true)
    protected String longId;
    @XmlElement(name = "Owner_Path", required = true)
    protected OwnerPath ownerPath;
    @XmlElement(name = "Physical_Name", required = true)
    protected PhysicalName physicalName;
    @XmlElement(name = "Location_Rectangle", required = true)
    protected LocationRectangle locationRectangle;
    @XmlElement(name = "Model_Object_Ref", required = true)
    protected String modelObjectRef;
    @XmlElement(name = "Font_Color", required = true)
    protected FontColor fontColor;
    @XmlElement(name = "Outline_Color", required = true)
    protected OutlineColor outlineColor;
    @XmlElement(name = "Parent_Connection_Side", required = true)
    protected BigInteger parentConnectionSide;
    @XmlElement(name = "Child_Connection_Side", required = true)
    protected BigInteger childConnectionSide;
    @XmlElement(name = "Relationship_Coordinates_Array", required = true)
    protected RelationshipCoordinatesArray relationshipCoordinatesArray;
    @XmlElement(name = "Is_User_Controlled_Path")
    protected boolean isUserControlledPath;
    @XmlElement(name = "Parent_Verb_Phrase_Side", required = true)
    protected BigInteger parentVerbPhraseSide;
    @XmlElement(name = "Child_Verb_Phrase_Side", required = true)
    protected BigInteger childVerbPhraseSide;
    @XmlElement(name = "Mid_Point_Of_Relationship_Point", required = true)
    protected String midPointOfRelationshipPoint;
    @XmlElement(name = "Parent_Verb_Phrase_Point", required = true)
    protected String parentVerbPhrasePoint;
    @XmlElement(name = "Child_Verb_Phrase_Point", required = true)
    protected String childVerbPhrasePoint;
    @XmlElement(name = "Is_Color_Inherited", required = true)
    protected IsColorInherited isColorInherited;
    @XmlElement(name = "Is_Font_Inherited", required = true)
    protected IsFontInherited isFontInherited;
    @XmlElement(name = "Font_Ref", required = true)
    protected FontRef fontRef;
    @XmlElement(name = "Dependent_Objects_Ref_Array", required = true)
    protected DependentObjectsRefArray dependentObjectsRefArray;
    @XmlElement(name = "Child_Drawing_Object_Ref")
    protected ChildDrawingObjectRef childDrawingObjectRef;
    @XmlElement(name = "Parent_Drawing_Object_Ref")
    protected ParentDrawingObjectRef parentDrawingObjectRef;
    @XmlElement(name = "Child_Connection_Position", required = true)
    protected BigInteger childConnectionPosition;
    @XmlElement(name = "Parent_Connection_Position", required = true)
    protected BigInteger parentConnectionPosition;
    @XmlElement(name = "Middle_Verb_Phrase_Point", required = true)
    protected String middleVerbPhrasePoint;
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
     * Gets the value of the physicalName property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalName }
     *     
     */
    public PhysicalName getPhysicalName() {
        return physicalName;
    }

    /**
     * Sets the value of the physicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalName }
     *     
     */
    public void setPhysicalName(PhysicalName value) {
        this.physicalName = value;
    }

    /**
     * Gets the value of the locationRectangle property.
     * 
     * @return
     *     possible object is
     *     {@link LocationRectangle }
     *     
     */
    public LocationRectangle getLocationRectangle() {
        return locationRectangle;
    }

    /**
     * Sets the value of the locationRectangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationRectangle }
     *     
     */
    public void setLocationRectangle(LocationRectangle value) {
        this.locationRectangle = value;
    }

    /**
     * Gets the value of the modelObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelObjectRef() {
        return modelObjectRef;
    }

    /**
     * Sets the value of the modelObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelObjectRef(String value) {
        this.modelObjectRef = value;
    }

    /**
     * Gets the value of the fontColor property.
     * 
     * @return
     *     possible object is
     *     {@link FontColor }
     *     
     */
    public FontColor getFontColor() {
        return fontColor;
    }

    /**
     * Sets the value of the fontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontColor }
     *     
     */
    public void setFontColor(FontColor value) {
        this.fontColor = value;
    }

    /**
     * Gets the value of the outlineColor property.
     * 
     * @return
     *     possible object is
     *     {@link OutlineColor }
     *     
     */
    public OutlineColor getOutlineColor() {
        return outlineColor;
    }

    /**
     * Sets the value of the outlineColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutlineColor }
     *     
     */
    public void setOutlineColor(OutlineColor value) {
        this.outlineColor = value;
    }

    /**
     * Gets the value of the parentConnectionSide property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentConnectionSide() {
        return parentConnectionSide;
    }

    /**
     * Sets the value of the parentConnectionSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentConnectionSide(BigInteger value) {
        this.parentConnectionSide = value;
    }

    /**
     * Gets the value of the childConnectionSide property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildConnectionSide() {
        return childConnectionSide;
    }

    /**
     * Sets the value of the childConnectionSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildConnectionSide(BigInteger value) {
        this.childConnectionSide = value;
    }

    /**
     * Gets the value of the relationshipCoordinatesArray property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipCoordinatesArray }
     *     
     */
    public RelationshipCoordinatesArray getRelationshipCoordinatesArray() {
        return relationshipCoordinatesArray;
    }

    /**
     * Sets the value of the relationshipCoordinatesArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipCoordinatesArray }
     *     
     */
    public void setRelationshipCoordinatesArray(RelationshipCoordinatesArray value) {
        this.relationshipCoordinatesArray = value;
    }

    /**
     * Gets the value of the isUserControlledPath property.
     * 
     */
    public boolean isIsUserControlledPath() {
        return isUserControlledPath;
    }

    /**
     * Sets the value of the isUserControlledPath property.
     * 
     */
    public void setIsUserControlledPath(boolean value) {
        this.isUserControlledPath = value;
    }

    /**
     * Gets the value of the parentVerbPhraseSide property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentVerbPhraseSide() {
        return parentVerbPhraseSide;
    }

    /**
     * Sets the value of the parentVerbPhraseSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentVerbPhraseSide(BigInteger value) {
        this.parentVerbPhraseSide = value;
    }

    /**
     * Gets the value of the childVerbPhraseSide property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildVerbPhraseSide() {
        return childVerbPhraseSide;
    }

    /**
     * Sets the value of the childVerbPhraseSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildVerbPhraseSide(BigInteger value) {
        this.childVerbPhraseSide = value;
    }

    /**
     * Gets the value of the midPointOfRelationshipPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidPointOfRelationshipPoint() {
        return midPointOfRelationshipPoint;
    }

    /**
     * Sets the value of the midPointOfRelationshipPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidPointOfRelationshipPoint(String value) {
        this.midPointOfRelationshipPoint = value;
    }

    /**
     * Gets the value of the parentVerbPhrasePoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentVerbPhrasePoint() {
        return parentVerbPhrasePoint;
    }

    /**
     * Sets the value of the parentVerbPhrasePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentVerbPhrasePoint(String value) {
        this.parentVerbPhrasePoint = value;
    }

    /**
     * Gets the value of the childVerbPhrasePoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildVerbPhrasePoint() {
        return childVerbPhrasePoint;
    }

    /**
     * Sets the value of the childVerbPhrasePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildVerbPhrasePoint(String value) {
        this.childVerbPhrasePoint = value;
    }

    /**
     * Gets the value of the isColorInherited property.
     * 
     * @return
     *     possible object is
     *     {@link IsColorInherited }
     *     
     */
    public IsColorInherited getIsColorInherited() {
        return isColorInherited;
    }

    /**
     * Sets the value of the isColorInherited property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsColorInherited }
     *     
     */
    public void setIsColorInherited(IsColorInherited value) {
        this.isColorInherited = value;
    }

    /**
     * Gets the value of the isFontInherited property.
     * 
     * @return
     *     possible object is
     *     {@link IsFontInherited }
     *     
     */
    public IsFontInherited getIsFontInherited() {
        return isFontInherited;
    }

    /**
     * Sets the value of the isFontInherited property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsFontInherited }
     *     
     */
    public void setIsFontInherited(IsFontInherited value) {
        this.isFontInherited = value;
    }

    /**
     * Gets the value of the fontRef property.
     * 
     * @return
     *     possible object is
     *     {@link FontRef }
     *     
     */
    public FontRef getFontRef() {
        return fontRef;
    }

    /**
     * Sets the value of the fontRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontRef }
     *     
     */
    public void setFontRef(FontRef value) {
        this.fontRef = value;
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
     * Gets the value of the childDrawingObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ChildDrawingObjectRef }
     *     
     */
    public ChildDrawingObjectRef getChildDrawingObjectRef() {
        return childDrawingObjectRef;
    }

    /**
     * Sets the value of the childDrawingObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildDrawingObjectRef }
     *     
     */
    public void setChildDrawingObjectRef(ChildDrawingObjectRef value) {
        this.childDrawingObjectRef = value;
    }

    /**
     * Gets the value of the parentDrawingObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParentDrawingObjectRef }
     *     
     */
    public ParentDrawingObjectRef getParentDrawingObjectRef() {
        return parentDrawingObjectRef;
    }

    /**
     * Sets the value of the parentDrawingObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentDrawingObjectRef }
     *     
     */
    public void setParentDrawingObjectRef(ParentDrawingObjectRef value) {
        this.parentDrawingObjectRef = value;
    }

    /**
     * Gets the value of the childConnectionPosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildConnectionPosition() {
        return childConnectionPosition;
    }

    /**
     * Sets the value of the childConnectionPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildConnectionPosition(BigInteger value) {
        this.childConnectionPosition = value;
    }

    /**
     * Gets the value of the parentConnectionPosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentConnectionPosition() {
        return parentConnectionPosition;
    }

    /**
     * Sets the value of the parentConnectionPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentConnectionPosition(BigInteger value) {
        this.parentConnectionPosition = value;
    }

    /**
     * Gets the value of the middleVerbPhrasePoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleVerbPhrasePoint() {
        return middleVerbPhrasePoint;
    }

    /**
     * Sets the value of the middleVerbPhrasePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleVerbPhrasePoint(String value) {
        this.middleVerbPhrasePoint = value;
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
