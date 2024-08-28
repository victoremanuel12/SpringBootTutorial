package com.minhaEmpresa.br.firstSpringApp.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String name){
        return "Hello by:" + name;
    }
}
