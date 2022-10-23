package com.example.kubedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class KubeDemoApplication {


    @GetMapping
    public ResponseEntity<List<String>>  hello() {
        return ResponseEntity.ok(List.of("Hello ", "i am", "from", "kubernetes"));
    }

    public static void main(String[] args) {
        SpringApplication.run(KubeDemoApplication.class, args);
    }

}
