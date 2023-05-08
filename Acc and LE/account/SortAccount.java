package sales.account;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SortAccount {
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
	WebElement sort = driver.findElement(By.xpath("//table//tr/th[3]//a/span[1]"));
	Actions a = new Actions(driver);
	a.click(sort).perform();
	Thread.sleep(3000);
	List<WebElement> rows = driver.findElements(By.xpath("//table//tbody/tr"));
	int size = rows.size();
	for (int i = 1; i < size+1; i++) {
		String text = driver.findElement(By.xpath("//table//tbody/tr["+i+"]/th//a")).getText();
		System.out.println(text);
	}
}
}
