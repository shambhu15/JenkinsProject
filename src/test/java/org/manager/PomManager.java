package org.manager;

import com.objectrepository.AddCustomerPom;
import com.objectrepository.AddTarrifPom;

public class PomManager {
	private AddCustomerPom addCustomerPage;
	private AddTarrifPom addTarrifPage;
	public AddCustomerPom getAddCustomerPage() {
		return (addCustomerPage==null)?addCustomerPage=new AddCustomerPom():addCustomerPage;
	}
	public AddTarrifPom getAddTarrifPage() {
		return (addTarrifPage==null)?addTarrifPage=new AddTarrifPom():addTarrifPage;
	}

}
