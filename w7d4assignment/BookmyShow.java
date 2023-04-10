package week7.day4.w7d4assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BookmyShow {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--start-maximized", "--disable-notifications");
	ChromeDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://in.bookmyshow.com/");
	driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad");
	driver.findElement(By.xpath("//strong[text()='Hyderabad']")).click();
	String expectedTitle = "Movie Tickets, Plays, Sports, Events & Cinemas near Hyderabad - BookMyShow";
	String actualTitle = driver.getTitle();
	System.out.println("Expected: " + expectedTitle);
	System.out.println("Actual: " + actualTitle);
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("Title same confirmed");
	}
	else {
		System.out.println("Title not same");
	}
	String currentUrl = driver.getCurrentUrl();
	System.out.println("URL: " + currentUrl);
	if(currentUrl.contains("hyderabad")) {
		System.out.println("URL confirmed. Loaded with Hyderabad.");
	}
	else {
		System.out.println("URL not confirmed");
	}
	driver.findElement(By.xpath("//span[contains(text(),'Search for Movies')]")).click();
	driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Movies')]")).sendKeys("Dasara");
	driver.findElement(By.xpath("//strong[text()='Dasara']")).click();
	driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
	String theatre = driver.findElement(By.xpath("(//a[@class='__venue-name'])[1]")).getText();
	System.out.println(theatre);
	driver.findElement(By.xpath("(//div[text()='INFO'])[1]")).click();
	List<WebElement> facilities = driver.findElements(By.xpath("//div[@class='facility-text']"));
	List<String> fac = new ArrayList<String>();
	for (WebElement facility : facilities) {
		fac.add(facility.getText());
	}
	String facAvail = fac.toString();
	System.out.println(facAvail);
	if(facAvail.contains("Parking")) {
		System.out.println("Parking facility is available");
	}
	else {
		System.out.println("Parking facility is not available");
	}
	driver.findElement(By.className("cross-container")).click();
	driver.findElement(By.xpath("(//div[contains(text(),'10:20 PM')])[1]")).click();
	driver.findElement(By.id("btnPopupAccept")).click();
	driver.findElement(By.xpath("//li[text()='1']")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Select Seats')]")).click();
	Thread.sleep(3000);
	WebElement seat = driver.findElement(By.xpath("//a[contains(@onclick,'B_15_0221')]"));
	driver.executeScript("arguments[0].scrollIntoView();", seat);
	seat.click();
	driver.findElement(By.xpath("(//a[text()='Pay '])[1]")).click();
	Thread.sleep(2000);
	String total = driver.findElement(By.xpath("//span[@id='subTT']")).getText();
	System.out.println("Subtotal: " + total);
}  
}
