package MiniProjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageAccueil {

    WebDriver driver;


    public PageAccueil(WebDriver driver) {

        this.driver = driver;

    }

    public void saisirlogin(String val1) {
        WebElement champsLogin = driver.findElement(By.id("user-name"));
        champsLogin.sendKeys(val1);
    }

    public void saisirMdp(String val2) {
        WebElement champsMdp = driver.findElement(By.id("password"));
        champsMdp.sendKeys(val2);
    }

    public void cliquerBoutonLogin() {
        WebElement BtnLogin = driver.findElement(By.id("login-button"));
        BtnLogin.click();
    }

    public void affichertxt() {
        WebElement Text = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));


        String expectedTitle = "Epic sadface: Username and password do not match any user in this service";
        String originalTitle = Text.getText();
        Assert.assertEquals(originalTitle, expectedTitle, "incorrect");



    }

}

