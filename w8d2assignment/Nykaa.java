package week8.day2.w8d2assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--start-maximized", "--disable-notifications");
	ChromeDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.nykaa.com/");
	WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
	Actions action = new Actions(driver);
	action.moveToElement(brand).perform();
	driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
	driver.findElement(By.linkText("L'Oreal Paris")).click();
	String title = driver.getTitle();
	System.out.println("Title: " + title);
	if(title.contains("L'Oreal Paris")) {
		System.out.println("Title contains L'Oreal Paris");
	}
	driver.findElement(By.xpath("//span[@class='sort-name']")).click();
	driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
	driver.findElement(By.xpath("//span[text()='Category']")).click();
	Thread.sleep(4000);
	WebElement hair = driver.findElement(By.xpath("//span[text()='Hair']"));
	action.click(hair).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
	driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
	driver.findElement(By.xpath("//span[text()='Concern']")).click();
	driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
    List<WebElement> filters = driver.findElements(By.xpath("//span[@class='filter-value']"));
	for (WebElement filter : filters) {
		String text = filter.getText();
		if(text.contains("Shampoo")) {
			System.out.println("Filter is applied with shampoo");
		}
	}
	Thread.sleep(3000);
	WebElement product = driver.findElement(By.xpath("//div[contains(text(),'Oreal Paris Colour')]"));
	action.moveToElement(product).click().perform();
	Set<String> window = driver.getWindowHandles();
	List<String> win = new ArrayList<String>(window);
	driver.switchTo().window(win.get(1));
	WebElement size = driver.findElement(By.xpath("//select[@title='SIZE']"));
	Select drop = new Select(size);
	drop.selectByValue("0");
	String text = driver.findElement(By.xpath("(//span[contains(text(),'₹')])[1]")).getText();
	System.out.println("MRP of the product: " + text);
	driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	WebElement frame = driver.findElement(By.xpath("//iframe[contains(@src,'/mobileCartIframe')]"));
	driver.switchTo().frame(frame);
	String total = driver.findElement(By.xpath("//div[contains(@class,'footer-layout')]//div//div/span")).getText();
	System.out.println("Grand total of the product: " + total);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	driver.findElement(By.xpath("(//img[contains(@src,'Payments/Clear')])[1]")).click();
	String total2 = driver.findElement(By.xpath("//p[contains(text(),'₹')]")).getText();
	System.out.println("Total after continuing as guest: " + total2);
	if(total.equals(total2)) {
		System.out.println("Grand total is same");
	}
	else {
		System.out.println("Grand total mismatch");
	}
	Thread.sleep(3000);
	driver.quit();
}
}
