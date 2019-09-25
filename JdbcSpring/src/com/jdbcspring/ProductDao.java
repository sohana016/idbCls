/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbcspring;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author A D M I N
 */
public class ProductDao implements ProductSpring{
    
//   private Connection connection = DbCon.getConnection();
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;
    
        public void setDataSource(DataSource dataSource) {
            this.jdbcTemplate =new JdbcTemplate(dataSource);
        this.dataSource = dataSource;
    }
    
                      
//           public ProductDao() throws Exception{
//               super();
//           }
    @Override
    public List<Product> getProduct() {
        List<Product> lists= new ArrayList<>();
       try {
           Connection connection = dataSource.getConnection();
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("select * from product");
           while(resultSet.next()){
           lists.add(new Product(resultSet.getInt(1),resultSet.getString(2),0.0,10));
           }
       } catch (SQLException ex) {
           ex.printStackTrace();;
          // Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
       }
       return lists;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
