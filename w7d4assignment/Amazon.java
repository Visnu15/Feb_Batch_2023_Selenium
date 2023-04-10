package week7.day4.w7d4assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
    option.addArguments("--disable-notifications", "--start-maximized");
    ChromeDriver driver = new ChromeDriver(option);
    driver.get("https://www.amazon.in/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
    driver.findElement(By.xpath("//span[text()=' for boys']")).click();
    WebElement result = driver.findElement(By.xpath("(//div[contains(@class,'a-section a-spacing-small')])[1]"));
    System.out.println(result.getText());
    System.out.println("Total number of results: " + result.getText().replaceAll("[^50000]", ""));
    driver.findElement(By.xpath("//a/span[text()='Safari']")).click();
    driver.findElement(By.xpath("//a/span[text()='American Tourister']")).click();
    driver.findElement(By.xpath("//span[text()='Last 90 days']")).click();
    WebElement res = driver.findElement(By.xpath("(//h5/span[contains(@class,'a-size-base')])[1]"));
    System.out.println("Name of first resulting bag: " + res.getText());
    WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
    System.out.println("Discounted price of first resulting bag: " + price.getText());
    System.out.println(driver.getTitle());
    Thread.sleep(3000);
    driver.close();
}
}
