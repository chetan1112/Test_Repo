package auto;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulaction {

	public static void main(String[] args) throws Exception {
		System.out.println("Chetan");
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\91899\\OneDrive\\Desktop\\chromedriver.exe"); 
		    ChromeDriver Driver= new ChromeDriver();  
		    ((RemoteWebDriver) Driver).manage().window().maximize();
		    Thread.sleep(2000);
		    Driver.manage().window().maximize();
		//     Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Driver .get("https://www.flipkart.com");
		    Thread.sleep(3000);

		    
		    //Create Web Element Reference
		    WebElement Electro =Driver.findElement(By.xpath("//*[text()='Electronic']"));
		    
		    Thread.sleep(3000);
		    
		    //Mouse Simulation using action class 
		    Actions act = new Actions(Driver);
		

	}

}
