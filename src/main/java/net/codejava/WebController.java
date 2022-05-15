package net.codejava;

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class WebController {

    @RequestMapping("index/{id}/{name}")
    public String sayHello(@PathVariable int id, @PathVariable String name) {
        return "<h1>Welcome to Spring Boot Journey.</h1>" + "<h1>" + id + " " + name  + "</h1>";
    }
}
