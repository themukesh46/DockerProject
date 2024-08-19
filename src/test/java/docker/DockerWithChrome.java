package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerWithChrome {

    public static void main(String[] args) throws MalformedURLException {
        // Set ChromeOptions instead of DesiredCapabilities
        ChromeOptions options = new ChromeOptions();

        // Specify the URL of the Selenium Grid hub
        URL url = new URL("http://localhost:4444/wd/hub");

        // Initialize the RemoteWebDriver with the hub URL and ChromeOptions
        RemoteWebDriver driver = new RemoteWebDriver(url, options);
        
        // Perform actions using the driver
        driver.get("https://www.google.com");
        
        System.out.println(driver.getTitle());


        // Close the browser
        driver.quit();
    }
}
