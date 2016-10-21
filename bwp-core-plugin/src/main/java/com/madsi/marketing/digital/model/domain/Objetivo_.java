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
@StaticMetamodel(Objetivo.class)
public class Objetivo_ {

	public static volatile SingularAttribute<Objetivo, Long> id;	
	public static volatile ListAttribute<Objetivo, Campanha> campanhas;
	public static volatile SingularAttribute<Objetivo, String> nomeObjetivo;
	
}