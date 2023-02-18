package org.loca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailPage {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-2013245829%3A1676313090426530&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHcOhFzsm7iRjr7vdGjuErSZaLLVlHdsiC4lJ0L-65abDHqJ6TlCYKA_cUwi6AgJwhx2STWqgg");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("velaneee.trt@gmail.com");
		
		WebElement passwd = driver.findElement(By.name("pass"));
		
		passwd.sendKeys("veknajbaj");
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
	}

}
