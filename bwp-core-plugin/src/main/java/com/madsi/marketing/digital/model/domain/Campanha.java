/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_CAMPANHA")
public class Campanha extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_CAMPANHA", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * ENTIDADE OBJETIVO
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_OBJETIVO", referencedColumnName = "ID_OBJETIVO", nullable = false)
    private Objetivo objetivo;
            
    /*
     * ENTIDADE PUBLICO ALVO
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PUBLICO_ALVO", referencedColumnName = "ID_PUBLICO_ALVO", nullable = false)
    private PublicoAlvo publicoAlvo;
            
    /*
     * ENTIDADE EMPRESA
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA", nullable = false)
    private Empresa empresa;
                                                                                                                                                                                    
    /*
     * ENTIDADE CAMPANHA METRICA
     */
    @OneToMany(mappedBy = "campanha")
    private List<CampanhaMetrica> campanhaMetricas;
                                                
    /*
     * NOME DA CAMPANHA
     */
    
    @NotNull
        
	@Column(name = "NM_CAMPANHA", length = 255, nullable = false)
    private String nameCampanha;
                        
    /*
     * DESCRICACAO DO PROBLEMA
     */
    
	@Column(name = "DS_PROBLEMA", length = 4000)
    private String descriptionProblema;
                        
    /*
     * DATA DE INICIO DA CAMPANHA
     */
    
    @NotNull
        
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_INICIO", nullable = false)
    private Date dateInicio;
                        
    /*
     * DATA DO FIM DA CAMPANHA
     */
    
    @NotNull
        
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_FIM")
    private Date dateFim;
                    
    /**
     * @param id
     */
    public Campanha(Long id) {
        super(id);
    }

    public Campanha() {

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
     * ENTIDADE OBJETIVO
     *
     * @param objetivo
     */
    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * ENTIDADE OBJETIVO
     *
     * @return Objetivo
     */
    public Objetivo getObjetivo() {
        return this.objetivo;
    }
                    
     
    /**
     * ENTIDADE PUBLICO ALVO
     *
     * @param publicoAlvo
     */
    public void setPublicoAlvo(PublicoAlvo publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    /**
     * ENTIDADE PUBLICO ALVO
     *
     * @return PublicoAlvo
     */
    public PublicoAlvo getPublicoAlvo() {
        return this.publicoAlvo;
    }
                    
     
    /**
     * ENTIDADE EMPRESA
     *
     * @param empresa
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * ENTIDADE EMPRESA
     *
     * @return Empresa
     */
    public Empresa getEmpresa() {
        return this.empresa;
    }
                    
     
    /**
     * NOME DA CAMPANHA
     *
     * @param nameCampanha
     */
    public void setNameCampanha(String nameCampanha) {
        this.nameCampanha = nameCampanha;
    }

    /**
     * NOME DA CAMPANHA
     *
     * @return String
     */
    public String getNameCampanha() {
        return this.nameCampanha;
    }
                    
     
    /**
     * DESCRICACAO DO PROBLEMA
     *
     * @param descriptionProblema
     */
    public void setDescriptionProblema(String descriptionProblema) {
        this.descriptionProblema = descriptionProblema;
    }

    /**
     * DESCRICACAO DO PROBLEMA
     *
     * @return String
     */
    public String getDescriptionProblema() {
        return this.descriptionProblema;
    }
                    
     
    /**
     * DATA DE INICIO DA CAMPANHA
     *
     * @param dateInicio
     */
    public void setDateInicio(Date dateInicio) {
        this.dateInicio = dateInicio;
    }

    /**
     * DATA DE INICIO DA CAMPANHA
     *
     * @return Date
     */
    public Date getDateInicio() {
        return this.dateInicio;
    }
                    
     
    /**
     * DATA DO FIM DA CAMPANHA
     *
     * @param dateFim
     */
    public void setDateFim(Date dateFim) {
        this.dateFim = dateFim;
    }

    /**
     * DATA DO FIM DA CAMPANHA
     *
     * @return Date
     */
    public Date getDateFim() {
        return this.dateFim;
    }
                    
     
    /**
     * ENTIDADE CAMPANHA METRICA
     *
     * @param campanhaMetricas
     */
    public void setCampanhaMetricas(List<CampanhaMetrica> campanhaMetricas) {
        this.campanhaMetricas = campanhaMetricas;
    }

    /**
     * ENTIDADE CAMPANHA METRICA
     *
     * @return List<CampanhaMetrica>
     */
    public List<CampanhaMetrica> getCampanhaMetricas() {
        return this.campanhaMetricas;
    }
    
}