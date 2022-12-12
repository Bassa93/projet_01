package MiniProjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageYourCarte {

    WebDriver driver;

    public PageYourCarte(WebDriver driver) {

        this.driver = driver;
    }

    public void TitreYOURCART() {
        WebElement TITLE = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

        String expectedTitle = "YOUR CART";
        String originalTitle = TITLE.getText();
        Assert.assertEquals(originalTitle, expectedTitle, "incorrect");

    }
    public void Presence1() {
        WebElement TITLE = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));

        String expectedTitle = "Sauce Labs Backpack";
        String originalTitle = TITLE.getText();
        Assert.assertEquals(originalTitle, expectedTitle, "incorrect");
    }


        public void Presence2() {
            WebElement TITLE = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));

            String expectedTitle = "Sauce Labs Bike Light";
            String originalTitle = TITLE.getText();
            Assert.assertEquals(originalTitle, expectedTitle, "incorrect");

        }
            public void CHEKOUT(){
        WebElement BtCHEKOUT=driver.findElement(By.id("checkout"));
        BtCHEKOUT.click();


    }
}