package com.tekarch.UserMgmtMS.Repositories;

import com.tekarch.UserMgmtMS.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepository extends JpaRepository<User,Long>
{

}
