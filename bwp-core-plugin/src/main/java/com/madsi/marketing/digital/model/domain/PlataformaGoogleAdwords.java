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
    private Double percentualCtr;
                        
    /*
     * PERCENTUAL DE CLIQUE
     */
    
	@Column(name = "PC_CLIQUE", precision = 3, scale = 2)
    private Double percentualClique;
                        
    /*
     * PERCENTUAL DE ALCANCE
     */
    
	@Column(name = "PC_ALCANCE", precision = 3, scale = 2)
    private Double percentualAlcance;
                        
    /*
     * PERCENTUAL DE CLIQUE CONVERTIDO
     */
    
	@Column(name = "PC_CLIQUE_CONVERTIDO", precision = 3, scale = 2)
    private Double percentualCliqueConvertido;
            
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
     * @param percentualCtr
     */
    public void setPercentualCtr(Double percentualCtr) {
        this.percentualCtr = percentualCtr;
    }

    /**
     * PERCENTUAL DE CLIQUE IMPRESSO E CLICADO
     *
     * @return Double
     */
    public Double getPercentualCtr() {
        return this.percentualCtr;
    }
                    
     
    /**
     * PERCENTUAL DE CLIQUE
     *
     * @param percentualClique
     */
    public void setPercentualClique(Double percentualClique) {
        this.percentualClique = percentualClique;
    }

    /**
     * PERCENTUAL DE CLIQUE
     *
     * @return Double
     */
    public Double getPercentualClique() {
        return this.percentualClique;
    }
                    
     
    /**
     * PERCENTUAL DE ALCANCE
     *
     * @param percentualAlcance
     */
    public void setPercentualAlcance(Double percentualAlcance) {
        this.percentualAlcance = percentualAlcance;
    }

    /**
     * PERCENTUAL DE ALCANCE
     *
     * @return Double
     */
    public Double getPercentualAlcance() {
        return this.percentualAlcance;
    }
                    
     
    /**
     * PERCENTUAL DE CLIQUE CONVERTIDO
     *
     * @param percentualCliqueConvertido
     */
    public void setPercentualCliqueConvertido(Double percentualCliqueConvertido) {
        this.percentualCliqueConvertido = percentualCliqueConvertido;
    }

    /**
     * PERCENTUAL DE CLIQUE CONVERTIDO
     *
     * @return Double
     */
    public Double getPercentualCliqueConvertido() {
        return this.percentualCliqueConvertido;
    }
    
}