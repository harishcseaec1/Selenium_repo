package demo;

import org.testng.annotations.Test;

public class mavenParameter {
	@Test
	public void receiveData()
	{
		String URL = System.getProperty("url");
		System.err.println(URL);
	}

}
