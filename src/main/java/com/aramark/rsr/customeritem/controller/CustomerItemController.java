package com.aramark.rsr.customeritem.controller;


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

import com.aramark.rsr.customeritem.dao.CustomerItemDAO;
import com.aramark.rsr.customeritem.model.CustomerItemHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/CustomerItem/List?routeid=2949
 */
@Controller
public class CustomerItemController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerItemController.class);
	
	@Autowired
	CustomerItemDAO customeritemDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}

	@RequestMapping(value = "/CustomerItem/List", method = RequestMethod.GET)
	@ResponseBody
	public CustomerItemHeader getAllCustomerItem(@RequestParam(value="routeid", defaultValue="") String routeid) {

		logger.info("Inside getAllCustomerItem() routeid = " +  routeid );

		CustomerItemHeader customeritemHeader = new CustomerItemHeader();

		try {

			customeritemHeader.setHeader("Customer_Item");
			long lRouteId = Long.parseLong(routeid);
			
			customeritemHeader.setData(customeritemDAO.getAllCustomerItem(lRouteId));

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return customeritemHeader;
	}	
}
