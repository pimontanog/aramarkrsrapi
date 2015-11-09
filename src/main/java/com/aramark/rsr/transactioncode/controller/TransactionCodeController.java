package com.aramark.rsr.transactioncode.controller;

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

import com.aramark.rsr.transactioncode.dao.TransactionCodeDAO;
import com.aramark.rsr.transactioncode.model.TransactionCodeHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/TransactionCode/List
 */
@Controller
public class TransactionCodeController {

	private static final Logger logger = LoggerFactory.getLogger(TransactionCodeController.class);
	
	@Autowired
	TransactionCodeDAO transactioncodeDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}
	
	@RequestMapping(value = "/TransactionCode/List", method = RequestMethod.GET)
	@ResponseBody
	public TransactionCodeHeader getAllTransactionCode() {

		logger.info("Inside getAllTransactionCode()");

		TransactionCodeHeader transactioncodeHeader = new TransactionCodeHeader();

		try {

			transactioncodeHeader.setHeader("Transaction_code");
			transactioncodeHeader.setData(transactioncodeDAO.getAllTransactionCode());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return transactioncodeHeader;
	}	
}
