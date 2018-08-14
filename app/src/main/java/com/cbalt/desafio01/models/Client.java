package com.cbalt.desafio01.models;

public class Client {

    String address, mail, name;

    public Client() {
    }

    public Client(String address, String mail, String name) {
        this.address = address;
        this.mail = mail;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
