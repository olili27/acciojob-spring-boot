package com.example.japbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getById")
    public User getUserById(@RequestParam("id") int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/deleteById")
    public String deleteById(@RequestParam("id") Integer id) {
        return userService.deleteById(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll() {
        return userService.deleteAll();
    }

    @PutMapping("/change-name")
    public  User changeName(@RequestParam("id") Integer id, @RequestParam("newName") String newName) {
        return userService.changeName(id, newName);
    }
}
