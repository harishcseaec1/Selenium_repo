package demo;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample {

	@Test
	public void sampler() {
		Reporter.log("Test executed", true);
		Reporter.log("Sample test case modified", true);
		Reporter.log("Sample test added for QA", true);
	}
	
}
