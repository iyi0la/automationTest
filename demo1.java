package demoScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Oppo")).click();
		driver.navigate().to("https://facebook.com");
		Thread.sleep(4000);
		driver.navigate().back();
		

	}

}
