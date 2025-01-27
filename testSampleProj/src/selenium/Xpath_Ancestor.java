package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath_Ancestor {

	public static void main(String[] args) throws Exception {
		LaunchBrowser.getBrowser("Firefox", "https://www.amazon.in/");
		WebElement ele = LaunchBrowser
				.findElement(By.xpath("//input[@id='twotabsearchtextbox']/ancestor::div[@class='ac-input-container']"));
		System.out.println(ele.getAttribute("class"));
		ele = LaunchBrowser.findElement(By.xpath("//div[@class='ac-input-container']/child::input"));
		ele.sendKeys("TV - 32' inches ");	
		ele.clear();
		ele = LaunchBrowser.findElement(By.xpath("//div[@class='ac-live-field']/following::input[@id='twotabsearchtextbox']"));
		ele.sendKeys("Toaster !!");
		//LaunchBrowser.tearDown();	
	}

}
