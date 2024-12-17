package com.tekarch.UserMgmtMS.Controllers;

import com.tekarch.UserMgmtMS.Models.User;
import com.tekarch.UserMgmtMS.Services.userserviceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Usercontroller
{
    private final userserviceImpl userserviceimpl;

    public Usercontroller(userserviceImpl userservice) {
        this.userserviceimpl = userservice;
    }

    @GetMapping("/users")
    public List<User> getUser()
    {
        return  userserviceimpl.getAllUsers();
    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user)
    {
        return new ResponseEntity<>(userserviceimpl.addUser(user), HttpStatus.CREATED);
    }
    @PutMapping("users/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody  User userDetails) {
        return ResponseEntity.ok(userserviceimpl.updateUser(userId, userDetails));
    }
}
