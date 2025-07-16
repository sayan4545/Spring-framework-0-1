package com.dev.springboot.bootcamp01.week1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ProdDb implements DbSpec{
    @Override
    public void upload() {
        System.out.println("Implement prod db");
    }
}
