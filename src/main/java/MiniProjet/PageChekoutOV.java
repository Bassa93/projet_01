package MiniProjet;

import commun.CM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageChekoutOV {
    WebDriver driver;
public PageChekoutOV(WebDriver driver){
    this.driver=driver;

}
    public void CHECKOUTOVERVIEW() {
        WebElement TITLE = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

        String expectedTitle = "CHECKOUT: OVERVIEW";
        String originalTitle = TITLE.getText();
        Assert.assertEquals(originalTitle, expectedTitle, "incorrect");

    }

    public void cliquerBoutonFinish() {
        WebElement BtnFinish = driver.findElement(By.id("finish"));
        BtnFinish.click();
    }
}