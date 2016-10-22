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
import javax.validation.constraints.NotNull;




/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Entity
@Table(name = "TB_SEGMENTO")
public class Segmento extends DomainEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_SEGMENTO", nullable = false, updatable = false, precision = 12)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
                                                    
    /*
     * ENTIDADE EMPRESA
     */
    @OneToMany(mappedBy = "segmento")
    private List<Empresa> empresas;
                                        
    /*
     * NOME DO SEGMENTO
     */
    
    @NotNull
        
	@Column(name = "NM_SEGMENTO", length = 60, nullable = false)
    private String nameSegmento;
            
    /**
     * @param id
     */
    public Segmento(Long id) {
        super(id);
    }

    public Segmento() {

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
     * ENTIDADE EMPRESA
     *
     * @param empresas
     */
    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    /**
     * ENTIDADE EMPRESA
     *
     * @return List<Empresa>
     */
    public List<Empresa> getEmpresas() {
        return this.empresas;
    }
                    
     
    /**
     * NOME DO SEGMENTO
     *
     * @param nameSegmento
     */
    public void setNameSegmento(String nameSegmento) {
        this.nameSegmento = nameSegmento;
    }

    /**
     * NOME DO SEGMENTO
     *
     * @return String
     */
    public String getNameSegmento() {
        return this.nameSegmento;
    }
    
}