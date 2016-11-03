/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Token.class)
public class Token_ {

	public static volatile SingularAttribute<Token, Long> id;	
	public static volatile SingularAttribute<Token, Usuario> usuario;
	public static volatile SingularAttribute<Token, String> codeToken;
	public static volatile SingularAttribute<Token, String> descriptionIp;
	public static volatile SingularAttribute<Token, String> descriptionUserAgent;
	public static volatile SingularAttribute<Token, Date> dateCriacao;
	public static volatile SingularAttribute<Token, String> inStatus;
	
}