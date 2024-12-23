package selenium;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEx2 {
	
	static WebDriver d =null;

	public static void main(String[] args) throws Exception {

		d = new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getPageSource());
		getPageSource();
		WebElement imgs = findElement(By.xpath("//img[@alt]"));
		imgs.click();
		// ((JavascriptExecutor)d).executeScript("arguments[0].style.border='3px solid
		// red'", imgs);
		Thread.sleep(3000);
		List<WebElement> allimgs = findElements(By.xpath("//img[@alt]"));
		if (allimgs.size() > 0) {
			for (WebElement ele : allimgs) {
				((JavascriptExecutor) d).executeScript("arguments[0].style.border='3px solid red'", ele);
			}
		} else {
			System.out.println("No elements found ");
		}

		Thread.sleep(3000);
		WebElement uname = findElement(By.name("username"));
		uname.sendKeys("admin");
		WebElement pswd = findElement(By.name("password"));
		pswd.sendKeys("admin123");
		System.out.println(d.getWindowHandle());
		WebElement submit = d.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(3000);
		d.navigate().refresh();
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
		d.quit();

	}

	public static void getPageSource() throws Exception {
		File file = new File(".\\DataFiles\\PageSource.txt");
		FileWriter fw = new FileWriter(file);
		fw.write(d.getPageSource());
		fw.close();

	}
	
	public static WebElement findElement(By by)
	{
		return d.findElement(by);
	}
	

	public static List<WebElement> findElements(By by)
	{
		return d.findElements(by);
	}
}
