package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectoraxes {

	static WebDriver d;
	
	public static void highlight(WebDriver d ,WebElement ele)
	{
		((JavascriptExecutor) d).executeScript("arguments[0].style.border='2px solid red'", ele);
	}

	public static void main(String[] args) throws InterruptedException {

		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement ele = d.findElement(By.cssSelector("input[name^='user']"));
		highlight(d,ele);
		ele.sendKeys("admin");
		
		ele = d.findElement(By.cssSelector("input[name$='word']"));
		highlight(d,ele);
		ele.sendKeys("admin123");
		
		ele = d.findElement(By.cssSelector("button[class*='oxd-button']"));
		highlight(d,ele);
		ele.click();
		Thread.sleep(5000);
		ele = d.findElement(By.cssSelector("a>svg"));
		highlight(d,ele);
		ele.click();
		Thread.sleep(3000);
		d.navigate().back();
		Thread.sleep(3000);
		ele = d.findElement(By.cssSelector("a span"));
		highlight(d,ele);
		ele.click();
		ele = d.findElement(By.cssSelector("ul[class='oxd-main-menu']>li:nth-child(6)"));
		highlight(d,ele);
		ele.click();
		Thread.sleep(3000);
		ele = d.findElement(By.cssSelector("ul[class='oxd-main-menu']>li:nth-of-type(8)"));
		highlight(d,ele);
		ele.click();
		ele = d.findElement(By.cssSelector("ul[class='oxd-main-menu']>li:first-of-type"));
		highlight(d,ele);
		ele.click();
		Thread.sleep(3000);
		ele = d.findElement(By.cssSelector("ul[class='oxd-main-menu']>li:last-of-type"));
		highlight(d,ele);
		ele.click();
		List<WebElement> allbtns = d
				.findElements(By.cssSelector("div[class='orangehrm-post-filters'] button:not([class*='label-warn'])"));
		for (WebElement btns : allbtns) {
			btns.click();
			Thread.sleep(4000);
		//	highlight(d,ele);
			System.out.println("Title " + d.getTitle());
			

		}

	}

}
