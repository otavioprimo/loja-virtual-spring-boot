package com.codebrain.lojavirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.codebrain.lojavirtual.controller")
public class LojaVirtualApplication {

    public static void main(String[] args) {
        SpringApplication.run(LojaVirtualApplication.class, args);
    }
}
