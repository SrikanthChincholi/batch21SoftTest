package selenium;

import java.io.File;
import java.io.FileWriter;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitClass {

	static WebDriver d;

	public static void main(String[] args) throws Exception {

		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Loader.html");
		WebElement ele = getFluentWaitforEleTobeClickable(d,
				By.xpath("//button[@id='loader' and contains(text(),'Run')]"),30);
		if (ele.isDisplayed()) {
			ele.click();
			boolean plswait = getFluentWaitforEleInvisibility(d, By.xpath("//h1[text()='Please wait...']"), 60);
			if (plswait) {
				WebElement modal = getFluentWaitforEleVisibility(d, By.xpath("//h4[text()='Modal title']"), 30);
				if (modal.isDisplayed()) {
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

	public static WebElement getFluentWaitforEleVisibility(WebDriver d, By by, int timeout) {
		WebElement ele = getFluentWait(timeout).pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOfElementLocated(by));
		return ele;
	}

	public static boolean getFluentWaitforEleInvisibility(WebDriver d, By by, int timeout) {
		boolean flag = getFluentWait(timeout).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.invisibilityOfElementLocated(by));
		return flag;
	}

	public static WebElement getFluentWaitforEleTobeClickable(WebDriver d, By by, int timeout) {
		WebElement ele = getFluentWait(timeout).pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(by));
		return ele;
	}

	public static FluentWait<WebDriver> getFluentWait(int timeout) {
		FluentWait<WebDriver> wait = new WebDriverWait(d, Duration.ofSeconds(timeout));
		return wait;
	}

}
