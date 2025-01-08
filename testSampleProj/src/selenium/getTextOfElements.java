package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getTextOfElements {

	protected static WebDriver d = null;

	public static void main(String[] args) throws Exception {

		d = LaunchBrowser.getBrowser("edge", "https://www.amazon.in/");
		List<WebElement> alllinks = d.findElements(By.xpath("//div[@id='nav-xshop']/a[15]"));
		for (WebElement links : alllinks) {
			System.out.println(links.getText());
		}
	}

}
