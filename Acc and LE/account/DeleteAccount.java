package sales.account;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteAccount {
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
	WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
	driver.executeScript("arguments[0].click()", accounts);
	WebElement search = driver.findElement(By.xpath("//input[@name='Account-search-input']"));
	search.sendKeys("Visnu", Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//table//tr)[2]/td[5]/following-sibling::td//div/a")).click();
	driver.findElement(By.xpath("//div[text()='Delete']/..")).click();
	driver.findElement(By.xpath("//span[text()='Delete']")).click();
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	By box = By.xpath("//input[@name='Account-search-input']");
	w.until(ExpectedConditions.presenceOfElementLocated(box));
	search.clear();
	search.sendKeys("Visnu", Keys.ENTER);
	Thread.sleep(3000);
	WebElement no = driver.findElement(By.xpath("//span[text()='No items to display.']"));
	if(no.isDisplayed()) {
		System.out.println(no.getText());
		System.out.println("Account deleted");
	}
	else {
		System.out.println("Account not deleted");
	}
}
}
