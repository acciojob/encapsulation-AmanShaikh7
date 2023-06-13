package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly rw = new RWOnly();
       // rw.name = "Aman";
        // error : 'name' has private access in 'com.driver.RWOnly'
        rw.setName("Aman");
        System.out.println(rw.getName());
    }
}