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
import com.radpac.CryptoChecker.model.User;

public interface UserService {
    public User findByUsername(String username);
    public void saveUser (User user);
}
