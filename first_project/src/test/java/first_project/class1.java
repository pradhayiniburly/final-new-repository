package first_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class class1 {
	@Test
	public void open_driver ()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b8c.07.19\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("pradhayiniburly");
	driver.findElement(By.id("password")).sendKeys("Git@123");
	driver.findElement(By.name("commit")).click();
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "GitHub");
	System.out.println("Testing Continues");
	
	}

}
