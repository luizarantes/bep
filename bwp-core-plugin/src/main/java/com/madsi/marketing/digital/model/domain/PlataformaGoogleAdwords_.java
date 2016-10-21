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
@StaticMetamodel(PlataformaGoogleAdwords.class)
public class PlataformaGoogleAdwords_ {

	public static volatile SingularAttribute<PlataformaGoogleAdwords, Long> id;	
	public static volatile ListAttribute<PlataformaGoogleAdwords, Metrica> metricas;
	public static volatile SingularAttribute<PlataformaGoogleAdwords, Double> percentualCtr;
	public static volatile SingularAttribute<PlataformaGoogleAdwords, Double> percentualClique;
	public static volatile SingularAttribute<PlataformaGoogleAdwords, Double> percentualAlcance;
	public static volatile SingularAttribute<PlataformaGoogleAdwords, Double> percentualCliqueConvertido;
	
}