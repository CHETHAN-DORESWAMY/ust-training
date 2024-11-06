package com.ust.spring_sec_demo2.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Component
public class JwtService {

    public static final String SECRET = "5367566B59703373367639792F423F4528482B4D6251655468576D5A71347437";

//    public String generateToken(String userName){
//        Map<String,Object> claims=new HashMap<>();
//        return createToken(claims,userName);
//    }

}
