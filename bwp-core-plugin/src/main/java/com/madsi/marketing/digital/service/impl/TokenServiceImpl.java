/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service.impl;

import org.springframework.stereotype.Service;

import com.madsi.marketing.digital.model.domain.Token;
import com.madsi.marketing.digital.model.domain.dto.TokenDTO;
import com.madsi.marketing.digital.service.TokenService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class TokenServiceImpl extends AbstractService<TokenDTO, Token, Long> implements TokenService<TokenDTO, Token, Long> {
    
     public  TokenServiceImpl() {
    	super(TokenDTO.class, Token.class);
    }
}