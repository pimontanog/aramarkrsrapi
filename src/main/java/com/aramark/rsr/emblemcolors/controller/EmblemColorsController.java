package com.aramark.rsr.emblemcolors.controller;

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

import com.aramark.rsr.emblemcolors.dao.EmblemColorsDAO;
import com.aramark.rsr.emblemcolors.model.EmblemColorsHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/EmblemColors/List
 */
@Controller
public class EmblemColorsController {

	private static final Logger logger = LoggerFactory.getLogger(EmblemColorsController.class);
	
	@Autowired
	EmblemColorsDAO emblemcolorsDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}
	
	@RequestMapping(value = "/EmblemColors/List", method = RequestMethod.GET)
	@ResponseBody
	public EmblemColorsHeader getAllEmblemColors() {

		logger.info("Inside getAllEmblemColors()");

		EmblemColorsHeader emblemcolorsHeader = new EmblemColorsHeader();

		try {

			emblemcolorsHeader.setHeader("Emblem_colors");
			emblemcolorsHeader.setData(emblemcolorsDAO.getAllEmblemColors());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return emblemcolorsHeader;
	}	
}
