package com.indracompany.type;

public enum Types {

	CHAR("String"), CLOB("String"), BLOB("byte[]"), VARCHAR2("String"), DATE("Date"), TIMESTAMP("Date"), LONG("Long"), INTEGER("Integer"), SHORT("Short"), DOUBLE("Double"), NUMBER("Integer"),
	CHAR_NULL("String"), CLOB_NULL("String"), BLOB_NULL("byte[]"), VARCHAR2_NULL("String"), DATE_NULL("Date"), TIMESTAMP_NULL("Date"), LONG_NULL("Long"), INTEGER_NULL("Integer"), SHORT_NULL("Short"), DOUBLE_NULL("Double"), NUMBER_NULL("Integer");

	private String type;

	private Types(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
