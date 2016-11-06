package com.indracompany.gsi.template;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.ca.erwin.ERwin;
import com.ca.erwin.data.Attribute;
import com.ca.erwin.data.AttributeProps;
import com.ca.erwin.data.ColumnsOrderRef;
import com.ca.erwin.data.Entity;
import com.ca.erwin.data.KeyGroup;
import com.ca.erwin.data.Relationship;
import com.ca.erwin.data.ValidValue;
import com.ca.erwin.data.ValidationRule;
import com.ca.erwin.data.ValidationRuleGroups;
import com.indracompany.jaxb.note.column.NoteColumnConfiguration;
import com.indracompany.jaxb.note.column.NoteValidator;
import com.indracompany.jaxb.note.entity.NoteEntityConfiguration;
import com.indracompany.to.ColumnTO;
import com.indracompany.to.EntityTO;
import com.indracompany.type.NomeClaturaTypeEnglish;
import com.indracompany.type.PackageType;
import com.indracompany.type.TypeTemplate;
import com.indracompany.type.Types;
import com.indracompany.type.ValidatorType;
import com.indracompany.type.VelocityType;

public class EngineEntityTemplate extends AbstractTemplateMethod {

	private static final String AK = "AK";

	private static final String PK = "PK";

	private static final String ID = "ID";

	private static final String CHECK_CONSTRAINT = "CK_";

	private static final String SEQUENCE = "SQ_";

	private static final String CEP = "CEP";

	private static final String ANNOTATION = "@";

	private static final String SET_PROPERTY = "this.getDomain().set";

	private static final String LIST = "List";

	protected static final String FORMAT_DATE = "yyyy-MM-dd";

	protected static final String INDICADOR = "Indicador";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.indracompany.gsi.template.AbstractTemplateMethod#buildTemplate(org
	 * .apache.velocity.app.VelocityEngine, java.util.List)
	 */
	@Override
	public void buildTemplate(VelocityEngine velocityEngine, ERwin erwin)
			throws Exception {
		List<Entity> entities = erwin.getModel().getEntityGroups().getEntity();
		if (entities != null) {
			Map<String, EntityTO> mapRelationships = this
					.mapRelationshipEntities(entities);
			Map<String, ValidationRule> mapRelationshipsCK = this
					.mapRelationshipCheckConstraint(erwin.getModel()
							.getValidationRuleGroups());
			Map<String, String> mapRelationshipFK = this
					.mapRelationshipFK(erwin.getModel().getRelationshipGroups()
							.getRelationship());
			Map<String, String> mapValueEnun = new HashMap<String, String>();
			
			FileUtils.forceMkdir(new File(PackageType.JAVA.getValue()
					+ this.getPathPackage().replace(".", "/")
					+ TypeTemplate.ENUM.getPrefixPackageImpl()));
			
			this.generateEnum(velocityEngine, erwin.getModel()
					.getValidationRuleGroups(), mapValueEnun, null, true);
			this.extractEntity(entities, mapRelationships, null,
					mapRelationshipsCK, mapValueEnun, null, mapRelationshipFK);
			this.generateEntities(velocityEngine, mapRelationships);

			this.generateProperties(velocityEngine, mapRelationships);
			this.generateProperties(velocityEngine, mapRelationships, PackageType.JAVA, TypeTemplate.META_MODEL);
			this.generateProperties(velocityEngine, mapRelationships, PackageType.JAVA, TypeTemplate.DTO);
			//this.generateProperties(velocityEngine, mapRelationships, PackageType.JAVA, TypeTemplate.BUILDER);
		}
	}

	protected void getOrder(ERwin erwin) {
		erwin.getModel().getEntityGroups().getEntity().get(0).getEntityProps()
				.getPhysicalColumnsOrderRefArray();
	}

	/**
	 * @param entities
	 * @param mapRelationships
	 * @param mapDbUnit
	 * @param mapRelationshipsCK
	 * @param mapValueEnun
	 * @throws Exception
	 */
	protected void extractEntity(List<Entity> entities,
			Map<String, EntityTO> mapRelationships,
			Map<String, String> mapDbUnit,
			Map<String, ValidationRule> mapRelationshipsCK,
			Map<String, String> mapValueEnun,
			Map<String, String> mapValueEnunDisplay,
			Map<String, String> mapRelationshipFK) throws Exception {
		Long longDateTime = Calendar.getInstance().getTime().getTime();
		for (Entity entity : entities) {
			Map<String, Integer> mapPhysicalOrder = new HashMap<String, Integer>();
			for (ColumnsOrderRef columnsOrderRef : entity.getEntityProps()
					.getColumnsOrderRefArray().getColumnsOrderRef()) {
				mapPhysicalOrder.put(columnsOrderRef.getContent(),
						columnsOrderRef.getIndex().intValue());
			}
			Map<String, AttributeProps> mapAttribute = new HashMap<String, AttributeProps>();
			AttributeProps attributePropsPK = this.getPK(entity);
			EntityTO entityTO = mapRelationships.get(attributePropsPK
					.getPhysicalName().getContent());
			for (Attribute attribute : entity.getAttributeGroups()
					.getAttribute()) {
				if (!attribute.getAttributeProps().getName().getContent()
						.startsWith(ID)) {
					Types type = this.getType(attribute.getAttributeProps()
							.getPhysicalDataType().getContent(), attribute
							.getAttributeProps().getNullOptionType().getValue()
							.intValue() == 1 ? true : false);
					ColumnTO columnTO = new ColumnTO();
					columnTO.setOrder(mapPhysicalOrder.get(attribute
							.getAttributeProps().getLongId()));
					columnTO.setPhysicalName(attribute.getAttributeProps()
							.getPhysicalName().getContent());
					this.getLength(attribute.getAttributeProps()
							.getPhysicalDataType().getContent(), columnTO);
					columnTO.setLengthNull(columnTO.getLength() == null ? true
							: false);
					columnTO.setPrecisionNull(columnTO.getPrecision() == null ? true
							: false);
					columnTO.setScaleNull(columnTO.getScale() == null ? true
							: false);
					columnTO.setType(type.getType());
					
					
					/*System.out.println("Atributo: " + attribute.getAttributeProps().getName()
							.getContent().substring(0, 2).toUpperCase());*/
					

					NomeClaturaTypeEnglish nomeClaturaType = NomeClaturaTypeEnglish
							.valueOf(attribute.getAttributeProps().getName()
									.getContent().substring(0, 2).toUpperCase());
					if (nomeClaturaType != null) {
						columnTO.setLogicalName("".equals(nomeClaturaType
								.getValue()) ? this
								.getQualifiedFullName(attribute
										.getAttributeProps().getName()
										.getContent()) : this
								.getQualifiedFullName(nomeClaturaType
										.getValue()
										+ attribute.getAttributeProps()
												.getName().getContent()
												.substring(2)));
					}
					
					if(attribute.getAttributeProps().getComment().getContent() == null || attribute.getAttributeProps().getComment().getContent().replaceAll("\n", "").trim().equals("")) {
						System.out.println("Sem comentarios: " + entity.getName() + " "  +  columnTO.getLogicalName());
					}									
					
					columnTO.setComment(attribute.getAttributeProps()
							.getComment().getContent().replaceAll("\n", "")
							.trim().toUpperCase());
					columnTO.setNullable(attribute.getAttributeProps()
							.getNullOptionType().getValue().intValue() == 1 ? true
							: false);
					this.setNoteColumnConfiguration(
							attribute.getAttributeProps(), entityTO, columnTO);
					if (attribute.getCheckConstraintUsageGroups() != null) {
						ValidationRule validationRule = mapRelationshipsCK
								.get(attribute.getCheckConstraintUsageGroups()
										.getCheckConstraintUsage()
										.getCheckConstraintUsageProps()
										.getValidationRuleRef().getContent());
						if (validationRule.getValidationRuleProps().getType()
								.getValue().intValue() == 2) {
							columnTO.setEnumName(this.getQualifiedFullName(
									validationRule.getName(), "_") + INDICADOR);
							columnTO.setEnumeration(true);
							entityTO.setUseEnum(true);
							String enumName = this.getPathPackage()
									+ TypeTemplate.ENUM.getPrefixPackageImpl()
											.replace("/", ".")
									+ columnTO.getEnumName();
							if (!entityTO.getPackageEnum().contains(enumName))
								entityTO.getPackageEnum().add(enumName);
						} else if (validationRule.getValidationRuleProps()
								.getType().getValue().intValue() == 1) {
							if (columnTO.getNoteColumnConfiguration() == null) {
								columnTO.setNoteColumnConfiguration(new NoteColumnConfiguration());
								columnTO.getNoteColumnConfiguration()
										.setNoteValidator(new NoteValidator());
							} else if (columnTO.getNoteColumnConfiguration()
									.getNoteValidator() == null) {
								columnTO.getNoteColumnConfiguration()
										.setNoteValidator(new NoteValidator());
							}
							columnTO.getNoteColumnConfiguration()
									.getNoteValidator()
									.setMin(validationRule
											.getValidationRuleProps()
											.getValidationRuleMinValue()
											.intValue());
							columnTO.getNoteColumnConfiguration()
									.getNoteValidator()
									.setMax(validationRule
											.getValidationRuleProps()
											.getValidationRuleMaxValue()
											.intValue());

							columnTO.getNoteColumnConfiguration()
									.getNoteValidator()
									.getValidators()
									.add(ANNOTATION
											+ ValidatorType.NotNull.toString());
							columnTO.getNoteColumnConfiguration()
									.getNoteValidator()
									.getValidators()
									.add("@Min(value = "
											+ validationRule
													.getValidationRuleProps()
													.getValidationRuleMinValue()
													.intValue() + ")");
							columnTO.getNoteColumnConfiguration()
									.getNoteValidator()
									.getValidators()
									.add("@Max(value = "
											+ validationRule
													.getValidationRuleProps()
													.getValidationRuleMaxValue()
													.intValue() + ")");
							columnTO.setNotNullNoteValidator(true);
							if (!entityTO.getPackageValidator().contains(
									ValidatorType.NotNull.getValue()))
								entityTO.getPackageValidator().add(
										ValidatorType.NotNull.getValue());
							if (!entityTO.getPackageValidator().contains(
									ValidatorType.Min.getValue()))
								entityTO.getPackageValidator().add(
										ValidatorType.Min.getValue());
							if (!entityTO.getPackageValidator().contains(
									ValidatorType.Max.getValue()))
								entityTO.getPackageValidator().add(
										ValidatorType.Max.getValue());
						}
					}
					this.verifyType(entityTO, attribute.getAttributeProps()
							.getPhysicalDataType().getContent(), columnTO);
					if (!entityTO.getColumns().contains(columnTO))
						entityTO.getColumns().add(columnTO);
				} else {
					mapAttribute.put(attribute.getAttributeProps()
							.getPhysicalName().getContent(),
							attribute.getAttributeProps());
				}
			}
			if (entity.getKeyGroupGroups() != null) {
				for (KeyGroup keyGroup : entity.getKeyGroupGroups()
						.getKeyGroup()) {
					if (!keyGroup.getKeyGroupProps().getKeyGroupType()
							.startsWith(PK)
							&& !keyGroup.getKeyGroupProps().getKeyGroupType()
									.startsWith(AK)) {
						EntityTO entityTORelationships = this.getFK(
								mapRelationships, keyGroup);
						if (entityTORelationships != null
								&& !entityTO
										.getPhysicalNamePK()
										.equals(keyGroup
												.getKeyGroupMemberGroups()
												.getKeyGroupMember().get(0)
												.getKeyGroupMemberProps()
												.getPhysicalName().getContent())) {

							boolean typeRelationshipsOneToOne = mapRelationshipFK
									.get(entityTORelationships
											.getPhisycalName()
											+ "_"
											+ entityTO.getPhisycalName()) == null ? false
									: true;

							ColumnTO columnReference = new ColumnTO();
							columnReference
									.setManyToOne(!typeRelationshipsOneToOne);
							columnReference
									.setOneToOne(typeRelationshipsOneToOne);
							columnReference.setOrder(mapPhysicalOrder
									.get(keyGroup.getKeyGroupMemberGroups()
											.getKeyGroupMember().get(0)
											.getKeyGroupMemberProps()
											.getAttributeRef()));

							keyGroup.getKeyGroupMemberGroups()
									.getKeyGroupMember().get(0)
									.getKeyGroupMemberProps().getPhysicalName();

							columnReference.setLogicalName(this
									.getQualifiedFullName(keyGroup
											.getKeyGroupMemberGroups()
											.getKeyGroupMember().get(0)
											.getKeyGroupMemberProps().getName()
											.getContent().substring(2).trim()));
							columnReference.setPhysicalName(keyGroup
									.getKeyGroupMemberGroups()
									.getKeyGroupMember().get(0)
									.getKeyGroupMemberProps().getPhysicalName()
									.getContent());
							columnReference.setType(entityTORelationships
									.getLogicalName());
							columnReference.setComment(entityTORelationships
									.getComment());
							columnReference
									.setReferencedColumnName(entityTORelationships
											.getPhysicalNamePK());

							AttributeProps attributePropsFK = mapAttribute
									.get(keyGroup.getKeyGroupMemberGroups()
											.getKeyGroupMember().get(0)
											.getKeyGroupMemberProps()
											.getPhysicalName().getContent());
							columnReference
									.setNullable(attributePropsFK
											.getNullOptionType().getValue()
											.intValue() == 1 ? true : false);
							this.setNoteColumnConfiguration(attributePropsFK,
									entityTO, columnReference);
							if (!entityTO.getColumns()
									.contains(columnReference))
								entityTO.getColumns().add(columnReference);
							entityTO.setUseManyToOne(entityTO.isUseManyToOne() ? entityTO
									.isUseManyToOne()
									: !typeRelationshipsOneToOne);
							entityTO.setUseOneToOne(entityTO.isUseOneToOne() ? entityTO
									.isUseOneToOne()
									: typeRelationshipsOneToOne);
							boolean cascade = columnReference
									.isNotNullNoteOrm()
									&& columnReference
											.getNoteColumnConfiguration()
											.getNoteORM().isParent() == null ? true
									: false;
							entityTO.setUseJoinColumn(true);
							entityTO.setUseCascade(entityTO.isUseCascade() ? entityTO
									.isUseCascade() : cascade);

							if (!entityTORelationships.getPhysicalNamePK()
									.equals(entityTO.getPhysicalNamePK())) {
								ColumnTO columnRelationship = new ColumnTO();
								columnRelationship.setOrder(0);
								columnRelationship
										.setOneToMany(!typeRelationshipsOneToOne);
								columnRelationship
										.setOneToOne(typeRelationshipsOneToOne);

								if (columnReference
										.getLogicalName()
										.toUpperCase()
										.equals(entityTORelationships
												.getLogicalName().toUpperCase()))
									columnRelationship.setLogicalName(entityTO
											.getLogicalName());
								else
									columnRelationship.setLogicalName(entityTO
											.getLogicalName()
											+ columnReference.getLogicalName()
													.substring(0, 1)
													.toUpperCase()
											+ columnReference.getLogicalName()
													.substring(1));

								columnRelationship.setNullable(attributePropsFK
										.getNullOptionType().getValue()
										.intValue() == 1 ? true : false);
								columnRelationship
										.setReferencedColumnName(entityTO
												.getPhysicalNamePK());
								columnRelationship.setMappedBy(columnReference
										.getLogicalName().substring(0, 1)
										.toLowerCase()
										+ columnReference.getLogicalName()
												.substring(1));
								columnRelationship.setUseMappedBy(true);
								columnRelationship
										.setType(typeRelationshipsOneToOne ? entityTO
												.getLogicalName() : LIST + "<"
												+ entityTO.getLogicalName()
												+ ">");
								columnRelationship.setComment(entityTO
										.getComment());
								boolean cascadeRelationship = (columnReference
										.isNotNullNoteOrm() && columnReference
										.getNoteColumnConfiguration()
										.getNoteORM().isParent() != null)
										|| (columnReference.isNotNullNoteOrm() && columnReference
												.getNoteColumnConfiguration()
												.getNoteORM()
												.isParentChildren() != null) ? true
										: false;

								entityTORelationships
										.setUseCascade(entityTORelationships
												.isUseCascade() ? entityTORelationships
												.isUseCascade()
												: cascadeRelationship);
								columnRelationship
										.setNoteColumnConfiguration(cascadeRelationship ? columnReference
												.getNoteColumnConfiguration()
												: null);
								columnRelationship
										.setNotNullNoteOrm(cascadeRelationship);
								columnReference.setNotNullNoteOrm(cascade);

								entityTORelationships.getColumns().add(
										columnRelationship);
								entityTORelationships
										.setUseList(entityTORelationships
												.isUseList() ? entityTORelationships
												.isUseList()
												: !typeRelationshipsOneToOne);
								entityTORelationships
										.setUseOneToOne(entityTORelationships
												.isUseOneToOne() ? entityTORelationships
												.isUseOneToOne()
												: typeRelationshipsOneToOne);
							}
						}
					}
				}
			}
			Collections.sort(entityTO.getColumns());
			Collections.sort(entityTO.getPackageEnum());
			Collections.sort(entityTO.getPackageValidator());
			Collections.sort(entityTO.getPackageValidatorAplication());
			if (mapDbUnit != null)
				mapDbUnit
						.put(attributePropsPK.getPhysicalName().getContent(),
								this.getDataDbUnit(entityTO, mapValueEnun,
										longDateTime));
			if (mapValueEnunDisplay != null)
				this.genarateDataEntity(entityTO, mapRelationships,
						mapValueEnunDisplay, longDateTime);
		}
	}

	/**
	 * @param entityTO
	 * @param type
	 * @param columnTO
	 */
	private void verifyType(EntityTO entityTO, String type, ColumnTO columnTO) {
		if (type.equals(Types.DATE.toString())) {
			entityTO.setUseDate(true);
			columnTO.setTimestamp(true);
			//columnTO.setDate(true);
			columnTO.setLengthNull(true);
			columnTO.setScaleNull(true);
			columnTO.setPrecisionNull(true);
		} else if (type.equals(Types.TIMESTAMP.toString())) {
			entityTO.setUseDate(true);
			columnTO.setTimestamp(true);
			columnTO.setLengthNull(true);
			columnTO.setScaleNull(true);
			columnTO.setPrecisionNull(true);
		} else if (type.equals(LARGE_BINARY)) {
			entityTO.setUseFile(true);
			columnTO.setFile(true);
		} else if (type.equals(Types.BLOB.toString())) {
			entityTO.setUseFile(true);
			columnTO.setFile(true);
		} else if (type.equals(Types.CLOB.toString())) {
			entityTO.setUseClob(true);
			columnTO.setClob(true);
		}
	}

	/**
	 * @param mapRelationships
	 * @param keyGroup
	 * @return EntityTO
	 */
	private EntityTO getFK(Map<String, EntityTO> mapRelationships,
			KeyGroup keyGroup) {
		EntityTO entityTORelationships = mapRelationships.get(keyGroup
				.getKeyGroupMemberGroups().getKeyGroupMember().get(0)
				.getKeyGroupMemberProps().getPhysicalName().getContent());
		if (entityTORelationships == null) {
			List<String> list = Arrays.asList(keyGroup
					.getKeyGroupMemberGroups().getKeyGroupMember().get(0)
					.getKeyGroupMemberProps().getPhysicalName().getContent()
					.split("_"));
			for (int x = 1; x < list.size(); x++) {
				String dataFK = "";
				for (int y = list.size() - x; y >= 0; y--) {
					dataFK = list.get(y) + "_" + dataFK;
				}
				if (mapRelationships.get(dataFK.substring(0,
						dataFK.length() - 1)) != null) {
					return mapRelationships.get(dataFK.substring(0,
							dataFK.length() - 1));
				}
			}
		}
		return entityTORelationships;
	}

	/**
	 * @param velocityEngine
	 * @param mapRelationships
	 * @throws Exception
	 */
	protected void generateEntities(VelocityEngine velocityEngine,
			Map<String, EntityTO> mapRelationships) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		TypeTemplate typeTemplate = TypeTemplate.ENTITY;
		FileUtils.forceMkdir(new File(PackageType.JAVA.getValue()
				+ this.getPathPackage().replace(".", "/")
				+ typeTemplate.getPrefixPackageImpl()));
		FileUtils.forceMkdir(new File(PackageType.TEST.getValue()
				+ this.getPathPackage().replace(".", "/")
				+ typeTemplate.getPrefixPackageImpl()));
		for (Iterator<String> iterator = mapRelationships.keySet().iterator(); iterator
				.hasNext();) {
			EntityTO entityTO = mapRelationships.get(iterator.next());
			map.put(VelocityType.ENTITY.getValue(), entityTO);
			map.put(VelocityType.PACKAGE.getValue(), this.getPathPackage());
			String dataImpl = VelocityEngineUtils.mergeTemplateIntoString(
					velocityEngine, typeTemplate.getFileTemplateImpl(), map);
			String dataTest = VelocityEngineUtils.mergeTemplateIntoString(
					velocityEngine, typeTemplate.getFileTemplateTest(), map);
			this.write(typeTemplate, entityTO.getLogicalName(), dataImpl,
					dataTest);
		}
	}

	/**
	 * @param entityTO
	 * @param referencedColumnName
	 * @param mapRelationships
	 * @param mapDbUnit
	 */
	private void recursiveFKDbUnit(EntityTO entityTO, EntityTO entityTOFK,
			Map<String, EntityTO> mapRelationships,
			Map<String, EntityTO> mapConference, Map<String, String> mapDbUnit) {
		for (ColumnTO columnTO : entityTOFK.getColumns()) {
			if ((columnTO.isManyToOne() || columnTO.isOneToOne())
					&& columnTO.getReferencedColumnName() != null
					&& columnTO.isNullable()
					&& mapConference.get(columnTO.getReferencedColumnName()) == null
					&& columnTO.getMappedBy() == null) {
				if (!entityTO.getDataDbUnit().contains(
						mapDbUnit.get(columnTO.getReferencedColumnName())))
					entityTO.getDataDbUnit().add(
							mapDbUnit.get(columnTO.getReferencedColumnName()));
				mapConference
						.put(columnTO.getReferencedColumnName(),
								mapRelationships.get(columnTO
										.getReferencedColumnName()));
				this.recursiveFKDbUnit(entityTO, mapRelationships.get(columnTO
						.getReferencedColumnName()), mapRelationships,
						mapConference, mapDbUnit);
			}
		}
	}

	/**
	 * @param velocityEngine
	 * @param mapRelationships
	 * @param mapDbUnit
	 * @throws Exception
	 */
	protected void generateDbUnit(VelocityEngine velocityEngine,
			Map<String, EntityTO> mapRelationships,
			Map<String, String> mapDbUnit) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		FileUtils.forceMkdir(new File(PackageType.RESOURCES_TEST.getValue()
				+ this.getPathPackage().replace(".", "/")
				+ TypeTemplate.DBUNIT.getPrefixPackageImpl()));
		for (Iterator<String> iterator = mapRelationships.keySet().iterator(); iterator
				.hasNext();) {
			EntityTO entityTO = mapRelationships.get(iterator.next());
			entityTO.getDataDbUnit().add(
					mapDbUnit.get(entityTO.getPhysicalNamePK()));
			Map<String, EntityTO> mapConference = new HashMap<String, EntityTO>();
			for (ColumnTO columnTO : entityTO.getColumns()) {
				if ((columnTO.isManyToOne() || columnTO.isOneToOne())
						&& columnTO.getReferencedColumnName() != null
						&& columnTO.isNullable()
						&& columnTO.getMappedBy() == null
						&& !entityTO.getDataDbUnit().contains(
								mapDbUnit.get(columnTO
										.getReferencedColumnName()))) {
					entityTO.getDataDbUnit().add(
							mapDbUnit.get(columnTO.getReferencedColumnName()));
					this.recursiveFKDbUnit(entityTO, mapRelationships
							.get(columnTO.getReferencedColumnName()),
							mapRelationships, mapConference, mapDbUnit);
				}
			}
			map.put(VelocityType.ENTITY.getValue(), entityTO);
			String data = VelocityEngineUtils.mergeTemplateIntoString(
					velocityEngine, TypeTemplate.DBUNIT.getFileTemplateImpl(),
					map);
			this.write(TypeTemplate.DBUNIT, entityTO.getLogicalName(), null,
					null, null, data);
		}
	}

	/**
	 * @param mapRelationships
	 */
	public void getDbUnitHerance(VelocityEngine velocityEngine,
			Map<String, EntityTO> mapRelationships) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		for (Iterator<String> iterator = mapRelationships.keySet().iterator(); iterator
				.hasNext();) {
			EntityTO entityTO = mapRelationships.get(iterator.next());
			if (entityTO.getNoteEntityConfiguration() != null
					&& entityTO.getNoteEntityConfiguration()
							.getDiscriminatorColumn() == null
					&& entityTO.getNoteEntityConfiguration()
							.getDiscriminatorValue() != null) {

				EntityTO entityTOHerance = mapRelationships
						.get(entityTO.getNoteEntityConfiguration()
								.getReferencedColumnName());
				entityTO.getDataEntity().addAll(0,
						entityTOHerance.getDataEntity());
				entityTO.setUseCalendar(entityTOHerance.isUseCalendar());
				entityTO.setUseDate(entityTOHerance.isUseDate());
				entityTO.getPackageEntity().addAll(
						entityTOHerance.getPackageEntity());
				entityTO.getPackageEnum().addAll(
						entityTOHerance.getPackageEnum());
				Collections.sort(entityTO.getPackageEntity());
				Collections.sort(entityTO.getPackageEnum());

				for (String dataDbUnit : entityTOHerance.getDataDbUnit()) {
					if (!entityTO.getDataDbUnit().contains(dataDbUnit))
						entityTO.getDataDbUnit().add(dataDbUnit);
				}
				map.put(VelocityType.ENTITY.getValue(), entityTO);
				String data = VelocityEngineUtils.mergeTemplateIntoString(
						velocityEngine,
						TypeTemplate.DBUNIT.getFileTemplateImpl(), map);
				FileUtils.deleteQuietly(new File(PackageType.RESOURCES_TEST
						.getValue()
						+ this.getPathPackage().replace(".", "/")
						+ TypeTemplate.DBUNIT.getPrefixPackageImpl()
						+ entityTO.getLogicalName()
						+ TypeTemplate.DBUNIT.getSuffixImpl()));
				this.write(TypeTemplate.DBUNIT, entityTO.getLogicalName(),
						null, null, null, data);
			}
		}
	}

	/**
	 * @param velocityEngine
	 * @param validationRuleGroups
	 * @param mapValueEnun
	 * @throws Exception
	 */
	protected void extractEnum(VelocityEngine velocityEngine,
			ValidationRuleGroups validationRuleGroups,
			Map<String, String> mapValueEnun,
			Map<String, String> mapValueEnunDisplay) throws Exception {
		this.generateEnum(velocityEngine, validationRuleGroups, mapValueEnun,
				mapValueEnunDisplay, false);
	}

	/**
	 * @param velocityEngine
	 * @param validationRuleGroups
	 * @param mapValueEnun
	 * @param white
	 * @throws Exception
	 */
	private void generateEnum(VelocityEngine velocityEngine,
			ValidationRuleGroups validationRuleGroups,
			Map<String, String> mapValueEnun,
			Map<String, String> mapValueEnunDisplay, boolean white)
			throws Exception {
		if (validationRuleGroups != null) {
			List<ValidationRule> validationRules = validationRuleGroups
					.getValidationRule();
			Map<String, Object> map = new HashMap<String, Object>();
			for (ValidationRule validationRule : validationRules) {
				if (validationRule.getValidationRuleProps().getType()
						.getValue().intValue() == 2) {
					String enumName = this.getQualifiedFullName(
							validationRule.getName(), "_");
					String validaValue = null;
					String valueDisplayName = null;
					
					//System.out.println("enumName: " + enumName);
					
					for (ValidValue validValue : validationRule
							.getValidValueGroups().getValidValue()) {
						validValue.getValidValueProps().setValueDisplayName(
								validValue.getValidValueProps()
										.getValueDisplayName()
										.replaceAll(" ", "_").toUpperCase());
						validaValue = validValue.getValidValueProps().getName()
								.getContent();
						valueDisplayName = validValue.getValidValueProps()
								.getValueDisplayName();
					}
					mapValueEnun.put(enumName + INDICADOR, validaValue);
					if (mapValueEnunDisplay != null)
						mapValueEnunDisplay.put(enumName + INDICADOR,
								valueDisplayName);
					if (white) {
						map.put(VelocityType.ENUM_NAME.getValue(), enumName);
						map.put(VelocityType.PACKAGE.getValue(),
								this.getPathPackage());
						map.put(VelocityType.CONSTANTS.getValue(),
								validationRule.getValidValueGroups()
										.getValidValue());
						String data = VelocityEngineUtils
								.mergeTemplateIntoString(
										velocityEngine,
										TypeTemplate.ENUM.getFileTemplateImpl(),
										map);
						this.write(TypeTemplate.ENUM, enumName, null, data,
								null, null);
					}
				}
			}
		}
	}
	
	
	/**
	 * @param velocityEngine
	 * @param entityTO
	 * @throws Exception
	 */
	protected void generateProperties(VelocityEngine velocityEngine,
			Map<String, EntityTO> mapRelationships, PackageType packageType, TypeTemplate typeTemplate) throws Exception {
		if (mapRelationships != null) {
			Map<String, Object> map = new HashMap<String, Object>();
			FileUtils.forceMkdir(new File(packageType.getValue()
					+ this.getPathPackage().replace(".", "/")
					+ typeTemplate.getPrefixPackageImpl()));
			for (Iterator<String> iterator = mapRelationships.keySet()
					.iterator(); iterator.hasNext();) {
				EntityTO entityTO = mapRelationships.get(iterator.next());
				map.put(VelocityType.ENTITY.getValue(), entityTO);
				map.put(VelocityType.PACKAGE.getValue(),
						this.getPathPackage());
				String data = VelocityEngineUtils.mergeTemplateIntoString(
						velocityEngine,
						typeTemplate.getFileTemplateImpl(), map);
				IOUtils.write(data, new FileOutputStream(new File(
						PackageType.JAVA.getValue()
								+ this.getPathPackage().replace(".", "/")
								+ typeTemplate.getPrefixPackageImpl() +  entityTO.getLogicalName()
								+ typeTemplate.getSuffixImpl())));
			}
		}
	}

	/**
	 * @param velocityEngine
	 * @param entityTO
	 * @throws Exception
	 */
	protected void generateProperties(VelocityEngine velocityEngine,
			Map<String, EntityTO> mapRelationships) throws Exception {
		if (mapRelationships != null) {
			Map<String, Object> map = new HashMap<String, Object>();
			FileUtils.forceMkdir(new File(PackageType.RESOURCES_TEST.getValue()
					+ this.getPathPackage().replace(".", "/")
					+ TypeTemplate.PROPERTIES.getPrefixPackageImpl()));
			
			System.out.println("Package" + this.getPathPackage());
			
			for (Iterator<String> iterator = mapRelationships.keySet()
					.iterator(); iterator.hasNext();) {
				EntityTO entityTO = mapRelationships.get(iterator.next());
				String entityName     = this.getQualifiedFullName(entityTO.getLogicalName());
				map.put(VelocityType.ENTITY.getValue(), entityTO);
				map.put(VelocityType.ENTITY_NAME.getValue(), entityName);
				map.put(VelocityType.PACKAGE.getValue(), this.getPathPackage());
				map.put(VelocityType.PACKAGE_DEFAULT.getValue(),    this.getPathPackage().replace(".", "/"));
				
				map.put(VelocityType.PACKAGE.getValue(), this.getPathPackage());
				String data = VelocityEngineUtils.mergeTemplateIntoString(
						velocityEngine,
						TypeTemplate.PROPERTIES.getFileTemplateImpl(), map);
				this.write(TypeTemplate.PROPERTIES, entityTO.getLogicalName(),
						null, null, null, data);
			}
		}
	}

	/**
	 * @param entities
	 * @return Map<String, EntityTO>
	 * @throws Exception
	 */
	protected Map<String, EntityTO> mapRelationshipEntities(
			List<Entity> entities) throws Exception {
		return this.mapRelationshipEntities(entities, null);
	}

	/**
	 * @param lisRelationshipsFK
	 * @return Map<String, EntityTO>
	 * @throws Exception
	 */
	protected Map<String, String> mapRelationshipFK(
			List<Relationship> lisRelationshipsFK) throws Exception {
		Map<String, String> mapRelationshipFK = new HashMap<String, String>();
		if (lisRelationshipsFK != null) {
			for (Relationship relationship : lisRelationshipsFK) {
				if (relationship.getRelationshipProps().getCardinality()
						.getValue().intValue() == 1
						|| relationship.getRelationshipProps().getCardinality()
								.getValue().intValue() == -1) {
					String entities[] = relationship
							.getRelationshipProps()
							.getUserFormattedPhysicalName()
							.getContent()
							.split(" "
									+ relationship.getRelationshipProps()
											.getParentToChildVerbPhrase() + " ");
					
					
					System.out.println("mapRelationshipFK: " + relationship.getName());
					
					mapRelationshipFK.put(entities[0] + "_" + entities[1],
							entities[1]);
				}
			}
		}
		return mapRelationshipFK;
	}

	/**
	 * @param entities
	 * @return String
	 */
	protected Map<String, EntityTO> mapRelationshipEntities(
			List<Entity> entities,
			Map<String, EntityTO> mapRelationshipLogicalName) throws Exception {
		Map<String, EntityTO> mapRelationships = new HashMap<String, EntityTO>();
		
		List<String> listPersistence = new ArrayList<String>();
		List<String> listEjb		 = new ArrayList<String>();
				
		for (Entity entity : entities) {
			
			System.out.println(entity.getEntityProps().getPhysicalName().getContent());
			
			StringBuilder persistence = new StringBuilder();
			StringBuilder ejb 		  = new StringBuilder();		
			
			EntityTO entityTO = new EntityTO();
			entityTO.setPhisycalName(entity.getEntityProps().getPhysicalName()
					.getContent());
			entityTO.setLogicalName(this.getQualifiedFullName(entity
					.getEntityProps().getName().getContent()));
			entityTO.setComment(entity.getEntityProps().getComment() != null ? entity
					.getEntityProps().getComment().getContent()
					.replaceAll("\n", "").trim().toUpperCase()
					: null);
			
			if(entity.getEntityProps().getComment() == null || entity.getEntityProps().getComment().getContent().replaceAll("\n", "").trim().equals("")) {
				System.out.println("Sem comentarios: " + entityTO.getPhisycalName());
			}
			
			AttributeProps attributeProps = this.getPK(entity);
			entityTO.setPhysicalNamePK(attributeProps.getPhysicalName()
					.getContent());
			entityTO.setTypePK(this.getType(attributeProps
					.getPhysicalDataType().getContent(), false));
			this.setNoteEntityConfiguration(entity, entityTO);
			mapRelationships.put(attributeProps.getPhysicalName().getContent(),
					entityTO);
			if (mapRelationshipLogicalName != null)
				mapRelationshipLogicalName.put(entityTO.getLogicalName(),
						entityTO);

			int position = attributeProps.getPhysicalDataType().getContent()
					.indexOf("(");
			entityTO.setPrecisionPK(attributeProps
					.getPhysicalDataType()
					.getContent()
					.substring(
							position + 1,
							attributeProps.getPhysicalDataType().getContent()
									.indexOf(")")).trim());
			entityTO.setSequenceName(SEQUENCE
					+ entityTO.getPhisycalName().substring(
							entityTO.getPhisycalName().indexOf("_") + 1));

			
			persistence.append("<class>").append(this.getPathPackage().replace("/", ".")).append(TypeTemplate.ENTITY.getPrefixPackageImpl().replace("/", ".")).append(entityTO.getLogicalName()).append("</class>\n");
			listPersistence.add(persistence.toString());

			ejb.append("\n<weblogic-enterprise-bean>\n");
			ejb.append("\t<ejb-name>").append(entityTO.getLogicalName()).append("ServiceImpl</ejb-name>\n");
			ejb.append("\t<stateless-session-descriptor/>\n");
			ejb.append("\t<enable-call-by-reference>true</enable-call-by-reference>\n");			
			ejb.append("\t<jndi-name>").append(entityTO.getLogicalName()).append("ServiceImpl#").append(this.getPathPackage().replace("/", ".")).append(".service.").append(entityTO.getLogicalName()).append("Service</jndi-name>\n");
			ejb.append("</weblogic-enterprise-bean>");
			listEjb.add(ejb.toString());
			
			ejb 		  = new StringBuilder();	
			ejb.append("\n<weblogic-enterprise-bean>\n");
			ejb.append("\t<ejb-name>").append(entityTO.getLogicalName()).append("DaoImpl</ejb-name>\n");
			ejb.append("\t<stateless-session-descriptor/>\n");
			ejb.append("\t<enable-call-by-reference>true</enable-call-by-reference>\n");
			ejb.append("\t<jndi-name>").append(entityTO.getLogicalName()).append("DaoImpl#").append(this.getPathPackage().replace("/", ".")).append(".dao.").append(entityTO.getLogicalName()).append("Dao</jndi-name>\n");
			ejb.append("</weblogic-enterprise-bean>");			
			listEjb.add(ejb.toString());

		}
		
		Collections.sort(listPersistence);
		Collections.sort(listEjb);
		
		StringBuilder persistence = new StringBuilder();
		for(String persistenceLine : listPersistence) {
			persistence.append(persistenceLine);
		}
		
		StringBuilder ejb = new StringBuilder();
		for(String ejbLine : listEjb) {
			ejb.append(ejbLine);
		}

		IOUtils.write(persistence.toString(), new FileOutputStream(new File(PackageType.RESOURCES_JAVA.getValue() + "/persistence.xml")));
		IOUtils.write(ejb.toString(), new FileOutputStream(new File(PackageType.RESOURCES_JAVA.getValue() + "/weblogic-ejb-jar.xml")));
		
		
		return mapRelationships;
	}

	/**
	 * @param validationRuleGroups
	 * @return Map<String, String>
	 * @throws Exception
	 */
	protected Map<String, ValidationRule> mapRelationshipCheckConstraint(
			ValidationRuleGroups validationRuleGroups) throws Exception {
		Map<String, ValidationRule> mapRelationships = new HashMap<String, ValidationRule>();
		if (validationRuleGroups != null) {
			for (ValidationRule validationRule : validationRuleGroups
					.getValidationRule()) {
				validationRule.setName(validationRule.getName().startsWith(
						CHECK_CONSTRAINT) ? validationRule.getName().substring(
						3) : validationRule.getName());
				mapRelationships.put(validationRule.getId(), validationRule);
			}
		}
		return mapRelationships;
	}

	/**
	 * @param entity
	 * @param entityTO
	 * @throws Exception
	 */
	private void setNoteEntityConfiguration(Entity entity, EntityTO entityTO)
			throws Exception {
		if (entity.getEntityProps().getNote() != null
				&& !entity.getEntityProps().getNote().getContent().trim()
						.equals("")
				&& entity.getEntityProps().getNote().getContent()
						.startsWith("<?xml")) {
			NoteEntityConfiguration noteEntityConfiguration = this
					.parseNoteEntityConfiguration(entity.getEntityProps()
							.getNote().getContent().trim());
			entityTO.setNoteEntityConfiguration(noteEntityConfiguration);
			entityTO.setEntityHierarchy(noteEntityConfiguration
					.getDiscriminatorColumn() != null ? true : false);
			entityTO.setSecondaryEntity(noteEntityConfiguration
					.getReferencedColumnName() != null ? true : false);
		}
	}

	/**
	 * @param attributeProps
	 * @param columnTO
	 * @throws Exception
	 */
	private void setNoteColumnConfiguration(AttributeProps attributeProps,
			EntityTO entityTO, ColumnTO columnTO) throws Exception {
		if (attributeProps.getNote() != null
				&& !attributeProps.getNote().getContent().trim().equals("")) {
			NoteColumnConfiguration noteColumnConfiguration = this
					.parseNoteColumnConfiguration(attributeProps.getNote()
							.getContent().trim());
			columnTO.setNoteColumnConfiguration(noteColumnConfiguration);
			columnTO.setNotNullNoteOrm(noteColumnConfiguration.getNoteORM() == null ? false
					: true);
			columnTO.setDisplay(noteColumnConfiguration.getDisplay() == null ? false
					: true);
			entityTO.setUseDisplay(entityTO.isUseDisplay() ? entityTO
					.isUseDisplay() : columnTO.isDisplay());
			if (noteColumnConfiguration.getNoteValidator() != null) {
				columnTO.setNotNullNoteValidator(true);
				columnTO.getNoteColumnConfiguration().getNoteValidator()
						.generateValidator(entityTO);
			} else {
				if (columnTO.isNullable()) {
					if (columnTO.getType().equals(Types.VARCHAR2.getType())
							|| columnTO.getType().equals(Types.DATE.getType())) {
						columnTO.setNoteColumnConfiguration(new NoteColumnConfiguration());
						columnTO.getNoteColumnConfiguration().setNoteValidator(
								new NoteValidator());
						columnTO.getNoteColumnConfiguration()
								.getNoteValidator()
								.getValidators()
								.add(columnTO.getType().equals(
										Types.VARCHAR2.getType()) ? ANNOTATION
										+ ValidatorType.NotNull.toString()
										: ANNOTATION
												+ ValidatorType.NotNull
														.toString());
						columnTO.setNotNullNoteValidator(true);
//						if (columnTO.getType().equals(Types.VARCHAR2.getType())
//								&& !entityTO.getPackageValidatorAplication()
//										.contains(
//												ValidatorType.NotEmpty
//														.getValue()))
//							entityTO.getPackageValidatorAplication().add(
//									ValidatorType.NotEmpty.getValue());
//						else 
						if (!entityTO.getPackageValidator().contains(
								ValidatorType.NotNull.getValue()))
							entityTO.getPackageValidator().add(
									ValidatorType.NotNull.getValue());
					}
				} else {
					columnTO.setNotNullNoteValidator(false);
				}
			}
		} else {
			if (columnTO.isNullable()) {
				if (columnTO.getType().equals(Types.VARCHAR2.getType())
						|| columnTO.getType().equals(Types.DATE.getType())) {
					columnTO.setNoteColumnConfiguration(new NoteColumnConfiguration());
					columnTO.getNoteColumnConfiguration().setNoteValidator(
							new NoteValidator());
					columnTO.getNoteColumnConfiguration()
							.getNoteValidator()
							.getValidators()
							.add(columnTO.getType().equals(
									Types.VARCHAR2.getType()) ? ANNOTATION
									+ ValidatorType.NotNull.toString()
									: ANNOTATION
											+ ValidatorType.NotNull.toString());
					columnTO.setNotNullNoteValidator(true);
//					if (columnTO.getType().equals(Types.VARCHAR2.getType())
//							&& !entityTO
//									.getPackageValidatorAplication()
//									.contains(ValidatorType.NotEmpty.getValue()))
//						entityTO.getPackageValidatorAplication().add(
//								ValidatorType.NotEmpty.getValue());
//					else 
					if (!entityTO.getPackageValidator().contains(
							ValidatorType.NotNull.getValue()))
						entityTO.getPackageValidator().add(
								ValidatorType.NotNull.getValue());
				}
			} else {
				columnTO.setNotNullNoteValidator(false);
			}
		}
	}

	/**
	 * @param dataType
	 * @param columnTO
	 */
	private void getLength(String dataType, ColumnTO columnTO) {
		if (dataType != null && dataType.endsWith(")")) {
			int position = dataType.indexOf("(");
			if (dataType.substring(0, position).toUpperCase().equals(NUMBER)) {
				if (dataType.contains(",")) {
					int positionScale = dataType.indexOf(",");
					columnTO.setPrecision(dataType.substring(position + 1,
							dataType.indexOf(",")).trim());
					columnTO.setScale(dataType.substring(positionScale + 1,
							dataType.indexOf(")")).trim());
				} else {
					columnTO.setPrecision(dataType.substring(position + 1,
							dataType.indexOf(")")).trim());
				}
			} else {
				columnTO.setLength(dataType.substring(position + 1,
						dataType.indexOf(")")).trim());
			}
		}
	}

	/**
	 * @param note
	 * @return NoteEntityConfiguration
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	private NoteEntityConfiguration parseNoteEntityConfiguration(String note)
			throws Exception {
		JAXBContext jaxbContext = JAXBContext
				.newInstance("com.indracompany.jaxb.note.entity");
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		JAXBElement<NoteEntityConfiguration> noteEntityConfiguration = (JAXBElement<NoteEntityConfiguration>) unmarshaller
				.unmarshal(new ByteArrayInputStream(note.toString().getBytes()));
		return noteEntityConfiguration.getValue();
	}

	/**
	 * @param note
	 * @return NoteColumnConfiguration
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	private NoteColumnConfiguration parseNoteColumnConfiguration(String note)
			throws Exception {
		JAXBContext jaxbContext = JAXBContext
				.newInstance("com.indracompany.jaxb.note.column");
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		JAXBElement<NoteColumnConfiguration> noteColumnConfiguration = (JAXBElement<NoteColumnConfiguration>) unmarshaller
				.unmarshal(new ByteArrayInputStream(note.toString().getBytes()));
		return noteColumnConfiguration.getValue();
	}

	/**
	 * @param entityTO
	 * @param mapValueEnun
	 * @return String
	 */
	private String getDataDbUnit(EntityTO entityTO,
			Map<String, String> mapValueEnun, Long longDateTime) {
		StringBuilder dataDbUnit = new StringBuilder();
		if (entityTO != null) {
			dataDbUnit.append("<!-- ").append(entityTO.getComment())
					.append(" -->").append("\n");
			dataDbUnit.append("<").append(entityTO.getPhisycalName())
					.append(" ").append(entityTO.getPhysicalNamePK())
					.append(" = \"").append("10\"").append(" ");
			if (entityTO.getNoteEntityConfiguration() != null
					&& entityTO.getNoteEntityConfiguration()
							.getDiscriminatorColumn() != null) {
				dataDbUnit
						.append(entityTO.getNoteEntityConfiguration()
								.getDiscriminatorColumn())
						.append(" = \"")
						.append(entityTO.getNoteEntityConfiguration()
								.getDiscriminatorValue()).append("\" ");
			}
			for (ColumnTO columnTO : entityTO.getColumns()) {
				if (!columnTO.isOneToMany()) {
					if (columnTO.isNullable() && columnTO.getType() != null
							&& columnTO.getMappedBy() == null) {
						if (columnTO.isDate()) {
							dataDbUnit
									.append(columnTO.getPhysicalName())
									.append(" = \"")
									.append(this.dateToString(new Date(
											longDateTime), FORMAT_DATE))
									.append("\"").append(" ");
						} else if (columnTO.isTimestamp()) {
							Calendar calendar = Calendar.getInstance();
							calendar.setTime(new Date(longDateTime));
							dataDbUnit
									.append(columnTO.getPhysicalName())
									.append(" = \"")
									.append(this.dateToString(
											calendar.getTime(), FORMAT_DATE))
									.append("\"").append(" ");
						} else if (columnTO.isManyToOne()
								|| columnTO.isOneToOne()
								&& columnTO.getMappedBy() == null) {
							dataDbUnit.append(columnTO.getPhysicalName())
									.append(" = \"").append("10\"").append(" ");
						} else if (columnTO.isEnumeration()) {
							dataDbUnit
									.append(columnTO.getPhysicalName())
									.append(" = \"")
									.append(mapValueEnun.get(columnTO
											.getEnumName())).append("\"")
									.append(" ");
						} else if (columnTO.getType().toLowerCase()
								.equals(Types.LONG.toString().toLowerCase())
								|| columnTO.getType().equals("Integer")
								|| columnTO
										.getType()
										.toLowerCase()
										.equals(Types.SHORT.toString()
												.toLowerCase())
								|| columnTO.getType().equals("int")) {
							if (columnTO.getNoteColumnConfiguration() != null
									&& columnTO.getNoteColumnConfiguration()
											.getNoteValidator() != null
									&& columnTO.getNoteColumnConfiguration()
											.getNoteValidator().getMin() != null) {
								dataDbUnit
										.append(columnTO.getPhysicalName())
										.append(" = \"")
										.append(columnTO
												.getNoteColumnConfiguration()
												.getNoteValidator().getMin())
										.append("\"").append(" ");
							} else {
								dataDbUnit.append(columnTO.getPhysicalName())
										.append(" = \"").append("12")
										.append("\"").append(" ");
							}
						} else if (columnTO.getType().equals(
								Types.VARCHAR2.getType())) {
							if (columnTO.getNoteColumnConfiguration() != null
									&& columnTO.getNoteColumnConfiguration()
											.getNoteValidator() != null
									&& Boolean.TRUE.equals(columnTO
											.getNoteColumnConfiguration()
											.getNoteValidator().isIpOrMask())) {
								dataDbUnit.append(columnTO.getPhysicalName())
										.append(" = \"127.0.0.1\" ");
							} else if (columnTO.getNoteColumnConfiguration() != null
									&& columnTO.getNoteColumnConfiguration()
											.getNoteValidator() != null
									&& Boolean.TRUE.equals(columnTO
											.getNoteColumnConfiguration()
											.getNoteValidator().isEmail())) {
								dataDbUnit.append(columnTO.getPhysicalName())
										.append(" = \"gsi@indracompany.com\" ");
							} else if (columnTO.getNoteColumnConfiguration() != null
									&& columnTO.getNoteColumnConfiguration()
											.getNoteValidator() != null
									&& Boolean.TRUE.equals(columnTO
											.getNoteColumnConfiguration()
											.getNoteValidator().isCnpj())) {
								dataDbUnit.append(columnTO.getPhysicalName())
										.append(" = \"05.276.991/0001-53\" ");
							} else if (columnTO.getNoteColumnConfiguration() != null
									&& columnTO.getNoteColumnConfiguration()
											.getNoteValidator() != null
									&& Boolean.TRUE.equals(columnTO
											.getNoteColumnConfiguration()
											.getNoteValidator().isCpf())) {
								dataDbUnit.append(columnTO.getPhysicalName())
										.append(" = \"111.444.777-05\" ");
							} else if (columnTO.getPhysicalName().toUpperCase()
									.contains(CEP)) {
								dataDbUnit.append(columnTO.getPhysicalName())
										.append(" = \"06455020\" ");
							} else {
								if (columnTO.getLength() != null
										&& columnTO.getPhysicalName().length() > Integer
												.parseInt(columnTO.getLength())) {
									dataDbUnit
											.append(columnTO.getPhysicalName())
											.append(" = \"")
											.append(columnTO
													.getPhysicalName()
													.substring(
															0,
															Integer.parseInt(columnTO
																	.getLength())))
											.append("\"").append(" ");
								} else {
									dataDbUnit
											.append(columnTO.getPhysicalName())
											.append(" = \"")
											.append(columnTO.getPhysicalName())
											.append("\"").append(" ");
								}
							}
						} else {
							dataDbUnit.append(columnTO.getPhysicalName())
									.append(" = \"")
									.append(columnTO.getPhysicalName())
									.append("\"").append(" ");
						}
					}
				}
			}
			dataDbUnit.append("/>");
		}
		return dataDbUnit.toString();
	}

	/**
	 * @param entityTO
	 * @param mapRelationships
	 * @param mapValueEnun
	 */
	private void genarateDataEntity(EntityTO entityTO,
			Map<String, EntityTO> mapRelationships,
			Map<String, String> mapValueEnunDisplay, Long longDateTime) {
		if (entityTO != null) {
			entityTO.getPackageEntity().add(entityTO.getLogicalName());
			boolean useDate = false;
			for (ColumnTO columnTO : entityTO.getColumns()) {
				if (!columnTO.isOneToMany() && columnTO.isNullable()
						&& columnTO.getMappedBy() == null) {

					StringBuilder dataEntity = new StringBuilder();
					if (columnTO.isTimestamp() || columnTO.isDate()) {
						if (!entityTO.isUseCalendar()) {
							dataEntity.append("this.getCalendar().clear();\n");
							dataEntity
									.append("\t\tthis.getCalendar().setTime(new Date(")
									.append(longDateTime).append("L));\n");
							dataEntity
									.append("\t\tthis.getDomain().set")
									.append(columnTO.getLogicalName()
											.substring(0, 1).toUpperCase())
									.append(columnTO.getLogicalName()
											.substring(1))
									.append("(this.getCalendar().getTime());");
						} else {
							dataEntity
									.append(SET_PROPERTY)
									.append(columnTO.getLogicalName()
											.substring(0, 1).toUpperCase())
									.append(columnTO.getLogicalName()
											.substring(1))
									.append("(this.getCalendar().getTime());");
						}
						entityTO.setUseCalendar(true);
						useDate = true;
					} else if ((columnTO.isManyToOne() || columnTO.isOneToOne()
							&& columnTO.getMappedBy() == null)
							&& columnTO.getReferencedColumnName() != null) {
						EntityTO entityTOFK = mapRelationships.get(columnTO
								.getReferencedColumnName());
						dataEntity
								.append(SET_PROPERTY)
								.append(columnTO.getLogicalName()
										.substring(0, 1).toUpperCase())
								.append(columnTO.getLogicalName().substring(1))
								.append("(new ")
								.append(entityTOFK.getLogicalName())
								.append("(")
								.append(entityTOFK.getTypePK().getType())
								.append(".valueOf(\"10\")));");
						if (!entityTO.getPackageEntity().contains(
								entityTOFK.getLogicalName()))
							entityTO.getPackageEntity().add(
									entityTOFK.getLogicalName());
					} else if (columnTO.isEnumeration()) {
						dataEntity
								.append(SET_PROPERTY)
								.append(columnTO.getLogicalName()
										.substring(0, 1).toUpperCase())
								.append(columnTO.getLogicalName().substring(1))
								.append("(")
								.append(columnTO.getEnumName())
								.append(".")
								.append(mapValueEnunDisplay.get(columnTO
										.getEnumName())).append(");");
					} else if (columnTO.getType().toLowerCase()
							.equals(Types.LONG.toString().toLowerCase())
							|| columnTO.getType().equals("Integer")
							|| columnTO
									.getType()
									.toLowerCase()
									.equals(Types.SHORT.toString()
											.toLowerCase())
							|| columnTO.getType().equals("int")) {
						if (columnTO.getNoteColumnConfiguration() != null
								&& columnTO.getNoteColumnConfiguration()
										.getNoteValidator() != null
								&& columnTO.getNoteColumnConfiguration()
										.getNoteValidator().getMin() != null) {
							dataEntity
									.append(SET_PROPERTY)
									.append(columnTO.getLogicalName()
											.substring(0, 1).toUpperCase())
									.append(columnTO.getLogicalName()
											.substring(1))
									.append("(")
									.append(columnTO.getType())
									.append(".valueOf(\"")
									.append(columnTO
											.getNoteColumnConfiguration()
											.getNoteValidator().getMin())
									.append("\"));");
						} else if (columnTO.getType().equals("int")) {
							dataEntity
									.append(SET_PROPERTY)
									.append(columnTO.getLogicalName()
											.substring(0, 1).toUpperCase())
									.append(columnTO.getLogicalName()
											.substring(1)).append("(12);");
						} else {
							dataEntity
									.append(SET_PROPERTY)
									.append(columnTO.getLogicalName()
											.substring(0, 1).toUpperCase())
									.append(columnTO.getLogicalName()
											.substring(1)).append("(")
									.append(columnTO.getType())
									.append(".valueOf(\"12\"));");
						}
					} else if (columnTO.getType().equals(
							Types.VARCHAR2.getType())) {
						if (columnTO.getNoteColumnConfiguration() != null
								&& columnTO.getNoteColumnConfiguration()
										.getNoteValidator() != null
								&& Boolean.TRUE.equals(columnTO
										.getNoteColumnConfiguration()
										.getNoteValidator().isIpOrMask())) {
							dataEntity
									.append(SET_PROPERTY)
									.append(columnTO.getLogicalName()
											.substring(0, 1).toUpperCase())
									.append(columnTO.getLogicalName()
											.substring(1))
									.append("(\"127.0.0.1\");");
						} else if (columnTO.getNoteColumnConfiguration() != null
								&& columnTO.getNoteColumnConfiguration()
										.getNoteValidator() != null
								&& Boolean.TRUE.equals(columnTO
										.getNoteColumnConfiguration()
										.getNoteValidator().isEmail())) {
							dataEntity
									.append(SET_PROPERTY)
									.append(columnTO.getLogicalName()
											.substring(0, 1).toUpperCase())
									.append(columnTO.getLogicalName()
											.substring(1))
									.append("(\"gsi@indracompany.com\");");
						} else if (columnTO.getNoteColumnConfiguration() != null
								&& columnTO.getNoteColumnConfiguration()
										.getNoteValidator() != null
								&& Boolean.TRUE.equals(columnTO
										.getNoteColumnConfiguration()
										.getNoteValidator().isCnpj())) {
							dataEntity
									.append(SET_PROPERTY)
									.append(columnTO.getLogicalName()
											.substring(0, 1).toUpperCase())
									.append(columnTO.getLogicalName()
											.substring(1))
									.append("(\"05.276.991/0001-53\");");
						} else if (columnTO.getNoteColumnConfiguration() != null
								&& columnTO.getNoteColumnConfiguration()
										.getNoteValidator() != null
								&& Boolean.TRUE.equals(columnTO
										.getNoteColumnConfiguration()
										.getNoteValidator().isCpf())) {
							dataEntity
									.append(SET_PROPERTY)
									.append(columnTO.getLogicalName()
											.substring(0, 1).toUpperCase())
									.append(columnTO.getLogicalName()
											.substring(1))
									.append("(\"111.444.777-05\");");
						} else if (columnTO.getPhysicalName().toUpperCase()
								.contains(CEP)) {
							dataEntity
									.append(SET_PROPERTY)
									.append(columnTO.getLogicalName()
											.substring(0, 1).toUpperCase())
									.append(columnTO.getLogicalName()
											.substring(1))
									.append("(\"06455020\");");
						} else {
							if (columnTO.getLength() != null
									&& columnTO.getPhysicalName().length() > Integer
											.parseInt(columnTO.getLength())) {
								dataEntity
										.append(SET_PROPERTY)
										.append(columnTO.getLogicalName()
												.substring(0, 1).toUpperCase())
										.append(columnTO.getLogicalName()
												.substring(1))
										.append("(\"")
										.append(columnTO
												.getPhysicalName()
												.substring(
														0,
														Integer.parseInt(columnTO
																.getLength())))
										.append("\");");
							} else {
								dataEntity
										.append(SET_PROPERTY)
										.append(columnTO.getLogicalName()
												.substring(0, 1).toUpperCase())
										.append(columnTO.getLogicalName()
												.substring(1)).append("(\"")
										.append(columnTO.getPhysicalName())
										.append("\");");
							}
						}
					} else if (columnTO.getType().equals(Types.BLOB.getType())) {
						dataEntity
								.append(SET_PROPERTY)
								.append(columnTO.getLogicalName()
										.substring(0, 1).toUpperCase())
								.append(columnTO.getLogicalName().substring(1))
								.append("(\"")
								.append(columnTO.getPhysicalName())
								.append("\".getBytes());");
					} else {
						dataEntity
								.append(SET_PROPERTY)
								.append(columnTO.getLogicalName()
										.substring(0, 1).toUpperCase())
								.append(columnTO.getLogicalName().substring(1))
								.append("(\"")
								.append(columnTO.getPhysicalName())
								.append("\");");
					}
					entityTO.getDataEntity().add(dataEntity.toString());
				}
			}
			entityTO.setUseDate(useDate);
			Collections.sort(entityTO.getPackageEntity());
		}
	}

	/**
	 * @param date
	 * @param pattern
	 * @return String
	 */
	public String dateToString(Date date, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return (format.format(date));
	}

}
