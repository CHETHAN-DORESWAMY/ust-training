package com.day1.composite.key.controller;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import com.day1.composite.key.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.day1.composite.key.service.UserService;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{userId}/types/{userType}")
    public ResponseEntity<User> findUser(@PathVariable int userId, @PathVariable String userType){
        log.info("Finding user with userId: {} and userType: {} ", userId, userType);

        Optional<User> user = userService.findUser(userId, userType);

        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


}