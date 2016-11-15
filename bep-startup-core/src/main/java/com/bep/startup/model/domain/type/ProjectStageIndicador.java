/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.model.domain.type;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
public enum ProjectStageIndicador {
        CD("CD"),
        DD("DD"),
    ;

    private String value;

    ProjectStageIndicador(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}