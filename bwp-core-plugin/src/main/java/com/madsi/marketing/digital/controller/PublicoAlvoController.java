/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.madsi.marketing.digital.model.domain.PublicoAlvo;
import com.madsi.marketing.digital.model.domain.dto.PublicoAlvoDTO;
import com.madsi.marketing.digital.service.PublicoAlvoService;
import com.madsi.marketing.digital.data.repository.PublicoAlvoRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Controller
@RequestMapping("/api/v1/publicoAlvo")
public class PublicoAlvoController {

	@Autowired
	private PublicoAlvoService<PublicoAlvoDTO, PublicoAlvo, Long> service;

	@Autowired
    private PublicoAlvoRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<PublicoAlvoDTO>> findAll() {
		return new ResponseEntity<Iterable<PublicoAlvoDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<PublicoAlvoDTO> save(PublicoAlvoDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<PublicoAlvoDTO>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one", method = RequestMethod.GET)
	public ResponseEntity<PublicoAlvoDTO> findOne(Long id) {
		return new ResponseEntity<PublicoAlvoDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(Long id) {
		this.dataRepository.delete(id);
		return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
	}

}