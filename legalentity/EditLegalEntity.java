package sales.legalentity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EditLegalEntity {
	public static void main(String[] args) throws InterruptedException{
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
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@name='LegalEntity-search-input']")).sendKeys("Salesforce Automation by Visnu", Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("((//table)[1]//tr[1])[2]/td[5]//div")).click();
		WebElement edit = d.findElement(By.xpath("//div[text()='Edit']"));
		a.click(edit).perform();
		WebElement company = d.findElement(By.xpath("//input[@name='CompanyName']"));
		company.clear();
		company.sendKeys("Testleaf");
		WebElement desc = d.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
		desc.clear();
		desc.sendKeys("Salesforce");
		d.findElement(By.xpath("//button[contains(@aria-label,'Status')]")).click();
		d.findElement(By.xpath("//span[text()='Active']")).click();
		d.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("((//table)[1]//tr[1])[2]/th//a")).click();
		String text = d.findElement(By.xpath("//p[text()='Status']/..//slot/lightning-formatted-text")).getText();
		System.out.println(text);
		if(text.equals("Active")) {
			System.out.println("Edit success");
		}
		else {
			System.out.println("Edit not success");
		}
}
}
