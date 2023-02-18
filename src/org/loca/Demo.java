package org.loca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		
		register.click();
		
		WebElement firstname = driver.findElement(By.id("//input[@placeholder='First Name']"));
		firstname.sendKeys("Velan");
		
		//WebElement LastName = driver.findElement(By.name("Last Name"));
		//LastName.sendKeys("Mani");
		
		
	}

}
