package com.indracompany.type;

public enum NomeClaturaType {

	CA("CODIGO"), CD("CODIGO"), DH("DATA"), DT("DATA"), DS("DESCRICAO"), TX("DESCRICAO"), HR("HORA"), FL(
			"ARQUIVO"), IN(""), ES(""), MD("MEDIDA"), NM("NOME"), VL("VALOR"), NR(
			"NUMERO"), PC("PERCENTUAL"), PZ("PRAZO"), QT("QUANTIDADE"), SG(
			"SIGLA"), TP("TIPO");

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
