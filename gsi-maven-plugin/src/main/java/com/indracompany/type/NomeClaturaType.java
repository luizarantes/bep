package com.indracompany.type;

public enum NomeClaturaType {

	CA("CODE"), CD("CODE"), DH("DATE"), DT("DATE"), DS("DESCRIPTION"), TX(
			"DESCRIPTION"), HR("HOUR"), FL("FILE"), IN(""), ES(""), MD(
			"MEASURE"), NM("NAME"), VL("VALUE"), NR("NUMBER"), PC("PERCENT"), PZ(
			"TIME"), QT("QUANTITY"), SG("INITIAL"), TP("TYPE");

	private String value;

	/**
	 * @param value
	 */
	NomeClaturaType(String value) {
		this.value = value;
	}

	/**
	 * @return String
	 */
	public String getValue() {
		return this.value;
	}

}
