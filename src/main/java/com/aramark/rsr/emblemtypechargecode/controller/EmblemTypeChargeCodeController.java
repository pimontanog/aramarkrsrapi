package com.aramark.rsr.emblemtypechargecode.controller;

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

import com.aramark.rsr.emblemtypechargecode.dao.EmblemTypeChargeCodeDAO;
import com.aramark.rsr.emblemtypechargecode.model.EmblemTypeChargeCodeHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/EmblemTypeChargeCode/List
 */
@Controller
public class EmblemTypeChargeCodeController {

	private static final Logger logger = LoggerFactory.getLogger(EmblemTypeChargeCodeController.class);
	
	@Autowired
	EmblemTypeChargeCodeDAO emblemtypechargecodeDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}
	
	@RequestMapping(value = "/EmblemTypeChargeCode/List", method = RequestMethod.GET)
	@ResponseBody
	public EmblemTypeChargeCodeHeader getAllEmblemTypeChargeCode() {

		logger.info("Inside getAllEmblemTypeChargeCode()");

		EmblemTypeChargeCodeHeader emblemtypechargecodeHeader = new EmblemTypeChargeCodeHeader();

		try {

			emblemtypechargecodeHeader.setHeader("Emblem_type_charge_code");
			emblemtypechargecodeHeader.setData(emblemtypechargecodeDAO.getAllEmblemTypeChargeCode());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return emblemtypechargecodeHeader;
	}	
}
