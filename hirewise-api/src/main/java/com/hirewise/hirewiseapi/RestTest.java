package com.hirewise.hirewiseapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestTest {

    @RequestMapping("/test")
    public String test() {
        return "Hello World";
    }
}
