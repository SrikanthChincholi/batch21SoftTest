package selenium;

import org.openqa.selenium.By;

public class CssSelector {
	
	public static void main(String[] args) throws Exception {
		
		LaunchBrowser.getBrowser("Firefox", "https://www.amazon.in/");
		LaunchBrowser.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Air Fyer");
		String tagname= LaunchBrowser.findElement(By.cssSelector(".nav-left")).getTagName();
		System.out.println(tagname);
		LaunchBrowser.findElement(By.cssSelector("a[id='nav-hamburger-menu']")).click();
		Thread.sleep(3000);
		LaunchBrowser.findElement(By.cssSelector("div[id='hmenu-close-icon'][role='button']")).click();
		Thread.sleep(3000);
		LaunchBrowser.findElement(By.cssSelector("a[id='nav-hamburger-menu']")).click();
		Thread.sleep(3000);
		LaunchBrowser.findElement(By.cssSelector("div[id='hmenu-close-icon'],[role='button123']")).click();
		
		
	}

}
