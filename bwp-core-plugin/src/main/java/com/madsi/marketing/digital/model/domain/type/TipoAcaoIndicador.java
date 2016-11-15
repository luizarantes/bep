/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.domain.type;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public enum TipoAcaoIndicador {
        PAUSAR("P"),
        NENHUM("N"),
    ;

    private String value;

    TipoAcaoIndicador(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}