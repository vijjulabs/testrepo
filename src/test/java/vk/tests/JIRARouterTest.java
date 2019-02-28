package vk.tests;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.*;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import vk.service.JIRARouter;

@RunWith(MockitoJUnitRunner.class)
public class JIRARouterTest {

	
	@Test
	public void testRouter1() 
	{
		JIRARouter router = mock(JIRARouter.class);
		when(router.routeTheRequest1(anyString())).thenCallRealMethod();
		router.routeTheRequest1("SEN");
		verify(router, atLeast(1)).processSENRequests();
		verify(router, atLeast(0)).processFOCERequests();

	}
	@Test
	public void testRouter2() 
	{
		JIRARouter router = mock(JIRARouter.class, CALLS_REAL_METHODS);
		router.routeTheRequest1("SEN");
		verify(router, atLeast(1)).processSENRequests();
		verify(router, atLeast(0)).processFOCERequests();

	}
	@Test
	public void testRouter3() 
	{
		JIRARouter router = mock(JIRARouter.class, CALLS_REAL_METHODS);
		doAnswer(new Answer() {

			@Override
			public Object answer(InvocationOnMock invocation) throws Throwable {
				// TODO Auto-generated method stub
				return "";
			}
		}).when(router).routeTheRequest("SEN");
		router.routeTheRequest("SEN");

		verify(router, atLeast(1)).processSENRequests();
		verify(router, atLeast(0)).processFOCERequests();

	}	
	@Test
	public void testRouter4() 
	{
		JIRARouter router = mock(JIRARouter.class);
		router.routeTheRequest("SEN");
		verify(router, atLeast(1)).processSENRequests();
		verify(router, atLeast(0)).processFOCERequests();

	}
	
	@Test
	public void testRouterWithSpy() 
	{
		JIRARouter router = spy(JIRARouter.class);
		router.routeTheRequest1("SEN");
		verify(router, atLeast(1)).processSENRequests();
		verify(router, atLeast(0)).processFOCERequests();

	}
}
