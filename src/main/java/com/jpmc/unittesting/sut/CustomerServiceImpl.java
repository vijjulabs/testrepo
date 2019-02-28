package com.jpmc.unittesting.sut;

import java.util.List;

public class CustomerServiceImpl implements CustomerService
{

	CustomerDAO customerDao;
	CustomerAccountsDAO customerAccountsDao;
	
	CustomerServiceImpl(CustomerDAO customerDao, CustomerAccountsDAO customerAccountsDao)
	{
		this.customerDao = customerDao;
		this.customerAccountsDao = customerAccountsDao;
	}
	
	public CustomerServiceResponse getCustomerAccountDetails(CustomerServiceRequest customerServiceRequest) throws CustomerServiceException 
	{
		CustomerAccountDetails cad = customerAccountsDao.getCustomerAccountDetails(customerServiceRequest.getCustomerId());
		
		return buildCustomerResponse(cad, false);
	}

	@Override
	public Customer getCustomerDetails(String customerId) {
	
		Customer customer = customerDao.getCustomerDetails(customerId);
		
		return customer;
	}

	@Override
	public void linkNewAccount(Customer customer, Account account) 
	{
		customerAccountsDao.linkNewAccount(customer.getCustomerId(), account);		
	}

	@Override
	public void linkNewAccounts(Customer customer, List<Account> accountList) 
	{
		for (Account account : accountList)
		{
			linkNewAccount(customer, account);
		}
	}

	@Override
	public List<Account> getAccounts(Customer customer) 
	{
		return customerAccountsDao.getAccounts(customer);		
	}
	
	private CustomerServiceResponse buildCustomerResponse(CustomerAccountDetails cad, boolean partialResult)
	{
		CustomerServiceResponse csr = new CustomerServiceResponse();
		csr.setCustomerAccountDetails(cad);
		csr.setPartialResult(partialResult);
		return csr;
	}
}
