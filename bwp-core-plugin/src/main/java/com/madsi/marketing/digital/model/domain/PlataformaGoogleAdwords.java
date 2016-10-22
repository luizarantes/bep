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
@Table(name = "TB_PLATAFORMA_GOOGLE_ADWORDS")
public class PlataformaGoogleAdwords extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_PLATAFORMA_GOOGLE_ADWORDS", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                                                                    
    /*
     * ENTIDADE METRICA
     */
    @OneToMany(mappedBy = "plataformaGoogleAdwords")
    private List<Metrica> metricas;
                                                                
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
    public PlataformaGoogleAdwords(Long id) {
        super(id);
    }

    public PlataformaGoogleAdwords() {

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