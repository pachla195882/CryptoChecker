/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radpac.CryptoChecker;

/**
 *
 * @author radekpachla
 */
public class User {

    private int id;
    private String login;
    private String password;

    User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setLogin(String login) {
        this.login = login;
    }

    String getLogin() {
        return login;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return password;
    }
}
