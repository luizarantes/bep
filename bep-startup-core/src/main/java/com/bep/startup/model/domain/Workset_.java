/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;


import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Workset.class)
public class Workset_ {

	public static volatile SingularAttribute<Workset, Long> id;	
	public static volatile SingularAttribute<Workset, Project> project;
	public static volatile SingularAttribute<Workset, WorksetType> worksetType;
	public static volatile SingularAttribute<Workset, String> descriptionWorkset;
	
}