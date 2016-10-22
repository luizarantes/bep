/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain.dto;



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
	private String inSexo;

  	/*
     * NOME DA CLASSE SOCIAL
     */
	private String nameClasseSocial;

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
    public void setInSexo(String inSexo) {
        this.inSexo = inSexo;
    }

    /**
     * INDICATIVO DO SEXO
     *
     * @return String
     */
    public String getInSexo() {
        return this.inSexo;
    }
             
         /**
     * NOME DA CLASSE SOCIAL
     *
     * @param nameClasseSocial
     */
    public void setNameClasseSocial(String nameClasseSocial) {
        this.nameClasseSocial = nameClasseSocial;
    }

    /**
     * NOME DA CLASSE SOCIAL
     *
     * @return String
     */
    public String getNameClasseSocial() {
        return this.nameClasseSocial;
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