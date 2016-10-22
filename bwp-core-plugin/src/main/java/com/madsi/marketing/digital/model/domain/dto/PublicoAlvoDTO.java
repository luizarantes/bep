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
	private String nomeClasseSocial;

  	/*
     * TEXTO DA LOCALIZACAO
     */
	private String descricaoLocalizacao;

  	/*
     * TEXTO DO INTERESSE
     */
	private String descricaoInteresse;


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
     * @param nomeClasseSocial
     */
    public void setNomeClasseSocial(String nomeClasseSocial) {
        this.nomeClasseSocial = nomeClasseSocial;
    }

    /**
     * NOME DA CLASSE SOCIAL
     *
     * @return String
     */
    public String getNomeClasseSocial() {
        return this.nomeClasseSocial;
    }
             
         /**
     * TEXTO DA LOCALIZACAO
     *
     * @param descricaoLocalizacao
     */
    public void setDescricaoLocalizacao(String descricaoLocalizacao) {
        this.descricaoLocalizacao = descricaoLocalizacao;
    }

    /**
     * TEXTO DA LOCALIZACAO
     *
     * @return String
     */
    public String getDescricaoLocalizacao() {
        return this.descricaoLocalizacao;
    }
             
         /**
     * TEXTO DO INTERESSE
     *
     * @param descricaoInteresse
     */
    public void setDescricaoInteresse(String descricaoInteresse) {
        this.descricaoInteresse = descricaoInteresse;
    }

    /**
     * TEXTO DO INTERESSE
     *
     * @return String
     */
    public String getDescricaoInteresse() {
        return this.descricaoInteresse;
    }
     
}