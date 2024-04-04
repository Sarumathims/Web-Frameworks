package com.example.demo.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Model {
    @GetMapping("/demo")
public String model()
{
    return "Hello good afternoon";
}

}
