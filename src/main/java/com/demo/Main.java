package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main {

    @RequestMapping("/")
    String home() {
        return "Olá, seja bem-vindo ao teste de Spring Boot para disciplina de Sistemas Distribuídos";
    }

    @RequestMapping("/home/{nome}")
    String piada(@PathVariable String nome) {
        return "Olá " + nome + ", você vai realmente conseguir passar nessa disciplina?";
    }

    @RequestMapping("/somar/{a}/{b}")
    double somar(@PathVariable double a, @PathVariable double b) {
        return a + b;
    }

    @RequestMapping("/subtrair/{a}/{b}")
    double subtrair(@PathVariable double a, @PathVariable double b) {
        return a - b;
    }

    @RequestMapping("/multiplicar/{a}/{b}")
    double multiplicar(@PathVariable double a, @PathVariable double b) {
        return a * b;
    }

    @RequestMapping("/dividir/{a}/{b}")
    double dividir(@PathVariable double a, @PathVariable double b) {
        return a / b;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
