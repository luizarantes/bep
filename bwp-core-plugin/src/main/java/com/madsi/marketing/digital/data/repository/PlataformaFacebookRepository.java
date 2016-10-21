/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.data.repository;

import com.madsi.marketing.digital.model.domain.PlataformaFacebook;
import com.madsi.marketing.digital.data.repository.custom.PlataformaFacebookCustomRepository;

import org.springframework.data.repository.CrudRepository;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public abstract interface PlataformaFacebookRepository extends CrudRepository<PlataformaFacebook, Long>, PlataformaFacebookCustomRepository {

}