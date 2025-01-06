package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifywithClassname {

	static WebDriver d = null;

	public static void main(String[] args) throws InterruptedException {

		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.letskodeit.com/practice");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> ele = d.findElements(By.className("dynamic-link"));
		for(int i = 0;i<ele.size();i++)
		{
		ele.get(i).click();
		Thread.sleep(3000);
		d.navigate().back();
		ele = d.findElements(By.className("dynamic-link"));
		}
	}

}
