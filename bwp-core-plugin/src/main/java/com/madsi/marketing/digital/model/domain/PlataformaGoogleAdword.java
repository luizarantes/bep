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
@Table(name = "TB_PLATAFORMA_GOOGLE_ADWORD")
@DiscriminatorValue("2")
@PrimaryKeyJoinColumn(name = "ID_PLATAFORMA_GOOGLE_ADWORD", referencedColumnName = "ID_PLATAFORMA")
public class PlataformaGoogleAdword extends Plataforma {

    private static final long serialVersionUID = 1L;

                                                                                                                            
    /*
     * PERCENTUAL DE CLIQUE IMPRESSO E CLICADO
     */
    
	@Column(name = "PC_CTR", precision = 3, scale = 2, nullable = false)
    private Double percentCtr;
                        
    /*
     * PERCENTUAL DE CLIQUE
     */
    
	@Column(name = "PC_CLIQUE", precision = 3, scale = 2)
    private Double percentClique;
                        
    /*
     * PERCENTUAL DE ALCANCE
     */
    
	@Column(name = "PC_ALCANCE", precision = 3, scale = 2)
    private Double percentAlcance;
                        
    /*
     * PERCENTUAL DE CLIQUE CONVERTIDO
     */
    
	@Column(name = "PC_CLIQUE_CONVERTIDO", precision = 3, scale = 2)
    private Double percentCliqueConvertido;
            
    /**
     * @param id
     */
    public PlataformaGoogleAdword(Long id) {
        super(id);
    }

    public PlataformaGoogleAdword() {

    }
                    
     
    /**
     * PERCENTUAL DE CLIQUE IMPRESSO E CLICADO
     *
     * @param percentCtr
     */
    public void setPercentCtr(Double percentCtr) {
        this.percentCtr = percentCtr;
    }

    /**
     * PERCENTUAL DE CLIQUE IMPRESSO E CLICADO
     *
     * @return Double
     */
    public Double getPercentCtr() {
        return this.percentCtr;
    }
                    
     
    /**
     * PERCENTUAL DE CLIQUE
     *
     * @param percentClique
     */
    public void setPercentClique(Double percentClique) {
        this.percentClique = percentClique;
    }

    /**
     * PERCENTUAL DE CLIQUE
     *
     * @return Double
     */
    public Double getPercentClique() {
        return this.percentClique;
    }
                    
     
    /**
     * PERCENTUAL DE ALCANCE
     *
     * @param percentAlcance
     */
    public void setPercentAlcance(Double percentAlcance) {
        this.percentAlcance = percentAlcance;
    }

    /**
     * PERCENTUAL DE ALCANCE
     *
     * @return Double
     */
    public Double getPercentAlcance() {
        return this.percentAlcance;
    }
                    
     
    /**
     * PERCENTUAL DE CLIQUE CONVERTIDO
     *
     * @param percentCliqueConvertido
     */
    public void setPercentCliqueConvertido(Double percentCliqueConvertido) {
        this.percentCliqueConvertido = percentCliqueConvertido;
    }

    /**
     * PERCENTUAL DE CLIQUE CONVERTIDO
     *
     * @return Double
     */
    public Double getPercentCliqueConvertido() {
        return this.percentCliqueConvertido;
    }
    
}