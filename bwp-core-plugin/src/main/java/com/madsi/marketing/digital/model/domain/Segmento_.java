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
@StaticMetamodel(Segmento.class)
public class Segmento_ {

	public static volatile SingularAttribute<Segmento, Long> id;	
	public static volatile ListAttribute<Segmento, Empresa> empresas;
	public static volatile SingularAttribute<Segmento, String> nameSegmento;
	
}