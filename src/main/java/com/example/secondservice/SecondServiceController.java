package com.example.secondservice;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
//@Slf4j
public class SecondServiceController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

//    http://localhost:8082/second-service/welcome/
    @GetMapping("/welcome")
    public String welcome() {
    	log.info("***** localhost:8082/second-service/welcome");
        return "Welcome to the Second service.";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("second-request") String header) {
        log.info(header);
        return "Hello World in Second Service.";
    }

    @GetMapping("/check")
    public String check() {
        return "Hi, there. This is a message from Second Service.";
    }
}
