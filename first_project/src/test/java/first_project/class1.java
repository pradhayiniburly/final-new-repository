package first_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class1 {
	@Parameters("browser")
	@Test
	public void open_driver(String value)
	{
		WebDriver driver=null;
		if(value.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b8c.07.19\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(value.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_b8c.07.19\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		} 
				
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
