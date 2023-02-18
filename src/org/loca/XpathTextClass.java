package org.loca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/login/");

		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Log in to Facebook')]"));
		
		String text2 = text.getText();
		
		System.out.println(text2);
		
		WebElement newBtn = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		
		newBtn.click();
		
		
	}

}
