/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain;


import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Usuario.class)
public class Usuario_ {

	public static volatile SingularAttribute<Usuario, Long> id;	
	public static volatile SingularAttribute<Usuario, String> descriptionEmail;
	public static volatile SingularAttribute<Usuario, String> descriptionSenha;
	public static volatile ListAttribute<Usuario, Token> tokens;
	
}