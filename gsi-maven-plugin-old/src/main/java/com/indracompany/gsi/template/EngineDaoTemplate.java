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
import com.ca.erwin.data.ValidationRule;
import com.indracompany.to.EntityTO;
import com.indracompany.type.PackageType;
import com.indracompany.type.TypeTemplate;
import com.indracompany.type.VelocityType;

public class EngineDaoTemplate extends EngineEntityTemplate {

	/**
	 * @param typeTemplate
	 */
	public EngineDaoTemplate() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.indracompany.gsi.template.AbstractTemplateMethod#buildTemplate(org.apache.velocity.app.VelocityEngine, java.util.List)
	 */
	@Override
	public void buildTemplate(VelocityEngine velocityEngine, ERwin erwin) throws Exception {
		List<Entity> entities = erwin.getModel().getEntityGroups().getEntity();
		if(entities != null) {
			Map<String, EntityTO> mapRelationshipsLogical  = new HashMap<String, EntityTO>();
			Map<String, EntityTO> mapRelationships         = this.mapRelationshipEntities(entities, mapRelationshipsLogical);
			Map<String, ValidationRule> mapRelationshipsCK = this.mapRelationshipCheckConstraint(erwin.getModel().getValidationRuleGroups());
			Map<String, String> mapRelationshipFK     	   = this.mapRelationshipFK(erwin.getModel().getRelationshipGroups().getRelationship());

			Map<String, String> mapDbUnit                  = new HashMap<String, String>();
			Map<String, String> mapValueEnun 			   = new HashMap<String, String>();
			Map<String, String> mapValueEnunDisplay  	   = new HashMap<String, String>();

			this.extractEnum(velocityEngine, erwin.getModel().getValidationRuleGroups(), mapValueEnun, mapValueEnunDisplay);
			this.extractEntity(entities, mapRelationships, mapDbUnit, mapRelationshipsCK, mapValueEnun, mapValueEnunDisplay, mapRelationshipFK);
			this.generateDbUnit(velocityEngine, mapRelationships, mapDbUnit);
			this.getDbUnitHerance(velocityEngine, mapRelationships);
			
			Map<String, Object> map   = new HashMap<String, Object>();
			FileUtils.forceMkdir(new File(PackageType.JAVA.getValue() + this.getPathPackage().replace(".", "/") + TypeTemplate.DAO.getPrefixPackageImpl()));
//			FileUtils.forceMkdir(new File(PackageType.TEST.getValue() + this.getPathPackage().replace(".", "/") + TypeTemplate.DAO.getPrefixPackageImpl()));

			for(Entity entity : entities) {
				String entityName     = this.getQualifiedFullName(entity.getEntityProps().getName().getContent());
				map.put(VelocityType.ENTITY.getValue(), mapRelationshipsLogical.get(entityName));
				map.put(VelocityType.ENTITY_NAME.getValue(), entityName);
				map.put(VelocityType.PACKAGE.getValue(), this.getPathPackage());
				map.put(VelocityType.PACKAGE_DEFAULT.getValue(),    this.getPathPackage().replace(".", "/"));
				map.put(VelocityType.TYPE_PK.getValue(),     	    this.getType(this.getPK(entity).getPhysicalDataType().getContent(), false).getType());

				String dataInterface 	= VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,  TypeTemplate.DAO.getFileTemplateInterface(), map);
				String dataImpl 	    = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,  TypeTemplate.DAO.getFileTemplateImpl(), map);
//				String dataTest 	    = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,  TypeTemplate.DAO.getFileTemplateTest(), map);
				this.write(TypeTemplate.DAO, entityName, dataInterface, dataImpl, null, null);
			}
		}				
	}

}