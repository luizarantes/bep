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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_PUBLICO_ALVO")
public class PublicoAlvo extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_PUBLICO_ALVO", nullable = false, updatable = false, precision = 12)
    @SequenceGenerator(name = "sqPublicoAlvo", sequenceName = "SQ_PUBLICO_ALVO", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sqPublicoAlvo", strategy = GenerationType.SEQUENCE)
    private Long id;
                    
    /*
     * ENTIDADE FAIXA ETARIA
     */
    
    @NotNull
        
    @ManyToOne
    @JoinColumn(name   = "ID_FAIXA_ETARIA", referencedColumnName = "ID_FAIXA_ETARIA", nullable = false)
    private FaixaEtaria faixaEtaria;
                                                                                                    
    /*
     * ENTIDADE CAMPANHA
     */
    @OneToMany(mappedBy = "publicoAlvo")
    private List<Campanha> campanhas;
                                                                                
    /*
     * INDICATIVO DO SEXO
     */
    
	@Column(name = "IN_SEXO", length = 1)
    private String inSexo;
                        
    /*
     * NOME DA CLASSE SOCIAL
     */
    
	@Column(name = "NM_CLASSE_SOCIAL", length = 255)
    private String nomeClasseSocial;
                        
    /*
     * TEXTO DA LOCALIZACAO
     */
    
	@Column(name = "TX_LOCALIZACAO", length = 255)
    private String descricaoLocalizacao;
                        
    /*
     * TEXTO DO INTERESSE
     */
    
	@Column(name = "TX_INTERESSE", length = 255)
    private String descricaoInteresse;
            
    /**
     * @param id
     */
    public PublicoAlvo(Long id) {
        super(id);
    }

    public PublicoAlvo() {

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
     * ENTIDADE FAIXA ETARIA
     *
     * @param faixaEtaria
     */
    public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    /**
     * ENTIDADE FAIXA ETARIA
     *
     * @return FaixaEtaria
     */
    public FaixaEtaria getFaixaEtaria() {
        return this.faixaEtaria;
    }
                    
     
    /**
     * INDICATIVO DO SEXO
     *
     * @param inSexo
     */
    public void setInSexo(String inSexo) {
        this.inSexo = inSexo;
    }

    /**
     * INDICATIVO DO SEXO
     *
     * @return String
     */
    public String getInSexo() {
        return this.inSexo;
    }
                    
     
    /**
     * NOME DA CLASSE SOCIAL
     *
     * @param nomeClasseSocial
     */
    public void setNomeClasseSocial(String nomeClasseSocial) {
        this.nomeClasseSocial = nomeClasseSocial;
    }

    /**
     * NOME DA CLASSE SOCIAL
     *
     * @return String
     */
    public String getNomeClasseSocial() {
        return this.nomeClasseSocial;
    }
                    
     
    /**
     * TEXTO DA LOCALIZACAO
     *
     * @param descricaoLocalizacao
     */
    public void setDescricaoLocalizacao(String descricaoLocalizacao) {
        this.descricaoLocalizacao = descricaoLocalizacao;
    }

    /**
     * TEXTO DA LOCALIZACAO
     *
     * @return String
     */
    public String getDescricaoLocalizacao() {
        return this.descricaoLocalizacao;
    }
                    
     
    /**
     * TEXTO DO INTERESSE
     *
     * @param descricaoInteresse
     */
    public void setDescricaoInteresse(String descricaoInteresse) {
        this.descricaoInteresse = descricaoInteresse;
    }

    /**
     * TEXTO DO INTERESSE
     *
     * @return String
     */
    public String getDescricaoInteresse() {
        return this.descricaoInteresse;
    }
    
}