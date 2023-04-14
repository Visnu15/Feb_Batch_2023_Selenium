package week8.day2.w8d2assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Amazon {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--start-maximized", "--disable-notification");
	ChromeDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro ",Keys.ENTER);
	Thread.sleep(3000);
	WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
    String all = price.getText().replaceAll("[^0-9]", "");
	System.out.println("Price of the first product: " + all);
	Thread.sleep(3000);
	String rating = driver.findElement(By.xpath("(//span[contains(@class,'s-underline')])[1]")).getText();
	System.out.println("No. of customer ratings: " + rating);
	
	try {
	driver.findElement(By.xpath("//span[text()='RESULTS']"));
	driver.findElement(By.xpath("(//span[contains(@class,'a-text-normal')])[2]")).click();
	}
	catch(Exception e) {
	driver.findElement(By.xpath("(//span[contains(@class,'a-text-normal')])[1]")).click();
	}

	Set<String> windows = driver.getWindowHandles();
	List<String> w = new ArrayList<String>(windows);
	driver.switchTo().window(w.get(1));
	WebElement phn = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']/img"));
	File ss = phn.getScreenshotAs(OutputType.FILE);
	String dest = "./ss/phn.jpg";
	File file = new File(dest);
	FileUtils.copyFile(ss, file);
	driver.findElement(By.id("add-to-cart-button")).click();
	Thread.sleep(9000);
	WebElement sub = driver.findElement(By.id("attach-accessory-cart-subtotal"));
	String subtotal = sub.getText().replaceAll("[^0-9 .]", "");
	System.out.println("Subtotal: " + subtotal);
	if(subtotal.contains(all)) {
		System.out.println("Price and subtotal verified same");
	}
	else {
		System.out.println("Price and subtotal not same");
	}
	Thread.sleep(3000);
	driver.quit();
}
}
