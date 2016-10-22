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
@Table(name = "TB_FAIXA_ETARIA")
public class FaixaEtaria extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_FAIXA_ETARIA", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                                                    
    /*
     * ENTIDADE PUBLICO ALVO
     */
    @OneToMany(mappedBy = "faixaEtaria")
    private List<PublicoAlvo> publicoAlvos;
                                                        
    /*
     * NOME DA FAIXA ETARIA
     */
    
	@Column(name = "NM_FAIXA_ETARIA", length = 255)
    private String nameFaixaEtaria;
                        
    /*
     * NUMERO DA FAIXA INICIAL
     */
    
	@Column(name = "NR_FAIXA_INICIAL", precision = 3, nullable = false)
    private Short numberFaixaInicial;
                        
    /*
     * NUMERO DA FAIXA FINAL
     */
    
	@Column(name = "NR_FAIXA_FINAL", precision = 3, nullable = false)
    private Short numberFaixaFinal;
            
    /**
     * @param id
     */
    public FaixaEtaria(Long id) {
        super(id);
    }

    public FaixaEtaria() {

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
     * ENTIDADE PUBLICO ALVO
     *
     * @param publicoAlvos
     */
    public void setPublicoAlvos(List<PublicoAlvo> publicoAlvos) {
        this.publicoAlvos = publicoAlvos;
    }

    /**
     * ENTIDADE PUBLICO ALVO
     *
     * @return List<PublicoAlvo>
     */
    public List<PublicoAlvo> getPublicoAlvos() {
        return this.publicoAlvos;
    }
                    
     
    /**
     * NOME DA FAIXA ETARIA
     *
     * @param nameFaixaEtaria
     */
    public void setNameFaixaEtaria(String nameFaixaEtaria) {
        this.nameFaixaEtaria = nameFaixaEtaria;
    }

    /**
     * NOME DA FAIXA ETARIA
     *
     * @return String
     */
    public String getNameFaixaEtaria() {
        return this.nameFaixaEtaria;
    }
                    
     
    /**
     * NUMERO DA FAIXA INICIAL
     *
     * @param numberFaixaInicial
     */
    public void setNumberFaixaInicial(Short numberFaixaInicial) {
        this.numberFaixaInicial = numberFaixaInicial;
    }

    /**
     * NUMERO DA FAIXA INICIAL
     *
     * @return Short
     */
    public Short getNumberFaixaInicial() {
        return this.numberFaixaInicial;
    }
                    
     
    /**
     * NUMERO DA FAIXA FINAL
     *
     * @param numberFaixaFinal
     */
    public void setNumberFaixaFinal(Short numberFaixaFinal) {
        this.numberFaixaFinal = numberFaixaFinal;
    }

    /**
     * NUMERO DA FAIXA FINAL
     *
     * @return Short
     */
    public Short getNumberFaixaFinal() {
        return this.numberFaixaFinal;
    }
    
}