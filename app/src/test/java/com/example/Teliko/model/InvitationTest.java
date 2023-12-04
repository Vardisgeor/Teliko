package com.example.Teliko.model;

import org.junit.*;
public class InvitationTest{

    @Test
    public void NullInput(){
        Invitations invite = new Invitations();
        Account acc = new Account();
        invite.setSender(acc);
        invite.setSender(null);
        Assert.assertNotNull( invite.getSender());

        invite.setReceiver(acc);
        invite.setReceiver(null);
        Assert.assertNotNull(invite.getReceiver());
    }
    @Test
    public void Invites(){

        Invitations invite = new Invitations();
        Account acc = new Account();
        Account acc2 = new Account();

        invite.setStatus(false);
        invite.setSender(acc);
        invite.setReceiver(acc2);

        Assert.assertEquals(acc, invite.getSender());
        Assert.assertEquals(acc2, invite.getReceiver());
        Assert.assertFalse(invite.getStatus());


    }
}