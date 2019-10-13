package com.mycompany.hibernatewithmaven;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.j2ee.dao.ProductService;
import com.j2ee.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author A D M I N
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ProductService ps = context.getBean("productService",ProductService.class);
//        System.out.println("Product................." +ps.getProducts().get(0).getName());

        ProductService ps = (ProductService) context.getBean("jpaService");
         Product p = ps.findByName("Mango").get(0);
       System.out.println("Id of Mango ---- "+p.getId());

//        ProductService ps = (ProductService) context.getBean("productRepository");
//        System.out.println("Total"+ps.findByName("Mango").get(0).getPrice());
       
    }
    
}
