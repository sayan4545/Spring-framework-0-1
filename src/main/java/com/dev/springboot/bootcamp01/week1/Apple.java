package com.dev.springboot.bootcamp01.week1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Apple {

    void eat(){
        System.out.println("Eats apple");
    }
    @PostConstruct
    void beforeAppleisCreated(){
        System.out.println("using post constructy");
    }
    @PreDestroy
    void beforeDsetroy(){
        System.out.println("before destruction of bean");
    }
}
