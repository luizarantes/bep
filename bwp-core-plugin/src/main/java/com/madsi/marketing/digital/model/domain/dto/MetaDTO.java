/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain.dto;

import java.util.Date;

import com.madsi.marketing.digital.model.type.TipoAcaoIndicador;
import com.madsi.marketing.digital.model.type.TipoMetaIndicador;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class MetaDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * DATA DE INICIO
     */
	private Date dateInicio;

  	/*
     * DATA DE FIM
     */
	private Date dateFim;

  	/*
     * PERCENTUAL DO VALOR
     */
	private Double percentValor;

  	/*
     * PERCENTUAL DO VALOR
     */
	private Double percentPercentual;

  	/*
     * INDICATIVO DO TIPO DE ALERTA
     */     
	private TipoMetaIndicador inTipoAlerta;

  	/*
     * INDICATIVO DA ACAO
     */     
	private TipoAcaoIndicador inTipoAcao;


    /**
     * @return Long
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }    
        
         /**
     * DATA DE INICIO
     *
     * @param dateInicio
     */
    public void setDateInicio(Date dateInicio) {
        this.dateInicio = dateInicio;
    }

    /**
     * DATA DE INICIO
     *
     * @return Date
     */
    public Date getDateInicio() {
        return this.dateInicio;
    }
             
         /**
     * DATA DE FIM
     *
     * @param dateFim
     */
    public void setDateFim(Date dateFim) {
        this.dateFim = dateFim;
    }

    /**
     * DATA DE FIM
     *
     * @return Date
     */
    public Date getDateFim() {
        return this.dateFim;
    }
             
         /**
     * PERCENTUAL DO VALOR
     *
     * @param percentValor
     */
    public void setPercentValor(Double percentValor) {
        this.percentValor = percentValor;
    }

    /**
     * PERCENTUAL DO VALOR
     *
     * @return Double
     */
    public Double getPercentValor() {
        return this.percentValor;
    }
             
         /**
     * PERCENTUAL DO VALOR
     *
     * @param percentPercentual
     */
    public void setPercentPercentual(Double percentPercentual) {
        this.percentPercentual = percentPercentual;
    }

    /**
     * PERCENTUAL DO VALOR
     *
     * @return Double
     */
    public Double getPercentPercentual() {
        return this.percentPercentual;
    }
             
     
    /**
     * INDICATIVO DO TIPO DE ALERTA
     *
     * @param inTipoAlerta
     */
    public void setInTipoAlerta(TipoMetaIndicador inTipoAlerta) {
        this.inTipoAlerta = inTipoAlerta;
    }

    /**
     * INDICATIVO DO TIPO DE ALERTA
     *
     * @return TipoMetaIndicador
     */
    public TipoMetaIndicador getInTipoAlerta() {
        return this.inTipoAlerta;
    }
        
     
    /**
     * INDICATIVO DA ACAO
     *
     * @param inTipoAcao
     */
    public void setInTipoAcao(TipoAcaoIndicador inTipoAcao) {
        this.inTipoAcao = inTipoAcao;
    }

    /**
     * INDICATIVO DA ACAO
     *
     * @return TipoAcaoIndicador
     */
    public TipoAcaoIndicador getInTipoAcao() {
        return this.inTipoAcao;
    }

}