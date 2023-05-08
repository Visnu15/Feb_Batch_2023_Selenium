package sales.account;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EditAccount {
public static void main(String[] args) throws InterruptedException, IOException {
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
	driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("Visnu", Keys.ENTER);
	//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	//By table = By.xpath("(//table//tr)[2]/td[5]/following-sibling::td//div/a");
	//w.until(ExpectedConditions.presenceOfElementLocated(table));
	Thread.sleep(3000);
	Actions a = new Actions(driver);
	driver.findElement(By.xpath("(//table//tr)[2]/td[5]/following-sibling::td//div/a")).click();
	driver.findElement(By.xpath("//div[text()='Edit']/..")).click();
	driver.findElement(By.xpath("//button[contains(@aria-label,'Type')]")).click();
	driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
	WebElement ind = driver.findElement(By.xpath("//button[contains(@aria-label,'Industry')]"));
	driver.executeScript("arguments[0].click()", ind);
	Thread.sleep(2000);
	WebElement hc = driver.findElement(By.xpath("//span[text()='Healthcare']"));
	a.scrollToElement(hc).click(hc).perform();
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]")).sendKeys("506, Rakiayappa street");
	driver.findElement(By.xpath("(//input[@name='city'])[1]")).sendKeys("Chennai");
	driver.findElement(By.xpath("(//input[@name='province'])[1]")).sendKeys("Tamilnadu");
	driver.findElement(By.xpath("(//input[@name='postalCode'])[1]")).sendKeys("600056");
	driver.findElement(By.xpath("(//input[@name='country'])[1]")).sendKeys("India");
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("506, Rakiayappa street");
	driver.findElement(By.xpath("(//input[@name='city'])[2]")).sendKeys("Chennai");
	driver.findElement(By.xpath("(//input[@name='province'])[2]")).sendKeys("Tamilnadu");
	driver.findElement(By.xpath("(//input[@name='postalCode'])[2]")).sendKeys("600056");
	driver.findElement(By.xpath("(//input[@name='country'])[2]")).sendKeys("India");
	WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(5));
	By priority = By.xpath("//button[contains(@aria-label,'Customer Priority')]");
	w1.until(ExpectedConditions.elementToBeClickable(priority));
	WebElement prior = driver.findElement(By.xpath("//button[contains(@aria-label,'Customer Priority')]"));
	a.click(prior).perform();
	driver.findElement(By.xpath("//span[text()='Low']")).click();
	driver.findElement(By.xpath("//button[contains(@aria-label,'SLA')]")).click();
	driver.findElement(By.xpath("//span[text()='Silver']")).click();
	WebElement active = driver.findElement(By.xpath("//button[contains(@aria-label,'Active')]"));
	driver.executeScript("arguments[0].click()", active);
	Thread.sleep(2000);
	//button[contains(@aria-label,'Active')]/../following-sibling::div//span/span[text()='No']
	WebElement op = driver.findElement(By.xpath("//span[text()='No']"));
	a.click(op).perform();
	WebElement phone = driver.findElement(By.xpath("//input[@name='Phone']"));
	phone.clear();
	phone.sendKeys("6548932170");
	WebElement up = driver.findElement(By.xpath("//button[contains(@aria-label,'Upsell Opportunity')]"));
	driver.executeScript("arguments[0].click()", up);
	Thread.sleep(2000);
	WebElement findElement = driver.findElement(By.xpath("(//span[text()='No'])[1]"));
	a.click(findElement).perform();
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	Thread.sleep(2000);
	WebElement phn = driver.findElement(By.xpath("(//table//tr)[2]/td[4]//span[contains(@class,'forceOutputPhone')]"));
	System.out.println(phn.getText());
	File screenshotAs = phn.getScreenshotAs(OutputType.FILE);
	File f = new File("./ss/phone.png");
	FileUtils.copyFile(screenshotAs, f);
}
}
