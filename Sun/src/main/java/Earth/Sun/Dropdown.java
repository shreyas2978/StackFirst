package Earth.Sun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FCustomer%2FList");
			//driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
			//driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
			Select drpdwn = new Select(driver.findElement(By.xpath("//select[@id='SearchMonthOfBirth']")));
			drpdwn.selectByValue("9");
			Select dropdwn = new Select(driver.findElement(By.xpath("//select[@id='SearchDayOfBirth']")));
			dropdwn.selectByValue("1");
	}

}
