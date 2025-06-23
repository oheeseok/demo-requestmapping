package com.example.demorequestmapping;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController{

    @GetMapping
    public ResponseEntity<Map<String, String>> test() {
        System.out.println("test!!");
        Map<String, String> ret = new HashMap<>();
        ret.put("hello", "world");
        return new ResponseEntity<>(ret, HttpStatus.OK);
    }
}
