package com.tekarch.UserMgmtMS.Services;

import com.tekarch.UserMgmtMS.Models.User;
import com.tekarch.UserMgmtMS.Repositories.userrepository;
import com.tekarch.UserMgmtMS.Services.Interfaces.userservice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class userserviceImpl implements userservice
{
    private final userrepository userRepository;

    public userserviceImpl(userrepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long user_id, User userdetails)
    {
        User user = userRepository.findById(user_id).orElseThrow(() -> new NoSuchElementException("User not found"));
        user.setUsername(userdetails.getUsername());
        user.setPassword(userdetails.getPassword());
        user.setEmail(userdetails.getEmail());
        user.setPhone_number(userdetails.getPhone_number());
        return userRepository.save(user);
    }


}
