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
public enum TipoPlataformaStatusIndicador {
        FOTO("F"),
        ATUAL("A"),
    ;

    private String value;

    TipoPlataformaStatusIndicador(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}