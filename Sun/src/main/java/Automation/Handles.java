package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		String b=driver.getWindowHandle();
		System.out.println(b+" Parent ID");
		//driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		//String b=driver.getWindowHandle();
		//System.out.println(b+" Parent ID");
		
		
		
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		
		Set<String> b1=driver.getWindowHandles();
		System.out.println(b1+" Parent ID + Child ID");
		
	}

}
