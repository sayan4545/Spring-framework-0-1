package com.dev.springboot.bootcamp01.week1;

import org.springframework.stereotype.Component;

@Component
public class OnlineOrder implements Order{
    public void createOrder(){
        System.out.println("Online order created");
    }
}
