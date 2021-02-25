package com.example.springdemodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author suixinlu
 */
@SpringBootApplication
@RestController
public class SpringDemoDockerApplication {
    /** docker run --name docker-demo -d -p 8080:8080 a96f67493c83 **/
    /** http://localhost:8080/hello **/
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoDockerApplication.class, args);
    }
    
    @GetMapping("/hello")
    public String hello() {
        return LocalDateTime.now().toString();
    }

}
