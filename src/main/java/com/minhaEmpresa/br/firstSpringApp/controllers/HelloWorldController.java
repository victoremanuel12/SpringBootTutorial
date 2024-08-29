package com.minhaEmpresa.br.firstSpringApp.controllers;

import com.minhaEmpresa.br.firstSpringApp.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;
// ao inves de colocar o construtor fazendo a injeção podemos fazer usando @Autowide
//    public HelloWorldController(HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Victor");
    }
}
