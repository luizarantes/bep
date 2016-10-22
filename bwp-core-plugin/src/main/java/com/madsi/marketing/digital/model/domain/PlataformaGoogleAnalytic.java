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
    @GeneratedValue(strategy = GenerationType.AUTO)
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