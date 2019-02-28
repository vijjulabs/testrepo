package vk.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.when;

import vk.service.InterestCalClient;
import vk.service.InterestCalculator;

@RunWith(MockitoJUnitRunner.class)
public class InterestCalcTest {

	@InjectMocks
	InterestCalClient client;
	
	@Mock
	InterestCalculator calculator;
	
	@Test
	public void testSimpleInterest1()
	{
		when(calculator.calculateSimepleInterest(100, 12, 12)).thenReturn(144.0);
		double interest = client.calcSimpleInterest(100, 12, 12);
		Assert.assertEquals(144.0, interest, 0);
		
	}
	@Test
	public void testSimpleInterest2()
	{
		Answer<Double> answer = new Answer<Double>() 
		{

			public Double answer(InvocationOnMock invocation) throws Throwable {
				return new Double(144.0);
			}
		};
		when(calculator.calculateSimepleInterest(100, 12, 12)).then(answer);
		double interest = client.calcSimpleInterest(100, 12, 12);

		Assert.assertEquals(144.0, interest, 0);
		
	}
	@Test
	public void testSimpleInterest3()
	{
		Answer<Double> answer = new Answer<Double>() 
		{

			public Double answer(InvocationOnMock invocation) throws Throwable {
				
				return ((Double)invocation.getArgument(1));
			}
		};
		when(calculator.calculateSimepleInterest(100, 12, 12)).then(answer);
		double interest = client.calcSimpleInterest(100, 12, 12);

		Assert.assertNotEquals(144.0, interest, 0);
		
	}
	
	@Test
	public void testSimpleInterest4()
	{
		Answer<Double> answer = new Answer<Double>() 
		{

			public Double answer(InvocationOnMock invocation) throws Throwable {
				
				return ((Double)invocation.getArgument(1));
			}
		};
		when(calculator.calculateSimepleInterest(100, 12, 12)).thenAnswer(answer);
		double interest = client.calcSimpleInterest(100, 12, 12);

		Assert.assertEquals(144.0, interest, 0);
		
	}
}
