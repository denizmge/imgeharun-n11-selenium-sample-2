package com.n11.training.samle.test.page;
import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PaymentPage extends BasePage {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }
    public PaymentPage makePayment(String kart1, String kart2, String kart3, String kart4, String name, String cvv) {
        setByXpath("//*[@tabindex='1']", kart1);
        setByXpath("//*[@tabindex='2']", kart2);
        setByXpath("//*[@tabindex='3']", kart3);
        setByXpath("//*[@tabindex='4']", kart4);
        setById("cardOwnerName", name);
        setById("securityCode", cvv);
        return new PaymentPage(driver);
    }
}