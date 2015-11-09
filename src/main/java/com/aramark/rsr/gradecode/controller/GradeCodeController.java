package com.aramark.rsr.gradecode.controller;

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

import com.aramark.rsr.gradecode.dao.GradeCodeDAO;
import com.aramark.rsr.gradecode.model.GradeCodeHeader;
import com.aramark.rsr.exception.model.ErrorDetail;
import com.aramark.rsr.exception.type.ServiceException;

/*
 *  http://localhost:7001/rsr/GradeCode/List
 */
@Controller
public class GradeCodeController {

	private static final Logger logger = LoggerFactory.getLogger(GradeCodeController.class);
	
	@Autowired
	GradeCodeDAO gradecodeDAO;
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ErrorDetail myError(HttpServletRequest request, Exception exception) {
		ErrorDetail error = new ErrorDetail();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getLocalizedMessage());
		error.setUrl(request.getRequestURL().append("/error/111").toString());
		return error;
	}
	
	@RequestMapping(value = "/GradeCode/List", method = RequestMethod.GET)
	@ResponseBody
	public GradeCodeHeader getAllGradeCode() {

		logger.info("Inside getAllGradeCode()");

		GradeCodeHeader gradecodeHeader = new GradeCodeHeader();

		try {

			gradecodeHeader.setHeader("Grade_code");
			gradecodeHeader.setData(gradecodeDAO.getAllGradeCode());

		} catch (Exception ex) {
			throw new ServiceException(ex.getLocalizedMessage());
		}

		return gradecodeHeader;
	}	
}
