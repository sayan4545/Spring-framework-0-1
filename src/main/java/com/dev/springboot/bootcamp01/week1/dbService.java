package com.dev.springboot.bootcamp01.week1;

import org.springframework.stereotype.Service;

@Service
public class dbService {

    private final DbSpec dbSpec;

    public dbService(DbSpec dbSpec){
        this.dbSpec = dbSpec;
    }
    public void dotask(){
        dbSpec.upload();
    }
}
