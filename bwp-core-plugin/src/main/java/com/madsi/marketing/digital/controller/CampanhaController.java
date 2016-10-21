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

import com.madsi.marketing.digital.model.domain.Campanha;
import com.madsi.marketing.digital.model.domain.dto.CampanhaDTO;
import com.madsi.marketing.digital.service.CampanhaService;
import com.madsi.marketing.digital.data.repository.CampanhaRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Controller
@RequestMapping("/api/v1/campanha")
public class CampanhaController {

	@Autowired
	private CampanhaService<CampanhaDTO, Campanha, Long> service;

	@Autowired
    private CampanhaRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<CampanhaDTO>> findAll() {
		return new ResponseEntity<Iterable<CampanhaDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<CampanhaDTO> save(CampanhaDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<CampanhaDTO>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one", method = RequestMethod.GET)
	public ResponseEntity<CampanhaDTO> findOne(Long id) {
		return new ResponseEntity<CampanhaDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(Long id) {
		this.dataRepository.delete(id);
		return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
	}

}