/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Config;


public class SimpleBean {
    private static final String DEFAULT_NAME ="Tawhida Shorif";
    private String name = null;
    private int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void init(){
        System.out.println("Initializing bean");
        if(name == null){
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if(age == Integer.MIN_VALUE ){
           throw new IllegalArgumentException(
           "You must set the age property of any beans of type " +SimpleBean.class);
        }
    }
    public String toString(){
        return "Name: "+ name +"/nAge: " +age;
    }
}
