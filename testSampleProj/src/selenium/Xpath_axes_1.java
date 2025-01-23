package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath_axes_1 {

	public static void main(String[] args) throws Exception {

		LaunchBrowser.getBrowser("Firefox", "https://demo.automationtesting.in/Register.html");
		List<WebElement> ele = LaunchBrowser.findElements(By.xpath("//input[@type='checkbox']/parent::div"));
		for (WebElement e : ele)
			System.out.println(e.getText());

	}

}
