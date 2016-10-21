package com.indracompany.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.indracompany.jaxb.note.entity.NoteEntityConfiguration;
import com.indracompany.type.Types;

public class EntityTO implements Serializable {

	private static final long serialVersionUID = -7877898737681027165L;

	private NoteEntityConfiguration noteEntityConfiguration;

	private String phisycalName;

	private String logicalName;

	private String sequenceName;

	private String physicalNamePK;

	private String precisionPK;

	private String comment;

	private Types typePK;

	private boolean useDate;

	private boolean useCalendar;

	private boolean useFile;

	private boolean useClob;

	private boolean useDisplay;

	private boolean useEnum;

	private boolean useList;

	private boolean useManyToOne;

	private boolean useOneToOne;

	private boolean useCascade;

	private boolean useJoinColumn;

	private boolean entityHierarchy;

	private boolean secondaryEntity;

	private List<ColumnTO> columns;

	private List<String> packageEntity;

	private List<String> packageValidator;

	private List<String> packageValidatorAplication;

	private List<String> packageEnum;

	private List<String> dataDbUnit;

	private List<String> dataEntity;

	public NoteEntityConfiguration getNoteEntityConfiguration() {
		return noteEntityConfiguration;
	}

	public void setNoteEntityConfiguration(
			NoteEntityConfiguration noteEntityConfiguration) {
		this.noteEntityConfiguration = noteEntityConfiguration;
	}

	public String getPhisycalName() {
		return phisycalName;
	}

	public void setPhisycalName(String phisycalName) {
		this.phisycalName = phisycalName;
	}

	public String getLogicalName() {
		return logicalName;
	}

	public void setLogicalName(String logicalName) {
		this.logicalName = logicalName;
	}

	public String getSequenceName() {
		return sequenceName;
	}

	public void setSequenceName(String sequenceName) {
		this.sequenceName = sequenceName;
	}

	public String getPhysicalNamePK() {
		return physicalNamePK;
	}

	public void setPhysicalNamePK(String physicalNamePK) {
		this.physicalNamePK = physicalNamePK;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Types getTypePK() {
		return typePK;
	}

	public void setTypePK(Types typePK) {
		this.typePK = typePK;
	}

	public String getPrecisionPK() {
		return precisionPK;
	}

	public void setPrecisionPK(String precisionPK) {
		this.precisionPK = precisionPK;
	}

	public boolean isUseDate() {
		return useDate;
	}

	public void setUseDate(boolean useDate) {
		this.useDate = useDate;
	}

	public boolean isUseCalendar() {
		return useCalendar;
	}

	public void setUseCalendar(boolean useCalendar) {
		this.useCalendar = useCalendar;
	}

	public boolean isUseFile() {
		return useFile;
	}

	public void setUseFile(boolean useFile) {
		this.useFile = useFile;
	}

	public boolean isUseClob() {
		return useClob;
	}

	public void setUseClob(boolean useClob) {
		this.useClob = useClob;
	}

	public boolean isUseDisplay() {
		return useDisplay;
	}

	public void setUseDisplay(boolean useDisplay) {
		this.useDisplay = useDisplay;
	}

	public boolean isUseEnum() {
		return useEnum;
	}

	public void setUseEnum(boolean useEnum) {
		this.useEnum = useEnum;
	}

	public boolean isUseList() {
		return useList;
	}

	public void setUseList(boolean useList) {
		this.useList = useList;
	}

	public boolean isUseManyToOne() {
		return useManyToOne;
	}

	public void setUseManyToOne(boolean useManyToOne) {
		this.useManyToOne = useManyToOne;
	}

	public boolean isUseOneToOne() {
		return useOneToOne;
	}

	public void setUseOneToOne(boolean useOneToOne) {
		this.useOneToOne = useOneToOne;
	}

	public boolean isUseCascade() {
		return useCascade;
	}

	public void setUseCascade(boolean useCascade) {
		this.useCascade = useCascade;
	}

	public boolean isUseJoinColumn() {
		return useJoinColumn;
	}

	public void setUseJoinColumn(boolean useJoinColumn) {
		this.useJoinColumn = useJoinColumn;
	}

	public boolean isEntityHierarchy() {
		return entityHierarchy;
	}

	public void setEntityHierarchy(boolean entityHierarchy) {
		this.entityHierarchy = entityHierarchy;
	}

	public boolean isSecondaryEntity() {
		return secondaryEntity;
	}

	public void setSecondaryEntity(boolean secondaryEntity) {
		this.secondaryEntity = secondaryEntity;
	}

	public List<ColumnTO> getColumns() {
		if (this.columns == null) {
			this.columns = new ArrayList<ColumnTO>();
		}
		return this.columns;
	}

	public void setColumns(List<ColumnTO> columns) {
		this.columns = columns;
	}

	public List<String> getPackageEntity() {
		if (this.packageEntity == null) {
			this.packageEntity = new ArrayList<String>();
		}
		return this.packageEntity;
	}

	public void setPackageEntity(List<String> packageEntity) {
		this.packageEntity = packageEntity;
	}

	public List<String> getPackageValidator() {
		if (this.packageValidator == null) {
			this.packageValidator = new ArrayList<String>();
		}
		return this.packageValidator;
	}

	public void setPackageValidator(List<String> packageValidator) {
		this.packageValidator = packageValidator;
	}

	public List<String> getPackageValidatorAplication() {
		if (this.packageValidatorAplication == null) {
			this.packageValidatorAplication = new ArrayList<String>();
		}
		return this.packageValidatorAplication;
	}

	public void setPackageValidatorAplication(
			List<String> packageValidatorAplication) {
		this.packageValidatorAplication = packageValidatorAplication;
	}

	public List<String> getPackageEnum() {
		if (this.packageEnum == null) {
			this.packageEnum = new ArrayList<String>();
		}
		return this.packageEnum;
	}

	public void setPackageEnum(List<String> packageEnum) {
		this.packageEnum = packageEnum;
	}

	public List<String> getDataDbUnit() {
		if (this.dataDbUnit == null) {
			this.dataDbUnit = new ArrayList<String>();
		}
		return this.dataDbUnit;
	}

	public void setDataDbUnit(List<String> datsaDbUnit) {
		this.dataDbUnit = datsaDbUnit;
	}

	public List<String> getDataEntity() {
		if (this.dataEntity == null) {
			this.dataEntity = new ArrayList<String>();
		}
		return this.dataEntity;
	}

	public void setDataEntity(List<String> dataEntity) {
		this.dataEntity = dataEntity;
	}

}
