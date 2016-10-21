package com.indracompany.type;

public enum ValidatorType {

	CNPJ("br.com.caelum.stella.hibernate.validator.CNPJ"),
	CPF("br.com.caelum.stella.hibernate.validator.CPF"),	
	IpOrMask("com.btg.pactual.core.validator.IpOrMask"),
	NotEmpty("com.btg.pactual.core.validator.NotEmpty"),
	NotNull("javax.validation.constraints.NotNull"),		
	Past("javax.validation.constraints.Past"),
	Future("javax.validation.constraints.Future"),
	Valid("javax.validation.Valid"),	
	Min("javax.validation.constraints.Min"),
	Max("javax.validation.constraints.Max"),
	Pattern("javax.validation.constraints.Pattern"),
	Length("javax.validation.constraints.Length"),
	Size("javax.validation.constraints.Size");

	private String value;

	/**
	 * @param value
	 */
	ValidatorType(String value) {
		this.value = value;
	}

	/**
	 * @return String
	 */
	public String getValue() {
		return this.value;
	}

}
