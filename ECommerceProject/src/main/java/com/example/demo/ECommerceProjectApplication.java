package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class ECommerceProjectApplication {

    @GetMapping("/Test")
    public String Test() {
        return "Hello Adana";
    }

    @GetMapping("/Test2")
    public String Test2(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            System.out.println("Header: " + headerName + " = " + request.getHeader(headerName));
        }
        return "Test2 Content!";
    }
    public static void main(String[] args) {
        SpringApplication.run(ECommerceProjectApplication.class, args);
    }
}
