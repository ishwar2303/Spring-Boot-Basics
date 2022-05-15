package net.codejava.controller;

import net.codejava.entities.User;
import net.codejava.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable long id) {
        return this.userService.getUser(id);
    }

    @PostMapping(path = "/user", consumes = "application/json")
    public User addUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }

    @GetMapping(path = "/users", params = "gender")
    public List<User> getUsers(@RequestParam String gender) {
        return this.userService.sortByGender(gender);
    }
}
