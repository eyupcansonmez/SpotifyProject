package com.spotify.tests;

import com.spotify.driver.BaseTest;
import com.spotify.pages.HomePage;
import com.spotify.pages.LoginPage;
import org.junit.Test;

public class TestSpotify extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();

        loginPage.login();
    }

    @Test

    public void homeTest() {

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

        loginPage.login();
        homePage.selectPlaylist();
        homePage.searchSong();
        homePage.addSong();
        homePage.playSong();
        homePage.exitProfile();
    }


}
