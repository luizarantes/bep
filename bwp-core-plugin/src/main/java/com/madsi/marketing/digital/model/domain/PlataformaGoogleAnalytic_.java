/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain;


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
	public static volatile SingularAttribute<PlataformaGoogleAnalytic, Double> percentVisita;
	public static volatile SingularAttribute<PlataformaGoogleAnalytic, Double> percentTrafico;
	public static volatile SingularAttribute<PlataformaGoogleAnalytic, Double> percentVisitaUnica;
	public static volatile SingularAttribute<PlataformaGoogleAnalytic, Double> percentRankPagina;
	
}