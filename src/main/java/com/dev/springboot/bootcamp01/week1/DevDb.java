package com.dev.springboot.bootcamp01.week1;

import org.springframework.stereotype.Component;

@Component
public class DevDb implements DbSpec{
    @Override
    public void upload() {
        System.out.println("Implement dev db");
    }
}
