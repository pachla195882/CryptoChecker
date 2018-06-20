/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radpac.CryptoChecker.model;

import javax.persistence.*;
import java.util.Set;

/**
 *
 * @author radekpachla
 */
@Entity
@Table(name = "role")
public class Role {

    private int id;
    private String name;
    private Set<User> users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @ManyToMany(mappedBy="roles")
    public Set<User> getUsers(){
        return users;
    }
    
    public void setUsers(Set<User> users){
        this.users=users;
    }
}
