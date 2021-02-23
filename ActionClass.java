package com.selenium.features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.co.uk/");
		WebElement target=driver.findElement(By.xpath("//div[@class='header-navigation-left']/ul/li[3]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(target).perform();
		driver.findElement(By.xpath("//div[@id='CLOTHFOOTW_1']/ul/li[2]/ul/li[4]/a/span")).click();

	}

}
