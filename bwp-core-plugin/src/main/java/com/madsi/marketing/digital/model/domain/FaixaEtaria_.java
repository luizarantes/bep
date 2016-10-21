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
@StaticMetamodel(FaixaEtaria.class)
public class FaixaEtaria_ {

	public static volatile SingularAttribute<FaixaEtaria, Long> id;	
	public static volatile ListAttribute<FaixaEtaria, PublicoAlvo> publicoAlvos;
	public static volatile SingularAttribute<FaixaEtaria, String> nomeFaixaEtaria;
	public static volatile SingularAttribute<FaixaEtaria, Short> numeroFaixaInicial;
	public static volatile SingularAttribute<FaixaEtaria, Short> numeroFaixaFinal;
	
}