package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifywithClassname2 {

	static WebDriver d = null;

	public static void main(String[] args) throws InterruptedException {

		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.letskodeit.com/practice");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele = d.findElement(By.className("dynamic-link"));
		ele.click();

	}

}
