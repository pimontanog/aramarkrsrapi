package com.aramark.rsr.deliverymethod.controller;

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

import com.aramark.rsr.deliverymethod.dao.DeliveryMethodDAO;
import com.aramark.rsr.deliverymethod.model.DeliveryMethodHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/DeliveryMethod/List
 */
@Controller
public class DeliveryMethodController {

	private static final Logger logger = LoggerFactory.getLogger(DeliveryMethodController.class);
	
	@Autowired
	DeliveryMethodDAO deliverymethodDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}
	
	@RequestMapping(value = "/DeliveryMethod/List", method = RequestMethod.GET)
	@ResponseBody
	public DeliveryMethodHeader getAllDeliveryMethod() {

		logger.info("Inside getAllDeliveryMethod()");

		DeliveryMethodHeader deliverymethodHeader = new DeliveryMethodHeader();

		try {

			deliverymethodHeader.setHeader("Delivery_method");
			deliverymethodHeader.setData(deliverymethodDAO.getAllDeliveryMethod());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return deliverymethodHeader;
	}	
}
