package app_hooks;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Manager {



	private static ThreadLocal<WebDriver> threadlocal = new ThreadLocal<>();	

	public static WebDriver intializeDriver(String browser) {
		System.out.println("Browser is : "+ browser);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			threadlocal.set(new ChromeDriver());
		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			threadlocal.set(new FirefoxDriver());
		} else if (browser.equals("Safari")) {
			WebDriverManager.safaridriver().setup();
			threadlocal.set(new SafariDriver());
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			threadlocal.set(new EdgeDriver()); 
		} else {
			System.out.println("Please enter correct browser: " + browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		return getDriver();


	}

	public static synchronized WebDriver getDriver() {
		return threadlocal.get();

	}
}



