package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) {
        // Set the path for ChromeDriver (only needed if not in PATH)
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open Google
        driver.get("https://www.google.com");

        // Find the search box and type query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Cancer.org");
        searchBox.submit();

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}
