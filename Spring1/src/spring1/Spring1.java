/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring1;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author A D M I N
 */
public class Spring1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HellowWorld h =  (HellowWorld) context.getBean("hellow");
        h.setMassage("Toay is your lucky day");
        System.out.println("Message " +h.getMassage());
       
    }
    
}
