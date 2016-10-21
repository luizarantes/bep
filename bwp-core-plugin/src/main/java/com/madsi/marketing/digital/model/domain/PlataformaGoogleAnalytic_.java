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
@StaticMetamodel(PlataformaGoogleAnalytic.class)
public class PlataformaGoogleAnalytic_ {

	public static volatile SingularAttribute<PlataformaGoogleAnalytic, Long> id;	
	public static volatile ListAttribute<PlataformaGoogleAnalytic, Metrica> metricas;
	public static volatile SingularAttribute<PlataformaGoogleAnalytic, Double> percentualVisita;
	public static volatile SingularAttribute<PlataformaGoogleAnalytic, Double> percentualTrafico;
	public static volatile SingularAttribute<PlataformaGoogleAnalytic, Double> percentualVisitaUnica;
	public static volatile SingularAttribute<PlataformaGoogleAnalytic, Double> percentualRankPagina;
	
}