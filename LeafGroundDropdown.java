package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	//launch the browser
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://leafground.com/select.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	Select dd = new Select(dropdown);	
	dd.selectByVisibleText("Selenium");
	
	Thread.sleep(3000);
	
	WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='j_idt87:country_input']"));
	Select dd1 = new Select(dropdown1);
	dd1.selectByValue("USA");
	
	Thread.sleep(3000);


	
}
}
