package com.aramark.rsr.creditcode.controller;

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

import com.aramark.rsr.creditcode.dao.CreditCodeDAO;
import com.aramark.rsr.creditcode.model.CreditCodeHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/CreditCode/List
 */
@Controller
public class CreditCodeController {
	
	private static final Logger logger = LoggerFactory.getLogger(CreditCodeController.class);
	
	@Autowired
	CreditCodeDAO creditcodeDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}
	
	@RequestMapping(value = "/CreditCode/List", method = RequestMethod.GET)
	@ResponseBody
	public CreditCodeHeader getAllCreditCode() {

		logger.info("Inside getAllCreditCode()");

		CreditCodeHeader creditcodeHeader = new CreditCodeHeader();

		try {

			creditcodeHeader.setHeader("Credit_code");
			creditcodeHeader.setData(creditcodeDAO.getAllCreditCode());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return creditcodeHeader;
	}
}
