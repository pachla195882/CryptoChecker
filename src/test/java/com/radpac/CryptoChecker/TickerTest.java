/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radpac.CryptoChecker;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author radekpachla
 */
public class TickerTest {
    
    public TickerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMax method, of class Ticker.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        Ticker instance = new Ticker();
        Double expResult = null;
        Double result = instance.getMax();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMax method, of class Ticker.
     */
    @Test
    public void testSetMax() {
        System.out.println("setMax");
        Double max = 5.0;
        Ticker instance = new Ticker();
        instance.setMax(max);
    }

    /**
     * Test of getMin method, of class Ticker.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        Ticker instance = new Ticker();
        Double expResult = instance.getMin();
        Double result = instance.getMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMin method, of class Ticker.
     */
    @Test
    public void testSetMin() {
        System.out.println("setMin");
        Double min = null;
        Ticker instance = new Ticker();
        instance.setMin(min);
    }

    /**
     * Test of getLast method, of class Ticker.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        Ticker instance = new Ticker();
        Double expResult = null;
        Double result = instance.getLast();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLast method, of class Ticker.
     */
    @Test
    public void testSetLast() {
        System.out.println("setLast");
        Double last = null;
        Ticker instance = new Ticker();
        instance.setLast(last);
    }

    /**
     * Test of getBid method, of class Ticker.
     */
    @Test
    public void testGetBid() {
        System.out.println("getBid");
        Ticker instance = new Ticker();
        Double expResult = null;
        Double result = instance.getBid();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBid method, of class Ticker.
     */
    @Test
    public void testSetBid() {
        System.out.println("setBid");
        Double bid = null;
        Ticker instance = new Ticker();
        instance.setBid(bid);
    }

    /**
     * Test of getAsk method, of class Ticker.
     */
    @Test
    public void testGetAsk() {
        System.out.println("getAsk");
        Ticker instance = new Ticker();
        Double expResult = null;
        Double result = instance.getAsk();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAsk method, of class Ticker.
     */
    @Test
    public void testSetAsk() {
        System.out.println("setAsk");
        Double ask = null;
        Ticker instance = new Ticker();
        instance.setAsk(ask);
    }

    /**
     * Test of getVwap method, of class Ticker.
     */
    @Test
    public void testGetVwap() {
        System.out.println("getVwap");
        Ticker instance = new Ticker();
        Double expResult = null;
        Double result = instance.getVwap();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVwap method, of class Ticker.
     */
    @Test
    public void testSetVwap() {
        System.out.println("setVwap");
        Double vwap = null;
        Ticker instance = new Ticker();
        instance.setVwap(vwap);
    }

    /**
     * Test of getAverage method, of class Ticker.
     */
    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        Ticker instance = new Ticker();
        Double expResult = null;
        Double result = instance.getAverage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAverage method, of class Ticker.
     */
    @Test
    public void testSetAverage() {
        System.out.println("setAverage");
        Double average = null;
        Ticker instance = new Ticker();
        instance.setAverage(average);
    }

    /**
     * Test of getVolume method, of class Ticker.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Ticker instance = new Ticker();
        Double expResult = null;
        Double result = instance.getVolume();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVolume method, of class Ticker.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        Double volume = null;
        Ticker instance = new Ticker();
        instance.setVolume(volume);
    }


    /**
     * Test of toString method, of class Ticker.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ticker instance = new Ticker();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
