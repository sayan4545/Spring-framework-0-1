package com.dev.springboot.bootcamp01.week1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    Apple createApple(){
        return new Apple();
    }
}
