package com.example.demo.api;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/demo")
public class DemoController {
	
    @GetMapping
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok("hi");
     }

}
