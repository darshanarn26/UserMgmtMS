package com.tekarch.UserMgmtMS.Controllers;

import com.tekarch.UserMgmtMS.Models.User;
import com.tekarch.UserMgmtMS.Services.userserviceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public  User addUser(@RequestBody User user)
    {
        return userserviceimpl.addUser(user);
    }
}
