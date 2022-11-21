package com.spotify.pages;

import com.spotify.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.spotify.constants.Constants.*;

public class LoginPage {

    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage() {
        methods = new Methods();
    }

    public void login() {

        methods.click(By.xpath(LOGIN_BUTTON_1));
        methods.sendKeys(By.id(USERNAME), "eyupcan.sonmez1@gmail.com");
        methods.waitBySeconds(2);
        logger.info("Kullanıcı adı girildi");
        methods.sendKeys(By.id(PASSWORD), "Asdqwe123");
        methods.waitBySeconds(2);
        logger.info("Şifre adı girildi");
        methods.click(By.xpath(LOGIN_BUTTON_2));
        methods.waitBySeconds(2);
        logger.info("Oturum Aç butonuna tıklandı");

        methods.click(By.xpath(COOKIE_CLOSE_BUTTON));
        methods.waitBySeconds(2);


    }
}
