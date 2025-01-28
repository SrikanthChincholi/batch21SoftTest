package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath_following_sib {

	public static void main(String[] args) throws Exception {
	//	clickElementusingfollowingsibling("Prime");
	//	clickElementusingfollowingsibling();
	//	clickElementusingprecedingsibling("Sell");
		clickElementusingprecedingsibling();
	}

	public static void clickElementusingfollowingsibling(String str) throws Exception {
		LaunchBrowser.getBrowser("chrome", "https://www.amazon.in/");
		List<WebElement> allfollowingsiblings = LaunchBrowser
				.findElements(By.xpath("//div[@id='nav-xshop']//a[text()='Best Sellers']/following-sibling::a"));
		for (WebElement ele : allfollowingsiblings) {
			if (ele.getText().equalsIgnoreCase(str)) {
				ele.click();
				System.out.println(LaunchBrowser.getDriver().getTitle());
			}
		}
		
		
	}
	public static void clickElementusingfollowingsibling() throws Exception {
		LaunchBrowser.getBrowser("chrome", "https://www.amazon.in/");
		List<WebElement> allfollowingsiblings = LaunchBrowser.findElements(By.xpath(
				"//div[@id='nav-xshop']//a[text()='Best Sellers']/following-sibling::a[contains(text(),'Today')]"));
		allfollowingsiblings.get(0).click();
		System.out.println(LaunchBrowser.getDriver().getTitle());

	}
	
	public static void clickElementusingprecedingsibling(String str) throws Exception {
		LaunchBrowser.getBrowser("chrome", "https://www.amazon.in/");
		List<WebElement> allfollowingsiblings = LaunchBrowser
				.findElements(By.xpath("//div[@id='nav-xshop']//a[text()='Best Sellers']/preceding-sibling::a"));
		for (WebElement ele : allfollowingsiblings) {
			if (ele.getText().equalsIgnoreCase(str)) {
				ele.click();
				System.out.println(LaunchBrowser.getDriver().getTitle());
			}
		}
		
		
	}
	public static void clickElementusingprecedingsibling() throws Exception {
		LaunchBrowser.getBrowser("chrome", "https://www.amazon.in/");
		List<WebElement> allfollowingsiblings = LaunchBrowser.findElements(By.xpath(
				"//div[@id='nav-xshop']//a[text()='Best Sellers']/preceding-sibling::a/span[text()='Fresh']"));
		allfollowingsiblings.get(0).click();
		System.out.println(LaunchBrowser.getDriver().getTitle());

	}

}
