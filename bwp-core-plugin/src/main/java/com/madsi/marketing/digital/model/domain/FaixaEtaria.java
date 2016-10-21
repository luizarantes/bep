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
@Table(name = "TB_FAIXA_ETARIA")
public class FaixaEtaria extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_FAIXA_ETARIA", nullable = false, updatable = false, precision = 12)
    @SequenceGenerator(name = "sqFaixaEtaria", sequenceName = "SQ_FAIXA_ETARIA", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sqFaixaEtaria", strategy = GenerationType.SEQUENCE)
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
    private String nomeFaixaEtaria;
                        
    /*
     * NUMERO DA FAIXA INICIAL
     */
    
	@Column(name = "NR_FAIXA_INICIAL", precision = 3, nullable = false)
    private Short numeroFaixaInicial;
                        
    /*
     * NUMERO DA FAIXA FINAL
     */
    
	@Column(name = "NR_FAIXA_FINAL", precision = 3, nullable = false)
    private Short numeroFaixaFinal;
            
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
     * @param nomeFaixaEtaria
     */
    public void setNomeFaixaEtaria(String nomeFaixaEtaria) {
        this.nomeFaixaEtaria = nomeFaixaEtaria;
    }

    /**
     * NOME DA FAIXA ETARIA
     *
     * @return String
     */
    public String getNomeFaixaEtaria() {
        return this.nomeFaixaEtaria;
    }
                    
     
    /**
     * NUMERO DA FAIXA INICIAL
     *
     * @param numeroFaixaInicial
     */
    public void setNumeroFaixaInicial(Short numeroFaixaInicial) {
        this.numeroFaixaInicial = numeroFaixaInicial;
    }

    /**
     * NUMERO DA FAIXA INICIAL
     *
     * @return Short
     */
    public Short getNumeroFaixaInicial() {
        return this.numeroFaixaInicial;
    }
                    
     
    /**
     * NUMERO DA FAIXA FINAL
     *
     * @param numeroFaixaFinal
     */
    public void setNumeroFaixaFinal(Short numeroFaixaFinal) {
        this.numeroFaixaFinal = numeroFaixaFinal;
    }

    /**
     * NUMERO DA FAIXA FINAL
     *
     * @return Short
     */
    public Short getNumeroFaixaFinal() {
        return this.numeroFaixaFinal;
    }
    
}