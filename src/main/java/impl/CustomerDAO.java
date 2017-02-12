package impl;

import impl.Customer;

public interface CustomerDAO 
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}




