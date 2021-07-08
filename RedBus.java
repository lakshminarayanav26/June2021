package LearnOops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement findFrom = driver.findElementByXPath("//input[@id='src']");
		findFrom.sendKeys("c");
		Thread.sleep(1000);
		findFrom.sendKeys(Keys.DOWN, Keys.ENTER);
		//findFrom.sendKeys(Keys.DOWN, Keys.ENTER);
		
		WebElement findTo = driver.findElementByXPath("//input[@id='dest']");
		findTo.sendKeys("b");
		Thread.sleep(2000);
		findTo.sendKeys(Keys.ENTER);
		
		driver.findElementByXPath("//input[@id='onward_cal']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//td[@class='next']/button").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//table[@class='rb-monthTable first last']//tr/td[text()='2']").click();
		driver.findElementByXPath("//button[@id='search_btn']").click();
		
		driver.findElementByXPath("//div[@class='close']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='close-primo']").click();
		
		
		String busesFound = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		
		System.out.println("total buses" + busesFound);
		
	}

}
