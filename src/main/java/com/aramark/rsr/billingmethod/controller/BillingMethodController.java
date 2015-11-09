package com.aramark.rsr.billingmethod.controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.aramark.rsr.billingmethod.dao.BillingMethodDAO;
import com.aramark.rsr.billingmethod.model.BillingMethod;
import com.aramark.rsr.billingmethod.model.BillingMethodHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/**
 * Handles requests for the application home page.
 * @api {get} /BillingMethod/List  Request all the available billing methods
 * @apiName GetBillingMethod
 * @apiGroup Billing
 * 
 * @apiSuccess {String} code 		code of the billing method.
 * @apiSuccess {String} description	description of the billing method.
 * 
 * @apiSuccessExample Success-Response:
 * 	HTTP 200 OK
 * 	{
 *		"data":[
 *		{
 *			"code": "A",
 *			"description": "Piece w/Stock Charge"
 *		},
 *		{
 *			"code": "B",
 *			"description": "Piece Rate"
 *		}
 *		],
 *		"header": "Billing_method"
 *	}
 *
 */

/* http://localhost:7001/rsr/BillingMethod/List?token=111 */
@Controller
public class BillingMethodController {

	private static final Logger logger = LoggerFactory.getLogger(BillingMethodController.class);
	private ArrayList<BillingMethod> billingMethods;

	@Autowired
	BillingMethodDAO billingMethodDAO;

	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}

	public BillingMethodController() {
		billingMethods = new ArrayList<BillingMethod>();
		BillingMethod bm = new BillingMethod();
		bm.setCode("code");
		bm.setDesc("desc");

		billingMethods.add(bm);

	}

	@RequestMapping(value = "/BillingMethod/List", method = RequestMethod.GET)
	@ResponseBody
	public BillingMethodHeader getAllBillingMethod(@RequestParam(value="token", defaultValue="") String token) {
		logger.info("Inside getAllIssuers() method..." +  token);

		BillingMethodHeader billingMethodHeader = new BillingMethodHeader();

		try {

			billingMethodHeader.setHeader("Billing_method");
			billingMethodHeader.setData(billingMethodDAO.getAllBillingMethod());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return billingMethodHeader;

	}


}
