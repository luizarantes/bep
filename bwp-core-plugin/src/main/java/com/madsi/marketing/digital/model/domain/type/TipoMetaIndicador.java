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
public enum TipoMetaIndicador {
        CRT("CRT"),
        CLIQUE("CLQ"),
        ALCANCE("ACC"),
        CLIQUE_CONVERTIDO("CC"),
        COMPARTILHAMENTO("CPTLMT"),
        CURTIDA_PAGINA("CTDPGN"),
        VISITA("VST"),
        TRAFICO("TFC"),
        VISITA_UNICA("VSTU"),
        RANK_PAGINA("RKPGN"),
    ;

    private String value;

    TipoMetaIndicador(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}