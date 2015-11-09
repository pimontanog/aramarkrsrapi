package com.aramark.rsr.invoiceheader.dao;

import java.util.ArrayList;
import java.util.Date;

import com.aramark.rsr.invoiceheader.model.InvoiceHeader;

public interface InvoiceHeaderDAO {

	public ArrayList<InvoiceHeader> getAllInvoiceHeader(Date pDownloadDate, long pRouteId, long pEmployeeId);
	
}
