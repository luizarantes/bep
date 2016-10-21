package com.madsi.marketing.digital.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

public abstract class AbstractService {
	
	 private static final Logger LOGGER  = Logger.getLogger(AbstractService.class.getName());
	
	/**
	 * @param destiny
	 * @param origin
	 */
	protected static void copyProperties(Object destiny, Object origin) {
		
		try {
			DateConverter converter = new DateConverter(null);
			ConvertUtils.register(converter, java.util.Date.class); 
			BeanUtilsBean.getInstance().getConvertUtils().register(false, false, 0);
			BeanUtils.copyProperties(destiny, origin);
		}catch (IllegalAccessException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}catch (InvocationTargetException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
	}

}
