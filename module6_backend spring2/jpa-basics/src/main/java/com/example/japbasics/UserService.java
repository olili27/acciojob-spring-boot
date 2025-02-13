package com.example.japbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user) {
        userRepository.save(user);

        return "user added";
    }

    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public String deleteById(Integer id) {
        userRepository.deleteById(id);

        return "deleted";
    }

    public String deleteAll() {
        userRepository.deleteAll();

        return "all deleted";
    }

    public  User changeName(Integer id, String newName) {
        User user = userRepository.findById(id).get();
        user.setName(newName);
        userRepository.save(user);

        return user;
    }
}
