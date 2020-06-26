package com.n11.training.samle.test.page;
import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }
    public ProductDetailPage goToCheckOut() {
        clickBy(By.xpath("//a[contains(@class, 'btnAddBasket')]"));
        clickBy(By.className("myBasket"));
        return new ProductDetailPage(driver);
    }
}