package com.example.Teliko.model;

import org.junit.Assert;
import org.junit.Test;

public class GameManagerTest {

    @Test
    public void account(){

        GameManager gameManager = new GameManager();

        gameManager.makeAccount("Orfeas", "pocoloco");
        Assert.assertEquals(1,gameManager.getAccounts().size());
        Assert.assertEquals("Orfeas",gameManager.getCurrentAccount().getName());
    }

    @Test
    public void login(){

        GameManager gameManager = new GameManager();
        gameManager.makeAccount("Orfeas", "pocoloco");
        Assert.assertTrue(gameManager.Login("Orfeas", "pocoloco"));
        Assert.assertFalse(gameManager.Login("Nick","Petras"));
    }

    @Test
    public void invite(){

        GameManager gameManager = new GameManager();
        gameManager.makeAccount("Orfeas", "pocoloco");
        gameManager.makeAccount("Nick","Petras");
        Assert.assertTrue(gameManager.makeInvitation(gameManager.getCurrentAccount(),"Orfeas"));

    }
}