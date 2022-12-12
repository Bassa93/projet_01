package commun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CM {
        public WebDriver driver;

        @BeforeMethod
        public void monBefore() {
            //System.setProperty("webdriver.chrome.driver", "C:\\dev\\driver\\chromedriver_win32\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();


            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();


        }


        @AfterMethod
        public void mnAfter() {
           // driver.quit();

        }


    }



