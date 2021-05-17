package demoScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dem0 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.twitter.com/login");
		driver.findElement(By.xpath("//input[@name='session[username_or_email]']")).sendKeys("isiaq.tesleem.68@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("harintunde");
		driver.findElement(By.xpath("//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-b88u0q r-1777fci r-ad9z0x r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0']")).click();

}
}