package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class US_23 {

    WebDriver driver;

    // tek test method'u oldugu icin @BeforeMethod veya @BeforeClass kullanabiliriz
    @BeforeClass
    public void setup(){

        WebDriverManager.chromedriver().setup();
        // sirket bize bir WebDriver verirse onu kullaniriz
        // yoksa Selenium'un kendi WebDriver'ini kullanabiliriz
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

    @Test
    public void test01(){

        // anasayfaya gidelim
        driver.get("https://qa.flavorfetch.com/");

        // anasayfadan sign in e tıklayıp login sayfasını göreceğiz
        WebElement loginsignIn = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
        // WebElement.click (driver.findElement(By.xpath("//a[normalize-space()='Sign in']")));
        loginsignIn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement loginName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/form/div[1]/input"));
        loginName.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //loginName.sendKeys("gozdegokdeniz@flavorfetch.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement loginPassword = driver.findElement(By.xpath("//label[@for='password']"));
        loginPassword .click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPassword.sendKeys("Flavor.2106");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement SingIn = driver.findElement(By.xpath("//div[@id='vue-login']//form"));
        SingIn.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }
}
