/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
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
    @SequenceGenerator(name = "sqCampanha", sequenceName = "SQ_CAMPANHA", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sqCampanha", strategy = GenerationType.SEQUENCE)
    private Long id;
            
    /*
     * ENTIDADE METRICA
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_METRICA", referencedColumnName = "ID_METRICA", nullable = false)
    private Metrica metrica;
            
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
     * NOME DA CAMPANHA
     */
    
    @NotNull
        
	@Column(name = "NM_CAMPANHA", length = 255, nullable = false)
    private String nomeCampanha;
                        
    /*
     * DESCRICACAO DO PROBLEMA
     */
    
	@Column(name = "DS_PROBLEMA", length = 4000)
    private String descricaoProblema;
                        
    /*
     * DATA DE INICIO DA CAMPANHA
     */
    
    @NotNull
        
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_INICIO", nullable = false)
    private Date dataInicio;
                        
    /*
     * DATA DO FIM DA CAMPANHA
     */
    
    @NotNull
        
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_FIM")
    private Date dataFim;
            
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
     * ENTIDADE METRICA
     *
     * @param metrica
     */
    public void setMetrica(Metrica metrica) {
        this.metrica = metrica;
    }

    /**
     * ENTIDADE METRICA
     *
     * @return Metrica
     */
    public Metrica getMetrica() {
        return this.metrica;
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
     * @param nomeCampanha
     */
    public void setNomeCampanha(String nomeCampanha) {
        this.nomeCampanha = nomeCampanha;
    }

    /**
     * NOME DA CAMPANHA
     *
     * @return String
     */
    public String getNomeCampanha() {
        return this.nomeCampanha;
    }
                    
     
    /**
     * DESCRICACAO DO PROBLEMA
     *
     * @param descricaoProblema
     */
    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    /**
     * DESCRICACAO DO PROBLEMA
     *
     * @return String
     */
    public String getDescricaoProblema() {
        return this.descricaoProblema;
    }
                    
     
    /**
     * DATA DE INICIO DA CAMPANHA
     *
     * @param dataInicio
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * DATA DE INICIO DA CAMPANHA
     *
     * @return Date
     */
    public Date getDataInicio() {
        return this.dataInicio;
    }
                    
     
    /**
     * DATA DO FIM DA CAMPANHA
     *
     * @param dataFim
     */
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * DATA DO FIM DA CAMPANHA
     *
     * @return Date
     */
    public Date getDataFim() {
        return this.dataFim;
    }
    
}