package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.DharanishUser;
import com.example.springapp.service.DharanishUserService;

@RestController
@RequestMapping("/api")
public class DharanishUserController {
    
    @Autowired
    private DharanishUserService userService;

    @PostMapping("/user")
    public ResponseEntity<DharanishUser> post(@RequestBody DharanishUser user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<DharanishUser>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<DharanishUser> getById(@PathVariable int userId)
    {
        DharanishUser user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<DharanishUser>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<DharanishUser> getByUserName(@PathVariable String userName)
    {
        DharanishUser user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<DharanishUser>(user, HttpStatus.OK);
        }
    }
}
