package com.minhaEmpresa.br.firstSpringApp.controllers;

import com.minhaEmpresa.br.firstSpringApp.domain.User;
import com.minhaEmpresa.br.firstSpringApp.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/userHello")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;
    // ao inves de colocar o construtor fazendo a injeção podemos fazer usando @Autowide
    //    public HelloWorldController(HelloWorldService helloWorldService) {
    //        this.helloWorldService = helloWorldService;
    //    }

    @GetMapping("/hello")
    public String helloWorld() {
        return helloWorldService.helloWorld("Victor");
    }

    @PostMapping("/hello/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User user) {
        return "Hello, " + user.getName() + id + filter;
    }
}
