package com.radpac.CryptoChecker.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author radekpachla
 */
@Entity
@Table(name = "user")
public class User {

    private int id;
    private String username;
    private String password;
    private String passwordConfirm;
    private Set<Role> roles;

    void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    @Transient
    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    @ManyToMany
    @JoinTable(name="user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn( name = "role_id"))
    public Set<Role> getRoles(){
        return roles;
    }
    
    public void setRoles(Set<Role> roles){
        this.roles=roles;
    }
}
