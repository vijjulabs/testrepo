package vk.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;
import vk.service.StringsUtil;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class StringUtilsTest
{
	@Test
	public void testRepitions1() 
	{
		StringsUtil utils = mock(StringsUtil.class);
		
		when(utils.findRepitions("Vijay", 'v')).thenReturn(5);
		int count = utils.findRepitions("Vijay",'v');
		Assert.assertEquals(5, count);
	}
	@Test
	public void testRepitions2() 
	{
		StringsUtil utils = mock(StringsUtil.class);                                
		
		when(utils.findRepitions(anyString(),anyChar())).thenReturn(5);
		int count = utils.findRepitions("KUmar",'v');
		Assert.assertEquals(5, count);
	}
	
}