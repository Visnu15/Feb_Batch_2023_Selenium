package sales.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateOpp {
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
	WebElement opp = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]/.."));
	driver.executeScript("arguments[0].click()", opp);
	driver.findElement(By.className("forceActionLink")).click();
	WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
	name.sendKeys("Salesforce Automation by Visnu");
	String nameEntered = "Salesforce Automation by Visnu";
	System.out.println("Input: " + nameEntered);
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	driver.findElement(By.xpath("//button[text()='Today']")).click();
	driver.findElement(By.xpath("(//button[contains(@class,'combobox')])[1]")).click();
	driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	String text = driver.findElement(By.xpath("(//h1)[3]//lightning-formatted-text")).getText();
	System.out.println("Output: " + text);
	if(nameEntered.equals(text)) {
		System.out.println("Opportunity name verified same");
	}
	else {
		System.out.println("Opportunity name not verified same");	
	}
}
}
