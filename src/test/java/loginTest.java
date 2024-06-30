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

        //        Login functionalities step-1 start
        WebElement inputEmail = driver.findElement(By.name("username"));
        inputEmail.sendKeys("tester");
        WebElement inputPassword = driver.findElement(By.name("password"));
        inputPassword.sendKeys("tester2023!");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='root']/div[2]/div[2]/div/div/div[3]/form/div/div[4]/button"));
        loginBtn.click();
        //        Login functionalities step-1 end

        //        Login functionalities step-2 start
        WebElement inputProvince = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/form/div[1]/div[1]/select"));
        inputProvince.sendKeys("Lusaka");
        WebElement inputDistrict = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/form/div[1]/div[2]/select"));
        inputDistrict.sendKeys("Lusaka");
        WebElement inputFacility = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/form/div[1]/div[3]/div/div[2]/input"));
        inputFacility.sendKeys("Dr. Watson Dental Clinic");
        Thread.sleep(1500);
        //        code for clicking on facilities suggestions in Login functionalities step-2
        WebElement suggestion = driver.findElement(By.xpath("//*[text()='Dr. Watson Dental Clinic']"));
        suggestion.click();

        WebElement inputEnterBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/form/div[3]/button"));
        inputEnterBtn.click();
        //        Login functionalities step-2 end

        //        Searching by NRC start
        Thread.sleep(1500);
        WebElement inputNrc = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div[1]/button[2]"));
        inputNrc.click();
        WebElement inputNrcValue = driver.findElement(By.name("nrc"));
        inputNrcValue.sendKeys("111111/11/1");
        WebElement inputSearchNrc = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/form/div[2]/button"));
        inputSearchNrc.click();
        //        Searching by NRC end

        // clicking on attend to patient
        Thread.sleep(1500);
        WebElement inputAttendToPatient = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[3]/div[2]/div/div/div[2]/div[2]/button[4]"));
        inputAttendToPatient.click();

        // clicking on Vitals
        Thread.sleep(1500);
        WebElement inputVital = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/a/div"));
        inputVital.click();

        // clicking on add vitals
        Thread.sleep(1500);
        WebElement inputAddVital = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div/button"));
        inputAddVital.click();
        // patient information saving part start
        // waiting time
        Thread.sleep(2000);
        // weight
        WebElement inputPatientWeight = driver.findElement(By.name("weight"));
        inputPatientWeight.clear();
        inputPatientWeight.sendKeys("68");
        // height
        WebElement inputPatientHeight = driver.findElement(By.name("height"));
        inputPatientHeight.clear();
        inputPatientHeight.sendKeys("168");
        // Temperature (c)
        WebElement inputPatientTemperature = driver.findElement(By.name("temperature"));
        inputPatientTemperature.sendKeys("36");

//        // Systolic (mmHg)
//        WebElement inputPatientSystolic = driver.findElement(By.name("systolic"));
//        inputPatientSystolic.sendKeys("132");
//        // Diastolic (mmHg)
//        WebElement inputPatientDiastolic= driver.findElement(By.name("diastolic"));
//        inputPatientDiastolic.sendKeys("67");
        // Pulse rate
        WebElement inputPatientPulseRate = driver.findElement(By.name("pulseRate"));
        inputPatientPulseRate.sendKeys("62");
        // Respiratory
        WebElement inputPatientRespiratory = driver.findElement(By.name("respiratoryRate"));
        inputPatientRespiratory.sendKeys("19");
        // Oxygen saturation
        WebElement inputPatientOxygenSaturation = driver.findElement(By.name("oxygenSaturation"));
        inputPatientOxygenSaturation.sendKeys("99");
        // Abdominal circumference
        WebElement inputPatientAbdominalCircumference = driver.findElement(By.name("abdominalCircumference"));
        inputPatientAbdominalCircumference.sendKeys("0");
        // BP Unrecordable
        WebElement inputPatientDiastolicIfUnrecordable = driver.findElement(By.name("diastolicIfUnrecordable"));
        inputPatientDiastolicIfUnrecordable.sendKeys("Too High");
        Thread.sleep(1500);
        WebElement suggestions = driver.findElement(By.name("unknownSuggestionName"));
        suggestions.click();
        // waiting time
        Thread.sleep(2000);
        // Patient information save
        WebElement inputPatientInfoSave = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div/form/div[2]/div/button[2]"));
        inputPatientInfoSave.click();

        // waiting time
        Thread.sleep(1500);
        // quite the driver
        driver.quit();




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
        // patient information saving parts end


    }
}

