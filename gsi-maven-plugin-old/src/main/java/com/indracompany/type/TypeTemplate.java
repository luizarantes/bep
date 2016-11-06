package com.indracompany.type;

public enum TypeTemplate {

	SERVICE("/service/ejb/", "/service/ejb/impl/", "Service.java", "ServiceImpl.java", "ServiceImplTest.java", "ServiceTemplate.vm", "ServiceTemplateImpl.vm", "ServiceTemplateImplTest.vm"),
	
	DAO("/dao/", "/dao/impl/", "Dao.java", "DaoImpl.java", "DaoImplTest.java", "DaoTemplate.vm", "DaoTemplateImpl.vm", "DaoTemplateImplTest.vm"),
			
	SERVICE_SPRING("/service/", "/service/impl/", "Service.java", "ServiceImpl.java", null, "ServiceSpringTemplate.vm", "ServiceSpringTemplateImpl.vm", null),
	
	REPOSITORY("/data/repository/", "/data/repository/impl/", "Repository.java", "RepositoryImpl.java", null, "RepositoryTemplate.vm", "RepositoryTemplateImpl.vm", null),
	
	CUSTOM_REPOSITORY(null, "/data/repository/custom/", null, "CustomRepository.java", null, null, "CustomRepositoryTemplate.vm", null),
	
	CONTROLLER(null, "/controller/", null, "Controller.java", null, null, "ControllerTemplate.vm", null),
					
	ENTITY(null, "/model/domain/", null, ".java", "Test.java", null, "EntityTemplate.vm", "EntityTemplateTest.vm"),

	SERVICEDAO("/service/", "/service/impl/", "Service.java", "ServiceImpl.java", "ServiceImplTest.java", "ServiceTemplate.vm", "ServiceTemplateImpl.vm", "ServiceTemplateImplTest.vm"),

	ENUM(null, "/type/", null, "Indicador.java", null, null, "EnumTemplate.vm", null),

	PROPERTIES(null, "/model/domain/", null, ".properties", null, null, "PropertiesTemplate.vm", null),
	
	META_MODEL(null, "/model/domain/", null, "_.java", null, null, "MetaModelTemplate.vm", null),
	
	DTO(null, "/model/domain/dto/", null, "DTO.java", null, null, "DTOTemplate.vm", null),

	BUILDER(null, "/model/builder/", null, "Builder.java", null, null, "BuilderTemplate.vm", null),

	DBUNIT(null, "/dao/dbunit/", null, "DataSet.xml", null, null, "DbUnitTemplate.vm", null);

	private String prefixPackageInterface;

	private String prefixPackageImpl;

	private String suffixInterface;

	private String suffixImpl;

	private String suffixTest;

	private String fileTemplateInterface;

	private String fileTemplateImpl;

	private String fileTemplateTest;	

	private TypeTemplate(String prefixPackageInterface,
			String prefixPackageImpl, String suffixInterface,
			String suffixImpl, String suffixTest, String fileTemplateInterface,
			String fileTemplateImpl, String fileTemplateTest) {
		this.prefixPackageInterface = prefixPackageInterface;
		this.prefixPackageImpl = prefixPackageImpl;
		this.suffixInterface = suffixInterface;
		this.suffixImpl = suffixImpl;
		this.suffixTest = suffixTest;
		this.fileTemplateInterface = fileTemplateInterface;
		this.fileTemplateImpl = fileTemplateImpl;
		this.fileTemplateTest = fileTemplateTest;
	}

	public String getPrefixPackageInterface() {
		return prefixPackageInterface;
	}	

	public String getPrefixPackageImpl() {
		return prefixPackageImpl;
	}

	public String getSuffixInterface() {
		return suffixInterface;
	}

	public String getSuffixImpl() {
		return suffixImpl;
	}

	public String getSuffixTest() {
		return suffixTest;
	}

	public String getFileTemplateInterface() {
		return fileTemplateInterface;
	}

	public String getFileTemplateImpl() {
		return fileTemplateImpl;
	}

	public String getFileTemplateTest() {
		return fileTemplateTest;
	}
}
