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
@Table(name = "TB_PLATAFORMA_FACEBOOK")
public class PlataformaFacebook extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_PLATAFORMA_FACEBOOK", nullable = false, updatable = false, precision = 12)
    @SequenceGenerator(name = "sqPlataformaFacebook", sequenceName = "SQ_PLATAFORMA_FACEBOOK", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sqPlataformaFacebook", strategy = GenerationType.SEQUENCE)
    private Long id;
                                                                                    
    /*
     * ENTIDADE METRICA
     */
    @OneToMany(mappedBy = "plataformaFacebook")
    private List<Metrica> metricas;
                                                        
    /*
     * PERCENTUAL DE COMPARTILHAMENTO
     */
    
	@Column(name = "PC_COMPARTILHAMENTO", precision = 3, scale = 2)
    private Double percentualCompartilhamento;
                        
    /*
     * PERCENTUAL DE CURTIDA DE PAGINA
     */
    
	@Column(name = "PC_CURTIDA_PAGINA", precision = 3, scale = 2)
    private Double percentualCurtidaPagina;
                        
    /*
     * PERCENTUAL DE CURTIDA DE POST
     */
    
	@Column(name = "PC_CURTIDA_POST", precision = 3, scale = 2)
    private Double percentualCurtidaPost;
            
    /**
     * @param id
     */
    public PlataformaFacebook(Long id) {
        super(id);
    }

    public PlataformaFacebook() {

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
     * PERCENTUAL DE COMPARTILHAMENTO
     *
     * @param percentualCompartilhamento
     */
    public void setPercentualCompartilhamento(Double percentualCompartilhamento) {
        this.percentualCompartilhamento = percentualCompartilhamento;
    }

    /**
     * PERCENTUAL DE COMPARTILHAMENTO
     *
     * @return Double
     */
    public Double getPercentualCompartilhamento() {
        return this.percentualCompartilhamento;
    }
                    
     
    /**
     * PERCENTUAL DE CURTIDA DE PAGINA
     *
     * @param percentualCurtidaPagina
     */
    public void setPercentualCurtidaPagina(Double percentualCurtidaPagina) {
        this.percentualCurtidaPagina = percentualCurtidaPagina;
    }

    /**
     * PERCENTUAL DE CURTIDA DE PAGINA
     *
     * @return Double
     */
    public Double getPercentualCurtidaPagina() {
        return this.percentualCurtidaPagina;
    }
                    
     
    /**
     * PERCENTUAL DE CURTIDA DE POST
     *
     * @param percentualCurtidaPost
     */
    public void setPercentualCurtidaPost(Double percentualCurtidaPost) {
        this.percentualCurtidaPost = percentualCurtidaPost;
    }

    /**
     * PERCENTUAL DE CURTIDA DE POST
     *
     * @return Double
     */
    public Double getPercentualCurtidaPost() {
        return this.percentualCurtidaPost;
    }
    
}