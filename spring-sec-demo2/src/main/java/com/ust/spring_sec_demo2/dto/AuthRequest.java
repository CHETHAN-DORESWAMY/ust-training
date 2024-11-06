package com.ust.spring_sec_demo2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AuthRequest {
    private String username;
    private String password;
//    private List<GrantedAuthority> roles;
}
