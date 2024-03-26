package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangecrm.com/");
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle' and @data-toggle='dropdown'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='/orange-banking.php']")).click();
		
		
		
		
		//driver.findElement(By.xpath("[@id=\\\"example-navbar-collapse\\\"]/ul/li[2]/ul/li[2]/a"));
		//Select drpdwn = new Select(driver.findElement(By.xpath("[@id=\"example-navbar-collapse\"]/ul/li[2]/ul/li[2]/a")));
		// drpdwn.selectByValue("Warehouse 2 (Los Angeles)");
	}

}
