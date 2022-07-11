import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

    @Test
    public void Test1() {
        //open chrome
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //scenario of test
        driver.navigate().to("https://www.danfoss.com/en/");
        WebElement searchText = driver.findElement(By.xpath ("//*[contains(text(),'Explore Danfoss Product Store')]"));
        //quit chrome
        driver.quit();
    }


}
