package docker;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerWithChrome {

   public void test() throws MalformedURLException {
	   
       // Set up ChromeOptions instead of deprecated DesiredCapabilities
       ChromeOptions options = new ChromeOptions();
       
       // URL of the Selenium Grid Hub
       URL url = new URL("http://localhost:4444/wd/hub");
       
       // Initialize RemoteWebDriver with the hub URL and ChromeOptions
       RemoteWebDriver driver = new RemoteWebDriver(url, options);
       
       // Navigate to the website
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
       // Print the title of the page
       System.out.println(driver.getTitle());
       
       // Quit the browser
       driver.quit();
   }
}
