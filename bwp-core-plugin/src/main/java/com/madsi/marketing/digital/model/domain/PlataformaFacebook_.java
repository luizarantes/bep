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
@StaticMetamodel(PlataformaFacebook.class)
public class PlataformaFacebook_ {

	public static volatile SingularAttribute<PlataformaFacebook, Long> id;	
	public static volatile ListAttribute<PlataformaFacebook, Metrica> metricas;
	public static volatile SingularAttribute<PlataformaFacebook, Double> percentualCompartilhamento;
	public static volatile SingularAttribute<PlataformaFacebook, Double> percentualCurtidaPagina;
	public static volatile SingularAttribute<PlataformaFacebook, Double> percentualCurtidaPost;
	
}