package com.sel.testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {

		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver_1.exe");

		WebDriver driver = new ChromeDriver();
		// Launch website
		driver.navigate().to("http://www.amazon.in/");

		// Click on the search text box and send value
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("flute");

		// Click on the search button
		driver.findElement(By.id("twotabsearchtextbox")).submit();

		driver.findElement(By.id("nav-link-accountList")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("anurag.ap6@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
		
		
	}
}
