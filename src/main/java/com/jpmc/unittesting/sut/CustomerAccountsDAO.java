package com.jpmc.unittesting.sut;

import java.util.List;

public interface CustomerAccountsDAO 
{
	CustomerAccountDetails  getCustomerAccountDetails(String customerId);
	void linkNewAccount (String customerId, Account account);
	List<Account> getAccounts(Customer customer);

}
