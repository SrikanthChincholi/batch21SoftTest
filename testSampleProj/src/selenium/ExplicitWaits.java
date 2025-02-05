package selenium;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

	static WebDriver d;

	public static void main(String[] args) throws Exception {

		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Loader.html");
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(30));
		WebElement found = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loader' and contains(text(),'Run')]")));
		if (found.isDisplayed()) {
			found.click();
		}

		Boolean plswait = wait
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h1[text()='Please wait...']")));
		if (plswait) {
			WebElement title = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Modal title']")));
			if (title.isDisplayed()) {
				// Thread.sleep(3000);
				String data = d.findElement(By.xpath("//div[@class='modal-body']/p")).getText();
				System.out.println(data);
				Thread.sleep(3000);
				FileWriter file = new FileWriter(new File(System.getProperty("user.dir") + "/DataFiles/data.txt"));
				file.write(data);
				file.close();
				d.findElement(By.xpath("//button[text()='Close']")).click();
			}
		}
	}

}
