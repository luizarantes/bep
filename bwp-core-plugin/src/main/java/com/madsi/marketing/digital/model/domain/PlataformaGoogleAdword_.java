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
@StaticMetamodel(PlataformaGoogleAdword.class)
public class PlataformaGoogleAdword_ {

	public static volatile SingularAttribute<PlataformaGoogleAdword, Long> id;	
	public static volatile SingularAttribute<PlataformaGoogleAdword, Double> percentCtr;
	public static volatile SingularAttribute<PlataformaGoogleAdword, Double> percentClique;
	public static volatile SingularAttribute<PlataformaGoogleAdword, Double> percentAlcance;
	public static volatile SingularAttribute<PlataformaGoogleAdword, Double> percentCliqueConvertido;
	
}