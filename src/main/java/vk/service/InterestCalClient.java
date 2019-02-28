package vk.service;

public class InterestCalClient 
{
	InterestCalculator interestService;
	
	public double calcSimpleInterest(double prinicipal, double rate, double tenure)
	{
		return interestService.calculateSimepleInterest(prinicipal, rate, tenure);
	}
}