package MiniProjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageProduct {

    WebDriver driver;

    public PageProduct(WebDriver driver) {

        this.driver = driver;

    }

    public void TitreProduct() {
        WebElement Title = driver.findElement(By.xpath("//*[@class='title']"));
        String expectedTitle = "PRODUCTS";
        String originalTitle = Title.getText();
        Assert.assertEquals(originalTitle, expectedTitle, "incorrect");
    }

    public void addtocart() {

        WebElement add1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        add1.click();

        WebElement add2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        add2.click();
    }

    public void ad() {

        WebElement panier = driver.findElement(By.id("shopping_cart_container"));
        panier.click();
    }
}
