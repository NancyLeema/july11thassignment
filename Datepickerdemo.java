package seliniumproject11;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Datepickerdemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.seleniumeasy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/a")).click();
		driver.findElement(By.id("from")).click();
		WebElement month=driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]"));
		Select m=new Select(month);
		m.selectByValue("4");
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'2023')]")).click();
		
		driver.findElement(By.id("to")).click();
		WebElement month1=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select"));
		Select m1=new Select(month1);
		m1.selectByValue("6");
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a")).click();
	
	   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span")).click();
	   TakesScreenshot src1shot=(TakesScreenshot)driver;
		File src1=src1shot.getScreenshotAs(OutputType.FILE);
		File des1=new File("C:\\Users\\Admin\\Desktop\\screenshot\\snapshot.jpg");
		FileHandler.copy(src1, des1);
		driver.quit();
		
		
	}

}
