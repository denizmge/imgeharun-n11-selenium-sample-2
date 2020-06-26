package com.n11.training.samle.test.page;
import com.n11.training.samle.test.base.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckOutPage extends BasePage {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    public CheckOutPage goToPayment(String city, String district, String neighbourhood, String tckn) {
        clickBy(By.className("info"));
        setById("fullName", "buyer buyer");
        clickBy(By.id("cityId"));
        clickBy(By.xpath("//*[text()='" + city + "']"));
        clickBy(By.id("districtId"));
        clickBy(By.xpath("//*[text()='" + district + "']"));
        clickBy(By.id("neighbourhoodId"));
        clickBy(By.xpath("//*[text()='" + neighbourhood + "']"));
        setById("addressDetail", "address address");
        driver.findElement(By.id("gsm")).sendKeys("555555555");
        setById("tcNO", tckn);
        setById("addressName", RandomStringUtils.randomAlphabetic(5).toLowerCase());
        clickBy(By.xpath("//*[text()='Adreslerime Ekle']"));
        clickBy(By.id("js-goToPaymentBtn"));
        return new CheckOutPage(driver);
    }
}