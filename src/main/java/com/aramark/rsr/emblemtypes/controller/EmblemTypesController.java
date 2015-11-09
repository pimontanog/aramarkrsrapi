package com.aramark.rsr.emblemtypes.controller;

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

import com.aramark.rsr.emblemtypes.dao.EmblemTypesDAO;
import com.aramark.rsr.emblemtypes.model.EmblemTypesHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/EmblemTypes/List
 */
@Controller
public class EmblemTypesController {

	private static final Logger logger = LoggerFactory.getLogger(EmblemTypesController.class);
	
	@Autowired
	EmblemTypesDAO emblemtypesDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}
	
	@RequestMapping(value = "/EmblemTypes/List", method = RequestMethod.GET)
	@ResponseBody
	public EmblemTypesHeader getAllEmblemTypes() {

		logger.info("Inside getAllEmblemTypes()");

		EmblemTypesHeader emblemtypesHeader = new EmblemTypesHeader();

		try {

			emblemtypesHeader.setHeader("Emblem_types");
			emblemtypesHeader.setData(emblemtypesDAO.getAllEmblemTypes());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return emblemtypesHeader;
	}
}
