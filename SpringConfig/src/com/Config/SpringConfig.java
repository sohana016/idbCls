/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringConfig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SimpleBeans.xml");
        SimpleBean simpleBean1 = (SimpleBean) context.getBean("simpleBean1",context);
        SimpleBean simpleBean2 = (SimpleBean) context.getBean("simpleBean2",context);
        SimpleBean simpleBean3 = (SimpleBean) context.getBean("simpleBean3",context);
       
       context.close();
        
         
        
    }  
   
        private static SimpleBean getBean(String beanName, ConfigurableApplicationContext  context){
        try {
            SimpleBean bean = (SimpleBean) context.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (Exception e) {
            System.out.println("An error occured in bean configuration: "+e.getMessage());
             return null;
           
        }
        
         
       
    }
        
}
