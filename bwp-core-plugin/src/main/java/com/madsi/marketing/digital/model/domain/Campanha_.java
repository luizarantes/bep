/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Campanha.class)
public class Campanha_ {

	public static volatile SingularAttribute<Campanha, Long> id;	
	public static volatile SingularAttribute<Campanha, Metrica> metrica;
	public static volatile SingularAttribute<Campanha, Objetivo> objetivo;
	public static volatile SingularAttribute<Campanha, PublicoAlvo> publicoAlvo;
	public static volatile SingularAttribute<Campanha, Empresa> empresa;
	public static volatile SingularAttribute<Campanha, String> nameCampanha;
	public static volatile SingularAttribute<Campanha, String> descriptionProblema;
	public static volatile SingularAttribute<Campanha, Date> dateInicio;
	public static volatile SingularAttribute<Campanha, Date> dateFim;
	
}