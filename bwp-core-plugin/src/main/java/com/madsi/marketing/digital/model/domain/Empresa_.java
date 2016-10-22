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
@StaticMetamodel(Empresa.class)
public class Empresa_ {

	public static volatile SingularAttribute<Empresa, Long> id;	
	public static volatile ListAttribute<Empresa, Campanha> campanhas;
	public static volatile SingularAttribute<Empresa, Segmento> segmento;
	public static volatile SingularAttribute<Empresa, String> descriptionEmail;
	public static volatile SingularAttribute<Empresa, String> descriptionTelefone;
	
}