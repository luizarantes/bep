/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain;

import java.util.Date;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.madsi.marketing.digital.model.domain.type.TipoPlataformaStatusIndicador;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(Plataforma.class)
public class Plataforma_ {

	public static volatile SingularAttribute<Plataforma, Long> id;	
	public static volatile SingularAttribute<Plataforma, String> codeConta;
	public static volatile SingularAttribute<Plataforma, Date> dateInicio;
	public static volatile SingularAttribute<Plataforma, Date> dateAtualizacao;
	public static volatile SingularAttribute<Plataforma, TipoPlataformaStatusIndicador> inTipoPlataformaStatus;
	public static volatile SingularAttribute<Plataforma, String> codeCampanha;
	public static volatile ListAttribute<Plataforma, CampanhaMetrica> campanhaMetricas;
	
}