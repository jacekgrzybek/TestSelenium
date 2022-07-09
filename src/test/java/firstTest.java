import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    @Test
    public void demoTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.danfoss.com/en/");
        WebElement searchText = driver.findElement(By.xpath ("//*[contains(text(),'Explore Danfoss Product Store')]"));
    }
}
