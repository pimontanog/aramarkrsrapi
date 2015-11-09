package com.aramark.rsr.invoiceheader.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

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

import com.aramark.rsr.invoiceheader.dao.InvoiceHeaderDAO;
import com.aramark.rsr.invoiceheader.model.InvoiceHeader;
import com.aramark.rsr.invoiceheader.model.InvoiceHeaderHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/**
 * @api {get} /InvoiceHeader/List  Request all the available invoice headers
 * @apiName GetInvoiceHeader
 * @apiGroup Invoice
 * 
 * @apiSuccess {Number} id			id of the record.
 * @apiSuccess {Number} routeHeaderId
 * @apiSuccess {Date} invoiceDate
 * @apiSuccess {Number} number
 * @apiSuccess {Number} customerId
 * @apiSuccess {Number} termsCode
 * @apiSuccess {String} taxableCustomer
 * @apiSuccess {String} serviceDays
 * @apiSuccess {String} serviceWeeks
 * @apiSuccess {Number} prebilledAmt
 * @apiSuccess {Number} adjustmentAmt
 * @apiSuccess {Number} collectedAmt
 * @apiSuccess {String} manualInvoiceFlag
 * @apiSuccess {Number} adjustmentCounter
 * @apiSuccess {Number} invoiceCreditCodeId
 * @apiSuccess {String} lpcCodeFlag
 * @apiSuccess {Number} officeAdjustment
 * @apiSuccess {String} e4wRentalInvoice
 * @apiSuccess {String} processedFlag
 * @apiSuccess {String} irmGenerateFlag
 * @apiSuccess {Number} spcIrmRequests
 * @apiSuccess {Number} totalLossRuinChrgs
 * @apiSuccess {Number} numberOfPages
 * @apiSuccess {Number} originalInvoice
 * @apiSuccess {String} oversizeMsgPrintFlag
 * @apiSuccess {String} rateControlFlag
 * @apiSuccess {Number} specialRoundingFlag
 * @apiSuccess {Number} autoLossPerc
 * @apiSuccess {Number} invoiceMinimum
 * @apiSuccess {Number} svcChargePerc
 * @apiSuccess {String} invAdjFlag
 * @apiSuccess {Number} statusId
 * @apiSuccess {Number} nbrOfLinesUp
 * @apiSuccess {String} explanation
 * @apiSuccess {Number} taxAdjustmentAmt
 * @apiSuccess {Number} svcAdjustmentAmt
 * @apiSuccess {Number} taxAmt1
 * @apiSuccess {Number} taxAmt2
 * @apiSuccess {Number} taxAmt3
 * @apiSuccess {Number} taxAmt4
 * @apiSuccess {Number} taxOn1
 * @apiSuccess {Number} taxOn2
 * @apiSuccess {Number} taxOn3
 * @apiSuccess {Number} taxOn4
 * @apiSuccess {Number} taxPerc1
 * @apiSuccess {Number} taxPerc2
 * @apiSuccess {Number} taxPerc3
 * @apiSuccess {Number} taxPerc4
 * @apiSuccess {Number} soilMessageId
 * @apiSuccess {Number} soilApprovalStatus
 * @apiSuccess {Number} ecAdjustmentAmt
 * @apiSuccess {Number} soilApprovalRank
 * @apiSuccess {Number} displayApprovalRank
 * @apiSuccess {Number} nbr
 * 
 * @apiSuccessExample Success-Response:
 * 	HTTP 200 OK
{
	"data": [
		{
			"id": 32713365,
			"routeHeaderId": 1483590,
			"invoiceDate": "2012-07-12",
			"number": "1046920",
			"customerId": 285552,
			"termsCode": "2",
			"taxableCustomer": " ",
			"serviceDays": "     B",
			"serviceWeeks": "BBBB",
			"prebilledAmt": 358.44,
			"adjustmentAmt": 0,
			"collectedAmt": 0,
			"manualInvoiceFlag": "N",
			"adjustmentCounter": 0,
			"invoiceCreditCodeId": 0,
			"lpcCodeFlag": "N",
			"officeAdjustment": 0,
			"e4wRentalInvoice": "N",
			"processedFlag": " ",
			"irmGenerateFlag": " ",
			"spcIrmRequests": 0,
			"totalLossRuinChrgs": 0,
			"numberOfPages": 3,
			"originalInvoice": "0000000",
			"oversizeMsgPrintFlag": "N",
			"rateControlFlag": "Y",
			"specialRoundingFlag": "0",
			"autoLossPerc": 0,
			"invoiceMinimum": 23.62,
			"svcChargePerc": 0,
			"invAdjFlag": null,
			"statusId": 5,
			"nbrOfLinesUp": 0,
			"explanation": " ",
			"taxAdjustmentAmt": 0,
			"svcAdjustmentAmt": 0,
			"taxAmt1": 0,
			"taxAmt2": 0,
			"taxAmt3": 0,
			"taxAmt4": 0,
			"taxOn1": 0,
			"taxOn2": 0,
			"taxOn3": 0,
			"taxOn4": 0,
			"taxPerc1": 7,
			"taxPerc2": 0,
			"taxPerc3": 0,
			"taxPerc4": 0,
			"soilMessageId": 0,
			"soilApprovalStatus": 0,
			"ecAdjustmentAmt": 0,
			"soilApprovalRank": "999",
			"displayApprovalRank": null,
			"nbr": "1046920"
		}
	],
	"header": "Invoice_header"
}		
 *
 */

/*
 *  http://localhost:7001/rsr/InvoiceHeader/List?routeid=2949&employeeid=25213&downloaddate=2012-07-10
 */
@Controller
public class InvoiceHeaderController {

	private static final Logger logger = LoggerFactory.getLogger(InvoiceHeaderController.class);
	private ArrayList<InvoiceHeader> invoiceHeaders;
	
	@Autowired
	InvoiceHeaderDAO invoiceHeaderDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}

	
	@RequestMapping(value = "/InvoiceHeader/List", method = RequestMethod.GET)
	@ResponseBody
	public InvoiceHeaderHeader getAllInvoiceHeader(@RequestParam(value="routeid", defaultValue="") String routeid
			, @RequestParam(value="employeeid", defaultValue="") String employeeid
			, @RequestParam(value="downloaddate", defaultValue="") String downloaddate) {
		logger.info("Inside getAllInvoiceHeader() routeid = " +  routeid 
				+ " , employeeid = " + employeeid
				+ " , downloaddate = " + downloaddate);

		InvoiceHeaderHeader invoiceHeaderHeader = new InvoiceHeaderHeader();

		try {

			invoiceHeaderHeader.setHeader("Invoice_header");
			
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
			Date dDownloadDate = format.parse(downloaddate);
			long lRouteId = Long.parseLong(routeid);
			long lEmployeeId = Long.parseLong(employeeid);
			
			logger.info(downloaddate);
			logger.info(format.format(dDownloadDate));
			invoiceHeaderHeader.setData(invoiceHeaderDAO.getAllInvoiceHeader(dDownloadDate, lRouteId, lEmployeeId));

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return invoiceHeaderHeader;
	}	
	
}
