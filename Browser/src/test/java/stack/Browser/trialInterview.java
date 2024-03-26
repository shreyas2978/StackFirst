package stack.Browser;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class trialInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shrey\\Downloads\\Driver\\chromedriver.exe");
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		//co.setBinary("C:\\Users\\Shrey\\Downloads\\chrome-win64\\chrome-win6\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com"); 	
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//.sendKeys("Iphone");
		 searchBox.sendKeys("Iphone");
		
		System.out.println("****************************************"+searchBox);
		//searchBox.click();
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement nextbtn=driver.findElement(By.xpath("//a[@aria-label=\"Go to next page, page 2\"]"));
	js.executeScript("arguments[0].scrollIntoView()", nextbtn);

	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	nextbtn.click();
	
	String Homebtn=driver.findElement(By.xpath("//a[@href=\"/ref=nav_logo\"]")).getText();
	System.out.println("Value inside "+Homebtn);
	driver.findElement(By.xpath("//a[@href=\"/ref=nav_logo\"]")).click();
	
	List<WebElement> Links= driver.findElements(By.xpath("//div[@id=\"navbar\"]"));
	
	for (WebElement  allLinks: Links) {
		
		String linkText= allLinks.getText();
		System.out.println(linkText);
		
	}
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	
//	
//	WebElement GA=driver.findElement(By.xpath("//h2[text()='Gaming accessories']"));
//	js.executeScript("arguments[0].scrollintoView()", GA);
//	
//	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//	
//	GA.getText();
//	
//	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//	
//	driver.findElement(By.xpath("//img[@src=\"https://m.media-amazon.com/images/I/61SejhzH8-L._AC_UL320_.jpg\"]")).click();
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//driver.findElement(By.xpath("//a[@href=\"/ref=nav_logo\"]")).click();
//	
	
	driver.findElement(By.xpath("//a[@href=\"/gp/goldbox?ref_=nav_cs_gb\"]")).click();
	
	
	driver.findElement(By.xpath("//span[text()='Books'])[2]")).click();
	
	//driver.close()
	//span[text()='Books'])[2]
	
	
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		

		
}
}
