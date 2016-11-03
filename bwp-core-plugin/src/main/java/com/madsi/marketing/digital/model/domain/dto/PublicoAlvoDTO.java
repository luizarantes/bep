/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain.dto;


import com.madsi.marketing.digital.model.type.ClasseSocialIndicador;
import com.madsi.marketing.digital.model.type.TipoPlataformaStatusIndicador;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public class PublicoAlvoDTO extends DataTransferObject {

	private static final long serialVersionUID = 1L;
	
	private Long id;

  	/*
     * INDICATIVO DO SEXO
     */     
	private TipoPlataformaStatusIndicador inSexo;

  	/*
     * INDICATIVO DA CLASSE SOCIAL
     */     
	private ClasseSocialIndicador inClasseSocial;

  	/*
     * TEXTO DA LOCALIZACAO
     */
	private String descriptionLocalizacao;

  	/*
     * TEXTO DO INTERESSE
     */
	private String descriptionInteresse;


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
     * INDICATIVO DO SEXO
     *
     * @param inSexo
     */
    public void setInSexo(TipoPlataformaStatusIndicador inSexo) {
        this.inSexo = inSexo;
    }

    /**
     * INDICATIVO DO SEXO
     *
     * @return TipoPlataformaStatusIndicador
     */
    public TipoPlataformaStatusIndicador getInSexo() {
        return this.inSexo;
    }
        
     
    /**
     * INDICATIVO DA CLASSE SOCIAL
     *
     * @param inClasseSocial
     */
    public void setInClasseSocial(ClasseSocialIndicador inClasseSocial) {
        this.inClasseSocial = inClasseSocial;
    }

    /**
     * INDICATIVO DA CLASSE SOCIAL
     *
     * @return ClasseSocialIndicador
     */
    public ClasseSocialIndicador getInClasseSocial() {
        return this.inClasseSocial;
    }
        
         /**
     * TEXTO DA LOCALIZACAO
     *
     * @param descriptionLocalizacao
     */
    public void setDescriptionLocalizacao(String descriptionLocalizacao) {
        this.descriptionLocalizacao = descriptionLocalizacao;
    }

    /**
     * TEXTO DA LOCALIZACAO
     *
     * @return String
     */
    public String getDescriptionLocalizacao() {
        return this.descriptionLocalizacao;
    }
             
         /**
     * TEXTO DO INTERESSE
     *
     * @param descriptionInteresse
     */
    public void setDescriptionInteresse(String descriptionInteresse) {
        this.descriptionInteresse = descriptionInteresse;
    }

    /**
     * TEXTO DO INTERESSE
     *
     * @return String
     */
    public String getDescriptionInteresse() {
        return this.descriptionInteresse;
    }
     
}