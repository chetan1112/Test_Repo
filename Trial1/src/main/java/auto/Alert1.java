package auto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\91899\\OneDrive\\Desktop\\chromedriver.exe"); 
	    ChromeDriver Driver= new ChromeDriver();  
	    Driver.manage().window().maximize();
	    Thread.sleep(2000);
	    Driver.manage().window().maximize();
	//     Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Driver .get("https://demoqa.com");
	    Thread.sleep(3000);
	    
	    //Verify alert text
	    
	  String actualResult= Driver.switchTo().alert().getText();
	  String expResult= "Do you confirm action?";
	  Assert.assertEquals( actualResult, expResult);
	  System.out.println("Alert text accepted");
	  
	  //Accept the alert
	  Thread.sleep(3000);
	  Driver.switchTo().alert().accept();
	  System.out.println("Alert text");
	  
	  
	  
	}

}
