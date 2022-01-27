package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
private static WebDriver driver;
	
public static WebDriver getdriver() {


	System.setProperty("webdriver.chrome.driver", "./src/main/resources/webdriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
	driver.manage().window().maximize();
	
	return driver;

 }
public static void fecharNavegador() {
	driver.close();
	driver.quit();
	
 }

}