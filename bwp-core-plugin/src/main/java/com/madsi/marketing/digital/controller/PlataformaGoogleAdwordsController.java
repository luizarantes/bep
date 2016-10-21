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

import com.madsi.marketing.digital.model.domain.PlataformaGoogleAdwords;
import com.madsi.marketing.digital.model.domain.dto.PlataformaGoogleAdwordsDTO;
import com.madsi.marketing.digital.service.PlataformaGoogleAdwordsService;
import com.madsi.marketing.digital.data.repository.PlataformaGoogleAdwordsRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Controller
@RequestMapping("/api/v1/plataformaGoogleAdwords")
public class PlataformaGoogleAdwordsController {

	@Autowired
	private PlataformaGoogleAdwordsService<PlataformaGoogleAdwordsDTO, PlataformaGoogleAdwords, Long> service;

	@Autowired
    private PlataformaGoogleAdwordsRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<PlataformaGoogleAdwordsDTO>> findAll() {
		return new ResponseEntity<Iterable<PlataformaGoogleAdwordsDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<PlataformaGoogleAdwordsDTO> save(PlataformaGoogleAdwordsDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<PlataformaGoogleAdwordsDTO>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one", method = RequestMethod.GET)
	public ResponseEntity<PlataformaGoogleAdwordsDTO> findOne(Long id) {
		return new ResponseEntity<PlataformaGoogleAdwordsDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(Long id) {
		this.dataRepository.delete(id);
		return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
	}

}