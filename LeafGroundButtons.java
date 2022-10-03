package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButtons {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']//parent::button")).click();
		String pgtitle = driver.getTitle();
		System.out.println("Page Title is "+pgtitle);
		driver.navigate().back();
		WebElement e = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		boolean actualValue = e.isEnabled();
		if (actualValue)
			System.out.println("Button is enabled");
		else
			System.out.println("Button is disabled");
		Point location = driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
		int x=location.getX();
		int y=location.getY();
		System.out.println(x);
		System.out.println(y);
		
		String css = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("color");
		System.out.println(css);
		
		Point location1 = driver.findElement(By.id("j_idt88:j_idt98")).getLocation();
		int a=location1.getX();
		int b=location1.getY();
		System.out.println(a);
		System.out.println(b);
		
}
}