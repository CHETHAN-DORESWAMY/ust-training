package com.ust.spring_sec_demo2.controller;

import com.ust.spring_sec_demo2.Service.JwtService;
import com.ust.spring_sec_demo2.Service.ProjectService;
import com.ust.spring_sec_demo2.Service.UserService;
import com.ust.spring_sec_demo2.dto.AuthRequest;
import com.ust.spring_sec_demo2.model.ProjectInfo;
import com.ust.spring_sec_demo2.model.UserInfo;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.authentication.AuthenticationManager;

import javax.management.remote.JMXAuthenticator;
import java.util.List;

@RestController
//@RequestMapping("/api")
public class UserController {

    @Autowired
    private ProjectService service;

    @Autowired
    private UserService userService;

    @GetMapping
    public String home(){
        return "Welcome to the home";
    }


    @PostMapping("/addUser")
    public String addUser(@RequestBody UserInfo user){
        return userService.addUser(user);
    }

    @GetMapping("/getAllProject")
    public List<ProjectInfo> getAllProject(@RequestBody UserInfo userInfo){
        return service.getProjects();

    }

    @PostMapping("/addProject")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ProjectInfo addProject(@RequestBody ProjectInfo project){
        return service.addProject(project);
    }
}
