/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbcspring;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author A D M I N
 */
public class JdbcSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
//            ProductDao dao = new ProductDao();

            ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
            ProductSpring dao = context.getBean("productDao",ProductDao.class);
            
            JdbcProductDao jb = new JdbcProductDao();
            ProductDao productdao = new ProductDao();
                List<Product> products = jb.findAll();
                for(Product product : products){
                    System.out.println(product);
                }
//            System.out.println("fgd"+jb.findAll());
            
//            System.out.println(dao.getProduct().get(0).getName());
           
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
}
