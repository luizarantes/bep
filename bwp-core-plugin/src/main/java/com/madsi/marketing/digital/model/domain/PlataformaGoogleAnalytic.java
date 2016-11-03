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
@Table(name = "TB_PLATAFORMA_GOOGLE_ANALYTIC")
@DiscriminatorValue("3")
@PrimaryKeyJoinColumn(name = "ID_PLATAFORMA_GOOGLE_ANALYTIC", referencedColumnName = "ID_PLATAFORMA")
public class PlataformaGoogleAnalytic extends Plataforma {

    private static final long serialVersionUID = 1L;

                                                                                                                            
    /*
     * PERCENTUAL DE VISITA
     */
    
	@Column(name = "PC_VISITA", precision = 3, scale = 2)
    private Double percentVisita;
                        
    /*
     * PERCENTUAL DE TRAFICO
     */
    
	@Column(name = "PC_TRAFICO", precision = 3, scale = 2, nullable = false)
    private Double percentTrafico;
                        
    /*
     * PERCENTUAL DE VISITA UNICA
     */
    
	@Column(name = "PC_VISITA_UNICA", precision = 3, scale = 2)
    private Double percentVisitaUnica;
                        
    /*
     * PERCENTUAL DE RANK PAGINA
     */
    
	@Column(name = "PC_RANK_PAGINA", precision = 3, scale = 2)
    private Double percentRankPagina;
            
    /**
     * @param id
     */
    public PlataformaGoogleAnalytic(Long id) {
        super(id);
    }

    public PlataformaGoogleAnalytic() {

    }
                    
     
    /**
     * PERCENTUAL DE VISITA
     *
     * @param percentVisita
     */
    public void setPercentVisita(Double percentVisita) {
        this.percentVisita = percentVisita;
    }

    /**
     * PERCENTUAL DE VISITA
     *
     * @return Double
     */
    public Double getPercentVisita() {
        return this.percentVisita;
    }
                    
     
    /**
     * PERCENTUAL DE TRAFICO
     *
     * @param percentTrafico
     */
    public void setPercentTrafico(Double percentTrafico) {
        this.percentTrafico = percentTrafico;
    }

    /**
     * PERCENTUAL DE TRAFICO
     *
     * @return Double
     */
    public Double getPercentTrafico() {
        return this.percentTrafico;
    }
                    
     
    /**
     * PERCENTUAL DE VISITA UNICA
     *
     * @param percentVisitaUnica
     */
    public void setPercentVisitaUnica(Double percentVisitaUnica) {
        this.percentVisitaUnica = percentVisitaUnica;
    }

    /**
     * PERCENTUAL DE VISITA UNICA
     *
     * @return Double
     */
    public Double getPercentVisitaUnica() {
        return this.percentVisitaUnica;
    }
                    
     
    /**
     * PERCENTUAL DE RANK PAGINA
     *
     * @param percentRankPagina
     */
    public void setPercentRankPagina(Double percentRankPagina) {
        this.percentRankPagina = percentRankPagina;
    }

    /**
     * PERCENTUAL DE RANK PAGINA
     *
     * @return Double
     */
    public Double getPercentRankPagina() {
        return this.percentRankPagina;
    }
    
}