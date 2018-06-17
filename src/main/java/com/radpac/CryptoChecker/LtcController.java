/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radpac.CryptoChecker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author radekpachla
 */
@RestController
public class LtcController implements ControllerInterface{
    
    Ticker ltc = restTemplate.getForObject("https://bitbay.net/API/Public/LTCPLN/ticker.json", Ticker.class);
   
    @RequestMapping("/ltc")
    @Override
    public String output() {
        return ltc.toString();
    }
    
}
