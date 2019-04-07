package com.springdemo.learning.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class DemospringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemospringbootApplication.class, args);
    }

}

@RestController
@RequestMapping("/")
class TestController
{
    @RequestMapping(value="hello/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String sName)
    {
        return "Hello Mr."+sName;
    }
}
