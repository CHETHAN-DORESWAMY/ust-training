package com.ust.spring_sec_demo2.Service;

import com.ust.spring_sec_demo2.Repository.UserRepository;
import com.ust.spring_sec_demo2.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userinfo = userRepository.findByUsername(username);
        if(userinfo == null){
            throw new UsernameNotFoundException("User not found");
        }

        return new PrincipalUser(userinfo);


    }
}
