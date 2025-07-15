package com.dev.springboot.bootcamp01.week1;

import org.springframework.stereotype.Component;

@Component
public class User {
    String username;
    int salary;
    Order order;
    public User(Order order){
        this.order = order;
        System.out.println("Invoke user");
    }

    void callOrder(){
        order.createOrder();
    }
}
