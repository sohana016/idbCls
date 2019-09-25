/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author A D M I N
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ProductJDBCTemplate productJDBCTemplate = (ProductJDBCTemplate) context.getBean("productJDBCTemplate");
        System.out.println("-----Product List--------");
        List<Product> products = productJDBCTemplate.listProduct();
        for(Product pro :products){
            System.out.println("Id: " + pro.getId());
            System.out.println("Name:" + pro.getName());
            System.out.println("Price: " + pro.getPrice());
            System.out.println("Qty: " + pro.getQty());
        }
    
    }
    
}
