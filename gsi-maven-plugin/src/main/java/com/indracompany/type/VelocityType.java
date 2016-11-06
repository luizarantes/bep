package com.indracompany.type;

public enum VelocityType {

	ENTITY("entity"),
	ENTITY_NAME("entityName"),
	TYPE_PK("typePK"),
	PACKAGE("package"),
	PACKAGE_DEFAULT("packageDefault"),
	ENUM_NAME("enumName"),
	CONSTANTS("constants");

	private String value;

	/**
	 * @param value
	 */
	VelocityType(String value) {
		this.value = value;
	}

	/**
	 * @return String
	 */
	public String getValue() {
		return this.value;
	}

}
