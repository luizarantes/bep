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
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.madsi.marketing.digital.model.type.ClasseSocialIndicador;
import com.madsi.marketing.digital.model.type.TipoPlataformaStatusIndicador;



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
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    
	@Enumerated(EnumType.STRING)
	@Column(name = "IN_SEXO", length = 1)
    private TipoPlataformaStatusIndicador inSexo;
	                    
    /*
     * INDICATIVO DA CLASSE SOCIAL
     */
    
	@Enumerated(EnumType.STRING)
	@Column(name = "IN_CLASSE_SOCIAL", length = 255)
    private ClasseSocialIndicador inClasseSocial;
	                    
    /*
     * TEXTO DA LOCALIZACAO
     */
    
	@Column(name = "TX_LOCALIZACAO", length = 255)
    private String descriptionLocalizacao;
                        
    /*
     * TEXTO DO INTERESSE
     */
    
	@Column(name = "TX_INTERESSE", length = 255)
    private String descriptionInteresse;
            
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
    public void setInSexo(TipoPlataformaStatusIndicador inSexo) {
        this.inSexo = inSexo;
    }

    /**
     * INDICATIVO DO SEXO
     *
     * @return TipoPlataformaStatusIndicador
     */
    public TipoPlataformaStatusIndicador getInSexo() {
         return this.inSexo;
    }
                
     
    /**
     * INDICATIVO DA CLASSE SOCIAL
     *
     * @param inClasseSocial
     */
    public void setInClasseSocial(ClasseSocialIndicador inClasseSocial) {
        this.inClasseSocial = inClasseSocial;
    }

    /**
     * INDICATIVO DA CLASSE SOCIAL
     *
     * @return ClasseSocialIndicador
     */
    public ClasseSocialIndicador getInClasseSocial() {
         return this.inClasseSocial;
    }
                
     
    /**
     * TEXTO DA LOCALIZACAO
     *
     * @param descriptionLocalizacao
     */
    public void setDescriptionLocalizacao(String descriptionLocalizacao) {
        this.descriptionLocalizacao = descriptionLocalizacao;
    }

    /**
     * TEXTO DA LOCALIZACAO
     *
     * @return String
     */
    public String getDescriptionLocalizacao() {
        return this.descriptionLocalizacao;
    }
                    
     
    /**
     * TEXTO DO INTERESSE
     *
     * @param descriptionInteresse
     */
    public void setDescriptionInteresse(String descriptionInteresse) {
        this.descriptionInteresse = descriptionInteresse;
    }

    /**
     * TEXTO DO INTERESSE
     *
     * @return String
     */
    public String getDescriptionInteresse() {
        return this.descriptionInteresse;
    }
    
}