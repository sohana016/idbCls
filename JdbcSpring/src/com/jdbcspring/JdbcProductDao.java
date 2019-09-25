/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbcspring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author A D M I N
 */
public class JdbcProductDao extends ProductDao implements  InitializingBean{
    private JdbcTemplate jdbcTemplate;
    public List<Product> findAll(){
        String sql = "select * from Product";
        return jdbcTemplate.query(sql, new ProductMapper());
    }
    
    
    @Override
    public void afterPropertiesSet() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static final class ProductMapper implements RowMapper<Product>{

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
    
}
