package com.indracompany.maven.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.indracompany.gsi.GsiTemplateImpl;
import com.indracompany.gsi.GsiTemplateInterface;

/**
 * 
 * @goal package
 * @phase package
 */
public class GsiMojo extends AbstractMojo {
	
	/**
	 * @parameter property = "pathPackage"
	 */
	private String pathPackage;
	
	/**
	 * @parameter property = "pathERwinXML"
	 */
	private String pathERwinXML;
	
	/**
	 * @parameter property = "typeTemplate"
	 */
	private String typeTemplate;
	

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		try {
			if(this.pathPackage == null || this.pathPackage.trim().equals("")) {
				throw new MojoExecutionException("Invalid package. \nMust not be a empty.");
			}			
			if(this.pathERwinXML == null || this.pathERwinXML.trim().equals("")) {
				throw new MojoExecutionException("Invalid path ERwin XML. \nMust not be a empty.");
			}
			if(this.typeTemplate == null || this.typeTemplate.trim().equals("")) {
				throw new MojoExecutionException("Invalid type template. \nMust not be a empty.");
			}
			GsiTemplateInterface gsiInterface = new GsiTemplateImpl();
			gsiInterface.setPathPackage(this.pathPackage);
			gsiInterface.setPathERwinXML(this.pathERwinXML);
			gsiInterface.setTypeTemplate(this.typeTemplate);
			gsiInterface.build();
		}catch (Exception e) {
			this.getLog().debug(e);
			throw new MojoExecutionException(e.getMessage(), e);
		}
	}
	
}
