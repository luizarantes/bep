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
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.madsi.marketing.digital.model.type.TipoAcaoIndicador;
import com.madsi.marketing.digital.model.type.TipoMetaIndicador;



/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_META")
public class Meta extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_META", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            
    /*
     * ENTIDADE CAMPANHA METRICA
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_CAMPANHA_METRICA", referencedColumnName = "ID_CAMPANHA_METRICA", nullable = false)
    private CampanhaMetrica campanhaMetrica;
                                                                                                                                                                                                        
    /*
     * DATA DE INICIO
     */
    
    @NotNull
        
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_INICIO", nullable = false)
    private Date dateInicio;
                        
    /*
     * DATA DE FIM
     */
    
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DH_FIM")
    private Date dateFim;
                        
    /*
     * PERCENTUAL DO VALOR
     */
    
	@Column(name = "PC_VALOR", precision = 10, scale = 2, nullable = false)
    private Double percentValor;
                        
    /*
     * PERCENTUAL DO VALOR
     */
    
	@Column(name = "PC_PERCENTUAL", precision = 3, scale = 2, nullable = false)
    private Double percentPercentual;
                        
    /*
     * INDICATIVO DO TIPO DE ALERTA
     */
    
    @NotNull
        
	@Enumerated(EnumType.STRING)
	@Column(name = "IN_TIPO_META", length = 5, nullable = false)
    private TipoMetaIndicador inTipoAlerta;
	                    
    /*
     * INDICATIVO DA ACAO
     */
    
    @NotNull
        
	@Enumerated(EnumType.STRING)
	@Column(name = "IN_TIPO_ACAO", length = 1, nullable = false)
    private TipoAcaoIndicador inTipoAcao;
	        
    /**
     * @param id
     */
    public Meta(Long id) {
        super(id);
    }

    public Meta() {

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
     * ENTIDADE CAMPANHA METRICA
     *
     * @param campanhaMetrica
     */
    public void setCampanhaMetrica(CampanhaMetrica campanhaMetrica) {
        this.campanhaMetrica = campanhaMetrica;
    }

    /**
     * ENTIDADE CAMPANHA METRICA
     *
     * @return CampanhaMetrica
     */
    public CampanhaMetrica getCampanhaMetrica() {
        return this.campanhaMetrica;
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
     * DATA DE FIM
     *
     * @param dateFim
     */
    public void setDateFim(Date dateFim) {
        this.dateFim = dateFim;
    }

    /**
     * DATA DE FIM
     *
     * @return Date
     */
    public Date getDateFim() {
        return this.dateFim;
    }
                    
     
    /**
     * PERCENTUAL DO VALOR
     *
     * @param percentValor
     */
    public void setPercentValor(Double percentValor) {
        this.percentValor = percentValor;
    }

    /**
     * PERCENTUAL DO VALOR
     *
     * @return Double
     */
    public Double getPercentValor() {
        return this.percentValor;
    }
                    
     
    /**
     * PERCENTUAL DO VALOR
     *
     * @param percentPercentual
     */
    public void setPercentPercentual(Double percentPercentual) {
        this.percentPercentual = percentPercentual;
    }

    /**
     * PERCENTUAL DO VALOR
     *
     * @return Double
     */
    public Double getPercentPercentual() {
        return this.percentPercentual;
    }
                    
     
    /**
     * INDICATIVO DO TIPO DE ALERTA
     *
     * @param inTipoAlerta
     */
    public void setInTipoAlerta(TipoMetaIndicador inTipoAlerta) {
        this.inTipoAlerta = inTipoAlerta;
    }

    /**
     * INDICATIVO DO TIPO DE ALERTA
     *
     * @return TipoMetaIndicador
     */
    public TipoMetaIndicador getInTipoAlerta() {
         return this.inTipoAlerta;
    }
                
     
    /**
     * INDICATIVO DA ACAO
     *
     * @param inTipoAcao
     */
    public void setInTipoAcao(TipoAcaoIndicador inTipoAcao) {
        this.inTipoAcao = inTipoAcao;
    }

    /**
     * INDICATIVO DA ACAO
     *
     * @return TipoAcaoIndicador
     */
    public TipoAcaoIndicador getInTipoAcao() {
         return this.inTipoAcao;
    }

}