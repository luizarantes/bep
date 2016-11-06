package com.indracompany.type;

public enum PackageType {

	JAVA("src/main/java/"),
	RESOURCES_JAVA("src/main/resources/"),
	RESOURCES_TEST("src/test/resources/"),
	TEST("src/test/java/");

	private String value;

	/**
	 * @param value
	 */
	PackageType(String value) {
		this.value = value;
	}

	/**
	 * @return String
	 */
	public String getValue() {
		return this.value;
	}

}
