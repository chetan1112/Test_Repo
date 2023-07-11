
package auto;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class Sele {

	public static  void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Chetan");
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\91899\\OneDrive\\Desktop\\chromedriver.exe"); 
		    ChromeDriver Driver= new ChromeDriver();  
		    Thread.sleep(2000);
		    ((RemoteWebDriver) Driver).manage().window().maximize();
		    ((RemoteWebDriver) Driver).get("https://www.facebook.com");	
		 //   ((RemoteWebDriver) Driver).navigate().refresh();
			Driver.findElement(By.xpath("//input[@value='1']")).click();
	
		
	}

}

//C:\Users\91899\OneDrive\Desktop\geckodriver.exe
