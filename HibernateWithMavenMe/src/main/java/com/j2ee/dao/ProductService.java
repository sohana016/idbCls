/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2ee.dao;

import com.j2ee.model.Product;
import java.util.List;

/**
 *
 * @author A D M I N
 */
public interface ProductService {
    public List<Product> getProducts();
        public Product findProductById(int id);
        public List<Product> findByName(String name);
    
}
