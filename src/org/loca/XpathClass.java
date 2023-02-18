package org.loca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/login/");

		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		email.sendKeys("velaneee.trt@gmail.com");
		
		WebElement element = driver.findElement(By.xpath("//input[@name='pass']"));
		
		element.sendKeys("velanuma746");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		login.click();
		
	}

}
