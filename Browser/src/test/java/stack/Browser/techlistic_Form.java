package stack.Browser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class techlistic_Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdiver.chome.driver", "C:\\Users\\Shrey\\Downloads\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shrey\\Downloads\\Driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		//Alert al= new Alert();
		
		
		String title= driver.getTitle();
		System.out.println("+++++++++++++++TITLE OF PAGE++++++++++++++++++++"+title);
		
		driver.manage().window().maximize();
		
		WebElement wl=driver.findElement(By.xpath("//h1[text()='Selenium - Automation Practice Form']"));
		String text=wl.getText();
		
		System.out.println("++++++++++++++++++TEXT OF A ELEMENT++++++++++++++++++++"+text);
		
		
		WebElement allDashboardEle=driver.findElement(By.xpath("//div[@class=\"row d-flex justify-content-center logindiv bg-white rounded\"]"));
		String a=allDashboardEle.getText();
		System.out.println("___________________All ELEMENTS _________________________"+a);
		
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Ram");
		
		driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]")).sendKeys("Ram@gmail.com");
		
		driver.findElement(By.xpath("//input[@name=\"gender\"]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).sendKeys("9858621156");
		
		driver.findElement(By.xpath("//input[@id=\"dob\"]")).sendKeys("17-09-1995");
		
		driver.findElement(By.xpath("//input[@id=\"subjects\"]")).sendKeys("English");
		
		driver.findElement(By.xpath("//input[@id=\"hobbies\"]")).click();
		
		driver.findElement(By.xpath("//label[text()='Reading']/preceding-sibling::input[@type=\"checkbox\"]")).click();
		
		driver.findElement(By.xpath("//label[text()='Music']")).click();
		
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("F:\\automation\\TestFile.docx");
		
		WebElement state= driver.findElement(By.xpath("//select[@id=\"state\"]"));
		
		Select dd=new Select(state);	
		dd.selectByValue("Uttar Pradesh");
		
		WebElement city= driver.findElement(By.xpath("//select[@id=\"city\"]"));
		
		Select dc=new Select(city);	
		dc.selectByValue("Agra");
		
		driver.findElement(By.xpath("//textarea[@placeholder=\"Currend Address\"]")).sendKeys("Pune");
		
		
		//driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();

		
		driver.findElement(By.xpath("//button[@aria-controls=\"collapseThree\"]")).click();
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//a[@href=\"browser-windows.php\"]")).click();
		
		String firstwindow= driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		
		Thread.sleep(1000);
		Set<String> windows= driver.getWindowHandles();
		
		
		for (String handle : windows) {
			
			if(!handle.equals(firstwindow)) {
				driver.switchTo().window(handle);
				
			WebElement insideW=	driver.findElement(By.xpath("//h1[text()='New Window']"));
		String text1=insideW.getText();
		
		System.out.println("=========================================="+text1);
				String IN=driver.getTitle();
				
				
				
				System.out.println("==============Inside 2 window===================="+IN);
				Thread.sleep(100);
				//driver.quit();
				driver.close();
			}
			
			
		}
		
		driver.switchTo().window(firstwindow);
	driver.findElement(By.xpath("//button[text()='New Tab']")).click();
	Set<String>WindowTab=driver.getWindowHandles();
	
	for (String Tab : WindowTab) {
		driver.switchTo().window(Tab);
		WebElement web=driver.findElement(By.xpath("//div[@class=\"row d-flex justify-content-center logindiv bg-white rounded\"]"));
		
		String text2=web.getText();
		
		System.out.println("=-=-=-=-=+++++-===+++++_+_++++++++++"+text2);
		

		
		
	}
	driver.close();
	
	driver.switchTo().window(firstwindow);
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[@href=\"frames.php\"]")).click();
	
	
	
	//driver.switchTo().frame(driver.findElement(By.id("")))
		
		
	}

}
