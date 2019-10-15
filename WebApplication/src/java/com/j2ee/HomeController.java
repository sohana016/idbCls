/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2ee;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author A D M I N
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {

        return "index";
    }

    @RequestMapping("/test")
    public String test() {

        return "test";
    }
    
    
    @RequestMapping("/hello")
    public String hello(HttpServletRequest req,Model m) {
        
            m.addAttribute("mess", "Hello");
        String name = req.getParameter("name");
        String id = req.getParameter("id");
        String pass=req.getParameter("pass"); 
        if(pass.equals("mim")){
            String msg = "Tawhida "+name;
             String msg1 = id ;
            m.addAttribute("name", msg);
            m.addAttribute("id", msg1);
            
        }
        return "viewPage";
    }

}
