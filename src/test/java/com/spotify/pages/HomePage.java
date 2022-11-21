package com.spotify.pages;

import com.spotify.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.spotify.constants.Constants.*;

public class HomePage {

    Methods methods;
    Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage() {

        methods = new Methods();

    }


    public void selectPlaylist() {


        methods.click(By.xpath(CREATE_PLAYLIST));
        methods.waitBySeconds(3);
        logger.info("Çalma Listesi Oluştur butonuna tıklandı");

        methods.click(By.xpath(MY_PLAYLIST));
        methods.waitBySeconds(3);


        methods.sendKeys(By.xpath(CHANGE_PLAYLIST_NAME), "EyupCanSonmezPlaylist");
        methods.waitBySeconds(3);

        methods.click(By.xpath(SAVE_BUTTON));
        methods.waitBySeconds(3);
        logger.info("Kaydet butonuna tıklandı");


        methods.CompareText(By.xpath(COMPARE_PLAYLIST));
        logger.info("Playlist adı EyupCanSonmezPlaylist olarak değiştirildi");

    }

    public void searchSong() {

        methods.click(By.xpath(SEARCH_BUTTON));
        methods.waitBySeconds(3);
        logger.info("Arama butonuna tıklandı");


        methods.sendKeys(By.xpath(SEARCH_SONG_NAME), "Another Love");
        methods.waitBySeconds(3);
        logger.info("Another love şarkısı aratıldı");


    }

    public void addSong() {

        methods.click(By.xpath(ADD_TO_FAVORITES));
        methods.waitBySeconds(3);
        logger.info("Favorilere ekle butonuna tıklandı");


        methods.click(By.xpath(GO_TO_LIBRARIY));
        methods.waitBySeconds(3);
        logger.info("Kitaplığın butonuna tıklandı");

        methods.click(By.xpath(LIKED_SONG));
        methods.waitBySeconds(3);
        logger.info("Beğenilen Şarkılar'a tıklanıldı");

        methods.click(By.xpath(ADD_TO_PLAYLIST_1));
        methods.waitBySeconds(3);

        methods.click(By.xpath(ADD_TO_PLAYLIST_2));
        methods.waitBySeconds(3);

        methods.click(By.xpath(ADD_TO_PLAYLIST_3));
        methods.waitBySeconds(3);
        logger.info("Şarkı Çalma Listesine eklendi");


    }


    public void playSong() {

        methods.click(By.xpath(PLAY_SONG));
        methods.waitBySeconds(10);
        logger.info("Çal butonuna tıklandı");

        methods.click(By.xpath(STOP_SONG));
        methods.waitBySeconds(1);
        logger.info("Duraklat butonuna tıklandı");
    }

    public void exitProfile() {

        methods.click(By.xpath(SIGN_OUT_1));
        methods.waitBySeconds(2);

        methods.click(By.xpath(SIGN_OUT_2));
        methods.waitBySeconds(2);
        logger.info("Oturumu Kapat butonuna tıklandı");


    }
}
