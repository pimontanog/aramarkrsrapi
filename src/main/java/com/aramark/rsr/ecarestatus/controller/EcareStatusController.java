package com.aramark.rsr.ecarestatus.controller;

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

import com.aramark.rsr.ecarestatus.dao.EcareStatusDAO;
import com.aramark.rsr.ecarestatus.model.EcareStatusHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/EcareStatus/List
 */
@Controller
public class EcareStatusController {

	private static final Logger logger = LoggerFactory.getLogger(EcareStatusController.class);
	
	@Autowired
	EcareStatusDAO ecarestatusDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}
	
	@RequestMapping(value = "/EcareStatus/List", method = RequestMethod.GET)
	@ResponseBody
	public EcareStatusHeader getAllEcareStatus() {

		logger.info("Inside getAllEcareStatus()");

		EcareStatusHeader ecarestatusHeader = new EcareStatusHeader();

		try {

			ecarestatusHeader.setHeader("Ecare_status");
			ecarestatusHeader.setData(ecarestatusDAO.getAllEcareStatus());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return ecarestatusHeader;
	}
}
