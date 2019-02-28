package com.jpmc.unittesting.sut;

import java.util.List;

public interface CustomerService 
{
	CustomerServiceResponse  getCustomerAccountDetails(CustomerServiceRequest customerServiceRequest) throws CustomerServiceException;
	Customer getCustomerDetails (String customerId);
	void linkNewAccount (Customer customer, Account account);
	void linkNewAccounts (Customer customer, List<Account> accountList);
	List<Account> getAccounts(Customer customer);
}