package selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumApplicationTest {

	@Test
	public void seleniumTestDemo()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranoti Kulkarni\\Desktop\\PranuTesting\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium Java");
	driver.findElement(By.className("gNO89b")).click();
	}
}
