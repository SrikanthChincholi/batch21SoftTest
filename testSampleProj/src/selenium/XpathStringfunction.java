package selenium;

import org.openqa.selenium.By;

public class XpathStringfunction {

	public static void main(String[] args) throws Exception {

		LaunchBrowser.getBrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LaunchBrowser.enterTxt(By.name("username"), "admin");
		LaunchBrowser.enterTxt(By.name("password"), "admin123");
		LaunchBrowser.clickElemt(By.xpath("//button[@type='submit']"));
		LaunchBrowser.clickElemt(By.xpath("//a//span[text()='Admin']"));
		if (LaunchBrowser
				.isDisplayed(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6[contains(string(),'User')]")))
			;
		{
			System.out.println("Admin page displayed");
		}
	}

}
