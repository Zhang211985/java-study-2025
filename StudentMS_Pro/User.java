package com.zcc;

public class User {
    private String username;
    private String password;
    private String idCardNumber;
    private String telephoneNumber;

    public User() {
    }

    public User(String username, String password, String idCardNumber, String telephoneNumber) {
        this.username = username;
        this.password = password;
        this.idCardNumber = idCardNumber;
        this.telephoneNumber = telephoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
