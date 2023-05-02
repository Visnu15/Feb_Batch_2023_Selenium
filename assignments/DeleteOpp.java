package sales.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteOpp {
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
	WebElement del = driver.findElement(By.xpath("(//div[text()='Delete'])[1]"));
	driver.executeScript("arguments[0].click()", del);
	driver.findElement(By.xpath("//span[text()='Delete']")).click();
	Thread.sleep(2000);
	WebElement search = driver.findElement(By.xpath("//input[@class='slds-input']"));
	search.clear();
	search.sendKeys("Salesforce Automation by Visnu", Keys.ENTER);
	WebElement msg = driver.findElement(By.xpath("//span[text()='No items to display.']"));
    boolean no = msg.isDisplayed();
    System.out.println(msg.getText());
    if(no == true) {
    	System.out.println("Deleted successfully");
    }
    else {
    	System.out.println("Not deleted");
    }
}
}
