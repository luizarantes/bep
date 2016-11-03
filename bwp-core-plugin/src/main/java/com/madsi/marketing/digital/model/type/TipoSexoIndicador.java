/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.madsi.marketing.digital.model.type;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public enum TipoSexoIndicador {
        MASCULINO("M"),
        FEMININO("F"),
        NAO_DEFINIDO("N"),
    ;

    private String value;

    TipoSexoIndicador(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}