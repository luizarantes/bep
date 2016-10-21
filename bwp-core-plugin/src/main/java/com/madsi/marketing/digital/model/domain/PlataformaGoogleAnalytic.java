/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_PLATAFORMA_GOOGLE_ANALYTIC")
public class PlataformaGoogleAnalytic extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_PLATAFORMA_GOOGLE_ANALYTIC", nullable = false, updatable = false, precision = 12)
    @SequenceGenerator(name = "sqPlataformaGoogleAnalytic", sequenceName = "SQ_PLATAFORMA_GOOGLE_ANALYTIC", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sqPlataformaGoogleAnalytic", strategy = GenerationType.SEQUENCE)
    private Long id;
                                                                                                    
    /*
     * ENTIDADE METRICA
     */
    @OneToMany(mappedBy = "plataformaGoogleAnalytic")
    private List<Metrica> metricas;
                                                                
    /*
     * PERCENTUAL DE VISITA
     */
    
	@Column(name = "PC_VISITA", precision = 3, scale = 2)
    private Double percentualVisita;
                        
    /*
     * PERCENTUAL DE TRAFICO
     */
    
	@Column(name = "PC_TRAFICO", precision = 3, scale = 2, nullable = false)
    private Double percentualTrafico;
                        
    /*
     * PERCENTUAL DE VISITA UNICA
     */
    
	@Column(name = "PC_VISITA_UNICA", precision = 3, scale = 2)
    private Double percentualVisitaUnica;
                        
    /*
     * PERCENTUAL DE RANK PAGINA
     */
    
	@Column(name = "PC_RANK_PAGINA", precision = 3, scale = 2)
    private Double percentualRankPagina;
            
    /**
     * @param id
     */
    public PlataformaGoogleAnalytic(Long id) {
        super(id);
    }

    public PlataformaGoogleAnalytic() {

    }

    /**
     * @return Long
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }
                    
     
    /**
     * ENTIDADE METRICA
     *
     * @param metricas
     */
    public void setMetricas(List<Metrica> metricas) {
        this.metricas = metricas;
    }

    /**
     * ENTIDADE METRICA
     *
     * @return List<Metrica>
     */
    public List<Metrica> getMetricas() {
        return this.metricas;
    }
                    
     
    /**
     * PERCENTUAL DE VISITA
     *
     * @param percentualVisita
     */
    public void setPercentualVisita(Double percentualVisita) {
        this.percentualVisita = percentualVisita;
    }

    /**
     * PERCENTUAL DE VISITA
     *
     * @return Double
     */
    public Double getPercentualVisita() {
        return this.percentualVisita;
    }
                    
     
    /**
     * PERCENTUAL DE TRAFICO
     *
     * @param percentualTrafico
     */
    public void setPercentualTrafico(Double percentualTrafico) {
        this.percentualTrafico = percentualTrafico;
    }

    /**
     * PERCENTUAL DE TRAFICO
     *
     * @return Double
     */
    public Double getPercentualTrafico() {
        return this.percentualTrafico;
    }
                    
     
    /**
     * PERCENTUAL DE VISITA UNICA
     *
     * @param percentualVisitaUnica
     */
    public void setPercentualVisitaUnica(Double percentualVisitaUnica) {
        this.percentualVisitaUnica = percentualVisitaUnica;
    }

    /**
     * PERCENTUAL DE VISITA UNICA
     *
     * @return Double
     */
    public Double getPercentualVisitaUnica() {
        return this.percentualVisitaUnica;
    }
                    
     
    /**
     * PERCENTUAL DE RANK PAGINA
     *
     * @param percentualRankPagina
     */
    public void setPercentualRankPagina(Double percentualRankPagina) {
        this.percentualRankPagina = percentualRankPagina;
    }

    /**
     * PERCENTUAL DE RANK PAGINA
     *
     * @return Double
     */
    public Double getPercentualRankPagina() {
        return this.percentualRankPagina;
    }
    
}