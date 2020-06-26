package com.n11.training.samle.test.page;

import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage register(String name, String lastname, String email, String password, String verifyPassword, String captcha) {
        try {
            clickBy(By.linkText("Tamam"));
        } catch (Exception e) {
        }
        setById("firstName", name);
        setById("lastName", lastname);
        setById("registrationEmail", email);
        setById("registrationPassword", password);
        setById("passwordAgain", verifyPassword);
        setById("captchaText", captcha);
        clickBy(By.xpath("//*[contains(text(), 'Erkek')]"));
        clickBy(By.xpath("//*[@for='acceptContract']"));
        clickBy(By.id("submitButton"));
        //clickBy(By.id("genderMale"));
        //selectByNameValue("gender", "M");

        return this;

    }

}