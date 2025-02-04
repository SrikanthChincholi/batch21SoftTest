package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitEx {

	static WebDriver d;

	public static void main(String[] args) {

		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("Srikanth");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("Chincholi");

	}

}
