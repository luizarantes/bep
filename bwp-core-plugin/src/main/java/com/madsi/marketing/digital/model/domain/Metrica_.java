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
@StaticMetamodel(Metrica.class)
public class Metrica_ {

	public static volatile SingularAttribute<Metrica, Long> id;	
	public static volatile ListAttribute<Metrica, Campanha> campanhas;
	public static volatile SingularAttribute<Metrica, String> nomeMetrica;
	public static volatile SingularAttribute<Metrica, PlataformaFacebook> plataformaFacebook;
	public static volatile SingularAttribute<Metrica, PlataformaGoogleAdwords> plataformaGoogleAdwords;
	public static volatile SingularAttribute<Metrica, PlataformaGoogleAnalytic> plataformaGoogleAnalytic;
	
}