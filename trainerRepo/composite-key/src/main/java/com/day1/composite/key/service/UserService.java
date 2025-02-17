package com.day1.composite.key.service;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import com.day1.composite.key.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.day1.composite.key.repository.UserRepository;

@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findUser(int userId, String userType) {
        try{
            return userRepository.findUser(userId, userType);
        }catch (Exception e){
            log.error("Error while finding user with userId: {} and userType: {}. Error message: {}", userId, userType, e.getMessage());
        }
        return Optional.empty();
    }

}