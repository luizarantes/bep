/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.model.domain;


import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Software.class)
public class Software_ {

	public static volatile SingularAttribute<Software, Long> id;	
	public static volatile SingularAttribute<Software, Project> project;
	public static volatile SingularAttribute<Software, SoftwareType> softwareType;
	public static volatile SingularAttribute<Software, String> descriptionDescription;
	
}