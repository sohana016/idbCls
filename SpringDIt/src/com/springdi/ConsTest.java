/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springdi;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author Administrator
 */
public class ConsTest {
    String value;
    int val;

    public ConsTest(String value) {
        this.value = value;
    }

    public ConsTest(int val) {
        this.val = val;
    }
    
    
}
