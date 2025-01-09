package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathwithFunctions {
	
	static WebDriver d = null;
	
	public static void main(String[] args) throws Exception {
		
		d = LaunchBrowser.getBrowser("chrome","https://demo.automationtesting.in/Register.html");
		WebElement ele = d.findElement(By.xpath("//label[text()='Full Name* ']"));
		if(ele.isDisplayed())
		System.out.println(ele.getText() + " is displayed");
		d.findElement(By.xpath("//a[text()='WebTable']")).click();
			
	}

}
