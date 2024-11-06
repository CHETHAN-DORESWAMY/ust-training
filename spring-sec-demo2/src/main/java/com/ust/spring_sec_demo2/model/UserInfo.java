package com.ust.spring_sec_demo2.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "userInfo")
/**
 * This class is used to store the user information in the database
 */
public class UserInfo {

    private String id;
    private String username;
    private String password;
    private String phNumber;
    private List<GrantedAuthority> roles;
}
