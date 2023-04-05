package week7.day2.w7d2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Lenskart {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications", "--start-maximized");
	ChromeDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.lenskart.com");
	WebElement glass = driver.findElement(By.linkText("COMPUTER GLASSES"));
	Actions action = new Actions(driver);
	action.moveToElement(glass).perform();
	WebElement kids = driver.findElement(By.xpath("(//span[text()='kids'])[2]"));
	action.moveToElement(kids).perform();
	driver.findElement(By.xpath("//span[text()='Kids Glasses']")).click();
}
}
