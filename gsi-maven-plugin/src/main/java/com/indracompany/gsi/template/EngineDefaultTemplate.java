package com.indracompany.gsi.template;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.ca.erwin.ERwin;
import com.ca.erwin.data.Entity;
import com.indracompany.to.EntityTO;
import com.indracompany.type.PackageType;
import com.indracompany.type.TypeTemplate;
import com.indracompany.type.VelocityType;

public class EngineDefaultTemplate extends AbstractTemplateMethod {

	private TypeTemplate typeTemplate;

	/**
	 * @param typeTemplate
	 */
	public EngineDefaultTemplate(TypeTemplate typeTemplate) {
		super();
		this.typeTemplate = typeTemplate;
	}

	/* (non-Javadoc)
	 * @see com.indracompany.gsi.template.AbstractTemplateMethod#buildTemplate(org.apache.velocity.app.VelocityEngine, java.util.List)
	 */
	@Override
	public void buildTemplate(VelocityEngine velocityEngine, ERwin erwin) throws Exception {
		List<Entity> entities = erwin.getModel().getEntityGroups().getEntity();
		if(entities != null) {
			Map<String, EntityTO> mapRelationshipsLogical      = new HashMap<String, EntityTO>();
			Map<String, Object> map   = new HashMap<String, Object>();
			FileUtils.forceMkdir(new File(PackageType.JAVA.getValue() + this.getPathPackage().replace(".", "/") + this.getTypeTemplate().getPrefixPackageImpl()));
			FileUtils.forceMkdir(new File(PackageType.TEST.getValue() + this.getPathPackage().replace(".", "/") + this.getTypeTemplate().getPrefixPackageImpl()));
			for(Entity entity : entities) {
				String entityName     = this.getQualifiedFullName(entity.getEntityProps().getName().getContent());
				map.put(VelocityType.ENTITY.getValue(), mapRelationshipsLogical.get(entityName));
				map.put(VelocityType.ENTITY_NAME.getValue(), entityName);
				map.put(VelocityType.PACKAGE.getValue(), this.getPathPackage());
				map.put(VelocityType.PACKAGE_DEFAULT.getValue(),    this.getPathPackage().replace(".", "/"));
				map.put(VelocityType.TYPE_PK.getValue(),     	    this.getType(this.getPK(entity).getPhysicalDataType().getContent(), false).getType());

				String dataInterface    = null;
				String dataImpl    		= null;
				String dataTest    		= null;
				if(this.getTypeTemplate().getFileTemplateInterface() != null) {
						dataInterface 	= VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,  this.getTypeTemplate().getFileTemplateInterface(), map);
				}
				
				if(this.getTypeTemplate().getFileTemplateImpl() != null) {
						dataImpl 	    = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,  this.getTypeTemplate().getFileTemplateImpl(), map);
				}
				
				if(this.getTypeTemplate().getFileTemplateTest() != null) {
						dataTest 	    = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,  this.getTypeTemplate().getFileTemplateTest(), map);
				}				
					
				this.write(this.getTypeTemplate(), entityName, dataInterface, dataImpl, dataTest, null);
			}
		}
	}

	/**
	 * @return TypeTemplate
	 */
	public TypeTemplate getTypeTemplate() {
		return typeTemplate;
	}	
}