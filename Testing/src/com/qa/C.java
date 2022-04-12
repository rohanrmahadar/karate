package com.qa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Rohan\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
			
		Actions actions=new Actions(driver);
		WebElement from=driver.findElement(By.xpath("//span[contains(text(),'From')]"));
		
		actions.moveToElement(from).perform();
		from.click();
		from.sendKeys("Pune");

		driver.findElement(By.xpath("//p[contains(text(),'Pune, India')]")).click();

		WebElement to=driver.findElement(By.id("toCity"));
		actions.moveToElement(to).perform();
		to.click();
		to.sendKeys("Mumbai");

		driver.findElement(By.xpath("//p[contains(text(),'Mumbai, India')]")).click();

		WebElement departure=driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
		actions.moveToElement(departure).perform();
		departure.click();
		
		WebElement departureDate=driver.findElement(By.xpath("//div[@class='dateInnerCell']/p[text()='12']/following-sibling::p[text()='10039']"));

		departureDate.click();

		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();

		List<WebElement>  li=driver.findElements(By.xpath("//div[@class='fli-list  simpleow ']"));

		System.out.println(li.size());
		
	}

}
