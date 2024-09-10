package maven_irctc_project_1;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Book_ticket_window_Automation {
	@Test
	
	public void book_ticket() throws InterruptedException, IOException
	{
		
	System.setProperty(" webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Aditi Rana\\Selinium class\\maven_irctc_project\\Chrome_driver_jars\\chromedriver.exe");
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("LUCKNOW NR - LKO (LUCKNOW)");
	driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("SECUNDERABAD JN - SC (SECUNDERABAD)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).sendKeys("09/09/2024");
	File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./Screenshots_for_maven_project/Book_ticket_window.png"));
	Thread.sleep(4000);

	driver.quit();
}


		@Test
		public void pnr_status() throws InterruptedException, IOException
		{
			
		System.setProperty(" webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Aditi Rana\\Selinium class\\Selenium Practices\\Launch_chrome_browser\\Edge_Driver_Jars\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.indianrail.gov.in/enquiry/PNR/PnrEnquiry.html?locale=en");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputPnrNo")).sendKeys("2916459830");
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots_for_maven_project/PNR_Number_input1.png"));
		Thread.sleep(5000);
		driver.findElement(By.id("modal1")).click();
		Thread.sleep(10000);
		((JavascriptExecutor) driver).executeScript("window.scroll(0,300)");
		File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("./Screenshots_for_maven_project/PNR_Status1.png"));
		Thread.sleep(2000);
		driver.quit();
	}
}

