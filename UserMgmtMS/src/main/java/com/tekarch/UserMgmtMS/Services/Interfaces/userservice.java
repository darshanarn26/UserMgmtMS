package com.tekarch.UserMgmtMS.Services.Interfaces;

import com.tekarch.UserMgmtMS.Models.User;

import java.util.List;

public interface userservice
{
    User addUser(User user);
    List<User> getAllUsers();
    User updateUser(Long user_id,User userdetails);

}
