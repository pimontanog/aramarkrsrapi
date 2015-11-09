package com.aramark.rsr.paymentmethod.controller;

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

import com.aramark.rsr.paymentmethod.dao.PaymentMethodDAO;
import com.aramark.rsr.paymentmethod.model.PaymentMethodHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/PaymentMethod/List
 */
@Controller
public class PaymentMethodController {

	private static final Logger logger = LoggerFactory.getLogger(PaymentMethodController.class);
	
	@Autowired
	PaymentMethodDAO paymentmethodDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}
	
	@RequestMapping(value = "/PaymentMethod/List", method = RequestMethod.GET)
	@ResponseBody
	public PaymentMethodHeader getAllPaymentMethod() {

		logger.info("Inside getAllPaymentMethod()");

		PaymentMethodHeader paymentmethodHeader = new PaymentMethodHeader();

		try {

			paymentmethodHeader.setHeader("Payment_method");
			paymentmethodHeader.setData(paymentmethodDAO.getAllPaymentMethod());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return paymentmethodHeader;
	}	
}
