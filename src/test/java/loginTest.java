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

        Thread.sleep(1500);

        WebElement inputAttendToPatient = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[2]/div[2]/button[4]"));
        inputAttendToPatient.click();

        Thread.sleep(1500);

        WebElement inputVital = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/a/div"));
        inputVital.click();

        Thread.sleep(1500);
        WebElement inputAddVital = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div/button"));
        inputAddVital.click();

        Thread.sleep(2000);

        WebElement inputPatientWeight = driver.findElement(By.name("weight"));
        inputPatientWeight.clear();
        inputPatientWeight.sendKeys("68");

        WebElement inputPatientHeight = driver.findElement(By.name("height"));
        inputPatientHeight.clear();
        inputPatientHeight.sendKeys("168");

        WebElement inputPatientTemperature = driver.findElement(By.name("temperature"));
        inputPatientTemperature.sendKeys("36");

        WebElement inputPatientSystolic = driver.findElement(By.name("systolic"));
        inputPatientSystolic.sendKeys("132");
        WebElement inputPatientDiastolic= driver.findElement(By.name("diastolic"));
        inputPatientDiastolic.sendKeys("67");

        WebElement inputPatientPulseRate = driver.findElement(By.name("pulseRate"));
        inputPatientPulseRate.sendKeys("62");
        WebElement inputPatientRespiratory = driver.findElement(By.name("respiratoryRate"));
        inputPatientRespiratory.sendKeys("19");
        WebElement inputPatientOxygenSaturation = driver.findElement(By.name("oxygenSaturation"));
        inputPatientOxygenSaturation.sendKeys("99");
        WebElement inputPatientAbdominalCircumference = driver.findElement(By.name("abdominalCircumference"));
        inputPatientAbdominalCircumference.sendKeys("0");

        WebElement inputPatientInfoSave = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div/form/div[2]/div/button[2]"));
        inputPatientInfoSave.click();

        WebElement inputPatientDiastolicIfUnrecordable = driver.findElement(By.name("diastolicIfUnrecordable"));
        inputPatientDiastolicIfUnrecordable.sendKeys("Unknown");
        Thread.sleep(1500);
        WebElement suggestions = driver.findElement(By.name("unknownSuggestionName"));
        suggestions.click();

        WebElement inputpatientMuac = driver.findElement(By.name("muac"));
        inputpatientMuac.sendKeys("NULL");
        WebElement inputPatientMuacScore = driver.findElement(By.name("muacScore"));
        inputPatientMuacScore.sendKeys("-1");
        WebElement inputPatientHeadCircumference = driver.findElement(By.name("headCircumference"));
        inputPatientHeadCircumference.sendKeys("NULL");
        WebElement inputPatientHcScore = driver.findElement(By.name("hcScore"));
        inputPatientHcScore.sendKeys("NULL");
        WebElement inputPatientComments = driver.findElement(By.name("comment"));
        inputPatientComments.sendKeys("abcd");




















//        Thread.sleep(50000);
//
//            driver.quit();

    }
}

