package com.indracompany.to;

import java.io.Serializable;

import com.indracompany.jaxb.note.column.NoteColumnConfiguration;

public class ColumnTO implements Serializable, Comparable<ColumnTO> {

	private static final long serialVersionUID = 7706557758347292269L;

	private NoteColumnConfiguration noteColumnConfiguration;

	private Integer order;

	private String physicalName;

	private String logicalName;

	private String enumName;

	private String referencedColumnName;

	private String mappedBy;

	private String type;

	private String length;

	private String precision;

	private String scale;

	private String comment;

	private boolean lengthNull;

	private boolean precisionNull;

	private boolean scaleNull;

	private boolean date;

	private boolean timestamp;

	private boolean file;

	private boolean clob;

	private boolean enumeration;

	private boolean manyToOne;

	private boolean oneToMany;

	private boolean oneToOne;

	private boolean useMappedBy;

	private boolean nullable;

	private boolean notNullNoteValidator;

	private boolean notNullNoteOrm;

	private boolean display;

	public NoteColumnConfiguration getNoteColumnConfiguration() {
		return noteColumnConfiguration;
	}

	public void setNoteColumnConfiguration(
			NoteColumnConfiguration noteColumnConfiguration) {
		this.noteColumnConfiguration = noteColumnConfiguration;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getPhysicalName() {
		return physicalName;
	}

	public void setPhysicalName(String physicalName) {
		this.physicalName = physicalName;
	}

	public String getLogicalName() {
		return logicalName;
	}

	public void setLogicalName(String logicalName) {
		this.logicalName = logicalName;
	}

	public String getEnumName() {
		return enumName;
	}

	public void setEnumName(String enumName) {
		this.enumName = enumName;
	}

	public String getReferencedColumnName() {
		return referencedColumnName;
	}

	public void setReferencedColumnName(String referencedColumnName) {
		this.referencedColumnName = referencedColumnName;
	}

	public String getMappedBy() {
		return mappedBy;
	}

	public void setMappedBy(String mappedBy) {
		this.mappedBy = mappedBy;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getPrecision() {
		return precision;
	}

	public void setPrecision(String precision) {
		this.precision = precision;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isLengthNull() {
		return lengthNull;
	}

	public void setLengthNull(boolean lengthNull) {
		this.lengthNull = lengthNull;
	}

	public boolean isPrecisionNull() {
		return precisionNull;
	}

	public void setPrecisionNull(boolean precisionNull) {
		this.precisionNull = precisionNull;
	}

	public boolean isScaleNull() {
		return scaleNull;
	}

	public void setScaleNull(boolean scaleNull) {
		this.scaleNull = scaleNull;
	}

	public boolean isDate() {
		return date;
	}

	public void setDate(boolean date) {
		this.date = date;
	}

	public boolean isTimestamp() {
		return timestamp;
	}

	public void setTimestamp(boolean timestamp) {
		this.timestamp = timestamp;
	}

	public boolean isFile() {
		return file;
	}

	public void setFile(boolean file) {
		this.file = file;
	}

	public boolean isClob() {
		return clob;
	}

	public void setClob(boolean clob) {
		this.clob = clob;
	}

	public boolean isEnumeration() {
		return enumeration;
	}

	public void setEnumeration(boolean enumeration) {
		this.enumeration = enumeration;
	}

	public boolean isManyToOne() {
		return manyToOne;
	}

	public void setManyToOne(boolean manyToOne) {
		this.manyToOne = manyToOne;
	}

	public boolean isOneToMany() {
		return oneToMany;
	}

	public void setOneToMany(boolean oneToMany) {
		this.oneToMany = oneToMany;
	}

	public boolean isOneToOne() {
		return oneToOne;
	}

	public void setOneToOne(boolean oneToOne) {
		this.oneToOne = oneToOne;
	}

	public boolean isUseMappedBy() {
		return useMappedBy;
	}

	public void setUseMappedBy(boolean useMappedBy) {
		this.useMappedBy = useMappedBy;
	}

	public boolean isNullable() {
		return nullable;
	}

	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}

	public boolean isNotNullNoteValidator() {
		return notNullNoteValidator;
	}

	public void setNotNullNoteValidator(boolean notNullNoteValidator) {
		this.notNullNoteValidator = notNullNoteValidator;
	}

	public boolean isNotNullNoteOrm() {
		return notNullNoteOrm;
	}

	public void setNotNullNoteOrm(boolean notNullNoteOrm) {
		this.notNullNoteOrm = notNullNoteOrm;
	}

	public boolean isDisplay() {
		return display;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	}

	@Override
	public int compareTo(ColumnTO o) {
		if (this.getOrder() != null && o.getOrder() != null)
			return this.getOrder().compareTo(o.getOrder());
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((logicalName == null) ? 0 : logicalName.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ColumnTO)) {
			return false;
		}
		ColumnTO other = (ColumnTO) obj;
		if (logicalName == null) {
			if (other.logicalName != null) {
				return false;
			}
		} else if (!logicalName.equals(other.logicalName)) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		return true;
	}

}
