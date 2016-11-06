package com.indracompany.gsi.template;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.velocity.app.VelocityEngine;

import com.ca.erwin.ERwin;
import com.ca.erwin.data.Attribute;
import com.ca.erwin.data.AttributeProps;
import com.ca.erwin.data.Entity;
import com.ca.erwin.data.KeyGroup;
import com.indracompany.type.PackageType;
import com.indracompany.type.TypeTemplate;
import com.indracompany.type.Types;

public abstract class AbstractTemplateMethod {

	protected static final String LARGE_BINARY = "LARGE BINARY";

	protected static final String NUMBER = "NUMBER";

	private static final String NULL = "_NULL";

	private String pathPackage;

	/**
	 * @param velocityEngine
	 * @param erwin
	 * @throws Exception
	 */
	public abstract void buildTemplate(VelocityEngine velocityEngine,
			ERwin erwin) throws Exception;

	/**
	 * 
	 * @param velocityEngine
	 * @param erwin
	 * @throws Exception
	 */
	public void execute(VelocityEngine velocityEngine, ERwin erwin)
			throws Exception {
		this.buildTemplate(velocityEngine, erwin);
	}

	/**
	 * @param data
	 * @param typeSplit
	 * @return String
	 */
	protected String getQualifiedFullName(String data, String typeSplit) {
		System.out.println(data);
		if (data != null) {
			String dataName = "";
			for (String name : data.split(typeSplit)) {
				dataName = dataName + name.substring(0, 1).toUpperCase()
						+ name.substring(1).toLowerCase();
			}
			return dataName;
		}
		return null;
	}

	/**
	 * @param data
	 * @return String
	 */
	protected String getQualifiedFullName(String data) {
		return this.getQualifiedFullName(data, " ");
	}

	/**
	 * @param typeTemplate
	 * @param className
	 * @param dataInterface
	 * @param dataImpl
	 * @param dataTest
	 * @throws Exception
	 */
	protected void write(TypeTemplate typeTemplate, String className,
			String dataInterface, String dataImpl, String dataTest,
			String dataResource) throws Exception {
		
		if (dataInterface != null)
			IOUtils.write(dataInterface, new FileOutputStream(new File(
					PackageType.JAVA.getValue()
							+ this.getPathPackage().replace(".", "/")
							+ typeTemplate.getPrefixPackageInterface()
							+ className + typeTemplate.getSuffixInterface())));
		if (dataImpl != null)
			IOUtils.write(dataImpl, new FileOutputStream(new File(
					PackageType.JAVA.getValue()
							+ this.getPathPackage().replace(".", "/")
							+ typeTemplate.getPrefixPackageImpl() + className
							+ typeTemplate.getSuffixImpl())));
		
//		if (dataTest != null)
//			IOUtils.write(dataTest, new FileOutputStream(new File(
//					PackageType.TEST.getValue()
//							+ this.getPathPackage().replace(".", "/")
//							+ typeTemplate.getPrefixPackageImpl() + className
//							+ typeTemplate.getSuffixTest())));
//		if (dataResource != null)
//			IOUtils.write(dataResource, new FileOutputStream(new File(
//					PackageType.RESOURCES_TEST.getValue()
//							+ this.getPathPackage().replace(".", "/")
//							+ typeTemplate.getPrefixPackageImpl() + className
//							+ typeTemplate.getSuffixImpl())));
	}

	/**
	 * @param typeTemplate
	 * @param entityName
	 * @param dataImpl
	 * @param dataTest
	 * @throws Exception
	 */
	protected void write(TypeTemplate typeTemplate, String entityName,
			String dataImpl, String dataTest) throws Exception {
		this.write(typeTemplate, entityName, null, dataImpl, dataTest, null);
	}

	/**
	 * @param dataType
	 * @param isNull
	 * @return Types
	 */
	protected Types getType(String dataType, boolean isNull) {
		if (dataType != null) {
			if (dataType.endsWith(")")) {
				int position = dataType.indexOf("(");
				if (dataType.substring(0, position).toUpperCase()
						.equals(NUMBER)) {
					if (dataType.contains(",")) {
						return Types.DOUBLE;
					} else {
						int value = Integer.parseInt(dataType.substring(
								position + 1, dataType.indexOf(")")));
						if (value <= 4) {
							return Types.SHORT;
						} else if (value > 4 && value <= 9) {
							return Types.INTEGER;
						} else {
							return Types.LONG;
						}
					}
				} else {
					return Types.valueOf(dataType.trim().substring(0, position)
							.concat(isNull ? NULL : ""));
				}
			} else {
				if (dataType.equals(LARGE_BINARY))
					return Types.BLOB;
				return Types
						.valueOf(dataType.trim().concat(isNull ? NULL : ""));
			}
		}
		return null;
	}

	/**
	 * @param dataType
	 * @return Types
	 */
	protected Types getType(String dataType) {
		return this.getType(dataType, false);
	}

	/**
	 * @param entity
	 * @return AttributeProps
	 */
	protected AttributeProps getPK(Entity entity) {
		if (entity != null) {
			Map<String, AttributeProps> mapAttribute = new HashMap<String, AttributeProps>();
			if (entity.getAttributeGroups() != null) {
				for (Attribute attribute : entity.getAttributeGroups()
						.getAttribute()) {
					mapAttribute.put(attribute.getAttributeProps()
							.getPhysicalName().getContent(),
							attribute.getAttributeProps());
				}
				if (entity.getKeyGroupGroups() != null) {
					for (KeyGroup keyGroup : entity.getKeyGroupGroups()
							.getKeyGroup()) {
						if (keyGroup.getKeyGroupProps().getIsUnique().isValue()) {
							return mapAttribute.get(keyGroup
									.getKeyGroupMemberGroups()
									.getKeyGroupMember().get(0)
									.getKeyGroupMemberProps().getPhysicalName()
									.getContent());
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * @return String
	 */
	public String getPathPackage() {
		return this.pathPackage;
	}

	/**
	 * @param pathPackage
	 */
	public void setPathPackage(String pathPackage) {
		this.pathPackage = pathPackage;
	}

}
