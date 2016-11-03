/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service;

import com.bep.startup.model.domain.DomainEntity;
import com.bep.startup.model.domain.dto.DataTransferObject;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public abstract interface FaixaEtariaService <T extends DataTransferObject, E extends DomainEntity<?>, ID extends Serializable> extends Service<T, E, ID> {

}