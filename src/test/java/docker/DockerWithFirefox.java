package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerWithFirefox {
	
	public static void main (String args[]) throws MalformedURLException {
		
		FirefoxOptions options = new FirefoxOptions();

        // Specify the URL of the Selenium Grid hub
        URL url = new URL("http://localhost:4444/wd/hub");

        // Initialize the RemoteWebDriver with the hub URL and FirefoxOptions
        RemoteWebDriver driver = new RemoteWebDriver(url, options);
        
        // Perform actions using the driver
        driver.get("https://www.google.com");
        
        System.out.print(driver.getTitle());
		
        driver.quit();
	}

}
