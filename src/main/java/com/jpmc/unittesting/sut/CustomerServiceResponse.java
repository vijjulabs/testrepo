package com.jpmc.unittesting.sut;

public class CustomerServiceResponse 
{
	CustomerAccountDetails customerAccountDetails;
	boolean partialResult;
	public CustomerAccountDetails getCustomerAccountDetails() {
		return customerAccountDetails;
	}
	public void setCustomerAccountDetails(CustomerAccountDetails customerAccountDetails) {
		this.customerAccountDetails = customerAccountDetails;
	}
	public boolean isPartialResult() {
		return partialResult;
	}
	public void setPartialResult(boolean partialResult) {
		this.partialResult = partialResult;
	}
	
	
}
