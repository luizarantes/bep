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
@Table(name = "TB_PLATAFORMA_FACEBOOK")
public class PlataformaFacebook extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_PLATAFORMA_FACEBOOK", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
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