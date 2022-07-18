import java.util.concurrent.TimeUnit;
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

    @Test
    public void Test2() {
        //open chrome
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //scenario of test
        driver.navigate().to("https://www.danfoss.com/en/");
        driver.findElement(By.cssSelector("[aria-label='Accept all']")).click();
        WebElement searchField = driver.findElement(By.cssSelector("[id='header-search-input']"));
        searchField.sendKeys("Alsense");
        searchField.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchText = driver.findElement(By.xpath ("//*[contains(text(),'Alsense IoT cloud and monitoring')]"));
        WebElement searchText2 = driver.findElement(By.xpath ("//*[contains(text(),'.pdf')]"));
        //quit chrome
        driver.quit(); //TEST TEST
    }

    @Test
    public void Test3() {
        //open chrome
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //scenario of testTEST
        driver.navigate().to("https://www.danfoss.com/en/");
        driver.manage().window().setSize(new Dimension(480, 480));
        boolean searchText = driver.findElement(By.xpath ("//*[contains(text(),'Quick links')]")).isDisplayed();
        assert(!searchText);
        //quit chrome  
        driver.quit();
    }

}
