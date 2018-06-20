/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radpac.CryptoChecker.controller;

import com.radpac.CryptoChecker.Ticker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author radekpachla
 */
@RestController
public class CurrenciesController {

    RestTemplate restTemplate = new RestTemplate();
    Ticker btcplnticker = restTemplate.getForObject("https://bitbay.net/API/Public/BTCPLN/ticker.json", Ticker.class);
    Ticker lskpln = restTemplate.getForObject("https://bitbay.net/API/Public/LSKPLN/ticker.json", Ticker.class);
    Ticker ltc = restTemplate.getForObject("https://bitbay.net/API/Public/LTCPLN/ticker.json", Ticker.class);
    Ticker eth = restTemplate.getForObject("https://bitbay.net/API/Public/ETHPLN/ticker.json", Ticker.class);

    @RequestMapping("/btc")
    public String btc() {
        return btcplnticker.toString();
    }
    @RequestMapping("/lsk")
    public String lsk(){
        return lskpln.toString();
    }
    @RequestMapping("/ltc")
    public String ltc(){
        return ltc.toString();
    }
    @RequestMapping("/eth")
    public String eth(){
        return eth.toString();
    }
}
