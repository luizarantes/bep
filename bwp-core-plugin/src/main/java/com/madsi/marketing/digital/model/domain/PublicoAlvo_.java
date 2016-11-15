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

import com.madsi.marketing.digital.model.domain.type.ClasseSocialIndicador;
import com.madsi.marketing.digital.model.domain.type.TipoPlataformaStatusIndicador;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@StaticMetamodel(PublicoAlvo.class)
public class PublicoAlvo_ {

	public static volatile SingularAttribute<PublicoAlvo, Long> id;	
	public static volatile ListAttribute<PublicoAlvo, Campanha> campanhas;
	public static volatile SingularAttribute<PublicoAlvo, FaixaEtaria> faixaEtaria;
	public static volatile SingularAttribute<PublicoAlvo, TipoPlataformaStatusIndicador> inSexo;
	public static volatile SingularAttribute<PublicoAlvo, ClasseSocialIndicador> inClasseSocial;
	public static volatile SingularAttribute<PublicoAlvo, String> descriptionLocalizacao;
	public static volatile SingularAttribute<PublicoAlvo, String> descriptionInteresse;
	
}