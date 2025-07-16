package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoforSome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Dt Hub Classes\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
				
		driver.get("https://www.google.com/");

	}

}
