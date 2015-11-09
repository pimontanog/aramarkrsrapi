package com.aramark.rsr.customer.dao;

import java.util.ArrayList;
import com.aramark.rsr.customer.model.Customer;

public interface CustomerDAO {

	public ArrayList<Customer> getAllCustomer(long pRouteId);

}
