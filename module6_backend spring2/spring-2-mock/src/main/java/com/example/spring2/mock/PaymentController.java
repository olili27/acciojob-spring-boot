package com.example.spring2.mock;

import com.example.spring2.mock.models.Transaction;
import com.example.spring2.mock.models.User;
import com.example.spring2.mock.services.TransactionService;
import com.example.spring2.mock.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private UserService userService;

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/add-user")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    @PostMapping("/add-transaction")
    public ResponseEntity<String> addTransaction(@RequestBody Transaction transaction) {
        return new ResponseEntity<>(transactionService.addTransaction(transaction), HttpStatus.CREATED);
    }
}
