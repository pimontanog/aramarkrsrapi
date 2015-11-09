package com.aramark.rsr.customeritem.dao;

import java.util.ArrayList;
import com.aramark.rsr.customeritem.model.CustomerItem;

public interface CustomerItemDAO {

	public ArrayList<CustomerItem> getAllCustomerItem(long pRouteId);
}
