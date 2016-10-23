/**
*
* Copyright BEP STARTUP All Rights Reserved. 
* No part of this Application may be reproduced without express consent.
* 
*/
package com.bep.startup.service.impl;

import org.springframework.stereotype.Service;

import com.bep.startup.model.domain.Goal;
import com.bep.startup.model.domain.dto.GoalDTO;

/** 
 *
 * @author GSI
 * @since 1.0
 * 
 */
@Service
public class GoalServiceImpl extends AbstractService<GoalDTO, Goal, Long>  {
    
	public GoalServiceImpl() {
    	super(GoalDTO.class, Goal.class);
    }
   
}