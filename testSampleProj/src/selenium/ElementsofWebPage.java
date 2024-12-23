package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsofWebPage {
	
	static WebDriver d =null;

	public static void main(String[] args) throws Exception {

		d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement title = d.findElement(By.xpath("//h1"));
		System.out.println(title.getText());
		WebElement fname = d.findElement(By.xpath("//input[@ng-model='FirstName']"));
		fname.sendKeys("Srikanth");
		String name = fname.getText();
		System.out.println(name);
		WebElement lname = d.findElement(By.xpath("//input[@ng-model='LastName']"));
		lname.sendKeys("Chincholi");
		System.out.println(lname.getTagName());
		WebElement txtarea = d.findElement(By.xpath("//textarea[@ng-model = 'Adress']"));
		txtarea.sendKeys("No 7/1, 142, Narayana Cross Road, Hyderabad, Nallagandla, Telangana 500019");
		WebElement email = d.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.sendKeys("srikanth.chincholi@gmail.com");
		d.findElement(By.xpath("//input[@value='Male']")).click();
		d.findElement(By.xpath("//input[@value='Cricket']")).click();
		d.findElement(By.xpath("//input[@value='Movies']")).click();
		
	}

}
