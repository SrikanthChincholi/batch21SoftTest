package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIdentiifers {
	static WebDriver d = null;

	public static void main(String[] args) throws Exception {

		d = new ChromeDriver();
		d.get("https://www.letskodeit.com/practice");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement bmw = d.findElement(By.id("bmwradio")); //identify with id 
		bmw.click(); //perform click() action 
		Thread.sleep(3000);
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		d.findElement(By.name("username")).sendKeys("Srikanth");
		String txt = d.findElement(By.className("oxd-label")).getText();
		System.out.println(txt);
		Thread.sleep(3000);
		d.get("https://www.letskodeit.com/practice");
		Thread.sleep(3000);
		d.findElement(By.linkText("HOME")).click();
	}
}
