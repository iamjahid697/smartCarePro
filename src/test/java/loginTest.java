import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
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

        WebElement inputProvince = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/form/div[1]/div[1]/select"));
        inputProvince.sendKeys("Lusaka");
        WebElement inputDistrict = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/form/div[1]/div[2]/select"));
        inputDistrict.sendKeys("Lusaka");
        WebElement inputFacility = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/form/div[1]/div[3]/div/div[2]/input"));
        inputFacility.sendKeys("Dr. Watson Dental Clinic");


        Thread.sleep(1500);

        WebElement suggestion = driver.findElement(By.xpath("//*[text()='Dr. Watson Dental Clinic']"));
        suggestion.click();

        WebElement inputEnterBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/form/div[3]/button"));
        inputEnterBtn.click();

        Thread.sleep(1500);

        WebElement inputNrc = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div[1]/button[2]"));
        inputNrc.click();
        WebElement inputNrcValue = driver.findElement(By.name("nrc"));
        inputNrcValue.sendKeys("111111/11/1");
        WebElement inputSearchNrc = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/form/div[2]/button"));
        inputSearchNrc.click();
        Thread.sleep(50000);

            driver.quit();

    }
}

