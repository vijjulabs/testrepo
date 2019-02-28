package vk.service;

public class JIRARouter 
{
	public int routeTheRequest1(String source)
	{
		switch(source)
		{
			case "SEN" : processSENRequests();break;
			case "CLAIR" : processSENRequests();break;
			case "FORCE" : processFOCERequests();break;
			default : processDefaultRequests();break;
		}
	return 0;
	}
	public void routeTheRequest(String source)
	{
		switch(source)
		{
			case "SEN" : processSENRequests();break;
			case "CLAIR" : processSENRequests();break;
			case "FORCE" : processSENRequests();break;
			default : processDefaultRequests();break;
		}
	
	}
	public void processSENRequests() {
		// TODO Auto-generated method stub
		
	}
	public void processCLAIRRequests()
	{
		
	}
	public void processFOCERequests()
	{
		
	}
	public void processDefaultRequests()
	{
		
	}	
}
