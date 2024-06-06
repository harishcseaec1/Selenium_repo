package genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class webdriverUtility {
    public Actions act;
	public void doubleClick(WebDriver driver) {
		act = new Actions(driver);
		
	}
	public void doubleClick() {
		act.doubleClick().perform();
	}

}
