/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author A D M I N
 */
public class ProductMapper implements RowMapper<Product>{

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   Product product = new Product();
   product.setId(rs.getInt("id"));
   product.setName(rs.getString("name"));
   product.setPrice(rs.getDouble("price"));
   product.setQty(rs.getInt("qty"));
   return product;
    
    }
    
    
}
