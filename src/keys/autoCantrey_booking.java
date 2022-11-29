package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class autoCantrey_booking {



	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rami\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.booking.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.id("ss")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("ss")).sendKeys("irbid"+ Keys.ENTER);
		
		

	}

}
