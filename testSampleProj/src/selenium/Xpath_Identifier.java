package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Identifier {

	static WebDriver d;

	public static void main(String[] args) {

		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement ele = d.findElement(By.xpath("//input[@name='username']"));
		ele.sendKeys("admin");
		WebElement ele1 = d.findElement(By.xpath("//input[@type='password']"));
		ele1.sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement dashboard = d.findElement(By.xpath("//h6[text()='Dashboard']"));
		if (dashboard.isDisplayed()) {
			System.out.println("Login success !!");
		} else {
			System.out.println("Login Failed !!");
		}
		WebElement admin = d.findElement(By.xpath("//a[@class='oxd-main-menu-ite' or @href='/web/index.php/admin/viewAdminModule']"));
		admin.click();
		WebElement admintxt = d.findElement(By.xpath("//span/h6[2]"));
		System.out.println(admintxt.getText());
		if(admintxt.getText().toUpperCase().contains("USER"))
		{
			System.out.println("Clicking on Admin/User Management link success !!");
		}

	}

}
