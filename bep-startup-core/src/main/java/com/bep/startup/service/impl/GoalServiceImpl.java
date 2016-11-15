/**
*
* Copyright MADSI 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Goal;
import com.bep.startup.model.domain.dto.GoalDTO;
import com.bep.startup.service.GoalService;

/** 
 *
 * @author MADSI
 * @since 1.0
 * 
 */
@Service
public class GoalServiceImpl extends AbstractService<GoalDTO, Goal, Long> implements GoalService<GoalDTO, Goal, Long> {
    
     public  GoalServiceImpl() {
    	super(GoalDTO.class, Goal.class);
    }
}