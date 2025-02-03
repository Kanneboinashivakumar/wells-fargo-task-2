package com.wellsfargo.counselor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // ✅ Ensures component scanning works
public class Entrypoint {
    public static void main(String[] args) {
        SpringApplication.run(Entrypoint.class, args);
    }
}
