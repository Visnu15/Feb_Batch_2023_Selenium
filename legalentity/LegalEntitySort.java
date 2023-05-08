package sales.legalentity;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LegalEntitySort {
	public static void main(String[] args) throws IOException, InterruptedException{
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
		WebElement last = d.findElement(By.xpath("//span[text()='Last Modified Date']/.."));
		last.click();
		Thread.sleep(3000);
		a.click(last).perform();
		Thread.sleep(3000);
		WebElement table = d.findElement(By.xpath("//div[contains(@class,'listViewContent')]"));
		File ss = table.getScreenshotAs(OutputType.FILE);
		File f = new File("./ss/verify1.png");
		FileUtils.copyFile(ss, f);
}
}