package com.indracompany.gsi;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ca.erwin.ERwin;
import com.indracompany.gsi.template.AbstractTemplateMethod;
import com.indracompany.gsi.template.EngineDaoTemplate;
import com.indracompany.gsi.template.EngineDefaultTemplate;
import com.indracompany.gsi.template.EngineEntityTemplate;
import com.indracompany.type.TypeTemplate;


public class GsiTemplateImpl implements GsiTemplateInterface {	

	private String pathPackage;
	
	private String pathERwinXML;	

	private String typeTemplate;
	
	public GsiTemplateImpl() {
		
	}

	/**
	 * @return VelocityEngine
	 */
	private VelocityEngine getVelocityEngine() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
		return applicationContext.getBean("velocityEngine", VelocityEngine.class);
	}

	/* (non-Javadoc)
	 * @see com.indracompany.gsi.GsiTemplateInterface#build()
	 */
	public void build() throws Exception {
		ERwin elementERWin = this.getElementERwin();
		if (elementERWin != null) {
			//if(engineTemplate != null) {
				String splitTemplate[] = this.getTypeTemplate().split(",");				
				for(String typeTemplate : splitTemplate) {
					this.setTypeTemplate(typeTemplate);
					AbstractTemplateMethod engineTemplate = this.getInstanceEngineTemplate();
					engineTemplate.setPathPackage(this.getPathPackage());
					if(this.getTypeTemplate().toUpperCase().equals(TypeTemplate.SERVICEDAO.toString())) {					
						engineTemplate.execute(this.getVelocityEngine(), elementERWin);			
						this.setTypeTemplate(TypeTemplate.DAO.toString());					
						engineTemplate = this.getInstanceEngineTemplate();
						engineTemplate.setPathPackage(this.getPathPackage());
						engineTemplate.execute(this.getVelocityEngine(), elementERWin);					
					}else {					
						engineTemplate.execute(this.getVelocityEngine(), elementERWin);
					}					
				}
		//	}
		}
	}

	/**
	 * @return ERwin
	 * @throws JAXBException
	 */	
	private ERwin getElementERwin() throws JAXBException {
		JAXBContext jaxbContext   = JAXBContext.newInstance("com.ca.erwin");
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return (ERwin) unmarshaller.unmarshal(new File(this.getPathERwinXML()));
	}
	
	/**
	 * @return AbstractTemplateMethod
	 */
	private AbstractTemplateMethod getInstanceEngineTemplate() {
		if(this.getTypeTemplate() != null && TypeTemplate.valueOf(this.getTypeTemplate()).toString() != null) {
			if(this.getTypeTemplate().toUpperCase().equals(TypeTemplate.ENTITY.toString())) {
				return new EngineEntityTemplate();
			}else if(this.getTypeTemplate().toUpperCase().equals(TypeTemplate.DAO.toString())) {
				return new EngineDaoTemplate();
			}else {
				return new EngineDefaultTemplate(TypeTemplate.valueOf(this.getTypeTemplate().toUpperCase()));
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.indracompany.gsi.GsiTemplateInterface#getPathPackage()
	 */
	public String getPathPackage() {
		return pathPackage;
	}


	/* (non-Javadoc)
	 * @see com.indracompany.gsi.GsiTemplateInterface#getPathERwinXML()
	 */
	public String getPathERwinXML() {
		return pathERwinXML;
	}


	/* (non-Javadoc)
	 * @see com.indracompany.gsi.GsiTemplateInterface#setPathERwinXML(java.lang.String)
	 */
	public void setPathERwinXML(String pathERwinXML) {
		this.pathERwinXML = pathERwinXML;
	}


	/* (non-Javadoc)
	 * @see com.indracompany.gsi.GsiTemplateInterface#getTypeTemplate()
	 */
	public String getTypeTemplate() {
		return typeTemplate;
	}


	/* (non-Javadoc)
	 * @see com.indracompany.gsi.GsiTemplateInterface#setTypeTemplate(java.lang.String)
	 */
	public void setTypeTemplate(String typeTemplate) {
		this.typeTemplate = typeTemplate;
	}


	/* (non-Javadoc)
	 * @see com.indracompany.gsi.GsiTemplateInterface#setPathPackage(java.lang.String)
	 */
	public void setPathPackage(String pathPackage) {
		this.pathPackage = pathPackage;
	}
}
