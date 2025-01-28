package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	static WebDriver d = null;

	@SuppressWarnings("unlikely-arg-type")
	public static WebDriver getBrowser(String browsername, String url) throws Exception {

		if (browsername.equalsIgnoreCase("chrome")) {
			d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			maximizeAndSettime();
			d.get(url);
		} else if (browsername.equalsIgnoreCase("firefox")) {
			d = new FirefoxDriver();
			d.manage().window().maximize();
			maximizeAndSettime();
			d.get(url);
		} else if (browsername.equalsIgnoreCase("edge")) {
			d = new EdgeDriver();
			d.manage().window().maximize();
			maximizeAndSettime();
			d.get(url);
		} else {
			throw new Exception("No such browser defined !!");
		}
		return d;

	}

	public static void maximizeAndSettime() {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	public static void clickElemt(By by) {
		d.findElement(by).click();
	}

	public static void enterTxt(By by, String value) {
		d.findElement(by).sendKeys(value);
	}

	public static WebDriver getDriver() {
		return d;

	}

	public static void waitForElement(int secs) throws Exception {
		Thread.sleep(secs * 1000);
	}

	public static void tearDown() {
		getDriver().quit();
	}

	public static String getText(By by) {
		return getDriver().findElement(by).getText();
	}

	public static boolean isDisplayed(By by) {
		return getDriver().findElement(by).isDisplayed();

	}

	public static  WebElement findElement(By by) {
		return d.findElement(by);
	}
	
	public static  List<WebElement> findElements(By by) {
		return d.findElements(by);
	}
}
