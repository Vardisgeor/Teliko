package com.example.Teliko.model;

import org.junit.Assert;
import org.junit.Test;

public class GameSettingsTest {

    @Test
    public void set(){
        GameSettings gameSettings = new GameSettings();
        gameSettings.setCategory("Knowledge");
        Assert.assertEquals("Knowledge",gameSettings.getCategory());

        gameSettings.setDifficulty("Hard");
        Assert.assertEquals("Hard",gameSettings.getDifficulty());

    }

}
