package com.indracompany.gsi;

public abstract interface GsiTemplateInterface {

	/**
	 * @throws Exception
	 */
	public abstract void build() throws Exception;

	/**
	 * @param pathPackage
	 */
	public abstract void setPathPackage(String pathPackage);

	/**
	 * @return String
	 */
	public abstract String getPathPackage();
	
	/**
	 * @param pathERwinXML
	 */
	public abstract void setPathERwinXML(String pathERwinXML);

	/**
	 * @return String
	 */
	public abstract String getPathERwinXML();
	
	/**
	 * @param typeTemplate
	 */
	public abstract void setTypeTemplate(String typeTemplate);

	/**
	 * @return String
	 */
	public abstract String getTypeTemplate();

}
