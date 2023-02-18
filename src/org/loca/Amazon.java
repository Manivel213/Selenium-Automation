package org.loca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=74238127911&hvpone=&hvptwo=&hvadid=610644609009&hvpos=&hvnetw=g&hvrand=14876805249254699316&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303202&hvtargid=kwd-29089120&hydadcr=5496_2359482&gclid=EAIaIQobChMImLr8sZGT_QIVTXmLCh2ljQFbEAAYASAAEgIiGPD_BwE");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("twotabsearchtextbox"));
		
		email.sendKeys("iphone");
		
		WebElement login = driver.findElement(By.id("nav-search-submit-button"));
		
		login.click();
	}

}
