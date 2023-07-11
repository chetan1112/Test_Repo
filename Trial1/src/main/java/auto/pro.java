package auto;

import org.openqa.selenium.By;
//import java.util.*;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91899\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		

	}

}
