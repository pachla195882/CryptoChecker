/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radpac.CryptoChecker;

import org.springframework.web.client.RestTemplate;

/**
 *
 * @author radekpachla
 */
public interface ControllerInterface {
    RestTemplate restTemplate = new RestTemplate();
    public String output();
}
