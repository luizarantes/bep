/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.service.impl;

import org.springframework.stereotype.Service;

import com.madsi.marketing.digital.model.domain.Usuario;
import com.madsi.marketing.digital.model.domain.dto.UsuarioDTO;
import com.madsi.marketing.digital.service.UsuarioService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class UsuarioServiceImpl extends AbstractService<UsuarioDTO, Usuario, Long> implements UsuarioService<UsuarioDTO, Usuario, Long> {
    
     public  UsuarioServiceImpl() {
    	super(UsuarioDTO.class, Usuario.class);
    }
}