package com.ust.spring_sec_demo2.Service;

import com.ust.spring_sec_demo2.Repository.UserRepository;
import com.ust.spring_sec_demo2.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    public String addUser(UserInfo userInfo) {
//        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repo.save(userInfo);
        return "user added to system ";
    }

}
