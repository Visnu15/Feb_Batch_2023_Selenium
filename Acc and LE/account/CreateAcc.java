package sales.account;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAcc {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications", "--start-maximized");
	ChromeDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://login.salesforce.com");
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//button[contains(@class,'AppLauncherHeader')]")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
	driver.executeScript("arguments[0].click()", accounts);
	driver.findElement(By.xpath("//div[text()='New']/..")).click();
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Visnu");
	driver.findElement(By.xpath("//button[contains(@aria-label,'Ownership')]")).click();
	driver.findElement(By.xpath("//span[text()='Public']")).click();
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	String name = "Visnu";
	String text = driver.findElement(By.xpath("//div[contains(@class,'outputName')]/lightning-formatted-text")).getText();
	if(name.equals(text)) {
		System.out.println("Account name verified same");
	}
	else {
		System.out.println("Account name not verified");
	}
}
}
