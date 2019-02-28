package vk.service;

public class InterestCalculatorImpl implements InterestCalculator {

	public double calculateSimepleInterest(double prinicipal, double rate, double tenure) 
	{
		return (prinicipal*rate*tenure)/100;
	}
}
