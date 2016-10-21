package com.indracompany.maven.plugins;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String relationship = "FK01_TSGO_TCNA (TSGO_ACSO to TSGO_TCNA)";
		relationship        =  relationship.substring(relationship.indexOf("(") + 1, relationship.length() - 1);
		String entities[]   =  relationship.split(" to ");
				
		System.out.println(entities[0]);
		System.out.println(entities[1]);
		

	}

}
