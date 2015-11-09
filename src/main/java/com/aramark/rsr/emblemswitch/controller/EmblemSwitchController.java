package com.aramark.rsr.emblemswitch.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.aramark.rsr.emblemswitch.dao.EmblemSwitchDAO;
import com.aramark.rsr.emblemswitch.model.EmblemSwitchHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/EmblemSwitch/List
 */
@Controller
public class EmblemSwitchController {

	private static final Logger logger = LoggerFactory.getLogger(EmblemSwitchController.class);
	
	@Autowired
	EmblemSwitchDAO emblemswitchDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}
	
	@RequestMapping(value = "/EmblemSwitch/List", method = RequestMethod.GET)
	@ResponseBody
	public EmblemSwitchHeader getAllEmblemSwitch() {

		logger.info("Inside getAllEmblemSwitch()");

		EmblemSwitchHeader emblemswitchHeader = new EmblemSwitchHeader();

		try {

			emblemswitchHeader.setHeader("Emblem_switch");
			emblemswitchHeader.setData(emblemswitchDAO.getAllEmblemSwitch());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return emblemswitchHeader;
	}
	
}
