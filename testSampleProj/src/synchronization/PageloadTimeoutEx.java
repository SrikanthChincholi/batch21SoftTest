package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageloadTimeoutEx
{

	static WebDriver d;

	public static void main(String[] args) {

		d = new ChromeDriver();
		long start = System.currentTimeMillis();

		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		d.get("https://demo.automationtesting.in/JqueryProgressBar.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[@id='downloadButton']")).click();
		// Current Progress: 34%
		String str = d.findElement(By.xpath("//div[@class='progress-label']")).getText();
		if (str.contains("Current Progress:"))
			System.out.println("Test Pass!!");
		else
			System.out.println("Test Fail");

	}

}
