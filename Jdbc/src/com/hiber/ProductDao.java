/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author A D M I N
 */
public interface ProductDao {
     public void setDataSource(DataSource ds);
      public List<Product> listProduct();  
    
}
