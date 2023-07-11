package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static <WebElement> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91899\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registraction-from-button']")).click();
		Thread.sleep(3000);
		
		//First way 
		@SuppressWarnings("unchecked")
		List<WebElement> birthMonth= (List<WebElement>) driver.findElement(By.xpath("//select[@id='month']"));
		System.out.println("Total drop values" + birthMonth.size() );
		
		

	}

}
