package week8.day2.w8d2assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
public static void main(String[] args) throws IOException, InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--start-maximized", "--disable-notifications");
	ChromeDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.snapdeal.com/");
	Actions action = new Actions(driver);
	WebElement men = driver.findElement(By.xpath("(//span[contains(text(),'Fashion')])[1]"));
	action.moveToElement(men).perform();
	driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
	String count = driver.findElement(By.xpath("//span[contains(@class,'category-count')]")).getText();
	System.out.println("Total sports shoes: " + count.replaceAll("[^0-9]", ""));
	driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
	driver.findElement(By.xpath("//span[@class='sort-label']")).click();
	driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
	Thread.sleep(3000);
	List<WebElement> prices = driver.findElements(By.xpath("//span[contains(@class,'product-price')]"));
	for (WebElement price : prices) {
		String p = price.getText().replaceAll("[^0-9]", "");
		System.out.print(p + " ");
	}
	System.out.println();
	Thread.sleep(3000);
	WebElement navy = driver.findElement(By.xpath("//label[@for='Color_s-Navy']"));
	Thread.sleep(3000);
	action.moveToElement(navy).click().perform();
	Thread.sleep(3000);
	WebElement scroll = driver.findElement(By.xpath("//span[text()='Did you find what you are looking for? ']"));
	action.scrollToElement(scroll).perform();
	Thread.sleep(3000);
	WebElement res = driver.findElement(By.xpath("//img[contains(@class,'product-image')]"));
	action.moveToElement(res).perform();
	driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
	String total = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
	System.out.println("Cost: " + total.replaceAll("[^0-9]", ""));
	String dis = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
	System.out.println("Discount: " + dis);
	WebElement pic = driver.findElement(By.xpath("//img[@itemprop='image']"));
	File screenshotAs = pic.getScreenshotAs(OutputType.FILE);
	File file = new File("./ss/shoes5.png");
	FileUtils.copyFile(screenshotAs, file);
	driver.findElement(By.xpath("(//i[contains(@class,'delete')])[4]")).click();
	Thread.sleep(3000);
	driver.close();
}
}
