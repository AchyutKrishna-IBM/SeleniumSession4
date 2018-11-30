package com.ibm.seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnSession4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		int salary=0;
		String salEl1=null;
		driver.manage().window().maximize();
		driver.get("https://datatables.net");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		int rowsCount=rows.size();
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='example']/tbody/tr[1]/td"));
		int colsCount=cols.size();
		for(int i=1;i<=rowsCount;i++)
		{
	    WebElement cellEle=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]"));
		cellEle.click();
		WebElement cellEle1=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+(i+1)+"]/td/descendant::span[2]"));
        salEl1=cellEle1.getText().trim();
        salEl1= salEl1.replace("$", "").replace(",", "");
        System.out.println(salEl1);
        salary=salary+Integer.parseInt(salEl1);
        cellEle.click();
		}
		System.out.println("Total Salry:"+salary);
		
}

}

