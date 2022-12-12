package MiniProjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageChekout {
    WebDriver driver;


    public PageChekout(WebDriver driver) {
        this.driver = driver;

    }

    public void saisirnom(String nom) {
        WebElement champsnom = driver.findElement(By.id("first-name"));
        champsnom.sendKeys(nom);
    }

    public void saisirprenom(String prenom) {
        WebElement champsprenom = driver.findElement(By.id("last-name"));
        champsprenom.sendKeys(prenom);
    }

    public void codepostal(String code) {
        WebElement champscode = driver.findElement(By.id("postal-code"));
        champscode.sendKeys(code);

    }

   // public void CHECKOUTYOURINFORMATION() {
     //   WebElement TITLE = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

       // String expectedTitle = "CHECKOUT: YOUR INFORMATION»";
      //  String originalTitle = TITLE.getText();
      //  Assert.assertEquals(originalTitle, expectedTitle, "incorrect");
   // }

    public void CONTINUE() {
        WebElement BtCONTINUE = driver.findElement(By.id("continue"));
        BtCONTINUE.click();

    }
}
