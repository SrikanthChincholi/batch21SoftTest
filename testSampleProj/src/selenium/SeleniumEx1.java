package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumEx1 {

	public static void main(String[] args) throws Exception {

		WebDriver d = new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement uname = d.findElement(By.name("username"));
		uname.sendKeys("admin");
		WebElement pswd = d.findElement(By.name("password"));
		pswd.sendKeys("admin123");
		WebElement submit = d.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(3000);
		d.quit();	

	}

}
