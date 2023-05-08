package sales.legalentity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LEWithoutManField {
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
		d.findElement(By.xpath("//a[contains(@title,'Legal Entities')]/following-sibling::one-app-nav-bar-item-dropdown")).click();
		WebElement n = d.findElement(By.xpath("//span[text()='New Legal Entity']"));
		d.executeScript("arguments[0].click()", n);
		WebElement company = d.findElement(By.xpath("//input[@name='CompanyName']"));
		company.sendKeys("Testleaf");
		WebElement desc = d.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
		desc.sendKeys("Salesforce");
		d.findElement(By.xpath("//button[contains(@aria-label,'Status')]")).click();
		d.findElement(By.xpath("//span[text()='Active']")).click();
		d.findElement(By.xpath("//button[text()='Save']")).click();
		WebElement alert = d.findElement(By.xpath("//div[contains(@id,'help-message')]"));
		if(alert.isDisplayed()) {
			String text = d.findElement(By.xpath("//ul[contains(@class,'errorsList')]//a")).getText();
			System.out.println("Missing fields: " + text);
			System.out.println(alert.getText());
			System.out.println("Alert message displayed in the missing fields");
		}
		else {
			System.out.println("All fields are filled");
		}
}
}
