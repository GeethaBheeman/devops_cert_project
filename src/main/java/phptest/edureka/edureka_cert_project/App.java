package phptest.edureka.edureka_cert_project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args)
    
    {
    	 System.setProperty("webdriver.chrome.driver", "/opt/google/chromedriver/bin/chromedriver");
         WebDriver driver=new ChromeDriver();
         driver.get("http://master/index.php");
         //driver.findElement(By.name("email")).sendKeys("edureka");
         driver.findElement(By.id("About Us")).click();
         String aboutus=driver.findElement(By.id("PID-ab2-pg")).getText();
         //System.out.println(aboutus);
         if (aboutus != "")
         {System.out.println("Success");}
         else
         {System.out.println("Failed");}
    }
}
