/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_PLATAFORMA_FACEBOOK")
@DiscriminatorValue("1")
@PrimaryKeyJoinColumn(name = "ID_PLATAFORMA_FACEBOOK", referencedColumnName = "ID_PLATAFORMA")
public class PlataformaFacebook extends Plataforma {

    private static final long serialVersionUID = 1L;

                                                                                                    
    /*
     * PERCENTUAL DE COMPARTILHAMENTO
     */
    
	@Column(name = "PC_COMPARTILHAMENTO", precision = 3, scale = 2)
    private Double percentCompartilhamento;
                        
    /*
     * PERCENTUAL DE CURTIDA DE PAGINA
     */
    
	@Column(name = "PC_CURTIDA_PAGINA", precision = 3, scale = 2)
    private Double percentCurtidaPagina;
                        
    /*
     * PERCENTUAL DE CURTIDA DE POST
     */
    
	@Column(name = "PC_CURTIDA_POST", precision = 3, scale = 2)
    private Double percentCurtidaPost;
            
    /**
     * @param id
     */
    public PlataformaFacebook(Long id) {
        super(id);
    }

    public PlataformaFacebook() {

    }
                    
     
    /**
     * PERCENTUAL DE COMPARTILHAMENTO
     *
     * @param percentCompartilhamento
     */
    public void setPercentCompartilhamento(Double percentCompartilhamento) {
        this.percentCompartilhamento = percentCompartilhamento;
    }

    /**
     * PERCENTUAL DE COMPARTILHAMENTO
     *
     * @return Double
     */
    public Double getPercentCompartilhamento() {
        return this.percentCompartilhamento;
    }
                    
     
    /**
     * PERCENTUAL DE CURTIDA DE PAGINA
     *
     * @param percentCurtidaPagina
     */
    public void setPercentCurtidaPagina(Double percentCurtidaPagina) {
        this.percentCurtidaPagina = percentCurtidaPagina;
    }

    /**
     * PERCENTUAL DE CURTIDA DE PAGINA
     *
     * @return Double
     */
    public Double getPercentCurtidaPagina() {
        return this.percentCurtidaPagina;
    }
                    
     
    /**
     * PERCENTUAL DE CURTIDA DE POST
     *
     * @param percentCurtidaPost
     */
    public void setPercentCurtidaPost(Double percentCurtidaPost) {
        this.percentCurtidaPost = percentCurtidaPost;
    }

    /**
     * PERCENTUAL DE CURTIDA DE POST
     *
     * @return Double
     */
    public Double getPercentCurtidaPost() {
        return this.percentCurtidaPost;
    }
    
}