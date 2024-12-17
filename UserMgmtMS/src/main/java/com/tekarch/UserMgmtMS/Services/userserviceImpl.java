package com.tekarch.UserMgmtMS.Services;

import com.tekarch.UserMgmtMS.Models.User;
import com.tekarch.UserMgmtMS.Repositories.userrepository;
import com.tekarch.UserMgmtMS.Services.Interfaces.userservice;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
