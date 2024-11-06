package com.ust.spring_sec_demo2.Repository;

import com.ust.spring_sec_demo2.model.UserInfo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserInfo, String> {
    UserInfo findByUsername(String username);
}
