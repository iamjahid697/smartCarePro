import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class loginTest {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://staging-scweb.arcapps.org/");

        WebElement inputEmail = driver.findElement(By.name("username"));
        inputEmail.sendKeys("tester");
        WebElement inputPassword = driver.findElement(By.name("password"));
        inputPassword.sendKeys("tester2023!");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='root']/div[2]/div[2]/div/div/div[3]/form/div/div[4]/button"));
        loginBtn.click();

        Thread.sleep(50000);

            driver.quit();

    }
}

