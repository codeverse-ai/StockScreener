package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.app")
public class StockFundAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockFundAppApplication.class, args);
    }
}
