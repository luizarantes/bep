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

import com.madsi.marketing.digital.model.domain.FaixaEtaria;
import com.madsi.marketing.digital.model.domain.dto.FaixaEtariaDTO;
import com.madsi.marketing.digital.service.FaixaEtariaService;
import com.madsi.marketing.digital.data.repository.FaixaEtariaRepository;


/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Controller
@RequestMapping("/api/v1/faixaEtaria")
public class FaixaEtariaController {

	@Autowired
	private FaixaEtariaService<FaixaEtariaDTO, FaixaEtaria, Long> service;

	@Autowired
    private FaixaEtariaRepository dataRepository;

	@ResponseBody
	@RequestMapping(path = "/find/all", method = RequestMethod.GET)
	public ResponseEntity<Iterable<FaixaEtariaDTO>> findAll() {
		return new ResponseEntity<Iterable<FaixaEtariaDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<FaixaEtariaDTO> save(FaixaEtariaDTO dto) {
		this.service.save(dto);
		return new ResponseEntity<FaixaEtariaDTO>(HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(path = "/find/one", method = RequestMethod.GET)
	public ResponseEntity<FaixaEtariaDTO> findOne(Long id) {
		return new ResponseEntity<FaixaEtariaDTO>(this.service.findOne(id), HttpStatus.OK);
	}
	
	@ResponseBody	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(Long id) {
		this.dataRepository.delete(id);
		return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
	}

}