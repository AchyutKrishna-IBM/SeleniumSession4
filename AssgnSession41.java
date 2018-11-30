package com.ibm.seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssgnSession41 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
        WebElement searchEle=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(searchEle).click().sendKeys("Laptops").build().perform();
        WebElement submitEle=driver.findElement(By.xpath("//input[@type='submit']"));
        submitEle.click();
        Thread.sleep(3000);
        List<WebElement> links=driver.findElements(By.tagName("a"));
        int linksCount=links.size();
        System.out.println(linksCount);
        for(int i=1;i<linksCount;i++)
        {
        System.out.println(links.get(i).getAttribute("href"));
		System.out.println(links.get(i).getText());
	}

}
}
