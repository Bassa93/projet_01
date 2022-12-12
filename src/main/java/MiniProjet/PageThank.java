package MiniProjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageThank {
    WebDriver driver;


    public PageThank() {
        this.driver = driver;

    }
    public void thankk(){
        WebElement Text = driver.findElement(By.xpath(""));


        String expectedTitle = "THANK YOU FOR YOUR ORDER";
        String originalTitle = Text.getText();
        Assert.assertEquals(originalTitle, expectedTitle, "incorrect");
    }
}
