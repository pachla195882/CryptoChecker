/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radpac.CryptoChecker.repository;

/**
 *
 * @author radekpachla
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.radpac.CryptoChecker.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long>{
    User findByName(String username);
}
