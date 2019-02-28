package com.jpmc.unittesting.sut;

import java.util.List;

public class CustomerServiceRequest 
{
	String channelId;
	String customerId;
	List<AccountType> requestedAccountTypes;
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public List<AccountType> getRequestedAccountTypes() {
		return requestedAccountTypes;
	}
	public void setRequestedAccountTypes(List<AccountType> requestedAccountTypes) {
		this.requestedAccountTypes = requestedAccountTypes;
	}
	
}
