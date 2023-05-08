package sales.legalentity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLegalEntity {
public static void main(String[] args) throws InterruptedException {
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
	WebElement searchbox = d.findElement(By.xpath("//input[@name='LegalEntity-search-input']"));
	searchbox.sendKeys("Salesforce Automation by Visnu", Keys.ENTER);
	Thread.sleep(2000);
	WebElement arrow = d.findElement(By.xpath("(//table//tr[1])[2]/td[5]//div"));
	arrow.click();
	Thread.sleep(2000);
	WebElement del = d.findElement(By.xpath("//div[text()='Delete']/.."));
	a.click(del).perform();
	d.findElement(By.xpath("//span[text()='Delete']/..")).click();
	WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(4));
	By search = By.xpath("//input[@name='LegalEntity-search-input']");
	wait.until(ExpectedConditions.presenceOfElementLocated(search));
	searchbox.clear();
	searchbox.sendKeys("Salesforce Automation by Visnu", Keys.ENTER);
	Thread.sleep(3000);
	WebElement msg = d.findElement(By.xpath("//span[text()='No items to display.']"));
	if(msg.isDisplayed()) {
		System.out.println(msg.getText());
		System.out.println("Delete confirmed");
	}
	else {
		System.out.println("Not deleted");
	}
}
}
