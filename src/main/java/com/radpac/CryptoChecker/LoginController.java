/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radpac.CryptoChecker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author radekpachla
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "login.html";
    }
    
}
