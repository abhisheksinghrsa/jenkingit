package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SmokeTest {
	@Test
	public void logintest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", 
	               "D:\\browser_driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.rediff.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
	Thread.sleep(5);
	driver.quit();
	
		
	}

}
