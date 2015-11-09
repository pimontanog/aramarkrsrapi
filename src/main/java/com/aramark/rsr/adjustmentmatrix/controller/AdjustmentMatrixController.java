package com.aramark.rsr.adjustmentmatrix.controller;

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

import com.aramark.rsr.adjustmentmatrix.dao.AdjustmentMatrixDAO;
import com.aramark.rsr.adjustmentmatrix.model.AdjustmentMatrixHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/AdjustmentMatrix/List
 */
@Controller
public class AdjustmentMatrixController {

	private static final Logger logger = LoggerFactory.getLogger(AdjustmentMatrixController.class);
	
	@Autowired
	AdjustmentMatrixDAO adjustmentmatrixDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}

	
	@RequestMapping(value = "/AdjustmentMatrix/List", method = RequestMethod.GET)
	@ResponseBody
	public AdjustmentMatrixHeader getAllAdjustmentMatrix() {

		logger.info("Inside getAllAdjustmentMatrix()");

		AdjustmentMatrixHeader adjustmentmatrixHeader = new AdjustmentMatrixHeader();

		try {

			adjustmentmatrixHeader.setHeader("Adjustment_matrix");
			
			adjustmentmatrixHeader.setData(adjustmentmatrixDAO.getAllAdjustmentMatrix());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return adjustmentmatrixHeader;	
	}	
}
