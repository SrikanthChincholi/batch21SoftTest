package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
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
}
