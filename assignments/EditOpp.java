package sales.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditOpp {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications", "--start-maximized");
	ChromeDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://login.salesforce.com");
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//button[contains(@class,'AppLauncherHeader')]")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	WebElement opp = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]/.."));
	driver.executeScript("arguments[0].click()", opp);
	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Salesforce Automation by Visnu", Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//table//tr[1])[2]/td//div[contains(@class,'forceVirtualActionMarker ')]/a")).click();
	Thread.sleep(2000);
	WebElement drop = driver.findElement(By.xpath("(//div[text()='Edit'])[1]"));
	driver.executeScript("arguments[0].click()", drop);
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	String text = driver.findElement(By.xpath("//h2[contains(@id,'month-title')]")).getText();
	while(!text.equals("May")) {
    driver.findElement(By.xpath("//button[@title='Next Month']")).click();
    text = driver.findElement(By.xpath("//h2[contains(@id,'month-title')]")).getText();
	}
	driver.findElement(By.xpath("(//td/span[text()='2'])[1]")).click();
	driver.findElement(By.xpath("(//button[contains(@aria-label,'Stage')])[1]")).click();
	driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
	WebElement status = driver.findElement(By.xpath("(//button[contains(@aria-label,'Delivery')])[1]"));
	driver.executeScript("arguments[0].click()", status);
	WebElement state = driver.findElement(By.xpath("(//span[text()='In progress'])[1]"));
	driver.executeScript("arguments[0].click()", state);
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]")).sendKeys("SalesForce");
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	Thread.sleep(2000);
	String status2 = driver.findElement(By.xpath("(//table//tr[1])[2]/td//span[@class='slds-truncate']")).getText();
	System.out.println("Satus: " + status2);
}
}







// (//table//tr[1])[2]/td//div[contains(@class,'forceVirtualActionMarker ')]

