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
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.madsi.marketing.digital.model.type.TipoPlataformaStatusIndicador;



/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_PLATAFORMA")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "IN_TIPO_PLATAFORMA", discriminatorType = DiscriminatorType.INTEGER)
public abstract class Plataforma extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

                                                                                                                                                        
    /*
     * ENTIDADE CAMPANHA METRICA
     */
    @OneToMany(mappedBy = "plataforma")
    private List<CampanhaMetrica> campanhaMetricas;
                        
    /*
     * NUMERO DA CONTA
     */
    
    @NotNull
        
	@Column(name = "CD_CONTA", length = 20, nullable = false)
    private String codeConta;
                        
    /*
     * DATA DE INICIO
     */
    
    @NotNull
        
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_INICIO", nullable = false)
    private Date dateInicio;
                        
    /*
     * DATA DA ATUALIZACAO
     */
    
    @NotNull
        
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_ATUALIZACAO", nullable = false)
    private Date dateAtualizacao;
                        
    /*
     * INDICATIVO DO TIPO DA PLATAFORMA
     */
    
	@Enumerated(EnumType.STRING)
	@Column(name = "IN_TIPO_PLATAFORMA_STATUS", length = 255)
    private TipoPlataformaStatusIndicador inTipoPlataformaStatus;
	                    
    /*
     * CODIGO DA CAMPANHA
     */
    
    @NotNull
        
	@Column(name = "CD_CAMPANHA", length = 30, nullable = false)
    private String codeCampanha;
                    
    /**
     * @param id
     */
    public Plataforma(Long id) {
        super(id);
    }

    public Plataforma() {

    }
                    
     
    /**
     * NUMERO DA CONTA
     *
     * @param codeConta
     */
    public void setCodeConta(String codeConta) {
        this.codeConta = codeConta;
    }

    /**
     * NUMERO DA CONTA
     *
     * @return String
     */
    public String getCodeConta() {
        return this.codeConta;
    }
                    
     
    /**
     * DATA DE INICIO
     *
     * @param dateInicio
     */
    public void setDateInicio(Date dateInicio) {
        this.dateInicio = dateInicio;
    }

    /**
     * DATA DE INICIO
     *
     * @return Date
     */
    public Date getDateInicio() {
        return this.dateInicio;
    }
                    
     
    /**
     * DATA DA ATUALIZACAO
     *
     * @param dateAtualizacao
     */
    public void setDateAtualizacao(Date dateAtualizacao) {
        this.dateAtualizacao = dateAtualizacao;
    }

    /**
     * DATA DA ATUALIZACAO
     *
     * @return Date
     */
    public Date getDateAtualizacao() {
        return this.dateAtualizacao;
    }
                    
     
    /**
     * INDICATIVO DO TIPO DA PLATAFORMA
     *
     * @param inTipoPlataformaStatus
     */
    public void setInTipoPlataformaStatus(TipoPlataformaStatusIndicador inTipoPlataformaStatus) {
        this.inTipoPlataformaStatus = inTipoPlataformaStatus;
    }

    /**
     * INDICATIVO DO TIPO DA PLATAFORMA
     *
     * @return TipoPlataformaStatusIndicador
     */
    public TipoPlataformaStatusIndicador getInTipoPlataformaStatus() {
         return this.inTipoPlataformaStatus;
    }
                
     
    /**
     * CODIGO DA CAMPANHA
     *
     * @param codeCampanha
     */
    public void setCodeCampanha(String codeCampanha) {
        this.codeCampanha = codeCampanha;
    }

    /**
     * CODIGO DA CAMPANHA
     *
     * @return String
     */
    public String getCodeCampanha() {
        return this.codeCampanha;
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