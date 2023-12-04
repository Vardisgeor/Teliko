package com.example.Teliko.model;



import org.junit.*;
public class AccountTest {

    @Test
    public void details(){
        Account account = new Account();
        account.setName("Nick");
        Assert.assertEquals("Nick", account.getName());

        account.setPassword("123456789");
        Assert.assertEquals("123456789",account.getPassword());

        account.setScore(37);
        Assert.assertEquals(37,account.getScore());

        account.updateScore(1);
        Assert.assertEquals(38,account.getScore());

        account.OnlineStatus(true);
        Assert.assertTrue(account.getOnlineStatus());
    }

    @Test
    public void AddNullInitation(){
        Account account = new Account();
        account.addInvitation(null);
        Assert.assertEquals(0,account.getInvitations().size());
    }

    @Test
    public void AddInitation(){
        Account account = new Account();
        Invitations invitations = new Invitations();
        account.addInvitation(invitations);
        Assert.assertEquals(1,account.getInvitations().size());
        Assert.assertTrue(account.getInvitations().contains(invitations));
    }

    @Test
    public void removeWrongInvite(){
        Account account = new Account();
        Invitations invitation1 = new Invitations();
        Invitations invitation2 = new Invitations();
        account.addInvitation(invitation2);
        Assert.assertFalse(account.removeInvitation(invitation1));
    }
    @Test
    public void removeInvite(){
        Account account = new Account();
        Invitations invitations = new Invitations();
        account.addInvitation(invitations);
        account.removeInvitation(invitations);
        Assert.assertEquals(0,account.getInvitations().size());
    }

    @Test
    public void Output(){
        Account account = new Account("Nick","Nelson");
        account.updateScore(2);
        Assert.assertEquals("Player Name: Nick  Score: 2",account.AccToString());
    }


}