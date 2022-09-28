package com.company;

public class Users {
    private String name;
    private int pin;
    private int balance;
    private int id;

    // === ID ===
    public int getId(){
        return id;
    }

    public void setId(int newId){ this.id = newId; }

    // === NAME ===
    public String getName(){ return name; }

    public void setName(String newName){
        this.name = newName;
    }

    // === PIN ===
    public int getPin(){
        return pin;
    }

    public void setPin(int newPin){
        this.pin = newPin;
    }

    // === BALANCE ===
    public int getBalance(){ return balance; }

    public void setBalance(int newBalance){
        this.balance = newBalance;
    }

}

