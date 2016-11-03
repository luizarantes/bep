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
@StaticMetamodel(CampanhaMetrica.class)
public class CampanhaMetrica_ {

	public static volatile SingularAttribute<CampanhaMetrica, Long> id;	
	public static volatile SingularAttribute<CampanhaMetrica, Campanha> campanha;
	public static volatile SingularAttribute<CampanhaMetrica, Plataforma> plataforma;
	public static volatile ListAttribute<CampanhaMetrica, Meta> metas;
	
}