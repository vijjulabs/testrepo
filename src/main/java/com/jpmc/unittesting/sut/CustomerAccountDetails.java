package com.jpmc.unittesting.sut;

import java.util.List;

public class CustomerAccountDetails 
{
	Customer customer;
	List<Account> linkedAccounts;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Account> getLinkedAccounts() {
		return linkedAccounts;
	}
	public void setLinkedAccounts(List<Account> linkedAccounts) {
		this.linkedAccounts = linkedAccounts;
	}
	
}
