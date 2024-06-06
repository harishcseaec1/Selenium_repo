package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectrepository.homePage;
import objectrepository.loginPage;
import objectrepository.welcomePage;

public class baseClass {
	public static WebDriver driver;
	public fileUtility flib;
	public welcomePage wp;
	public homePage hp;
	public loginPage lp;
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		//driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		flib = new fileUtility();
		String URL = flib.getDataFromProperty("url");
		driver.get(URL);
	}
	
	@BeforeMethod
	public void login()
	{
		wp = new welcomePage();
		wp.get
	}

}
