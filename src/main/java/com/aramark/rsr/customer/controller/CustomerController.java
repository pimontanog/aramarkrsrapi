package com.aramark.rsr.customer.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.aramark.rsr.customer.dao.CustomerDAO;
import com.aramark.rsr.customer.model.CustomerHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/Customer/List?routeid=2949
 */
@Controller
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerDAO customerDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}

	
	@RequestMapping(value = "/Customer/List", method = RequestMethod.GET)
	@ResponseBody
	public CustomerHeader getAllCustomer(@RequestParam(value="routeid", defaultValue="") String routeid) {

		logger.info("Inside getAllCustomer() routeid = " +  routeid );

		CustomerHeader customerHeader = new CustomerHeader();

		try {

			customerHeader.setHeader("Customer");
			long lRouteId = Long.parseLong(routeid);
			
			customerHeader.setData(customerDAO.getAllCustomer(lRouteId));

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return customerHeader;
	}	
	
}

