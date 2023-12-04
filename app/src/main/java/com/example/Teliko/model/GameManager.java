package com.example.Teliko.model;

import java.util.HashSet;
import java.util.Set;

public class GameManager {

    private Set<Account> accounts = new HashSet<Account>();

    private Account currentAccount;

    GameManager(){

    }

    public boolean makeAccount(String name, String pas)
    {
        Account newAccount = new Account(name,pas);

        for(Account i: accounts){
            if(i.getName().equals(newAccount.getName())){
                return false;
            }
        }

        this.currentAccount = newAccount;
        accounts.add(newAccount);

        return true;

    }

    public Boolean Login(String name, String pas)
    {
        for (Account i: accounts) {
            if(i.getName().equals(name) && i.getPassword().equals(pas)){
                this.currentAccount = i;
                return true;
            }
        }
        return false;

    }

    public Boolean makeInvitation(Account acc ,String sender){
        for(Account i: accounts){
            if(i.getName().equals(sender)){
                Invitations invite = new Invitations(acc, i);
                return  true;
            }
        }
        return false;
    }

    public Account getCurrentAccount() {
        return currentAccount;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }
}
