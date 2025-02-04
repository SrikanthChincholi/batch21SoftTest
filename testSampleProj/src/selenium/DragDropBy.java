package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class DragDropBy {

	public static void main(String[] args) throws Exception {

		LaunchBrowser.getBrowser("chrome", "https://jqueryui.com/slider/#colorpicker");
		LaunchBrowser.getDriver().switchTo().frame(0);
		Actions act = new Actions(LaunchBrowser.getDriver());
		int i = 0;
		while (i < 10) {
			act.dragAndDropBy(
					LaunchBrowser.findElement(By.xpath("//div[@id='red']//span[contains(@class,'ui-slider-handle')]")),
					-i, 0).release().build().perform();
			act.dragAndDropBy(LaunchBrowser
					.findElement(By.xpath("//div[@id='green']//span[contains(@class,'ui-slider-handle')]")), -i, 0)
					.release().build().perform();
			act.dragAndDropBy(
					LaunchBrowser.findElement(By.xpath("//div[@id='blue']//span[contains(@class,'ui-slider-handle')]")),
					-i, 0).release().build().perform();
			i = i + 2;
			
		}

	}

}
