package week7.day2.w7d2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications", "--start-maximized");
	ChromeDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
	Actions action = new Actions(driver);
	action.moveToElement(fashion).perform();
	WebElement men = driver.findElement(By.linkText("Men's Top Wear"));
	action.moveToElement(men);
	driver.findElement(By.linkText("Men's T-Shirts")).click();
	WebElement min = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
	Select price = new Select(min);
	price.selectByValue("500");
}
}

