package com.example.Teliko.model;

public class Invitations {

    private Account Sender;
    private Account Receiver;
    private Boolean Status;

    Invitations(){}

    Invitations(Account sender, Account receiver){
        this.Receiver = receiver;
        this.Sender = sender;
    }

    public void setStatus(boolean s){

        this.Status=s;
    }

    public void setReceiver(Account receiver) {
        if(receiver != null) {
            this.Receiver = receiver;
        }
    }

    public void setSender(Account sender) {
        if(sender != null) {
            this.Sender = sender;
        }
    }

    public boolean getStatus(){

        return Status;
    }

    public Account getReceiver() {

        return Receiver;
    }

    public Account getSender() {

        return Sender;
    }


}