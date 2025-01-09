package selenium;

import org.openqa.selenium.By;

public class XpathContains {
	
	public static void main(String[] args) throws Exception {
		
		LaunchBrowser.getBrowser("edge","https://demo.automationtesting.in/Alerts.html");
		//LaunchBrowser.clickElemt(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]"));
		LaunchBrowser.clickElemt(By.xpath("(//button[text()[normalize-space('click the button to display an  alert box:')]])[2]"));
		LaunchBrowser.waitForElement(3);
		LaunchBrowser.getDriver().switchTo().alert().accept();
		LaunchBrowser.clickElemt(By.xpath("(//a[contains(@class,'analystic')])[2]"));
		LaunchBrowser.waitForElement(3);
		LaunchBrowser.clickElemt(By.xpath("//a[starts-with(text(),'Regi')]"));
		LaunchBrowser.enterTxt(By.xpath("//input[starts-with(@placeholder,'First Name')]"), "Srikanth");
	//	LaunchBrowser.tearDown();
	}

}
