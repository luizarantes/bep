/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain;


import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(User.class)
public class User_ {

	public static volatile SingularAttribute<User, Long> id;	
	public static volatile ListAttribute<User, Project> projects;
	public static volatile SingularAttribute<User, String> descriptionMail;
	public static volatile SingularAttribute<User, String> descriptionPassword;
	
}