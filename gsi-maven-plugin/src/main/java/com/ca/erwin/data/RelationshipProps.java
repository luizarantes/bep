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
 *         &lt;element ref="{http://www.ca.com/erwin/data}Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Long_Id"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Owner_Path"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Type"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Note" minOccurs="0"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Null_Option_Type"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_To_Parent_Verb_Phrase"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Cardinality"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Relationship_Sequence" minOccurs="0"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Key_Group_Ref"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_Update_Rule"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_Delete_Rule"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_Insert_Rule"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_Update_Rule"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_Delete_Rule"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_Insert_Rule"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Physical_Name"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_To_Child_Verb_Phrase"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_Entity_Ref"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_Entity_Ref"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_Update_Trigger_Template_Ref"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Child_Insert_Trigger_Template_Ref"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_Update_Trigger_Template_Ref"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Parent_Delete_Trigger_Template_Ref"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Drawing_Objects_Ref_Array"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Dependent_Objects_Ref_Array"/>
 *         &lt;element ref="{http://www.ca.com/erwin/data}Do_Not_Generate"/>
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
    "type",
    "note",
    "nullOptionType",
    "childToParentVerbPhrase",
    "cardinality",
    "relationshipSequence",
    "keyGroupRef",
    "parentUpdateRule",
    "parentDeleteRule",
    "parentInsertRule",
    "childUpdateRule",
    "childDeleteRule",
    "childInsertRule",
    "physicalName",
    "parentToChildVerbPhrase",
    "parentEntityRef",
    "childEntityRef",
    "childUpdateTriggerTemplateRef",
    "childInsertTriggerTemplateRef",
    "parentUpdateTriggerTemplateRef",
    "parentDeleteTriggerTemplateRef",
    "drawingObjectsRefArray",
    "dependentObjectsRefArray",
    "doNotGenerate",
    "userFormattedName",
    "userFormattedPhysicalName"
})
@XmlRootElement(name = "RelationshipProps")
public class RelationshipProps {

    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "Long_Id", required = true)
    protected String longId;
    @XmlElement(name = "Owner_Path", required = true)
    protected OwnerPath ownerPath;
    @XmlElement(name = "Type", required = true)
    protected Type type;
    @XmlElement(name = "Note")
    protected Note note;
    @XmlElement(name = "Null_Option_Type", required = true)
    protected NullOptionType nullOptionType;
    @XmlElement(name = "Child_To_Parent_Verb_Phrase", required = true)
    protected String childToParentVerbPhrase;
    @XmlElement(name = "Cardinality", required = true)
    protected Cardinality cardinality;
    @XmlElement(name = "Relationship_Sequence")
    protected BigInteger relationshipSequence;
    @XmlElement(name = "Key_Group_Ref", required = true)
    protected String keyGroupRef;
    @XmlElement(name = "Parent_Update_Rule", required = true)
    protected ParentUpdateRule parentUpdateRule;
    @XmlElement(name = "Parent_Delete_Rule", required = true)
    protected ParentDeleteRule parentDeleteRule;
    @XmlElement(name = "Parent_Insert_Rule", required = true)
    protected ParentInsertRule parentInsertRule;
    @XmlElement(name = "Child_Update_Rule", required = true)
    protected ChildUpdateRule childUpdateRule;
    @XmlElement(name = "Child_Delete_Rule", required = true)
    protected ChildDeleteRule childDeleteRule;
    @XmlElement(name = "Child_Insert_Rule", required = true)
    protected ChildInsertRule childInsertRule;
    @XmlElement(name = "Physical_Name", required = true)
    protected PhysicalName physicalName;
    @XmlElement(name = "Parent_To_Child_Verb_Phrase", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String parentToChildVerbPhrase;
    @XmlElement(name = "Parent_Entity_Ref", required = true)
    protected String parentEntityRef;
    @XmlElement(name = "Child_Entity_Ref", required = true)
    protected String childEntityRef;
    @XmlElement(name = "Child_Update_Trigger_Template_Ref", required = true)
    protected ChildUpdateTriggerTemplateRef childUpdateTriggerTemplateRef;
    @XmlElement(name = "Child_Insert_Trigger_Template_Ref", required = true)
    protected ChildInsertTriggerTemplateRef childInsertTriggerTemplateRef;
    @XmlElement(name = "Parent_Update_Trigger_Template_Ref", required = true)
    protected ParentUpdateTriggerTemplateRef parentUpdateTriggerTemplateRef;
    @XmlElement(name = "Parent_Delete_Trigger_Template_Ref", required = true)
    protected ParentDeleteTriggerTemplateRef parentDeleteTriggerTemplateRef;
    @XmlElement(name = "Drawing_Objects_Ref_Array", required = true)
    protected DrawingObjectsRefArray drawingObjectsRefArray;
    @XmlElement(name = "Dependent_Objects_Ref_Array", required = true)
    protected DependentObjectsRefArray dependentObjectsRefArray;
    @XmlElement(name = "Do_Not_Generate", required = true)
    protected DoNotGenerate doNotGenerate;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link Note }
     *     
     */
    public Note getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link Note }
     *     
     */
    public void setNote(Note value) {
        this.note = value;
    }

    /**
     * Gets the value of the nullOptionType property.
     * 
     * @return
     *     possible object is
     *     {@link NullOptionType }
     *     
     */
    public NullOptionType getNullOptionType() {
        return nullOptionType;
    }

    /**
     * Sets the value of the nullOptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullOptionType }
     *     
     */
    public void setNullOptionType(NullOptionType value) {
        this.nullOptionType = value;
    }

    /**
     * Gets the value of the childToParentVerbPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildToParentVerbPhrase() {
        return childToParentVerbPhrase;
    }

    /**
     * Sets the value of the childToParentVerbPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildToParentVerbPhrase(String value) {
        this.childToParentVerbPhrase = value;
    }

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link Cardinality }
     *     
     */
    public Cardinality getCardinality() {
        return cardinality;
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardinality }
     *     
     */
    public void setCardinality(Cardinality value) {
        this.cardinality = value;
    }

    /**
     * Gets the value of the relationshipSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelationshipSequence() {
        return relationshipSequence;
    }

    /**
     * Sets the value of the relationshipSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelationshipSequence(BigInteger value) {
        this.relationshipSequence = value;
    }

    /**
     * Gets the value of the keyGroupRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyGroupRef() {
        return keyGroupRef;
    }

    /**
     * Sets the value of the keyGroupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyGroupRef(String value) {
        this.keyGroupRef = value;
    }

    /**
     * Gets the value of the parentUpdateRule property.
     * 
     * @return
     *     possible object is
     *     {@link ParentUpdateRule }
     *     
     */
    public ParentUpdateRule getParentUpdateRule() {
        return parentUpdateRule;
    }

    /**
     * Sets the value of the parentUpdateRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentUpdateRule }
     *     
     */
    public void setParentUpdateRule(ParentUpdateRule value) {
        this.parentUpdateRule = value;
    }

    /**
     * Gets the value of the parentDeleteRule property.
     * 
     * @return
     *     possible object is
     *     {@link ParentDeleteRule }
     *     
     */
    public ParentDeleteRule getParentDeleteRule() {
        return parentDeleteRule;
    }

    /**
     * Sets the value of the parentDeleteRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentDeleteRule }
     *     
     */
    public void setParentDeleteRule(ParentDeleteRule value) {
        this.parentDeleteRule = value;
    }

    /**
     * Gets the value of the parentInsertRule property.
     * 
     * @return
     *     possible object is
     *     {@link ParentInsertRule }
     *     
     */
    public ParentInsertRule getParentInsertRule() {
        return parentInsertRule;
    }

    /**
     * Sets the value of the parentInsertRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentInsertRule }
     *     
     */
    public void setParentInsertRule(ParentInsertRule value) {
        this.parentInsertRule = value;
    }

    /**
     * Gets the value of the childUpdateRule property.
     * 
     * @return
     *     possible object is
     *     {@link ChildUpdateRule }
     *     
     */
    public ChildUpdateRule getChildUpdateRule() {
        return childUpdateRule;
    }

    /**
     * Sets the value of the childUpdateRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildUpdateRule }
     *     
     */
    public void setChildUpdateRule(ChildUpdateRule value) {
        this.childUpdateRule = value;
    }

    /**
     * Gets the value of the childDeleteRule property.
     * 
     * @return
     *     possible object is
     *     {@link ChildDeleteRule }
     *     
     */
    public ChildDeleteRule getChildDeleteRule() {
        return childDeleteRule;
    }

    /**
     * Sets the value of the childDeleteRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildDeleteRule }
     *     
     */
    public void setChildDeleteRule(ChildDeleteRule value) {
        this.childDeleteRule = value;
    }

    /**
     * Gets the value of the childInsertRule property.
     * 
     * @return
     *     possible object is
     *     {@link ChildInsertRule }
     *     
     */
    public ChildInsertRule getChildInsertRule() {
        return childInsertRule;
    }

    /**
     * Sets the value of the childInsertRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildInsertRule }
     *     
     */
    public void setChildInsertRule(ChildInsertRule value) {
        this.childInsertRule = value;
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
     * Gets the value of the parentToChildVerbPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentToChildVerbPhrase() {
        return parentToChildVerbPhrase;
    }

    /**
     * Sets the value of the parentToChildVerbPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentToChildVerbPhrase(String value) {
        this.parentToChildVerbPhrase = value;
    }

    /**
     * Gets the value of the parentEntityRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentEntityRef() {
        return parentEntityRef;
    }

    /**
     * Sets the value of the parentEntityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentEntityRef(String value) {
        this.parentEntityRef = value;
    }

    /**
     * Gets the value of the childEntityRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildEntityRef() {
        return childEntityRef;
    }

    /**
     * Sets the value of the childEntityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildEntityRef(String value) {
        this.childEntityRef = value;
    }

    /**
     * Gets the value of the childUpdateTriggerTemplateRef property.
     * 
     * @return
     *     possible object is
     *     {@link ChildUpdateTriggerTemplateRef }
     *     
     */
    public ChildUpdateTriggerTemplateRef getChildUpdateTriggerTemplateRef() {
        return childUpdateTriggerTemplateRef;
    }

    /**
     * Sets the value of the childUpdateTriggerTemplateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildUpdateTriggerTemplateRef }
     *     
     */
    public void setChildUpdateTriggerTemplateRef(ChildUpdateTriggerTemplateRef value) {
        this.childUpdateTriggerTemplateRef = value;
    }

    /**
     * Gets the value of the childInsertTriggerTemplateRef property.
     * 
     * @return
     *     possible object is
     *     {@link ChildInsertTriggerTemplateRef }
     *     
     */
    public ChildInsertTriggerTemplateRef getChildInsertTriggerTemplateRef() {
        return childInsertTriggerTemplateRef;
    }

    /**
     * Sets the value of the childInsertTriggerTemplateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildInsertTriggerTemplateRef }
     *     
     */
    public void setChildInsertTriggerTemplateRef(ChildInsertTriggerTemplateRef value) {
        this.childInsertTriggerTemplateRef = value;
    }

    /**
     * Gets the value of the parentUpdateTriggerTemplateRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParentUpdateTriggerTemplateRef }
     *     
     */
    public ParentUpdateTriggerTemplateRef getParentUpdateTriggerTemplateRef() {
        return parentUpdateTriggerTemplateRef;
    }

    /**
     * Sets the value of the parentUpdateTriggerTemplateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentUpdateTriggerTemplateRef }
     *     
     */
    public void setParentUpdateTriggerTemplateRef(ParentUpdateTriggerTemplateRef value) {
        this.parentUpdateTriggerTemplateRef = value;
    }

    /**
     * Gets the value of the parentDeleteTriggerTemplateRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParentDeleteTriggerTemplateRef }
     *     
     */
    public ParentDeleteTriggerTemplateRef getParentDeleteTriggerTemplateRef() {
        return parentDeleteTriggerTemplateRef;
    }

    /**
     * Sets the value of the parentDeleteTriggerTemplateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentDeleteTriggerTemplateRef }
     *     
     */
    public void setParentDeleteTriggerTemplateRef(ParentDeleteTriggerTemplateRef value) {
        this.parentDeleteTriggerTemplateRef = value;
    }

    /**
     * Gets the value of the drawingObjectsRefArray property.
     * 
     * @return
     *     possible object is
     *     {@link DrawingObjectsRefArray }
     *     
     */
    public DrawingObjectsRefArray getDrawingObjectsRefArray() {
        return drawingObjectsRefArray;
    }

    /**
     * Sets the value of the drawingObjectsRefArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawingObjectsRefArray }
     *     
     */
    public void setDrawingObjectsRefArray(DrawingObjectsRefArray value) {
        this.drawingObjectsRefArray = value;
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

}
