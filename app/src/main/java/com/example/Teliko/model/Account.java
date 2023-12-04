package com.example.Teliko.model;

import java.util.HashSet;
import java.util.Set;

public class Account {

    private int score;
    private String password;
    private String name;
    private boolean online;
    private Set<Invitations> invitations = new HashSet<Invitations>();

    public Account(){}
    Account(String name, String password){
        this.password = password;
        this.name = name;
        this.score = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Set<Invitations> getInvitations() {
        return invitations;
    }

    public void addInvitation(Invitations invite){
        if(invite!=null) {
            this.invitations.add(invite);
        }
    }

    public boolean removeInvitation(Invitations invite){

        for(Invitations i: invitations) {
            if(i.equals(invite)){
                this.invitations.remove(i);
                return true;
            }
        }
        return false;
    }
    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public int getScore() {
        return score;
    }

    public void updateScore(int score){
        this.score += score;
    }

    public void OnlineStatus(boolean status){
        this.online = status;
    }

    public boolean getOnlineStatus(){
        return this.online;
    }

    public String AccToString(){
        return "Player Name: "+ this.name+"  Score: "+ this.score;
    }
}