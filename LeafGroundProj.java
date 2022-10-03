package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundProj {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Indira");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).clear();
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("Chennai");
		System.out.println(driver.findElement(By.id("j_idt88:j_idt93")).isEnabled());

//		boolean Isenabled = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
//		if (Isenabled) {
//			System.out.println("Text is enabled");
//		}
//		else {
//			System.out.println("Text is disabled");
//		}
			driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']")).clear();
			String text = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getText();
			System.out.println(text);
			driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("xyz@gmail.com", Keys.TAB);
			driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("This is Indira Priyadarshini");
			driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
			String errmsg = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
			System.out.println(errmsg);
			if(errmsg.contains("Age is mandatory")) {
				System.out.println("Error message confirmed");
			}
			else {
				System.out.println("error message not confirmed");
			}
			Point location = driver.findElement(By.xpath("//label[text()='Username']//preceding-sibling::input")).getLocation();
			int x = location.getX();
			int y = location.getY();
			System.out.println(x);
			System.out.println(y);
			
		

}
}