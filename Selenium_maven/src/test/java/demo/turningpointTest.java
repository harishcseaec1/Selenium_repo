package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class turningpointTest {
	@Test
	public void turningpointtest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tpgsi.com/");
		
	}

}
