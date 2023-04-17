package week9.day1.w9d1assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BuyTheValue {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--start-maximized", "--disable-notifications");
	ChromeDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://buythevalue.in/");
	Thread.sleep(4000);
	WebElement electronics = driver.findElement(By.xpath("//a[@title='ELECTRONICS']"));
	Actions action = new Actions(driver);
	action.moveToElement(electronics).perform();
	Thread.sleep(1000);
	WebElement computer = driver.findElement(By.xpath("(//a[@title='Computers & Accessories'])[1]"));
	action.moveToElement(computer).perform();
	WebElement acc = driver.findElement(By.xpath("(//a[@title='Computer Accessories'])[1]"));
	action.moveToElement(acc).perform();
	driver.findElement(By.xpath("(//a[@title='Mouse'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label/span[text()='Mouse']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Zebronics']")).click();
	Thread.sleep(2000);
	List<WebElement> zeb = driver.findElements(By.xpath("//span[@class='special-price']"));
	List<Double> list = new ArrayList<Double>();
	double maxprice = 0;
	WebElement maxele = null;
	for (WebElement webElement : zeb) {
		String text = webElement.getText().replaceAll("[^0-9 .]", "");
		System.out.println(text);
		double d = Double.parseDouble(text);
		list.add(d);
		if(d>maxprice) {
			maxprice = d;
			maxele = webElement;
		}
	}
	System.out.println(list);
	Double max = Collections.max(list);
	System.out.println("Max price: " + max);
	File screenshotAs = maxele.getScreenshotAs(OutputType.FILE);
	File file = new File("./ss/max.jpg");
	FileUtils.copyFile(screenshotAs, file);
	Thread.sleep(2000);
	driver.close();
}
}
