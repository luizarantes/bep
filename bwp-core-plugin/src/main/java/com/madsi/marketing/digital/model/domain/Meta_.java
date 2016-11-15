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

import com.madsi.marketing.digital.model.domain.type.TipoAcaoIndicador;
import com.madsi.marketing.digital.model.domain.type.TipoMetaIndicador;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Meta.class)
public class Meta_ {

	public static volatile SingularAttribute<Meta, Long> id;	
	public static volatile SingularAttribute<Meta, CampanhaMetrica> campanhaMetrica;
	public static volatile SingularAttribute<Meta, Date> dateInicio;
	public static volatile SingularAttribute<Meta, Date> dateFim;
	public static volatile SingularAttribute<Meta, Double> percentValor;
	public static volatile SingularAttribute<Meta, Double> percentPercentual;
	public static volatile SingularAttribute<Meta, TipoMetaIndicador> inTipoAlerta;
	public static volatile SingularAttribute<Meta, TipoAcaoIndicador> inTipoAcao;
	
}