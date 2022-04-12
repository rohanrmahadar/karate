package com.skillenza.qa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
	
	public static void main(String[] args) {

		returnOrderOperations();
	}

	private static void returnOrderOperations() {
		
		String baseUrl;
		String result_str;	
		WebDriver driver;
		WebDriverWait wait;
		WebElement orderId;
		WebElement findOrder;
		WebElement result_div;
		WebElement returnThisProduct;
		String downloadFilePath=System.getProperty("user.dir")+"/results/";		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 60);
		baseUrl = "https://return-order-app.herokuapp.com/";
		driver.get(baseUrl);

		orderId=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order-id")));		
		orderId.clear();
		orderId.sendKeys("1257945872");
		findOrder=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Find Order')]")));		
		findOrder.click();
		returnThisProduct=wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Return This Product')]")));		
		returnThisProduct.click();		
		result_div=wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='result']")));
		result_str = result_div.getText();

		try {
			FileWriter myWriter = new FileWriter(downloadFilePath+"result.txt");
			myWriter.write(result_str);
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();
	}
}
