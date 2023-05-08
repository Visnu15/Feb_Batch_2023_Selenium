package sales.legalentity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class CreateLegalEntity {
public static void main(String[] args){
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications, --start-maximized");
	ChromeDriver d = new ChromeDriver(option);
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://login.salesforce.com");
	d.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	d.findElement(By.id("password")).sendKeys("Leaf@1234");
	d.findElement(By.id("Login")).click();
	d.findElement(By.xpath("//button[contains(@class,'AppLauncherHeader')]")).click();
	d.findElement(By.xpath("//button[text()='View All']")).click();
	Actions a = new Actions(d);
	WebElement le = d.findElement(By.xpath("//p[text()='Legal Entities']"));
	a.click(le).perform();
	//d.findElement(By.xpath("//div[contains(@title,'Legal Entities')]")).click();
	d.findElement(By.xpath("//a[contains(@title,'Legal Entities')]/following-sibling::one-app-nav-bar-item-dropdown")).click();
    //d.findElement(By.xpath("//div[text()='New']")).click();
	WebElement n = d.findElement(By.xpath("//span[text()='New Legal Entity']"));
	d.executeScript("arguments[0].click()", n);
	d.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Visnu");
	d.findElement(By.xpath("//button[text()='Save']")).click();
	String text = d.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
	System.out.println(text);
	String txt = "Salesforce Automation by Visnu";
	if(text.equals(txt)) {
		System.out.println("Legal entity name verified to be same");
	}
	else {
		System.out.println("Not verified");
	}
}
}
