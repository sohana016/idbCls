/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring1;

import org.springframework.stereotype.Service;

/**
 *
 * @author A D M I N
 */
@Service("hellow")
public class HellowWorld {
    String massage;

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        
        this.massage = massage;
    }
    
    
}
