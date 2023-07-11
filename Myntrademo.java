package seliniumproject13;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntrademo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),\"Men's Fashion\")]")).click();
		driver.findElement(By.xpath("//body/div[@id='content_wrapper']/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div")).click();
	WebElement search=	driver.findElement(By.xpath("//input[@id='inputValEnter']"));
	search.clear();
	search.sendKeys("shoes for men");
	Thread.sleep(3000);
	search.sendKeys(Keys.ENTER);
	

	}

}
