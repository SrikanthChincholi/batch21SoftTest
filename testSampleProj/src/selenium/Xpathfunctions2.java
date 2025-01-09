package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpathfunctions2 {
	
	public static void main(String[] args) throws Exception {
		
		LaunchBrowser.getBrowser("chrome", "https://www.amazon.in/");
		List<WebElement> alllinks = LaunchBrowser.getDriver().findElements(By.xpath("//div[@id='nav-xshop-container']//a[not(contains(text(),'Amazon'))]"));
		for(WebElement link : alllinks)
		{
			System.out.println(link.getText());
		}
		//LaunchBrowser.clickElemt(By.xpath("//div[contains(@id,'nav-xshop')]/a[position()=4]"));
		
	}

}
