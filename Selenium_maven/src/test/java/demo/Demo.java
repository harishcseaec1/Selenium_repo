package demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericutility.excelUtility;
import genericutility.fileUtility;
import genericutility.javaUtility;

public class Demo {
	@Test
	public void test() throws IOException {
		fileUtility flib = new fileUtility();
		javaUtility jlib = new javaUtility();
		String time = jlib.getSystemTime();
		System.out.println("Time is" +time);
		excelUtility elib = new excelUtility();
		String URL = elib.getStringDataFromExcel("Sheet1", 0, 0);
		//String URL = flib.getDataFromProperty("url");
	    System.out.println(URL);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
	}

}
