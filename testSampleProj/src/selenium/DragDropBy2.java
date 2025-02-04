package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropBy2 {

	public static void main(String[] args) throws Exception {

		LaunchBrowser.getBrowser("chrome", "https://jqueryui.com/slider/#custom-handle");
		LaunchBrowser.getDriver().switchTo().frame(0);
		Actions act = new Actions(LaunchBrowser.getDriver());
		int i = 0;
		while (true) {
			act.dragAndDropBy(
					LaunchBrowser.findElement(By.xpath("//div[@id='slider']/div[contains(@class,'ui-slider-handle')]")),
					i, 0).release().build().perform();
			WebElement ele = LaunchBrowser.findElement(By.xpath("//div[@id='custom-handle']"));
			if (ele.getText().equalsIgnoreCase("34"))
				break;
			i++;

		}

	}

}
