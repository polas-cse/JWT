package com.learning.code.security.service;

import com.learning.code.security.dao.JwtDao;
import com.learning.code.security.model.JwtRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private JwtDao jwtDao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        JwtRequest user;
        try {
            user =  jwtDao.loginCheck(userName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new User(user.getUsername(),user.getPassword(),new ArrayList<>());
    }
}
