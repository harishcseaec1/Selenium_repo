package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sampleTest {
	@Test(groups = "smoke")
	public void sampletest() {
		Reporter.log("Executed", true);
	}

}
