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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_METRICA")
public class Metrica extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_METRICA", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                            
    /*
     * ENTIDADE PLATAFORMA FACEBOOK
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PLATAFORMA_FACEBOOK", referencedColumnName = "ID_PLATAFORMA_FACEBOOK", nullable = false)
    private PlataformaFacebook plataformaFacebook;
            
    /*
     * ENTIDADE PLATAFORMA GOOGLE ADWORD
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PLATAFORMA_GOOGLE_ADWORDS", referencedColumnName = "ID_PLATAFORMA_GOOGLE_ADWORDS", nullable = false)
    private PlataformaGoogleAdwords plataformaGoogleAdwords;
            
    /*
     * ENTIDADE PLATAFORMA GOOGLE ANALYTICS
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_PLATAFORMA_GOOGLE_ANALYTIC", referencedColumnName = "ID_PLATAFORMA_GOOGLE_ANALYTIC", nullable = false)
    private PlataformaGoogleAnalytic plataformaGoogleAnalytic;
                                                            
    /*
     * ENTIDADE CAMPANHA
     */
    @OneToMany(mappedBy = "metrica")
    private List<Campanha> campanhas;
                                                                
    /*
     * NOME DA METRICA
     */
    
    @NotNull
        
	@Column(name = "NM_METRICA", length = 255, nullable = false)
    private String nomeMetrica;
                                    
    /**
     * @param id
     */
    public Metrica(Long id) {
        super(id);
    }

    public Metrica() {

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
     * ENTIDADE CAMPANHA
     *
     * @param campanhas
     */
    public void setCampanhas(List<Campanha> campanhas) {
        this.campanhas = campanhas;
    }

    /**
     * ENTIDADE CAMPANHA
     *
     * @return List<Campanha>
     */
    public List<Campanha> getCampanhas() {
        return this.campanhas;
    }
                    
     
    /**
     * NOME DA METRICA
     *
     * @param nomeMetrica
     */
    public void setNomeMetrica(String nomeMetrica) {
        this.nomeMetrica = nomeMetrica;
    }

    /**
     * NOME DA METRICA
     *
     * @return String
     */
    public String getNomeMetrica() {
        return this.nomeMetrica;
    }
                    
     
    /**
     * ENTIDADE PLATAFORMA FACEBOOK
     *
     * @param plataformaFacebook
     */
    public void setPlataformaFacebook(PlataformaFacebook plataformaFacebook) {
        this.plataformaFacebook = plataformaFacebook;
    }

    /**
     * ENTIDADE PLATAFORMA FACEBOOK
     *
     * @return PlataformaFacebook
     */
    public PlataformaFacebook getPlataformaFacebook() {
        return this.plataformaFacebook;
    }
                    
     
    /**
     * ENTIDADE PLATAFORMA GOOGLE ADWORD
     *
     * @param plataformaGoogleAdwords
     */
    public void setPlataformaGoogleAdwords(PlataformaGoogleAdwords plataformaGoogleAdwords) {
        this.plataformaGoogleAdwords = plataformaGoogleAdwords;
    }

    /**
     * ENTIDADE PLATAFORMA GOOGLE ADWORD
     *
     * @return PlataformaGoogleAdwords
     */
    public PlataformaGoogleAdwords getPlataformaGoogleAdwords() {
        return this.plataformaGoogleAdwords;
    }
                    
     
    /**
     * ENTIDADE PLATAFORMA GOOGLE ANALYTICS
     *
     * @param plataformaGoogleAnalytic
     */
    public void setPlataformaGoogleAnalytic(PlataformaGoogleAnalytic plataformaGoogleAnalytic) {
        this.plataformaGoogleAnalytic = plataformaGoogleAnalytic;
    }

    /**
     * ENTIDADE PLATAFORMA GOOGLE ANALYTICS
     *
     * @return PlataformaGoogleAnalytic
     */
    public PlataformaGoogleAnalytic getPlataformaGoogleAnalytic() {
        return this.plataformaGoogleAnalytic;
    }
    
}